package com.example.xwysun.wsdltest.device;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.2.8.3
//
// Created by Quasar Development 
//
//---------------------------------------------------





public class COGEnums
{

    public enum ScopeDefinition
    {
        
        Fixed(0),
        
        Configurable(1);
        
        private int code;
        
        ScopeDefinition(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ScopeDefinition fromString(String str)
        {
            if (str.equals("Fixed"))
                return Fixed;
            if (str.equals("Configurable"))
                return Configurable;
		    return null;
        }
    }

    public enum DiscoveryMode
    {
        
        Discoverable(0),
        
        NonDiscoverable(1);
        
        private int code;
        
        DiscoveryMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static DiscoveryMode fromString(String str)
        {
            if (str.equals("Discoverable"))
                return Discoverable;
            if (str.equals("NonDiscoverable"))
                return NonDiscoverable;
		    return null;
        }
    }

    public enum Duplex
    {
        
        Full(0),
        
        Half(1);
        
        private int code;
        
        Duplex(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static Duplex fromString(String str)
        {
            if (str.equals("Full"))
                return Full;
            if (str.equals("Half"))
                return Half;
		    return null;
        }
    }

    public enum IPv6DHCPConfiguration
    {
        
        Auto(0),
        
        Stateful(1),
        
        Stateless(2),
        
        Off(3);
        
        private int code;
        
        IPv6DHCPConfiguration(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static IPv6DHCPConfiguration fromString(String str)
        {
            if (str.equals("Auto"))
                return Auto;
            if (str.equals("Stateful"))
                return Stateful;
            if (str.equals("Stateless"))
                return Stateless;
            if (str.equals("Off"))
                return Off;
		    return null;
        }
    }

    public enum NetworkProtocolType
    {
        
        HTTP(0),
        
        HTTPS(1),
        
        RTSP(2);
        
        private int code;
        
        NetworkProtocolType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static NetworkProtocolType fromString(String str)
        {
            if (str.equals("HTTP"))
                return HTTP;
            if (str.equals("HTTPS"))
                return HTTPS;
            if (str.equals("RTSP"))
                return RTSP;
		    return null;
        }
    }

    public enum NetworkHostType
    {
        
        IPv4(0),
        
        IPv6(1),
        
        DNS(2);
        
        private int code;
        
        NetworkHostType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static NetworkHostType fromString(String str)
        {
            if (str.equals("IPv4"))
                return IPv4;
            if (str.equals("IPv6"))
                return IPv6;
            if (str.equals("DNS"))
                return DNS;
		    return null;
        }
    }

    public enum IPType
    {
        
        IPv4(0),
        
        IPv6(1);
        
        private int code;
        
        IPType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static IPType fromString(String str)
        {
            if (str.equals("IPv4"))
                return IPv4;
            if (str.equals("IPv6"))
                return IPv6;
		    return null;
        }
    }

    public enum DynamicDNSType
    {
        
        NoUpdate(0),
        
        ClientUpdates(1),
        
        ServerUpdates(2);
        
        private int code;
        
        DynamicDNSType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static DynamicDNSType fromString(String str)
        {
            if (str.equals("NoUpdate"))
                return NoUpdate;
            if (str.equals("ClientUpdates"))
                return ClientUpdates;
            if (str.equals("ServerUpdates"))
                return ServerUpdates;
		    return null;
        }
    }

    public enum Dot11StationMode
    {
        
        Ad_x002D_hoc(0,"Ad-hoc"),
        
        Infrastructure(1,"Infrastructure"),
        
        Extended(2,"Extended");
        
        private int code;
        private java.lang.String xmlValue;
        
        Dot11StationMode(int code ,java.lang.String xmlValue){
            this.code = code;
            this.xmlValue=xmlValue;
        }
    
        public int getCode(){
		    return code;
	    }
    
        @Override
        public String toString() {
            return xmlValue;
        }

        public static Dot11StationMode fromString(String str)
        {
            if (str.equals("Ad-hoc"))
                return Ad_x002D_hoc;
            if (str.equals("Infrastructure"))
                return Infrastructure;
            if (str.equals("Extended"))
                return Extended;
		    return null;
        }
    }

