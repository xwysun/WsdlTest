package com.example.xwysun.wsdltest;

import org.kxml2.kdom.Element;
import org.kxml2.kdom.Node;

/**
 * Author: xwysun
 * Date:2018/3/14
 * Description:
 */

public class AuthHeaderUtil {
    private static final String NAMESPACE="http://www.w3.org/2003/05/soap-envelope";
    private static final String NAMESPACE_SECURITY="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String PWD_TYPE="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest";
    private static final String ENCODING_TYPE="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary";
    private static final String NAMESPACE_CREATED="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

    public static Element createAuthHeader(String account, String pwd){

        DeviceAuth auth=new DeviceAuth(account,pwd);

        Element security=new Element().createElement(NAMESPACE_SECURITY,"Security");
        security.setAttribute(NAMESPACE,"mustUnderstand","1");

        Element userNameToken=new Element();
        userNameToken.setName("UsernameToken");

        Element userName=new Element().createElement(null,"Username");
        userName.addChild(Node.TEXT,auth.getUsername());
        userNameToken.addChild(Node.ELEMENT,userName);

        Element password=new Element().createElement(null,"Password");
        password.setAttribute(null,"Type",PWD_TYPE);
        password.addChild(Node.TEXT,auth.getmAuthPwd());
        userNameToken.addChild(Node.ELEMENT,password);

        Element nonce=new Element().createElement(NAMESPACE_SECURITY,"Nonce");
        nonce.setAttribute(null,"EncodingType",ENCODING_TYPE);
        nonce.addChild(Node.TEXT,auth.getmNonce());
        userNameToken.addChild(Node.ELEMENT,nonce);

        Element created=new Element().createElement(NAMESPACE_CREATED,"Created");
        created.addChild(Node.TEXT,auth.getmCreated());
        userNameToken.addChild(Node.ELEMENT,created);

        security.addChild(Node.ELEMENT,userNameToken);
        return security;
    }
}
