package apple.systemconfiguration;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("SystemConfiguration/SystemConfiguration.h")
public class SCNetworkReachability 
    extends CFType 
     {

    
    
    protected SCNetworkReachability() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilityCreateWithAddress")
    protected static native SCNetworkReachability create(CFAllocator allocator, Struct<?> address);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilityCreateWithAddressPair")
    protected static native SCNetworkReachability create(CFAllocator allocator, Struct<?> localAddress, Struct<?> remoteAddress);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilityCreateWithName")
    protected static native SCNetworkReachability create(CFAllocator allocator, Todo nodename);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilityGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilityGetFlags")
    protected static native boolean getFlags(SCNetworkReachability target, Todo flags);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilitySetCallback")
    protected static native boolean setCallback(SCNetworkReachability target, FunctionPtr callout, SCNetworkReachabilityContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilityScheduleWithRunLoop")
    public static native boolean schedule(SCNetworkReachability target, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilityUnscheduleFromRunLoop")
    public static native boolean unschedule(SCNetworkReachability target, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("SCNetworkReachabilitySetDispatchQueue")
    public static native boolean setDispatchQueue(SCNetworkReachability target, DispatchQueue queue);
    
}
