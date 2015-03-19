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





@Library("Foundation/Foundation.h") @Mapping("NSStream")
public class NSStream 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSStream() { }
    
    
    @Mapping("delegate")
    public native NSStreamDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSStreamDelegate v);
    @Mapping("streamStatus")
    public native @Representing("NSStreamStatus") long getStreamStatus();
    @Mapping("streamError")
    public native NSError getStreamError();
    
    
    
    @Mapping("open")
    public native void open();
    @Mapping("close")
    public native void close();
    @Mapping("propertyForKey:")
    public native Object getProperty(String key);
    @Mapping("setProperty:forKey:")
    public native boolean setProperty(Object property, String key);
    @Mapping("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop(NSRunLoop aRunLoop, String mode);
    @Mapping("removeFromRunLoop:forMode:")
    public native void removeFromRunLoop(NSRunLoop aRunLoop, String mode);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getStreamsToHostWithName:port:inputStream:outputStream:")
    public static native void getStreamsToHost(String hostname, @MachineSizedSInt long port, Todo inputStream, Todo outputStream);
    
}
