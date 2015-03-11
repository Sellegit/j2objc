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





@Library("Foundation") @Mapping("NSConditionLock")
public class NSConditionLock 
    extends NSObject 
    implements NSLocking {

    
    
    public NSConditionLock() {}
    @Mapping("initWithCondition:")
    public NSConditionLock(@MachineSizedSInt long condition) { }
    
    
    @Mapping("condition")
    public native @MachineSizedSInt long getCondition();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setName(String v);
    
    
    
    @Mapping("lockWhenCondition:")
    public native void lock(@MachineSizedSInt long condition);
    @Mapping("tryLock")
    public native boolean tryLock();
    @Mapping("tryLockWhenCondition:")
    public native boolean tryLock(@MachineSizedSInt long condition);
    @Mapping("unlockWithCondition:")
    public native void unlock(@MachineSizedSInt long condition);
    @Mapping("lockBeforeDate:")
    public native boolean lock(NSDate limit);
    @Mapping("lockWhenCondition:beforeDate:")
    public native boolean lock(@MachineSizedSInt long condition, NSDate limit);
    @Mapping("lock")
    public native void lock();
    @Mapping("unlock")
    public native void unlock();
    
}
