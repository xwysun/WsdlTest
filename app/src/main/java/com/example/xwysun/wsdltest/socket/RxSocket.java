package com.example.xwysun.wsdltest.socket;

import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/**
 * Author: xwysun
 * Date:2018/2/13
 * Description:
 */

public class RxSocket implements IRxSocket{


    /**
     * TCP Socket （未测试）
     */
    private static final String TAG_TCP="RxSocket_TCP";
    private Socket tcpSocket;
    private TcpOnSubscriber tcpOnSubscriber;
    @Override
    public boolean sendTcpSocket(byte[] output) throws IOException {
        if (tcpOnSubscriber==null||tcpSocket==null){
            Log.e(TAG_TCP, "Socket is null!");
            return false;
        }

        if (tcpSocket!=tcpOnSubscriber.getSocket()){
            Log.e(TAG_TCP, "Socket is not suitable to Flowable!");
            return false;
        }
        OutputStream outputStream=tcpSocket.getOutputStream();
        outputStream.write(output);
        outputStream.flush();
        return true;
    }

    @Override
    public void closeTcpSocket() throws IOException {
        tcpSocket.getOutputStream().close();
        tcpSocket.getInputStream().close();;
        tcpSocket.close();
    }

    @Override
    public Flowable<byte[]> startTcpSocket(String ip, int port) throws IOException {
        tcpSocket=new Socket(ip,port);
        return Flowable.create(tcpOnSubscriber, BackpressureStrategy.BUFFER);
    }



    /**
     * UDP Socket （未测试）
     */
    private static final String TAG_UDP="RxSocket_UDP";
    private DatagramSocket udpSocket;
    private UdpOnSubscriber udpOnSubscriber;

    @Override
    public boolean sendUdpSocket(byte[] output,String ip,int port) throws IOException {

        if (ip==null||output==null||port==0){
            Log.e(TAG_UDP, "ip,port is null");
        }

        if (udpOnSubscriber==null||udpSocket==null){
            Log.e(TAG_UDP, "Socket is null!");
            return false;
        }

        if (udpSocket!=udpOnSubscriber.getSocket()){
            Log.e(TAG_UDP, "Socket is not suitable to Flowable!");
            return false;
        }
        InetAddress address=InetAddress.getByName(ip);
        DatagramPacket packet=new DatagramPacket(output,output.length,address,port);
        udpSocket.send(packet);
        return true;
    }

    @Override
    public void closeUdpSocket() {
        udpSocket.close();
    }


    @Override
    public Flowable<byte[]> startUdpSocket() throws SocketException {
        udpSocket=new DatagramSocket();
        udpOnSubscriber=new UdpOnSubscriber(udpSocket);
        return Flowable.create(udpOnSubscriber,BackpressureStrategy.BUFFER);
    }


    /**
     * 多播
     */

    @Override
    public Flowable<byte[]> startMultiUdpSocket() {
        return null;
    }



    /**
     * 局域网广播
     */



    private static final String TAG_BROADCAST="RxSocket_Broadcast";
    private DatagramSocket broadcastSocket;
    private BroadcastSubscriber broadcastSubscriber;

    @Override
    public boolean sendBroadCast(byte[] output,int port) throws IOException {
        if (output==null){
            Log.e(TAG_BROADCAST, "output is null");
        }

        if (broadcastSocket==null||broadcastSubscriber==null){
            Log.e(TAG_BROADCAST, "Socket is null!");
            return false;
        }

        if (broadcastSocket!=broadcastSubscriber.getSocket()){
            Log.e(TAG_BROADCAST, "Socket is not suitable to Flowable!");
            return false;
        }
        String broadcastAddr=getBroadcast();
        if (broadcastAddr == null) {
            Log.e(TAG_BROADCAST, "broadcast is null");
            return false;
        }
        DatagramPacket packet = new DatagramPacket(output, output.length,
                InetAddress.getByName(broadcastAddr), port);
        broadcastSocket.send(packet);
        return true;
    }

    @Override
    public void closeBroadcast() {
        broadcastSocket.close();
    }


    @Override
    public Flowable<byte[]> startBroadcast(int timeout) throws SocketException {
        broadcastSocket=new DatagramSocket();
        broadcastSocket.setBroadcast(true);
        broadcastSocket.setSoTimeout(timeout);
        broadcastSubscriber=new BroadcastSubscriber(broadcastSocket);
        return Flowable.create(broadcastSubscriber,BackpressureStrategy.BUFFER);
    }


    private String getBroadcast() throws SocketException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        for (Enumeration<NetworkInterface> niEnum = NetworkInterface
                .getNetworkInterfaces(); niEnum.hasMoreElements();) {
            NetworkInterface ni = niEnum.nextElement();
            if (!ni.isLoopback()) {
                for (InterfaceAddress interfaceAddress : ni
                        .getInterfaceAddresses()) {
                    if (interfaceAddress.getBroadcast() != null) {
                        return interfaceAddress.getBroadcast().toString()
                                .substring(1);
                    }
                }
            }
        }
        return null;
    }
}
