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
public class CFReadStream 
    extends CFType 
     {

    
    
    protected CFReadStream() {}
    
    
    
    
    @GlobalFunction("CFReadStreamGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFReadStreamCreateWithBytesNoCopy")
    protected static native CFReadStream create(CFAllocator alloc, @Pointer long bytes, @MachineSizedSInt long length, CFAllocator bytesDeallocator);
    @GlobalFunction("CFReadStreamCreateWithFile")
    protected static native CFReadStream create(CFAllocator alloc, CFURL fileURL);
    @GlobalFunction("CFReadStreamGetStatus")
    public native CFStreamStatus getStatus();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFReadStreamCopyError")
    public native CFError getError();
    @GlobalFunction("CFReadStreamOpen")
    public native boolean openStream();
    @GlobalFunction("CFReadStreamClose")
    public native void closeStream();
    @GlobalFunction("CFReadStreamHasBytesAvailable")
    public native boolean hasBytesAvailable();
    @GlobalFunction("CFReadStreamRead")
    private native @MachineSizedSInt long read(@Pointer long buffer, @MachineSizedSInt long bufferLength);
    @GlobalFunction("CFReadStreamGetBuffer")
    private native Todo getBuffer(@MachineSizedSInt long maxBytesToRead, Todo numBytesRead);
    @GlobalFunction("CFReadStreamCopyProperty")
    public native CFType getProperty(CFStreamProperty propertyName);
    @GlobalFunction("CFReadStreamSetProperty")
    public native boolean setProperty(CFStreamProperty propertyName, CFType propertyValue);
    @GlobalFunction("CFReadStreamSetClient")
    private native boolean setClient(CFStreamEventType streamEvents, FunctionPtr clientCB, CFStreamClientContext clientContext);
    @GlobalFunction("CFReadStreamScheduleWithRunLoop")
    public native void scheduleInRunLoop(CFRunLoop runLoop, String runLoopMode);
    @GlobalFunction("CFReadStreamUnscheduleFromRunLoop")
    public native void unscheduleFromRunLoop(CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFReadStreamSetDispatchQueue")
    public native void setDispatchQueue(DispatchQueue q);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFReadStreamCopyDispatchQueue")
    public native DispatchQueue getDispatchQueue();
    @GlobalFunction("CFReadStreamGetError")
    public native CFStreamError getStreamError();
    
}
