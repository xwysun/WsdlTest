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

public class COGIOCapabilitiesExtension extends AttributeContainer implements KvmSerializable
{

    
    public Boolean Auxiliary;
    
    public ArrayList< String> AuxiliaryCommands =new ArrayList<String >();
    
    public COGIOCapabilitiesExtension2 Extension;
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
        if (info.name.equals("Auxiliary"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Auxiliary = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.Auxiliary = (Boolean)obj;
                }
            }
            return true;
        }
        if (info.name.equals("AuxiliaryCommands"))
        {
            if(obj!=null)
            {
                if(this.AuxiliaryCommands==null)
                {
                    this.AuxiliaryCommands = new java.util.ArrayList< String>();
                }
                java.lang.Object j =obj;
                String j1= j.toString();
                this.AuxiliaryCommands.add(j1);
            }
            return true;
        }
        if (info.name.equals("Extension"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extension = (COGIOCapabilitiesExtension2)__envelope.get(j,COGIOCapabilitiesExtension2.class,false);
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
            return this.Auxiliary!=null?this.Auxiliary:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.AuxiliaryCommands.size())
        {
            java.lang.Object AuxiliaryCommands = this.AuxiliaryCommands.get(propertyIndex-(1));
            return AuxiliaryCommands!=null?AuxiliaryCommands:SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==1+this.AuxiliaryCommands.size())
        {
            return Extension;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+AuxiliaryCommands.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "Auxiliary";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex>=1 && propertyIndex < 1+this.AuxiliaryCommands.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AuxiliaryCommands";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1+this.AuxiliaryCommands.size())
        {
            info.type = COGIOCapabilitiesExtension2.class;
            info.name = "Extension";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
