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
@Library("CFNetwork")
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
    public native String getDomain();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetType")
    public native String getType();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetName")
    public native String getName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceRegisterWithOptions")
    protected native boolean register(CFNetServiceOptions options, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceResolveWithTimeout")
    protected native boolean resolve(double timeout, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCancel")
    public native void cancel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetTargetHost")
    public native String getTargetHost();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetPortNumber")
    public native int getPortNumber();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetAddressing")
    public native NSArray<NSData> getAddressing();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetTXTData")
    public native NSData getTXTData();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceSetTXTData")
    public native boolean setTXTData(NSData txtRecord);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateDictionaryWithTXTData")
    protected static native NSDictionary<NSString, NSData> parseTXTData(CFAllocator alloc, NSData txtRecord);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateTXTDataWithDictionary")
    protected static native NSData createTXTData(CFAllocator alloc, NSDictionary<NSString, ?> keyValuePairs);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceSetClient")
    protected native boolean setCallback(FunctionPtr clientCB, CFNetServiceClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceScheduleWithRunLoop")
    public native void schedule(CFRunLoop runLoop, CFString runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceUnscheduleFromRunLoop")
    public native void unschedule(CFRunLoop runLoop, CFString runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStreamCreatePairWithSocketToNetService")
    protected static native void createSocketStreamPair(CFAllocator alloc, CFNetService service, Todo readStream, Todo writeStream);
    
}
