package apple.externalaccessory;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("ExternalAccessory") @Mapping("EAWiFiUnconfiguredAccessory")
public class EAWiFiUnconfiguredAccessory 
    extends NSObject 
     {

    
    
    public EAWiFiUnconfiguredAccessory() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("manufacturer")
    public native String getManufacturer();
    @Mapping("model")
    public native String getModel();
    @Mapping("ssid")
    public native String getSsid();
    @Mapping("macAddress")
    public native String getMacAddress();
    @Mapping("properties")
    public native @Representing("EAWiFiUnconfiguredAccessoryProperties") @MachineSizedUInt long getProperties();
    
    
    
    
    
}
