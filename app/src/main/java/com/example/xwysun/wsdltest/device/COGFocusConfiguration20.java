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

public class COGFocusConfiguration20 extends AttributeContainer implements KvmSerializable
{

    
    public COGEnums.AutoFocusMode AutoFocusMode=COGEnums.AutoFocusMode.AUTO;
    
    public Float DefaultSpeed;
    
    public Float NearLimit;
    
    public Float FarLimit;
    
    public COGFocusConfiguration20Extension Extension;
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
        if (info.name.equals("AutoFocusMode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.AutoFocusMode = COGEnums.AutoFocusMode.fromString(j.toString());
                    }
                }
                else if (obj instanceof COGEnums.AutoFocusMode){
                    this.AutoFocusMode = (COGEnums.AutoFocusMode)obj;
                }
            }
            return true;
        }
        if (info.name.equals("DefaultSpeed"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.DefaultSpeed = new Float(j.toString());
                    }
                }
                else if (obj instanceof Float){
                    this.DefaultSpeed = (Float)obj;
                }
            }
            return true;
        }
        if (info.name.equals("NearLimit"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.NearLimit = new Float(j.toString());
                    }
                }
                else if (obj instanceof Float){
                    this.NearLimit = (Float)obj;
                }
            }
            return true;
        }
        if (info.name.equals("FarLimit"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.FarLimit = new Float(j.toString());
                    }
                }
                else if (obj instanceof Float){
                    this.FarLimit = (Float)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Extension"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extension = (COGFocusConfiguration20Extension)__envelope.get(j,COGFocusConfiguration20Extension.class,false);
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
            return this.AutoFocusMode!=null?this.AutoFocusMode.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.DefaultSpeed!=null?this.DefaultSpeed:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.NearLimit!=null?this.NearLimit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.FarLimit!=null?this.FarLimit:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.Extension!=null?this.Extension:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AutoFocusMode";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1)
        {
            info.type = Float.class;
            info.name = "DefaultSpeed";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==2)
        {
            info.type = Float.class;
            info.name = "NearLimit";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==3)
        {
            info.type = Float.class;
            info.name = "FarLimit";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==4)
        {
            info.type = COGFocusConfiguration20Extension.class;
            info.name = "Extension";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

