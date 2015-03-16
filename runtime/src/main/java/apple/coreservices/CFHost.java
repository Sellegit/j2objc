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
public class CFHost 
    extends CFType 
     {

    
    
    protected CFHost() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostCreateWithName")
    protected static native CFHost create(CFAllocator allocator, String hostname);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostCreateWithAddress")
    protected static native CFHost create(CFAllocator allocator, NSData addr);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostCreateCopy")
    protected static native CFHost createCopy(CFAllocator alloc, CFHost host);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostStartInfoResolution")
    protected static native boolean startInfoResolution(CFHost theHost, CFHostInfoType info, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostGetAddressing")
    protected static native NSArray<NSData> getAddressing(CFHost theHost, Todo hasBeenResolved);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostGetNames")
    protected static native List<String> getNames(CFHost theHost, Todo hasBeenResolved);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostGetReachability")
    protected static native NSData getReachability(CFHost theHost, Todo hasBeenResolved);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostCancelInfoResolution")
    public static native void cancelInfoResolution(CFHost theHost, CFHostInfoType info);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostSetClient")
    protected static native boolean setCallback(CFHost theHost, FunctionPtr clientCB, CFHostClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostScheduleWithRunLoop")
    public static native void schedule(CFHost theHost, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostUnscheduleFromRunLoop")
    public static native void unschedule(CFHost theHost, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStreamCreatePairWithSocketToCFHost")
    protected static native void createSocketStreamPair(CFAllocator alloc, CFHost host, int port, Todo readStream, Todo writeStream);
    
}
