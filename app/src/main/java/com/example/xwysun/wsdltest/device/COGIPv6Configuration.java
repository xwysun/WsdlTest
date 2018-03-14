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

public class COGIPv6Configuration extends AttributeContainer implements KvmSerializable
{

    
    public Boolean AcceptRouterAdvert;
    
    public COGEnums.IPv6DHCPConfiguration DHCP=COGEnums.IPv6DHCPConfiguration.Auto;
    
    public ArrayList< COGPrefixedIPv6Address> Manual =new ArrayList<COGPrefixedIPv6Address >();
    
    public ArrayList< COGPrefixedIPv6Address> LinkLocal =new ArrayList<COGPrefixedIPv6Address >();
    
    public ArrayList< COGPrefixedIPv6Address> FromDHCP =new ArrayList<COGPrefixedIPv6Address >();
    
    public ArrayList< COGPrefixedIPv6Address> FromRA =new ArrayList<COGPrefixedIPv6Address >();
    
    public COGIPv6ConfigurationExtension Extension;
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
        if (info.name.equals("AcceptRouterAdvert"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.AcceptRouterAdvert = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.AcceptRouterAdvert = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("DHCP"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.DHCP = COGEnums.IPv6DHCPConfiguration.fromString(j.toString());
                    }
                }
                else if (obj instanceof COGEnums.IPv6DHCPConfiguration){
                    this.DHCP = (COGEnums.IPv6DHCPConfiguration)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Manual"))
        {
            if(obj!=null)
            {
                if(this.Manual==null)
                {
                    this.Manual = new java.util.ArrayList< COGPrefixedIPv6Address>();
                }
                java.lang.Object j =obj;
                COGPrefixedIPv6Address j1= (COGPrefixedIPv6Address)__envelope.get(j,COGPrefixedIPv6Address.class,false);
                this.Manual.add(j1);
            }
            return true;
        }
        if (info.name.equals("LinkLocal"))
        {
            if(obj!=null)
            {
                if(this.LinkLocal==null)
                {
                    this.LinkLocal = new java.util.ArrayList< COGPrefixedIPv6Address>();
                }
                java.lang.Object j =obj;
                COGPrefixedIPv6Address j1= (COGPrefixedIPv6Address)__envelope.get(j,COGPrefixedIPv6Address.class,false);
                this.LinkLocal.add(j1);
            }
            return true;
        }
        if (info.name.equals("FromDHCP"))
        {
            if(obj!=null)
            {
                if(this.FromDHCP==null)
                {
                    this.FromDHCP = new java.util.ArrayList< COGPrefixedIPv6Address>();
                }
                java.lang.Object j =obj;
                COGPrefixedIPv6Address j1= (COGPrefixedIPv6Address)__envelope.get(j,COGPrefixedIPv6Address.class,false);
                this.FromDHCP.add(j1);
            }
            return true;
        }
        if (info.name.equals("FromRA"))
        {
            if(obj!=null)
            {
                if(this.FromRA==null)
                {
                    this.FromRA = new java.util.ArrayList< COGPrefixedIPv6Address>();
                }
                java.lang.Object j =obj;
                COGPrefixedIPv6Address j1= (COGPrefixedIPv6Address)__envelope.get(j,COGPrefixedIPv6Address.class,false);
                this.FromRA.add(j1);
            }
            return true;
        }
        if (info.name.equals("Extension"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extension = (COGIPv6ConfigurationExtension)__envelope.get(j,COGIPv6ConfigurationExtension.class,false);
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
            return this.AcceptRouterAdvert!=null?this.AcceptRouterAdvert:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.DHCP!=null?this.DHCP.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=2 && propertyIndex < 2+this.Manual.size())
        {
            java.lang.Object Manual = this.Manual.get(propertyIndex-(2));
            return Manual!=null?Manual:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=2+this.Manual.size() && propertyIndex < 2+this.Manual.size()+this.LinkLocal.size())
        {
            java.lang.Object LinkLocal = this.LinkLocal.get(propertyIndex-(2+this.Manual.size()));
            return LinkLocal!=null?LinkLocal:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=2+this.Manual.size()+this.LinkLocal.size() && propertyIndex < 2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size())
        {
            java.lang.Object FromDHCP = this.FromDHCP.get(propertyIndex-(2+this.Manual.size()+this.LinkLocal.size()));
            return FromDHCP!=null?FromDHCP:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex>=2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size() && propertyIndex < 2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size()+this.FromRA.size())
        {
            java.lang.Object FromRA = this.FromRA.get(propertyIndex-(2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size()));
            return FromRA!=null?FromRA:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size()+this.FromRA.size())
        {
            return this.Extension!=null?this.Extension:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3+Manual.size()+LinkLocal.size()+FromDHCP.size()+FromRA.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "AcceptRouterAdvert";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "DHCP";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex>=2 && propertyIndex < 2+this.Manual.size())
        {
            info.type = COGPrefixedIPv6Address.class;
            info.name = "Manual";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex>=2+this.Manual.size() && propertyIndex < 2+this.Manual.size()+this.LinkLocal.size())
        {
            info.type = COGPrefixedIPv6Address.class;
            info.name = "LinkLocal";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex>=2+this.Manual.size()+this.LinkLocal.size() && propertyIndex < 2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size())
        {
            info.type = COGPrefixedIPv6Address.class;
            info.name = "FromDHCP";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex>=2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size() && propertyIndex < 2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size()+this.FromRA.size())
        {
            info.type = COGPrefixedIPv6Address.class;
            info.name = "FromRA";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==2+this.Manual.size()+this.LinkLocal.size()+this.FromDHCP.size()+this.FromRA.size())
        {
            info.type = COGIPv6ConfigurationExtension.class;
            info.name = "Extension";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
