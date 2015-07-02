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
@Library("Foundation/Foundation.h") @Mapping("NSObject")
public class NSObject 
    extends Object 
    implements NSObjectProtocol {

    
    
    @Mapping("init")
    public NSObject() { }

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("autoContentAccessingProxy")
    public native Object getAutoContentAccessingProxy();
    @Mapping("observationInfo")
    public native VoidPtr getObservationInfo();
    @Mapping("setObservationInfo:")
    public native void setObservationInfo(VoidPtr v);

    
    
    @Mapping("copy")
    public native Object copy();
    @Mapping("mutableCopy")
    public native Object mutableCopy();
    @Mapping("observeValueForKeyPath:ofObject:change:context:")
    public native void observeValueForKeyPath(String keyPath, Object object, NSDictionary<?, ?> change, VoidPtr context);
    @Mapping("addObserver:forKeyPath:options:context:")
    public native void addObserver(NSObject observer, String keyPath, @Representing("NSKeyValueObservingOptions") long options, VoidPtr context);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("removeObserver:forKeyPath:context:")
    public native void removeObserver(NSObject observer, String keyPath, VoidPtr context);
    @Mapping("willChangeValueForKey:")
    public native void willChangeValue(String key);
    @Mapping("didChangeValueForKey:")
    public native void didChangeValue(String key);
    @Mapping("willChange:valuesAtIndexes:forKey:")
    public native void willChangeValues(@Representing("NSKeyValueChange") long changeKind, NSIndexSet indexes, String key);
    @Mapping("didChange:valuesAtIndexes:forKey:")
    public native void didChangeValues(@Representing("NSKeyValueChange") long changeKind, NSIndexSet indexes, String key);
    @Mapping("willChangeValueForKey:withSetMutation:usingObjects:")
    public native void willChangeValue(String key, @Representing("NSKeyValueSetMutationKind") long mutationKind, NSSet<?> objects);
    @Mapping("didChangeValueForKey:withSetMutation:usingObjects:")
    public native void didChangeValue(String key, @Representing("NSKeyValueSetMutationKind") long mutationKind, NSSet<?> objects);
    @Mapping("performSelector:withObject:afterDelay:inModes:")
    public final native void performSelector(Selector aSelector, Object anArgument, double delay, NSArray<?> modes);
    @Mapping("performSelector:withObject:afterDelay:")
    public final native void performSelector(Selector aSelector, Object anArgument, double delay);
    @Mapping("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequests(Object aTarget, Selector aSelector, Object anArgument);
    @Mapping("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequests(Object aTarget);
    @Mapping("performSelectorOnMainThread:withObject:waitUntilDone:modes:")
    public final native void performSelectorOnMainThread(Selector aSelector, Object arg, boolean wait, NSArray<?> array);
    @Mapping("performSelectorOnMainThread:withObject:waitUntilDone:")
    public final native void performSelectorOnMainThread(Selector aSelector, Object arg, boolean wait);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("performSelector:onThread:withObject:waitUntilDone:modes:")
    public final native void performSelector(Selector aSelector, NSThread thr, Object arg, boolean wait, NSArray<?> array);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("performSelector:onThread:withObject:waitUntilDone:")
    public final native void performSelector(Selector aSelector, NSThread thr, Object arg, boolean wait);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("performSelectorInBackground:withObject:")
    public final native void performSelectorInBackground(Selector aSelector, Object arg);

}
