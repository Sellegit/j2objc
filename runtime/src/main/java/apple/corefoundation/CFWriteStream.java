package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFWriteStream 
    extends CFType 
     {

    
    
    protected CFWriteStream() {}
    
    
    
    
    @GlobalFunction("CFWriteStreamGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFWriteStreamCreateWithBuffer")
    public static native CFWriteStream create(CFAllocator alloc, Todo buffer, @MachineSizedSInt long bufferCapacity);
    @GlobalFunction("CFWriteStreamCreateWithFile")
    public static native CFWriteStream create(CFAllocator alloc, CFURL fileURL);
    @GlobalFunction("CFWriteStreamGetStatus")
    public static native CFStreamStatus getStatus(CFWriteStream stream);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFWriteStreamCopyError")
    public static native CFError getError(CFWriteStream stream);
    @GlobalFunction("CFWriteStreamOpen")
    public static native boolean openStream(CFWriteStream stream);
    @GlobalFunction("CFWriteStreamClose")
    public static native void closeStream(CFWriteStream stream);
    @GlobalFunction("CFWriteStreamCanAcceptBytes")
    public static native boolean canAcceptBytes(CFWriteStream stream);
    @GlobalFunction("CFWriteStreamWrite")
    public static native @MachineSizedSInt long write(CFWriteStream stream, Todo buffer, @MachineSizedSInt long bufferLength);
    @GlobalFunction("CFWriteStreamCopyProperty")
    public static native CFType getProperty(CFWriteStream stream, String propertyName);
    @GlobalFunction("CFWriteStreamSetProperty")
    public static native boolean setProperty(CFWriteStream stream, String propertyName, CFType propertyValue);
    @GlobalFunction("CFWriteStreamSetClient")
    public static native boolean setClient(CFWriteStream stream, @MachineSizedUInt long streamEvents, FunctionPtr clientCB, CFStreamClientContext clientContext);
    @GlobalFunction("CFWriteStreamScheduleWithRunLoop")
    public static native void scheduleInRunLoop(CFWriteStream stream, CFRunLoop runLoop, String runLoopMode);
    @GlobalFunction("CFWriteStreamUnscheduleFromRunLoop")
    public static native void unscheduleFromRunLoop(CFWriteStream stream, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFWriteStreamSetDispatchQueue")
    public static native void setDispatchQueue(CFWriteStream stream, DispatchQueue q);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFWriteStreamCopyDispatchQueue")
    public static native DispatchQueue getDispatchQueue(CFWriteStream stream);
    @GlobalFunction("CFWriteStreamGetError")
    public static native CFStreamError getStreamError(CFWriteStream stream);
    
}
