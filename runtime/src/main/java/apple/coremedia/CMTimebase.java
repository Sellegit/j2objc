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
@Library("CoreMedia/CoreMedia.h")
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
    public static native NSString EventTimeNotificationKey();
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseCreateWithMasterClock")
    public static native int create(CFAllocator allocator, CMClock masterClock, Todo timebaseOut);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseCreateWithMasterTimebase")
    public static native int create(CFAllocator allocator, CMTimebase masterTimebase, Todo timebaseOut);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetMasterTimebase")
    public static native CMTimebase getMasterTimebase(CMTimebase timebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetMasterClock")
    public static native CMClock getMasterClock(CMTimebase timebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetMaster")
    public static native CMTimebase getMaster(CMTimebase timebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetUltimateMasterClock")
    public static native CMClock getUltimateMasterClock(CMTimebase timebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetTime")
    public static native CMTime getTime(CMTimebase timebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetTimeWithTimeScale")
    public static native CMTime getTime(CMTimebase timebase, int timescale, @Representing("CMTimeRoundingMethod") long method);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTime")
    public static native CMTimebaseError setTime(CMTimebase timebase, CMTime time);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetAnchorTime")
    public static native CMTimebaseError setAnchorTime(CMTimebase timebase, CMTime timebaseTime, CMTime immediateMasterTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetRate")
    public static native double getRate(CMTimebase timebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetRate")
    public static native CMTimebaseError setRate(CMTimebase timebase, double rate);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetRateAndAnchorTime")
    public static native CMTimebaseError setRateAndAnchorTime(CMTimebase timebase, double rate, CMTime timebaseTime, CMTime immediateMasterTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseGetEffectiveRate")
    public static native double getEffectiveRate(CMTimebase timebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseAddTimer")
    public static native CMTimebaseError addTimer(CMTimebase timebase, CFRunLoopTimer timer, CFRunLoop runloop);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseRemoveTimer")
    public static native CMTimebaseError removeTimer(CMTimebase timebase, CFRunLoopTimer timer);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerNextFireTime")
    public static native CMTimebaseError setTimerNextFireTime(CMTimebase timebase, CFRunLoopTimer timer, CMTime fireTime, int flags);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerToFireImmediately")
    public static native CMTimebaseError setTimerToFireImmediately(CMTimebase timebase, CFRunLoopTimer timer);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseAddTimerDispatchSource")
    public static native CMTimebaseError addTimerDispatchSource(CMTimebase timebase, DispatchSource timerSource);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseRemoveTimerDispatchSource")
    public static native CMTimebaseError removeTimerDispatchSource(CMTimebase timebase, DispatchSource timerSource);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerDispatchSourceNextFireTime")
    public static native CMTimebaseError setTimerDispatchSourceNextFireTime(CMTimebase timebase, DispatchSource timerSource, CMTime fireTime, int flags);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseSetTimerDispatchSourceToFireImmediately")
    public static native CMTimebaseError setTimerDispatchSourceToFireImmediately(CMTimebase timebase, DispatchSource timerSource);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMTimebaseNotificationBarrier")
    public static native CMTimebaseError notificationBarrier(CMTimebase timebase);
    
}
