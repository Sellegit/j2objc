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





@Mapping("CMTime") @Library("CoreMedia")
public class CMTime 
    extends Struct 
     {

    
    public static final long MaxTimescale = 0x7fffffffL;
    
    protected CMTime() {}
    
    
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
        original.value = value;
        return original;
    ]-*/;

    
    public static native CMTime copyWithtimescale(CMTime original, int timescale) /*-[
        original.timescale = timescale;
        return original;
    ]-*/;

    
    public static native CMTime copyWithflags(CMTime original, CMTimeFlags flags) /*-[
        original.flags = flags;
        return original;
    ]-*/;

    
    public static native CMTime copyWithepoch(CMTime original, long epoch) /*-[
        original.epoch = epoch;
        return original;
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
    public native double getSeconds();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeConvertScale")
    public native CMTime convertScale(int newTimescale, CMTimeRoundingMethod method);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeAdd")
    public native CMTime add(CMTime addend2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeSubtract")
    public native CMTime subtract(CMTime subtrahend);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMultiply")
    public native CMTime multiply(int multiplier);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMultiplyByFloat64")
    public native CMTime multiplyByFloat64(double multiplier);
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalFunction("CMTimeMultiplyByRatio")
    public native CMTime multiplyByRatio(int multiplier, int divisor);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCompare")
    public native int compare(CMTime time2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMinimum")
    public native CMTime minimum(CMTime time2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMaximum")
    public native CMTime maximum(CMTime time2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeAbsoluteValue")
    public native CMTime absoluteValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCopyAsDictionary")
    public native NSDictionary<?, ?> asDictionary(CFAllocator allocator);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMakeFromDictionary")
    public static native CMTime create(NSDictionary<?, ?> dict);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCopyDescription")
    private static native String getDescription(CFAllocator allocator, CMTime time);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeShow")
    public native void show();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMapTimeFromRangeToRange")
    public native CMTime mapTimeFromRangeToRange(CMTimeRange fromRange, CMTimeRange toRange);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeClampToRange")
    public native CMTime clampToRange(CMTimeRange range);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeMapDurationFromRangeToRange")
    public native CMTime mapDurationFromRangeToRange(CMTimeRange fromRange, CMTimeRange toRange);
    
}
