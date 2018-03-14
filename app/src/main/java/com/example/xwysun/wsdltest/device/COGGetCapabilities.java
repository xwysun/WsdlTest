package com.example.xwysun.wsdltest.device;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.2.8.3
//
// Created by Quasar Development 
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class COGGetCapabilities extends Vector< COGEnums.CapabilityCategory> implements KvmSerializable
{
    private transient java.lang.Object __source;

    public void loadFromSoap(java.lang.Object inObj,COGExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        __source=inObj;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            java.lang.Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                COGEnums.CapabilityCategory j1= COGEnums.CapabilityCategory.fromString(j.toString());
                add(j1);
            }
        }
}
    public java.lang.Object getSourceObject()
    {
        return __source;
    }
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0).toString():SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "Category";
        info.type = PropertyInfo.STRING_CLASS;
    	info.namespace= "http://www.onvif.org/ver10/device/wsdl";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    
}