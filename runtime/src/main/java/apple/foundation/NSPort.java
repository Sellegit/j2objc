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





@Library("Foundation") @Mapping("NSPort")
public class NSPort 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public NSPort() {}
    
    
    @Mapping("isValid")
    public native boolean isValid();
    @Mapping("reservedSpaceLength")
    public native @MachineSizedUInt long getReservedSpaceLength();
    
    
    
    @GlobalConstant("NSPortDidBecomeInvalidNotification")
    public static native NSString DidBecomeInvalidNotification();
    
    @Mapping("invalidate")
    public native void invalidate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSPortDelegate anObject);
    @Mapping("delegate")
    public native NSPortDelegate getDelegate();
    @Mapping("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop(NSRunLoop runLoop, String mode);
    @Mapping("removeFromRunLoop:forMode:")
    public native void removeFromRunLoop(NSRunLoop runLoop, String mode);
    @Mapping("sendBeforeDate:components:from:reserved:")
    public native boolean send(NSDate limitDate, NSMutableArray<?> components, NSPort receivePort, @MachineSizedUInt long headerSpaceReserved);
    @Mapping("sendBeforeDate:msgid:components:from:reserved:")
    public native boolean send(NSDate limitDate, @MachineSizedUInt long msgID, NSMutableArray<?> components, NSPort receivePort, @MachineSizedUInt long headerSpaceReserved);
    @Mapping("port")
    public static native NSPort create();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
