package com.example.xwysun.wsdltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xwysun.wsdltest.device.COGDeviceBinding;
import com.example.xwysun.wsdltest.device.COGIServiceEvents;
import com.example.xwysun.wsdltest.device.COGOperationResult;

public class TestActivity extends AppCompatActivity {

    private static final String TAG=TestActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        final COGDeviceBinding service=new COGDeviceBinding(new COGIServiceEvents() {
            @Override
            public void Starting() {

            }

            @Override
            public void Completed(COGOperationResult result) {

            }
        },"http://111.13.101.208");
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
                    service.GetDeviceInformation();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
