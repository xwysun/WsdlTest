package com.example.xwysun.wsdltest.wsdl;




//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.2.8.3
//
// Created by Quasar Development 
//
//---------------------------------------------------




import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.*;

import java.util.List;


public class KBFWeatherWebServiceSoap12
{
    interface KBFIWcfMethod
    {
        KBFExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

        java.lang.Object ProcessResult(KBFExtendedSoapSerializationEnvelope __envelope,java.lang.Object result) throws java.lang.Exception;
    }

    String url="http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";

    int timeOut=60000;
    public List< HeaderProperty> httpHeaders;
    public boolean enableLogging;

    KBFIServiceEvents callback;
    public KBFWeatherWebServiceSoap12(){}

    public KBFWeatherWebServiceSoap12 (KBFIServiceEvents callback)
    {
        this.callback = callback;
    }
    public KBFWeatherWebServiceSoap12(KBFIServiceEvents callback,String url)
    {
        this.callback = callback;
        this.url = url;
    }

    public KBFWeatherWebServiceSoap12(KBFIServiceEvents callback,String url,int timeOut)
    {
        this.callback = callback;
        this.url = url;
        this.timeOut=timeOut;
    }

    protected org.ksoap2.transport.Transport createTransport()
    {
        try
        {
            java.net.URI uri = new java.net.URI(url);
            if(uri.getScheme().equalsIgnoreCase("https"))
            {
                int port=uri.getPort()>0?uri.getPort():443;
                return new com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE(uri.getHost(), port, uri.getPath(), timeOut);
            }
            else
            {
                return new com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE(url,timeOut);
            }

        }
        catch (java.net.URISyntaxException e)
        {
        }
        return null;
    }
    
    protected KBFExtendedSoapSerializationEnvelope createEnvelope()
    {
        KBFExtendedSoapSerializationEnvelope envelope= new KBFExtendedSoapSerializationEnvelope(KBFExtendedSoapSerializationEnvelope.VER12);
            return envelope;
    }
    
