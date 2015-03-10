package apple.coremedia;


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
import apple.foundation.*;
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMedia")
public class CMTimebase 
    extends CMClockOrTimebase 
     {

    
    
    protected CMTimebase() {}
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCMTimebaseNotification_EffectiveRateChanged")
    public static native NSString EffectiveRateChangedNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCMTimebaseNotification_TimeJumped")
    public static native NSString TimeJumpedNotification();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCMTimebaseNotificationKey_EventTime")
    protected static native NSString EventTimeNotificationKey();
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseCreateWithMasterClock")
    protected static native int create(CFAllocator allocator, CMClock masterClock, Todo timebaseOut);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseCreateWithMasterTimebase")
    protected static native int create(CFAllocator allocator, CMTimebase masterTimebase, Todo timebaseOut);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetMasterTimebase")
    public native CMTimebase getMasterTimebase();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetMasterClock")
    public native CMClock getMasterClock();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetMaster")
    public native CMTimebase getMaster();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetUltimateMasterClock")
    public native CMClock getUltimateMasterClock();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetTime")
    public native CMTime getTime();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetTimeWithTimeScale")
    public native CMTime getTime(int timescale, CMTimeRoundingMethod method);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTime")
    public native CMTimebaseError setTime(CMTime time);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetAnchorTime")
    public native CMTimebaseError setAnchorTime(CMTime timebaseTime, CMTime immediateMasterTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetRate")
    public native double getRate();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetRate")
    public native CMTimebaseError setRate(double rate);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetRateAndAnchorTime")
    public native CMTimebaseError setRateAndAnchorTime(double rate, CMTime timebaseTime, CMTime immediateMasterTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetEffectiveRate")
    public native double getEffectiveRate();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseAddTimer")
    public native CMTimebaseError addTimer(CFRunLoopTimer timer, CFRunLoop runloop);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseRemoveTimer")
    public native CMTimebaseError removeTimer(CFRunLoopTimer timer);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerNextFireTime")
    public native CMTimebaseError setTimerNextFireTime(CFRunLoopTimer timer, CMTime fireTime, int flags);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerToFireImmediately")
    public native CMTimebaseError setTimerToFireImmediately(CFRunLoopTimer timer);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseAddTimerDispatchSource")
    public native CMTimebaseError addTimerDispatchSource(DispatchSource timerSource);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseRemoveTimerDispatchSource")
    public native CMTimebaseError removeTimerDispatchSource(DispatchSource timerSource);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerDispatchSourceNextFireTime")
    public native CMTimebaseError setTimerDispatchSourceNextFireTime(DispatchSource timerSource, CMTime fireTime, int flags);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerDispatchSourceToFireImmediately")
    public native CMTimebaseError setTimerDispatchSourceToFireImmediately(DispatchSource timerSource);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseNotificationBarrier")
    public native CMTimebaseError notificationBarrier();
    
}
