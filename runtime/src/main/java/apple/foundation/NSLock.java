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





@Library("Foundation") @Mapping("NSLock")
public class NSLock 
    extends NSObject 
    implements NSLocking {

    
    
    public NSLock() {}
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setName:")
    public native void setName(String v);
    
    
    
    @Mapping("tryLock")
    public native boolean tryLock();
    @Mapping("lockBeforeDate:")
    public native boolean lock(NSDate limit);
    @Mapping("lock")
    public native void lock();
    @Mapping("unlock")
    public native void unlock();
    
}
