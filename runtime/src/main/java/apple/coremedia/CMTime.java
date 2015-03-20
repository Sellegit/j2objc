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





@Mapping("CMTime") @Library("CoreMedia/CoreMedia.h")
public class CMTime 
    extends Struct 
     {

    
    public static final long MaxTimescale = 0x7fffffffL;
    
    private CMTime() {}
    
    
    @DotMapping("value")
    public native long getValue();
    @DotMapping("timescale")
    public native int getTimescale();
    @DotMapping("flags")
    public native CMTimeFlags getFlags();
    @DotMapping("epoch")
    public native long getEpoch();
    
    public static native CMTime create(long value, int timescale, CMTimeFlags flags, long epoch) /*-[
        CMTime __new = { .value = value, .timescale = timescale, .flags = flags, .epoch = epoch };
        return __new;
    ]-*/;
    public static native CMTime copyWithvalue(CMTime original, long value) /*-[
        CMTime __new = { .value = value, .timescale = original.timescale, .flags = original.flags, .epoch = original.epoch };
        return __new;
    ]-*/;

    
    public static native CMTime copyWithtimescale(CMTime original, int timescale) /*-[
        CMTime __new = { .value = original.value, .timescale = timescale, .flags = original.flags, .epoch = original.epoch };
        return __new;
    ]-*/;

    
    public static native CMTime copyWithflags(CMTime original, CMTimeFlags flags) /*-[
        CMTime __new = { .value = original.value, .timescale = original.timescale, .flags = flags, .epoch = original.epoch };
        return __new;
    ]-*/;

    
    public static native CMTime copyWithepoch(CMTime original, long epoch) /*-[
        CMTime __new = { .value = original.value, .timescale = original.timescale, .flags = original.flags, .epoch = epoch };
        return __new;
    ]-*/;

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimeInvalid")
    public static native CMTime Invalid();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimeIndefinite")
    public static native CMTime Indefinite();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimePositiveInfinity")
    public static native CMTime PositiveInfinity();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimeNegativeInfinity")
    public static native CMTime NegativeInfinity();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimeZero")
    public static native CMTime Zero();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMake")
    public static native CMTime create(long value, int timescale);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMakeWithEpoch")
    public static native CMTime create(long value, int timescale, long epoch);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMakeWithSeconds")
    public static native CMTime create(double seconds, int preferredTimeScale);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeGetSeconds")
    public static native double getSeconds(CMTime time);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeConvertScale")
    public static native CMTime convertScale(CMTime time, int newTimescale, @Representing("CMTimeRoundingMethod") long method);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeAdd")
    public static native CMTime add(CMTime addend1, CMTime addend2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeSubtract")
    public static native CMTime subtract(CMTime minuend, CMTime subtrahend);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMultiply")
    public static native CMTime multiply(CMTime time, int multiplier);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMultiplyByFloat64")
    public static native CMTime multiplyByFloat64(CMTime time, double multiplier);
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalFunction("CMTimeMultiplyByRatio")
    public static native CMTime multiplyByRatio(CMTime time, int multiplier, int divisor);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCompare")
    public static native int compare(CMTime time1, CMTime time2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMinimum")
    public static native CMTime minimum(CMTime time1, CMTime time2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMaximum")
    public static native CMTime maximum(CMTime time1, CMTime time2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeAbsoluteValue")
    public static native CMTime absoluteValue(CMTime time);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCopyAsDictionary")
    public static native CFDictionary asDictionary(CMTime time, CFAllocator allocator);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMakeFromDictionary")
    public static native CMTime create(CFDictionary dict);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCopyDescription")
    public static native CFString getDescription(CFAllocator allocator, CMTime time);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeShow")
    public static native void show(CMTime time);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMapTimeFromRangeToRange")
    public static native CMTime mapTimeFromRangeToRange(CMTime t, CMTimeRange fromRange, CMTimeRange toRange);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeClampToRange")
    public static native CMTime clampToRange(CMTime time, CMTimeRange range);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMapDurationFromRangeToRange")
    public static native CMTime mapDurationFromRangeToRange(CMTime dur, CMTimeRange fromRange, CMTimeRange toRange);
    
}
