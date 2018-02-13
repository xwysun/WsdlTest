package com.example.xwysun.wsdltest.socket;

import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/**
 * Author: xwysun
 * Date:2018/2/13
 * Description:
 */

public class UdpOnSubscriber implements FlowableOnSubscribe<byte[]> {

    private DatagramSocket socket;

    private byte[] res;

    private DatagramPacket packet;

    public UdpOnSubscriber(DatagramSocket socket) {
        this.socket = socket;
    }

    public DatagramSocket getSocket() {
        return socket;
    }

    public void setSocket(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void subscribe(FlowableEmitter<byte[]> e) throws Exception {
        if (socket!=null){
            int size=socket.getReceiveBufferSize();
            while (!socket.isClosed()){
                res=new byte[size];
                packet=new DatagramPacket(res,res.length);
                socket.receive(packet);
                e.onNext(res);
            }
        }
    }
}
