package apple.coreservices;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("CFNetwork/CFNetwork.h")
public class CFNetService 
    extends CFType 
     {

    
    
    protected CFNetService() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreate")
    protected static native CFNetService create(CFAllocator alloc, String domain, String serviceType, String name, int port);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateCopy")
    protected static native CFNetService createCopy(CFAllocator alloc, CFNetService service);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetDomain")
    public static native String getDomain(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetType")
    public static native String getType(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetName")
    public static native String getName(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceRegisterWithOptions")
    protected static native boolean register(CFNetService theService, @MachineSizedUInt long options, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceResolveWithTimeout")
    protected static native boolean resolve(CFNetService theService, double timeout, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCancel")
    public static native void cancel(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetTargetHost")
    public static native String getTargetHost(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetPortNumber")
    public static native int getPortNumber(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetAddressing")
    public static native NSArray<NSData> getAddressing(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetTXTData")
    public static native NSData getTXTData(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceSetTXTData")
    public static native boolean setTXTData(CFNetService theService, NSData txtRecord);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateDictionaryWithTXTData")
    protected static native NSDictionary<NSString, NSData> parseTXTData(CFAllocator alloc, NSData txtRecord);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateTXTDataWithDictionary")
    protected static native NSData createTXTData(CFAllocator alloc, CFDictionary keyValuePairs);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceSetClient")
    protected static native boolean setCallback(CFNetService theService, FunctionPtr clientCB, CFNetServiceClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceScheduleWithRunLoop")
    public static native void schedule(CFNetService theService, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceUnscheduleFromRunLoop")
    public static native void unschedule(CFNetService theService, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStreamCreatePairWithSocketToNetService")
    protected static native void createSocketStreamPair(CFAllocator alloc, CFNetService service, Todo readStream, Todo writeStream);
    
}
