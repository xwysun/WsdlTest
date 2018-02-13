package com.example.xwysun.wsdltest.socket;

import java.io.InputStream;
import java.net.Socket;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/**
 * Author: xwysun
 * Date:2018/2/13
 * Description:
 */

public class TcpOnSubscriber implements FlowableOnSubscribe<byte[]> {

    private Socket socket;

    public TcpOnSubscriber(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void subscribe(FlowableEmitter<byte[]> e) throws Exception {
        if (socket!=null){
            InputStream inputStream=socket.getInputStream();
            while (!socket.isClosed()){
                int size=inputStream.available();
                if (size>0){
                    byte[] res=new byte[size];
                    inputStream.read(res);
                    e.onNext(res);
                }
            }
        }
    }
}
