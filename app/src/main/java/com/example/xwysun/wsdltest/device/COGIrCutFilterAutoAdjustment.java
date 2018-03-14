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

public class COGIrCutFilterAutoAdjustment extends AttributeContainer implements KvmSerializable
{

    
    public String BoundaryType;
    
    public Float BoundaryOffset;
    
    public String ResponseTime;
    
    public COGIrCutFilterAutoAdjustmentExtension Extension;
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
        if (info.name.equals("BoundaryType"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.BoundaryType = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.BoundaryType = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("BoundaryOffset"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.BoundaryOffset = new Float(j.toString());
                    }
                }
                else if (obj instanceof Float){
                    this.BoundaryOffset = (Float)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ResponseTime"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ResponseTime = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.ResponseTime = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Extension"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extension = (COGIrCutFilterAutoAdjustmentExtension)__envelope.get(j,COGIrCutFilterAutoAdjustmentExtension.class,false);
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
            return BoundaryType;
        }
        if(propertyIndex==1)
        {
            return this.BoundaryOffset!=null?this.BoundaryOffset:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ResponseTime!=null?this.ResponseTime:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Extension!=null?this.Extension:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BoundaryType";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==1)
        {
            info.type = Float.class;
            info.name = "BoundaryOffset";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ResponseTime";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==3)
        {
            info.type = COGIrCutFilterAutoAdjustmentExtension.class;
            info.name = "Extension";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

