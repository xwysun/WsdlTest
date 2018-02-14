package com.example.xwysun.wsdltest.socket;

import android.util.Log;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/**
 * Author: xwysun
 * Date:2018/2/13
 * Description:
 */

public class BroadcastSubscriber implements FlowableOnSubscribe<byte[]> {

    private static final String TAG =BroadcastSubscriber.class.getSimpleName();
    private DatagramSocket socket;

    private byte[] res;

    private DatagramPacket packet;

    public BroadcastSubscriber(DatagramSocket socket) {
        this.socket = socket;
    }

    public DatagramSocket getSocket() {
        return socket;
    }

    public void setSocket(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void subscribe(FlowableEmitter<byte[]> e) {
        if (socket!=null){
            int size= 0;
            try {
                size = socket.getReceiveBufferSize();
            } catch (SocketException e1) {
                e1.printStackTrace();
            }
            while (!socket.isClosed()){
                res=new byte[size];
                packet=new DatagramPacket(res,res.length);
                try {
                    socket.receive(packet);
                    e.onNext(res);
                }
                catch (InterruptedIOException e1){
                    Log.e(TAG, "receive timeout!");
                    e.onError(e1);
                }
                catch(IOException e2) {
                    e.onError(e2);
                }
            }
        }
    }
}
