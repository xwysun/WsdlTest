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

public class COGSetDNS extends AttributeContainer implements KvmSerializable
{

    
    public Boolean FromDHCP=false;
    
    public ArrayList< String> SearchDomain =new ArrayList<String >();
    
    public ArrayList< COGIPAddress> DNSManual =new ArrayList<COGIPAddress >();
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
        if (info.name.equals("SearchDomain"))
        {
            if(obj!=null)
            {
                if(this.SearchDomain==null)
                {
                    this.SearchDomain = new java.util.ArrayList< String>();
                }
                java.lang.Object j =obj;
                String j1= j.toString();
                this.SearchDomain.add(j1);
            }
            return true;
        }
        if (info.name.equals("DNSManual"))
        {
            if(obj!=null)
            {
                if(this.DNSManual==null)
                {
                    this.DNSManual = new java.util.ArrayList< COGIPAddress>();
                }
                java.lang.Object j =obj;
                COGIPAddress j1= (COGIPAddress)__envelope.get(j,COGIPAddress.class,false);
                this.DNSManual.add(j1);
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
        if(propertyIndex>=1 && propertyIndex < 1+this.SearchDomain.size())
        {
            java.lang.Object SearchDomain = this.SearchDomain.get(propertyIndex-(1));
            return SearchDomain!=null?SearchDomain:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=1+this.SearchDomain.size() && propertyIndex < 1+this.SearchDomain.size()+this.DNSManual.size())
        {
            java.lang.Object DNSManual = this.DNSManual.get(propertyIndex-(1+this.SearchDomain.size()));
            return DNSManual!=null?DNSManual:SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+SearchDomain.size()+DNSManual.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "FromDHCP";
            info.namespace= "http://www.onvif.org/ver10/device/wsdl";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.SearchDomain.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SearchDomain";
            info.namespace= "http://www.onvif.org/ver10/device/wsdl";
        }
        if(propertyIndex>=1+this.SearchDomain.size() && propertyIndex < 1+this.SearchDomain.size()+this.DNSManual.size())
        {
            info.type = COGIPAddress.class;
            info.name = "DNSManual";
            info.namespace= "http://www.onvif.org/ver10/device/wsdl";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
