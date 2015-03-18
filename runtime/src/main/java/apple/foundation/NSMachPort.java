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





@Library("Foundation/Foundation.h") @Mapping("NSMachPort")
public class NSMachPort 
    extends NSPort 
     {

    
    
    @Mapping("initWithMachPort:")
    public NSMachPort(int machPort) { }
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("initWithMachPort:options:")
    public NSMachPort(int machPort, @MachineSizedUInt long f) { }
    @Mapping("initWithCoder:")
    public NSMachPort(NSCoder aDecoder) { }
    @Mapping("init")
    public NSMachPort() { }
    
    
    @Mapping("machPort")
    public native int getMachPort();
    
    
    
    @Mapping("setDelegate:")
    public native void setDelegate(NSMachPortDelegate anObject);
    @Mapping("delegate")
    public native NSMachPortDelegate getMachDelegate();
    @Mapping("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop(NSRunLoop runLoop, String mode);
    @Mapping("removeFromRunLoop:forMode:")
    public native void removeFromRunLoop(NSRunLoop runLoop, String mode);
    @Mapping("portWithMachPort:")
    public static native NSPort create(int machPort);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("portWithMachPort:options:")
    public static native NSPort create(int machPort, @MachineSizedUInt long f);
    
}