    protected java.util.List sendRequest(String methodName,KBFExtendedSoapSerializationEnvelope envelope,org.ksoap2.transport.Transport transport ,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile )throws java.lang.Exception
    {
        if(transport instanceof com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE )
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
        else
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }  
    }

    java.lang.Object getResult(java.lang.Class destObj,java.lang.Object source,String resultName,KBFExtendedSoapSerializationEnvelope __envelope) throws java.lang.Exception
    {
        if(source==null)
        {
            return null;
        }
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                java.lang.Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                java.lang.Object instance=__envelope.get(j,destObj,false);
                return instance;
            }
            else if( soap.getName().equals(resultName)) {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
       }

       return null;
    }

        
    public KBFArrayOfString getSupportCity(final String byProvinceName ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (KBFArrayOfString)execute(new KBFIWcfMethod()
        {
            @Override
            public KBFExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              KBFExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://WebXml.com.cn/", "getSupportCity");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://WebXml.com.cn/";
                __info.name="byProvinceName";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(byProvinceName!=null?byProvinceName:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(KBFExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (KBFArrayOfString)getResult(KBFArrayOfString.class,__result,"getSupportCityResult",__envelope);
            }
        },"http://WebXml.com.cn/getSupportCity",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, KBFOperationResult< KBFArrayOfString>> getSupportCityAsync(final String byProvinceName)
    {
        return executeAsync(new KBFFunctions.IFunc< KBFArrayOfString>() {
            public KBFArrayOfString Func() throws java.lang.Exception {
                return getSupportCity( byProvinceName);
            }
        },"getSupportCity");
    }
    
    public KBFArrayOfString getSupportProvince( ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (KBFArrayOfString)execute(new KBFIWcfMethod()
        {
            @Override
            public KBFExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              KBFExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://WebXml.com.cn/", "getSupportProvince");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(KBFExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (KBFArrayOfString)getResult(KBFArrayOfString.class,__result,"getSupportProvinceResult",__envelope);
            }
        },"http://WebXml.com.cn/getSupportProvince",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, KBFOperationResult< KBFArrayOfString>> getSupportProvinceAsync()
    {
        return executeAsync(new KBFFunctions.IFunc< KBFArrayOfString>() {
            public KBFArrayOfString Func() throws java.lang.Exception {
                return getSupportProvince( );
            }
        },"getSupportProvince");
    }
    
    public org.ksoap2.serialization.SoapObject getSupportDataSet( ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (org.ksoap2.serialization.SoapObject)execute(new KBFIWcfMethod()
        {
            @Override
            public KBFExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              KBFExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://WebXml.com.cn/", "getSupportDataSet");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(KBFExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (org.ksoap2.serialization.SoapObject)getResult(org.ksoap2.serialization.SoapObject.class,__result,"getSupportDataSetResult",__envelope);
            }
        },"http://WebXml.com.cn/getSupportDataSet",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, KBFOperationResult< org.ksoap2.serialization.SoapObject>> getSupportDataSetAsync()
    {
        return executeAsync(new KBFFunctions.IFunc< org.ksoap2.serialization.SoapObject>() {
            public org.ksoap2.serialization.SoapObject Func() throws java.lang.Exception {
                return getSupportDataSet( );
            }
        },"getSupportDataSet");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public String getWeatherbyCityName(final String theCityName ) throws java.lang.Exception
    {
        /*This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.*/
        throw new java.lang.UnsupportedOperationException("This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public android.os.AsyncTask< Void, Void, KBFOperationResult< String>> getWeatherbyCityNameAsync(final String theCityName)
    {
        return executeAsync(new KBFFunctions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return getWeatherbyCityName( theCityName);
            }
        },"getWeatherbyCityName");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public String getWeatherbyCityNamePro(final String theCityName,final String theUserID ) throws java.lang.Exception
    {
        /*This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.*/
        throw new java.lang.UnsupportedOperationException("This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public android.os.AsyncTask< Void, Void, KBFOperationResult< String>> getWeatherbyCityNameProAsync(final String theCityName,final String theUserID)
    {
        return executeAsync(new KBFFunctions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return getWeatherbyCityNamePro( theCityName,theUserID);
            }
        },"getWeatherbyCityNamePro");
    }

    
    protected java.lang.Object execute(KBFIWcfMethod wcfMethod,String methodName,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile) throws java.lang.Exception
    {
        org.ksoap2.transport.Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        KBFExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport,profile);
            
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    android.util.Log.i("requestDump",__httpTransport.requestDump);    
                    
                }
                if (__httpTransport.responseDump != null) {
                    android.util.Log.i("responseDump",__httpTransport.responseDump);
                }
            }
        }
        java.lang.Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }
    
    protected < T> android.os.AsyncTask< Void, Void, KBFOperationResult< T>>  executeAsync(final KBFFunctions.IFunc< T> func, final String methodName)
    {
        return new android.os.AsyncTask< Void, Void, KBFOperationResult< T>>()
        {
            @Override
            protected void onPreExecute() {
                callback.Starting();
            };
            @Override
            protected KBFOperationResult< T> doInBackground(Void... params) {
                KBFOperationResult< T> result = new KBFOperationResult< T>();
                try
                {
                    result.MethodName=methodName;
                    result.Result= func.Func();
                }
                catch(java.lang.Exception ex)
                {
                    ex.printStackTrace();
                    result.Exception=ex;
                }
                return result;
            }
            
            @Override
            protected void onPostExecute(KBFOperationResult< T> result)
            {
                callback.Completed(result);
            }
        }.execute();
    }
        
    protected java.lang.Exception convertToException(org.ksoap2.SoapFault fault,KBFExtendedSoapSerializationEnvelope envelope)
    {
        org.ksoap2.SoapFault newException = fault;

        return newException;
    }
}

