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
    protected native boolean startInfoResolution(CFHostInfoType info, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostGetAddressing")
    protected native NSArray<NSData> getAddressing(Todo hasBeenResolved);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostGetNames")
    protected native List<String> getNames(Todo hasBeenResolved);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostGetReachability")
    protected native NSData getReachability(Todo hasBeenResolved);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostCancelInfoResolution")
    public native void cancelInfoResolution(CFHostInfoType info);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostSetClient")
    protected native boolean setCallback(FunctionPtr clientCB, CFHostClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostScheduleWithRunLoop")
    public native void schedule(CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFHostUnscheduleFromRunLoop")
    public native void unschedule(CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStreamCreatePairWithSocketToCFHost")
    protected static native void createSocketStreamPair(CFAllocator alloc, CFHost host, int port, Todo readStream, Todo writeStream);
    
}
