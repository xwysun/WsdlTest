package com.example.xwysun.wsdltest;

import android.util.Base64;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Author: xwysun
 * Date:2018/2/27
 * Description:
 */

public class DeviceAuth {

    private String mCreated, mNonce, mAuthPwd,username,password;

    public DeviceAuth(String username, String password) {
        this.username = username;
        this.password = password;
        createAuthString();
    }

    private void createAuthString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'",
                Locale.CHINA);
        mCreated = df.format(new Date());
        mNonce = getNonce();
        mAuthPwd = getPasswordEncode(mNonce,password, mCreated);
    }

    public String getNonce() {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 24; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
    public String getPasswordEncode(String nonce, String password, String date) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            // 从官方文档可以知道我们nonce还需要用Base64解码一次
            byte[] b1 = Base64.decode(nonce.getBytes(), Base64.DEFAULT);
            // 生成字符字节流
            byte[] b2 = date.getBytes(); // "2013-09-17T09:13:35Z";
            byte[] b3 = password.getBytes();
            // 根据我们传得值的长度生成流的长度
            byte[] b4 = new byte[b1.length + b2.length + b3.length];
            // 利用sha-1加密字符
            md.update(b1, 0, b1.length);
            md.update(b2, 0, b2.length);
            md.update(b3, 0, b3.length);
            // 生成sha-1加密后的流
            b4 = md.digest();
            // 生成最终的加密字符串
            String result = new String(Base64.encode(b4, Base64.DEFAULT));
            return result.replace("\n", "");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
