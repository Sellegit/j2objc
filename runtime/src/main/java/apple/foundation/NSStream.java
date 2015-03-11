package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation") @Mapping("NSStream")
public class NSStream 
    extends NSObject 
     {

    
    
    public NSStream() {}
    
    
    @Mapping("delegate")
    public native NSStreamDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSStreamDelegate v);
    @Mapping("streamStatus")
    public native @Representing("NSStreamStatus") @MachineSizedUInt long getStreamStatus();
    @Mapping("streamError")
    public native NSError getStreamError();
    
    
    
    @Mapping("open")
    public native void open();
    @Mapping("close")
    public native void close();
    @Mapping("propertyForKey:")
    public native Object getProperty(NSStreamProperty key);
    @Mapping("setProperty:forKey:")
    protected native boolean setProperty(Object property, NSStreamProperty key);
    @Mapping("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop(NSRunLoop aRunLoop, String mode);
    @Mapping("removeFromRunLoop:forMode:")
    public native void removeFromRunLoop(NSRunLoop aRunLoop, String mode);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getStreamsToHostWithName:port:inputStream:outputStream:")
    protected static native void getStreamsToHost(String hostname, @MachineSizedSInt long port, Todo inputStream, Todo outputStream);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getBoundStreamsWithBufferSize:inputStream:outputStream:")
    protected static native void getBoundStreams(@MachineSizedUInt long bufferSize, Todo inputStream, Todo outputStream);
    
}
