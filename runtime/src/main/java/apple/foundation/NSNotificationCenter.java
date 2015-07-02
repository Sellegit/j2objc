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


@Library("Foundation/Foundation.h") @Mapping("NSNotificationCenter")
public class NSNotificationCenter 
    extends NSObject 
     {

    
    
    public NSNotificationCenter() {}

    


    
    
    @Mapping("addObserver:selector:name:object:")
    public native void addNotificationObserver(Object observer, Selector aSelector, String aName, Object anObject);
    @Mapping("postNotification:")
    public native void postNotification(NSNotification notification);
    @Mapping("postNotificationName:object:")
    public native void postNotification(String aName, Object anObject);
    @Mapping("postNotificationName:object:userInfo:")
    public native void postNotification(String aName, Object anObject, NSDictionary<?, ?> aUserInfo);
    @Mapping("removeObserver:")
    public native void removeNotificationObserver(Object observer);
    @Mapping("removeObserver:name:object:")
    public native void removeNotificationObserver(Object observer, String aName, Object anObject);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("addObserverForName:object:queue:usingBlock:")
    public native NSObject addNotificationObserver(String name, Object obj, NSOperationQueue queue, @Block VoidBlock1<NSNotification> block);
    @Mapping("defaultCenter")
    public static native NSNotificationCenter getDefaultCenter();

}
