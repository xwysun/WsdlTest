package com.example.xwysun.wsdltest.device;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.2.8.3
//
// Created by Quasar Development 
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class COGDeviceIOCapabilities extends AttributeContainer implements KvmSerializable
{

    
    public String XAddr;
    
    public Integer VideoSources=0;
    
    public Integer VideoOutputs=0;
    
    public Integer AudioSources=0;
    
    public Integer AudioOutputs=0;
    
    public Integer RelayOutputs=0;
    private transient java.lang.Object __source;    
    

    
    
    
    public void loadFromSoap(java.lang.Object paramObj,COGExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                }
            } 
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,COGExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("XAddr"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.XAddr = j.toString();
                    }
                }
                else{
                    this.XAddr = obj.toString();
                }
            }
            return true;
        }
        if (info.name.equals("VideoSources"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.VideoSources = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.VideoSources = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("VideoOutputs"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.VideoOutputs = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.VideoOutputs = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("AudioSources"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.AudioSources = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.AudioSources = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("AudioOutputs"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.AudioOutputs = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.AudioOutputs = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("RelayOutputs"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.RelayOutputs = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.RelayOutputs = (Integer)obj;
                }
            }
            return true;
        }
        return false;
    }
    
    public java.lang.Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return XAddr;
        }
        if(propertyIndex==1)
        {
            return VideoSources;
        }
        if(propertyIndex==2)
        {
            return VideoOutputs;
        }
        if(propertyIndex==3)
        {
            return AudioSources;
        }
        if(propertyIndex==4)
        {
            return AudioOutputs;
        }
        if(propertyIndex==5)
        {
            return RelayOutputs;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "XAddr";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "VideoSources";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "VideoOutputs";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "AudioSources";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "AudioOutputs";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "RelayOutputs";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
