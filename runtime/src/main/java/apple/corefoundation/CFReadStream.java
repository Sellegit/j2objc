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
public class CFReadStream 
    extends CFType 
     {

    
    
    protected CFReadStream() {}
    
    
    
    
    @GlobalFunction("CFReadStreamGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFReadStreamCreateWithBytesNoCopy")
    public static native CFReadStream create(CFAllocator alloc, Todo bytes, @MachineSizedSInt long length, CFAllocator bytesDeallocator);
    @GlobalFunction("CFReadStreamCreateWithFile")
    public static native CFReadStream create(CFAllocator alloc, CFURL fileURL);
    @GlobalFunction("CFReadStreamGetStatus")
    public static native CFStreamStatus getStatus(CFReadStream stream);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFReadStreamCopyError")
    public static native CFError getError(CFReadStream stream);
    @GlobalFunction("CFReadStreamOpen")
    public static native boolean openStream(CFReadStream stream);
    @GlobalFunction("CFReadStreamClose")
    public static native void closeStream(CFReadStream stream);
    @GlobalFunction("CFReadStreamHasBytesAvailable")
    public static native boolean hasBytesAvailable(CFReadStream stream);
    @GlobalFunction("CFReadStreamRead")
    public static native @MachineSizedSInt long read(CFReadStream stream, Todo buffer, @MachineSizedSInt long bufferLength);
    @GlobalFunction("CFReadStreamGetBuffer")
    public static native Todo getBuffer(CFReadStream stream, @MachineSizedSInt long maxBytesToRead, Todo numBytesRead);
    @GlobalFunction("CFReadStreamCopyProperty")
    public static native CFType getProperty(CFReadStream stream, String propertyName);
    @GlobalFunction("CFReadStreamSetProperty")
    public static native boolean setProperty(CFReadStream stream, String propertyName, CFType propertyValue);
    @GlobalFunction("CFReadStreamSetClient")
    public static native boolean setClient(CFReadStream stream, @MachineSizedUInt long streamEvents, FunctionPtr clientCB, CFStreamClientContext clientContext);
    @GlobalFunction("CFReadStreamScheduleWithRunLoop")
    public static native void scheduleInRunLoop(CFReadStream stream, CFRunLoop runLoop, String runLoopMode);
    @GlobalFunction("CFReadStreamUnscheduleFromRunLoop")
    public static native void unscheduleFromRunLoop(CFReadStream stream, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFReadStreamSetDispatchQueue")
    public static native void setDispatchQueue(CFReadStream stream, DispatchQueue q);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFReadStreamCopyDispatchQueue")
    public static native DispatchQueue getDispatchQueue(CFReadStream stream);
    @GlobalFunction("CFReadStreamGetError")
    public static native CFStreamError getStreamError(CFReadStream stream);
    
}
