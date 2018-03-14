package com.example.xwysun.wsdltest.socket;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Observable;

import io.reactivex.Flowable;

/**
 * Author: xwysun
 * Date:2018/2/13
 * Description:
 */

public interface IRxSocket {

    boolean sendTcpSocket(byte[] output) throws IOException;

    void closeTcpSocket() throws IOException;

    Flowable<byte[]> startTcpSocket(String ip,int port) throws IOException;

    boolean sendUdpSocket(byte[] output,String ip,int port) throws IOException;

    void closeUdpSocket();

    Flowable<byte[]> startUdpSocket() throws SocketException;

    Flowable<byte[]> startMultiUdpSocket();

    boolean sendBroadCast(byte[] output,int port) throws IOException;

    void closeBroadcast();

    Flowable<byte[]> startBroadcast(int timeout) throws SocketException;
}
