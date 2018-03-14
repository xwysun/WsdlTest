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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;

public class COGNTPInformation extends AttributeContainer implements KvmSerializable
{

    
    public Boolean FromDHCP=false;
    
    public ArrayList< COGNetworkHost> NTPFromDHCP =new ArrayList<COGNetworkHost >();
    
    public ArrayList< COGNetworkHost> NTPManual =new ArrayList<COGNetworkHost >();
    
    public COGNTPInformationExtension Extension;
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
        if (info.name.equals("FromDHCP"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.FromDHCP = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.FromDHCP = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("NTPFromDHCP"))
        {
            if(obj!=null)
            {
                if(this.NTPFromDHCP==null)
                {
                    this.NTPFromDHCP = new java.util.ArrayList< COGNetworkHost>();
                }
                java.lang.Object j =obj;
                COGNetworkHost j1= (COGNetworkHost)__envelope.get(j,COGNetworkHost.class,false);
                this.NTPFromDHCP.add(j1);
            }
            return true;
        }
        if (info.name.equals("NTPManual"))
        {
            if(obj!=null)
            {
                if(this.NTPManual==null)
                {
                    this.NTPManual = new java.util.ArrayList< COGNetworkHost>();
                }
                java.lang.Object j =obj;
                COGNetworkHost j1= (COGNetworkHost)__envelope.get(j,COGNetworkHost.class,false);
                this.NTPManual.add(j1);
            }
            return true;
        }
        if (info.name.equals("Extension"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extension = (COGNTPInformationExtension)__envelope.get(j,COGNTPInformationExtension.class,false);
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
            return FromDHCP;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.NTPFromDHCP.size())
        {
            java.lang.Object NTPFromDHCP = this.NTPFromDHCP.get(propertyIndex-(1));
            return NTPFromDHCP!=null?NTPFromDHCP:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.NTPFromDHCP.size() && propertyIndex < 1+this.NTPFromDHCP.size()+this.NTPManual.size())
        {
            java.lang.Object NTPManual = this.NTPManual.get(propertyIndex-(1+this.NTPFromDHCP.size()));
            return NTPManual!=null?NTPManual:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==1+this.NTPFromDHCP.size()+this.NTPManual.size())
        {
            return this.Extension!=null?this.Extension:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+NTPFromDHCP.size()+NTPManual.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "FromDHCP";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.NTPFromDHCP.size())
        {
            info.type = COGNetworkHost.class;
            info.name = "NTPFromDHCP";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex>=1+this.NTPFromDHCP.size() && propertyIndex < 1+this.NTPFromDHCP.size()+this.NTPManual.size())
        {
            info.type = COGNetworkHost.class;
            info.name = "NTPManual";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1+this.NTPFromDHCP.size()+this.NTPManual.size())
        {
            info.type = COGNTPInformationExtension.class;
            info.name = "Extension";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

