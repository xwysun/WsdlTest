package com.example.xwysun.wsdltest;

import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xwysun.wsdltest.device.COGDeviceBinding;
import com.example.xwysun.wsdltest.device.COGIServiceEvents;
import com.example.xwysun.wsdltest.device.COGOperationResult;



public class MainActivity extends AppCompatActivity {
    public static final String TAG="MainActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "run: ");
        final COGDeviceBinding service=new COGDeviceBinding(new COGIServiceEvents() {
            @Override
            public void Starting() {

            }

            @Override
            public void Completed(COGOperationResult result) {

            }
        },"http://easywsdl.com/Home/Faq");
//        service.httpHeaders.add(new HeaderProperty("Security s:mustUnderstand=\\\"1\\\" xmlns=\\\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\\\"",
//                "<UsernameToken>\n" +
//                        "                <Username>%s</Username>\n" +
//                        "                <Password Type=\\\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest\\\">%s</Password>\n" +
//                        "                <Nonce EncodingType=\\\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\\\">%s</Nonce>\n" +
//                        "                <Created xmlns=\\\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\\\">%s</Created>\n" +
//                        "            </UsernameToken>"));
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.d(TAG, "run: ");
                    service.GetServices(Boolean.TRUE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
