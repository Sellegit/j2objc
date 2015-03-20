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
@Mapping("CFNetServiceRef") @Library("CFNetwork/CFNetwork.h")
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
    public static native CFNetService create(CFAllocator alloc, CFString domain, CFString serviceType, CFString name, int port);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateCopy")
    public static native CFNetService createCopy(CFAllocator alloc, CFNetService service);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetDomain")
    public static native CFString getDomain(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetType")
    public static native CFString getType(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetName")
    public static native CFString getName(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceRegisterWithOptions")
    public static native boolean register(CFNetService theService, @MachineSizedUInt long options, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceResolveWithTimeout")
    public static native boolean resolve(CFNetService theService, double timeout, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCancel")
    public static native void cancel(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceGetTargetHost")
    public static native CFString getTargetHost(CFNetService theService);
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
    public static native CFData getTXTData(CFNetService theService);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceSetTXTData")
    public static native boolean setTXTData(CFNetService theService, CFData txtRecord);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateDictionaryWithTXTData")
    public static native NSDictionary<NSString, NSData> parseTXTData(CFAllocator alloc, CFData txtRecord);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceCreateTXTDataWithDictionary")
    public static native CFData createTXTData(CFAllocator alloc, CFDictionary keyValuePairs);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceSetClient")
    public static native boolean setCallback(CFNetService theService, FunctionPtr clientCB, CFNetServiceClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceScheduleWithRunLoop")
    public static native void schedule(CFNetService theService, CFRunLoop runLoop, CFString runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceUnscheduleFromRunLoop")
    public static native void unschedule(CFNetService theService, CFRunLoop runLoop, CFString runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStreamCreatePairWithSocketToNetService")
    public static native void createSocketStreamPair(CFAllocator alloc, CFNetService service, Todo readStream, Todo writeStream);
    
}
