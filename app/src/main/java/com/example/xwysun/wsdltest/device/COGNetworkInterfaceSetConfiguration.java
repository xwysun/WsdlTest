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

public class COGNetworkInterfaceSetConfiguration extends AttributeContainer implements KvmSerializable
{

    
    public Boolean Enabled;
    
    public COGNetworkInterfaceConnectionSetting Link;
    
    public Integer MTU;
    
    public COGIPv4NetworkInterfaceSetConfiguration IPv4;
    
    public COGIPv6NetworkInterfaceSetConfiguration IPv6;
    
    public COGNetworkInterfaceSetConfigurationExtension Extension;
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
        if (info.name.equals("Enabled"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Enabled = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.Enabled = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Link"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Link = (COGNetworkInterfaceConnectionSetting)__envelope.get(j,COGNetworkInterfaceConnectionSetting.class,false);
            }
            return true;
        }
        if (info.name.equals("MTU"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.MTU = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.MTU = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("IPv4"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.IPv4 = (COGIPv4NetworkInterfaceSetConfiguration)__envelope.get(j,COGIPv4NetworkInterfaceSetConfiguration.class,false);
            }
            return true;
        }
        if (info.name.equals("IPv6"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.IPv6 = (COGIPv6NetworkInterfaceSetConfiguration)__envelope.get(j,COGIPv6NetworkInterfaceSetConfiguration.class,false);
            }
            return true;
        }
        if (info.name.equals("Extension"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extension = (COGNetworkInterfaceSetConfigurationExtension)__envelope.get(j,COGNetworkInterfaceSetConfigurationExtension.class,false);
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
            return this.Enabled!=null?this.Enabled:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Link!=null?this.Link:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.MTU!=null?this.MTU:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.IPv4!=null?this.IPv4:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.IPv6!=null?this.IPv6:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.Extension!=null?this.Extension:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "Enabled";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1)
        {
            info.type = COGNetworkInterfaceConnectionSetting.class;
            info.name = "Link";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "MTU";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==3)
        {
            info.type = COGIPv4NetworkInterfaceSetConfiguration.class;
            info.name = "IPv4";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==4)
        {
            info.type = COGIPv6NetworkInterfaceSetConfiguration.class;
            info.name = "IPv6";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==5)
        {
            info.type = COGNetworkInterfaceSetConfigurationExtension.class;
            info.name = "Extension";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

