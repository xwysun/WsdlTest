package com.example.xwysun.wsdltest;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.xwysun.wsdltest.wsdl.KBFArrayOfString;
import com.example.xwysun.wsdltest.wsdl.KBFWeatherWebServiceSoap12;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="MainActivity";
    KBFWeatherWebServiceSoap12 webServiceSoap12;
    KBFArrayOfString arrayOfString;
    String info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webServiceSoap12=new KBFWeatherWebServiceSoap12();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    arrayOfString=webServiceSoap12.getSupportCity("重庆");
                    Log.d(TAG, "citys: "+arrayOfString);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
