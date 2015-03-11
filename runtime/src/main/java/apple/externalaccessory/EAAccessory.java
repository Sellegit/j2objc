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
 * @since Available in iOS 3.0 and later.
 */

@Library("ExternalAccessory") @Mapping("EAAccessory")
public class EAAccessory 
    extends NSObject 
     {

    
    public static final int ConnectionIDNone = 0;
    
    
    public EAAccessory() {}
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isConnected")
    public native boolean isConnected();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("connectionID")
    public native @MachineSizedUInt long getConnectionID();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("manufacturer")
    public native String getManufacturer();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("modelNumber")
    public native String getModelNumber();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("serialNumber")
    public native String getSerialNumber();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("firmwareRevision")
    public native String getFirmwareRevision();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("hardwareRevision")
    public native String getHardwareRevision();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("protocolStrings")
    public native List<String> getProtocolStrings();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("delegate")
    public native EAAccessoryDelegate getDelegate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    public native void setDelegate(EAAccessoryDelegate v);
    
    
    
    
    
}
