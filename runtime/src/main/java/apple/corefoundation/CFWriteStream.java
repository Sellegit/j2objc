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
@Library("CoreFoundation")
public class CFWriteStream 
    extends CFType 
     {

    
    
    protected CFWriteStream() {}
    
    
    
    
    @GlobalFunction("CFWriteStreamGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFWriteStreamCreateWithBuffer")
    protected static native CFWriteStream create(CFAllocator alloc, Todo buffer, @MachineSizedSInt long bufferCapacity);
    @GlobalFunction("CFWriteStreamCreateWithFile")
    protected static native CFWriteStream create(CFAllocator alloc, CFURL fileURL);
    @GlobalFunction("CFWriteStreamGetStatus")
    public native CFStreamStatus getStatus();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFWriteStreamCopyError")
    public native CFError getError();
    @GlobalFunction("CFWriteStreamOpen")
    public native boolean openStream();
    @GlobalFunction("CFWriteStreamClose")
    public native void closeStream();
    @GlobalFunction("CFWriteStreamCanAcceptBytes")
    public native boolean canAcceptBytes();
    @GlobalFunction("CFWriteStreamWrite")
    private native @MachineSizedSInt long write(Todo buffer, @MachineSizedSInt long bufferLength);
    @GlobalFunction("CFWriteStreamCopyProperty")
    public native CFType getProperty(String propertyName);
    @GlobalFunction("CFWriteStreamSetProperty")
    public native boolean setProperty(String propertyName, CFType propertyValue);
    @GlobalFunction("CFWriteStreamSetClient")
    private native boolean setClient(@MachineSizedUInt long streamEvents, FunctionPtr clientCB, CFStreamClientContext clientContext);
    @GlobalFunction("CFWriteStreamScheduleWithRunLoop")
    public native void scheduleInRunLoop(CFRunLoop runLoop, String runLoopMode);
    @GlobalFunction("CFWriteStreamUnscheduleFromRunLoop")
    public native void unscheduleFromRunLoop(CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFWriteStreamSetDispatchQueue")
    public native void setDispatchQueue(DispatchQueue q);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFWriteStreamCopyDispatchQueue")
    public native DispatchQueue getDispatchQueue();
    @GlobalFunction("CFWriteStreamGetError")
    public native CFStreamError getStreamError();
    
}
