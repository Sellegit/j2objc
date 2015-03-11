package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation") @Mapping("NSProcessInfo")
public class NSProcessInfo 
    extends NSObject 
     {

    
    
    
    
    
    @Mapping("environment")
    public native Map<String, NSObject> getEnvironment();
    @Mapping("arguments")
    public native List<String> getArguments();
    @Mapping("hostName")
    public native String getHostName();
    @Mapping("processName")
    public native String getProcessName();
    @Mapping("setProcessName:")
    public native void setProcessName(String v);
    @Mapping("processIdentifier")
    public native int getProcessIdentifier();
    @Mapping("globallyUniqueString")
    public native String getGloballyUniqueString();
    @Mapping("operatingSystemVersionString")
    public native String getOperatingSystemVersionString();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("operatingSystemVersion")
    public native NSOperatingSystemVersion getOperatingSystemVersion();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("processorCount")
    public native @MachineSizedUInt long getProcessorCount();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("activeProcessorCount")
    public native @MachineSizedUInt long getActiveProcessorCount();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("physicalMemory")
    public native long getPhysicalMemory();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("systemUptime")
    public native double getSystemUptime();
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("operatingSystem")
    public native NSOperatingSystem getOperatingSystem();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("operatingSystemName")
    public native String getOperatingSystemName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isOperatingSystemAtLeastVersion:")
    public native boolean isOperatingSystemAtLeastVersion(NSOperatingSystemVersion version);
    @Mapping("processInfo")
    public static native NSProcessInfo getSharedProcessInfo();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("beginActivityWithOptions:reason:")
    public native NSObject beginActivity(@Representing("NSActivityOptions") long options, String reason);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("endActivity:")
    public native void endActivity(NSObject activity);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("performActivityWithOptions:reason:usingBlock:")
    public native void performActivity(@Representing("NSActivityOptions") long options, String reason, @Block Runnable block);
    
}
