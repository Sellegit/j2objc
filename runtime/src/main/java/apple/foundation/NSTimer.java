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


@Library("Foundation/Foundation.h") @Mapping("NSTimer")
public class NSTimer 
    extends NSObject 
     {

    
    
    @Mapping("initWithFireDate:interval:target:selector:userInfo:repeats:")
    public NSTimer(NSDate date, double ti, Object t, Selector s, Object ui, boolean rep) { }
    @Mapping("init")
    public NSTimer() { }

    
    @Mapping("fireDate")
    public native NSDate getFireDate();
    @Mapping("setFireDate:")
    public native void setFireDate(NSDate v);
    @Mapping("timeInterval")
    public native double getTimeInterval();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tolerance")
    public native double getTolerance();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTolerance:")
    public native void setTolerance(double v);
    @Mapping("isValid")
    public native boolean isValid();
    @Mapping("userInfo")
    public native Object getUserInfo();

    
    
    @Mapping("fire")
    public native void fire();
    @Mapping("invalidate")
    public native void invalidate();
    @Mapping("timerWithTimeInterval:invocation:repeats:")
    public static native NSTimer create(double ti, NSInvocation invocation, boolean yesOrNo);
    @Mapping("scheduledTimerWithTimeInterval:invocation:repeats:")
    public static native NSTimer createScheduled(double ti, NSInvocation invocation, boolean yesOrNo);
    @Mapping("timerWithTimeInterval:target:selector:userInfo:repeats:")
    public static native NSTimer create(double ti, Object aTarget, Selector aSelector, Object userInfo, boolean yesOrNo);
    @Mapping("scheduledTimerWithTimeInterval:target:selector:userInfo:repeats:")
    public static native NSTimer createScheduled(double ti, Object aTarget, Selector aSelector, Object userInfo, boolean yesOrNo);

}
