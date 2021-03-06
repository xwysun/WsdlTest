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

public class COGOSDConfiguration extends COGDeviceEntity implements KvmSerializable
{

    
    public COGOSDReference VideoSourceConfigurationToken;
    
    public COGEnums.OSDType Type=COGEnums.OSDType.Text;
    
    public COGOSDPosConfiguration Position;
    
    public COGOSDTextConfiguration TextString;
    
    public COGOSDImgConfiguration Image;
    
    public COGOSDConfigurationExtension Extension;
    

    
    
    @Override
    public void loadFromSoap(java.lang.Object paramObj,COGExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        super.loadFromSoap(paramObj, __envelope);

    }

    @Override
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,COGExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("VideoSourceConfigurationToken"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.VideoSourceConfigurationToken = (COGOSDReference)__envelope.get(j,COGOSDReference.class,false);
            }
            return true;
        }
        if (info.name.equals("Type"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Type = COGEnums.OSDType.fromString(j.toString());
                    }
                }
                else if (obj instanceof COGEnums.OSDType){
                    this.Type = (COGEnums.OSDType)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Position"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Position = (COGOSDPosConfiguration)__envelope.get(j,COGOSDPosConfiguration.class,false);
            }
            return true;
        }
        if (info.name.equals("TextString"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.TextString = (COGOSDTextConfiguration)__envelope.get(j,COGOSDTextConfiguration.class,false);
            }
            return true;
        }
        if (info.name.equals("Image"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Image = (COGOSDImgConfiguration)__envelope.get(j,COGOSDImgConfiguration.class,false);
            }
            return true;
        }
        if (info.name.equals("Extension"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Extension = (COGOSDConfigurationExtension)__envelope.get(j,COGOSDConfigurationExtension.class,false);
            }
            return true;
        }
        return super.loadProperty(info,soapObject,__envelope);
    }
    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return this.VideoSourceConfigurationToken!=null?this.VideoSourceConfigurationToken.getSimpleValue():null;
        }
        if(propertyIndex==count+1)
        {
            return this.Type!=null?this.Type.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return Position;
        }
        if(propertyIndex==count+3)
        {
            return this.TextString!=null?this.TextString:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.Image!=null?this.Image:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.Extension!=null?this.Extension:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = org.ksoap2.serialization.SoapPrimitive.class;
            info.name = "VideoSourceConfigurationToken";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Type";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==count+2)
        {
            info.type = COGOSDPosConfiguration.class;
            info.name = "Position";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==count+3)
        {
            info.type = COGOSDTextConfiguration.class;
            info.name = "TextString";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==count+4)
        {
            info.type = COGOSDImgConfiguration.class;
            info.name = "Image";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        if(propertyIndex==count+5)
        {
            info.type = COGOSDConfigurationExtension.class;
            info.name = "Extension";
            info.namespace= "http://www.onvif.org/ver10/schema";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

