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


/**
 * @since Available in iOS 2.0 and later.
 */
@Library("Foundation/Foundation.h") @Mapping("NSCondition")
public class NSCondition 
    extends NSObject 
    implements NSLocking {

    
    
    @Mapping("init")
    public NSCondition() { }

    
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

    
    
    @Mapping("wait")
    public native void await();
    @Mapping("waitUntilDate:")
    public native boolean await(NSDate limit);
    @Mapping("signal")
    public native void signal();
    @Mapping("broadcast")
    public native void broadcast();
    @Mapping("lock")
    public native void lock();
    @Mapping("unlock")
    public native void unlock();

}