    public enum Dot11SecurityMode
    {
        
        None(0),
        
        WEP(1),
        
        PSK(2),
        
        Dot1X(3),
        
        Extended(4);
        
        private int code;
        
        Dot11SecurityMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static Dot11SecurityMode fromString(String str)
        {
            if (str.equals("None"))
                return None;
            if (str.equals("WEP"))
                return WEP;
            if (str.equals("PSK"))
                return PSK;
            if (str.equals("Dot1X"))
                return Dot1X;
            if (str.equals("Extended"))
                return Extended;
		    return null;
        }
    }

    public enum Dot11Cipher
    {
        
        CCMP(0),
        
        TKIP(1),
        
        Any(2),
        
        Extended(3);
        
        private int code;
        
        Dot11Cipher(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static Dot11Cipher fromString(String str)
        {
            if (str.equals("CCMP"))
                return CCMP;
            if (str.equals("TKIP"))
                return TKIP;
            if (str.equals("Any"))
                return Any;
            if (str.equals("Extended"))
                return Extended;
		    return null;
        }
    }

    public enum CapabilityCategory
    {
        
        All(0),
        
        Analytics(1),
        
        Device(2),
        
        Events(3),
        
        Imaging(4),
        
        Media(5),
        
        PTZ(6);
        
        private int code;
        
        CapabilityCategory(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static CapabilityCategory fromString(String str)
        {
            if (str.equals("All"))
                return All;
            if (str.equals("Analytics"))
                return Analytics;
            if (str.equals("Device"))
                return Device;
            if (str.equals("Events"))
                return Events;
            if (str.equals("Imaging"))
                return Imaging;
            if (str.equals("Media"))
                return Media;
            if (str.equals("PTZ"))
                return PTZ;
		    return null;
        }
    }

    public enum SystemLogType
    {
        
        System(0),
        
        Access(1);
        
        private int code;
        
        SystemLogType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SystemLogType fromString(String str)
        {
            if (str.equals("System"))
                return System;
            if (str.equals("Access"))
                return Access;
		    return null;
        }
    }

    public enum FactoryDefaultType
    {
        
        Hard(0),
        
        Soft(1);
        
        private int code;
        
        FactoryDefaultType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static FactoryDefaultType fromString(String str)
        {
            if (str.equals("Hard"))
                return Hard;
            if (str.equals("Soft"))
                return Soft;
		    return null;
        }
    }

    public enum SetDateTimeType
    {
        
        Manual(0),
        
        NTP(1);
        
        private int code;
        
        SetDateTimeType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SetDateTimeType fromString(String str)
        {
            if (str.equals("Manual"))
                return Manual;
            if (str.equals("NTP"))
                return NTP;
		    return null;
        }
    }

    public enum UserLevel
    {
        
        Administrator(0),
        
        Operator(1),
        
        User(2),
        
        Anonymous(3),
        
        Extended(4);
        
        private int code;
        
        UserLevel(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static UserLevel fromString(String str)
        {
            if (str.equals("Administrator"))
                return Administrator;
            if (str.equals("Operator"))
                return Operator;
            if (str.equals("User"))
                return User;
            if (str.equals("Anonymous"))
                return Anonymous;
            if (str.equals("Extended"))
                return Extended;
		    return null;
        }
    }

    public enum RelayIdleState
    {
        
        closed(0),
        
        open(1);
        
        private int code;
        
        RelayIdleState(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static RelayIdleState fromString(String str)
        {
            if (str.equals("closed"))
                return closed;
            if (str.equals("open"))
                return open;
		    return null;
        }
    }

    public enum RelayMode
    {
        
        Monostable(0),
        
        Bistable(1);
        
        private int code;
        
        RelayMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static RelayMode fromString(String str)
        {
            if (str.equals("Monostable"))
                return Monostable;
            if (str.equals("Bistable"))
                return Bistable;
		    return null;
        }
    }

    public enum DigitalIdleState
    {
        
        closed(0),
        
