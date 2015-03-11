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





@Library("Foundation") @Mapping("NSNotificationCenter")
public class NSNotificationCenter 
    extends NSObject 
     {

    
    
    public NSNotificationCenter() {}
    
    
    
    
    
    
    @Mapping("addObserver:selector:name:object:")
    public native void addObserver(Object observer, Selector aSelector, NSString aName, Object anObject);
    @Mapping("postNotification:")
    public native void postNotification(NSNotification notification);
    @Mapping("postNotificationName:object:")
    public native void postNotification(NSString aName, Object anObject);
    @Mapping("postNotificationName:object:userInfo:")
    public native void postNotification(NSString aName, Object anObject, NSDictionary<NSString, ?> aUserInfo);
    @Mapping("removeObserver:")
    public native void removeObserver(Object observer);
    @Mapping("removeObserver:name:object:")
    public native void removeObserver(Object observer, NSString aName, Object anObject);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("addObserverForName:object:queue:usingBlock:")
    public native NSObject addObserver(NSString name, Object obj, NSOperationQueue queue, @Block VoidBlock1<NSNotification> block);
    @Mapping("defaultCenter")
    public static native NSNotificationCenter getDefaultCenter();
    
}
