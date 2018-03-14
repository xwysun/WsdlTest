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

public class COGCapabilitiesExtension extends AttributeContainer implements KvmSerializable
{

    
    public COGDeviceIOCapabilities DeviceIO;
    
    public COGDisplayCapabilities Display;
    
    public COGRecordingCapabilities Recording;
    
    public COGSearchCapabilities Search;
    
    public COGReplayCapabilities Replay;
    
    public COGReceiverCapabilities Receiver;
    
    public COGAnalyticsDeviceCapabilities AnalyticsDevice;
    
    public COGCapabilitiesExtension2 Extensions;
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
        if (info.name.equals("DeviceIO"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.DeviceIO = (COGDeviceIOCapabilities)__envelope.get(j,COGDeviceIOCapabilities.class,false);
            }
            return true;
        }
        if (info.name.equals("Display"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Display = (COGDisplayCapabilities)__envelope.get(j,COGDisplayCapabilities.class,false);
            }
            return true;
        }
        if (info.name.equals("Recording"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Recording = (COGRecordingCapabilities)__envelope.get(j,COGRecordingCapabilities.class,false);
            }
            return true;
        }
        if (info.name.equals("Search"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Search = (COGSearchCapabilities)__envelope.get(j,COGSearchCapabilities.class,false);
            }
            return true;
        }
        if (info.name.equals("Replay"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Replay = (COGReplayCapabilities)__envelope.get(j,COGReplayCapabilities.class,false);
            }
            return true;
        }
        if (info.name.equals("Receiver"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Receiver = (COGReceiverCapabilities)__envelope.get(j,COGReceiverCapabilities.class,false);
            }
            return true;
        }
        if (info.name.equals("AnalyticsDevice"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.AnalyticsDevice = (COGAnalyticsDeviceCapabilities)__envelope.get(j,COGAnalyticsDeviceCapabilities.class,false);
            }
            return true;
        }
        if (info.name.equals("Extensions"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extensions = (COGCapabilitiesExtension2)__envelope.get(j,COGCapabilitiesExtension2.class,false);
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
            return this.DeviceIO!=null?this.DeviceIO:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Display!=null?this.Display:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Recording!=null?this.Recording:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Search!=null?this.Search:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.Replay!=null?this.Replay:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.Receiver!=null?this.Receiver:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.AnalyticsDevice!=null?this.AnalyticsDevice:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.Extensions!=null?this.Extensions:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = COGDeviceIOCapabilities.class;
            info.name = "DeviceIO";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1)
        {
            info.type = COGDisplayCapabilities.class;
            info.name = "Display";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==2)
        {
            info.type = COGRecordingCapabilities.class;
            info.name = "Recording";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==3)
        {
            info.type = COGSearchCapabilities.class;
            info.name = "Search";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==4)
        {
            info.type = COGReplayCapabilities.class;
            info.name = "Replay";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==5)
        {
            info.type = COGReceiverCapabilities.class;
            info.name = "Receiver";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==6)
        {
            info.type = COGAnalyticsDeviceCapabilities.class;
            info.name = "AnalyticsDevice";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==7)
        {
            info.type = COGCapabilitiesExtension2.class;
            info.name = "Extensions";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