        open(1);
        
        private int code;
        
        DigitalIdleState(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static DigitalIdleState fromString(String str)
        {
            if (str.equals("closed"))
                return closed;
            if (str.equals("open"))
                return open;
		    return null;
        }
    }

    public enum PTZPresetTourOperation
    {
        
        Start(0),
        
        Stop(1),
        
        Pause(2),
        
        Extended(3);
        
        private int code;
        
        PTZPresetTourOperation(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static PTZPresetTourOperation fromString(String str)
        {
            if (str.equals("Start"))
                return Start;
            if (str.equals("Stop"))
                return Stop;
            if (str.equals("Pause"))
                return Pause;
            if (str.equals("Extended"))
                return Extended;
		    return null;
        }
    }

    public enum AutoFocusMode
    {
        
        AUTO(0),
        
        MANUAL(1);
        
        private int code;
        
        AutoFocusMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static AutoFocusMode fromString(String str)
        {
            if (str.equals("AUTO"))
                return AUTO;
            if (str.equals("MANUAL"))
                return MANUAL;
		    return null;
        }
    }

    public enum WideDynamicMode
    {
        
        OFF(0),
        
        ON(1);
        
        private int code;
        
        WideDynamicMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static WideDynamicMode fromString(String str)
        {
            if (str.equals("OFF"))
                return OFF;
            if (str.equals("ON"))
                return ON;
		    return null;
        }
    }

    public enum BacklightCompensationMode
    {
        
        OFF(0),
        
        ON(1);
        
        private int code;
        
        BacklightCompensationMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static BacklightCompensationMode fromString(String str)
        {
            if (str.equals("OFF"))
                return OFF;
            if (str.equals("ON"))
                return ON;
		    return null;
        }
    }

    public enum ExposurePriority
    {
        
        LowNoise(0),
        
        FrameRate(1);
        
        private int code;
        
        ExposurePriority(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ExposurePriority fromString(String str)
        {
            if (str.equals("LowNoise"))
                return LowNoise;
            if (str.equals("FrameRate"))
                return FrameRate;
		    return null;
        }
    }

    public enum ExposureMode
    {
        
        AUTO(0),
        
        MANUAL(1);
        
        private int code;
        
        ExposureMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ExposureMode fromString(String str)
        {
            if (str.equals("AUTO"))
                return AUTO;
            if (str.equals("MANUAL"))
                return MANUAL;
		    return null;
        }
    }

    public enum WhiteBalanceMode
    {
        
        AUTO(0),
        
        MANUAL(1);
        
        private int code;
        
        WhiteBalanceMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static WhiteBalanceMode fromString(String str)
        {
            if (str.equals("AUTO"))
                return AUTO;
            if (str.equals("MANUAL"))
                return MANUAL;
		    return null;
        }
    }

    public enum IrCutFilterMode
    {
        
        ON(0),
        
        OFF(1),
        
        AUTO(2);
        
        private int code;
        
        IrCutFilterMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static IrCutFilterMode fromString(String str)
        {
            if (str.equals("ON"))
                return ON;
            if (str.equals("OFF"))
                return OFF;
            if (str.equals("AUTO"))
                return AUTO;
		    return null;
        }
    }

    public enum ImageStabilizationMode
    {
        
        OFF(0),
        
        ON(1),
        
        AUTO(2),
        
        Extended(3);
        
        private int code;
        
        ImageStabilizationMode(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ImageStabilizationMode fromString(String str)
        {
            if (str.equals("OFF"))
                return OFF;
            if (str.equals("ON"))
                return ON;
            if (str.equals("AUTO"))
                return AUTO;
            if (str.equals("Extended"))
                return Extended;
		    return null;
        }
    }

    public enum OSDType
    {
        
        Text(0),
        
        Image(1),
        
        Extended(2);
        
        private int code;
        
        OSDType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static OSDType fromString(String str)
        {
            if (str.equals("Text"))
                return Text;
            if (str.equals("Image"))
                return Image;
            if (str.equals("Extended"))
                return Extended;
		    return null;
        }
    }

}