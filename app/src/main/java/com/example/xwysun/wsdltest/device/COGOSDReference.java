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

public class COGOSDReference  
{

    
    public String value;
    private transient java.lang.Object __source;    
    

    
    
    
    public void loadFromSoap(java.lang.Object paramObj,COGExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        if(!(inObj instanceof SoapObject))
        {
            java.lang.Object j =(java.lang.Object)inObj;
            value = j.toString();
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,COGExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("value"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.value = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.value = (String)obj;
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
    
    public Object getSimpleValue()
    {
        Object value=this.value != null ? this.value.toString() : "";
        SoapPrimitive primitive = new SoapPrimitive("http://www.onvif.org/ver10/schema", "value",value);
        
        return primitive;
    }    
}

