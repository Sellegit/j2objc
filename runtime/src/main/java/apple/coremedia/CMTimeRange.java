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





@Mapping("CMTimeRange") @Library("CoreMedia")
public class CMTimeRange 
    extends Struct 
     {

    
    protected CMTimeRange() {}
    
    
    @DotMapping("start")
    public native CMTime getStart();
    @DotMapping("duration")
    public native CMTime getDuration();
    
    public static native CMTimeRange create(CMTime start, CMTime duration) /*-[
        CMTimeRange __new = { .start = start, .duration = duration };
        return __new;
    ]-*/;
    public static native CMTimeRange copyWithstart(CMTimeRange original, CMTime start) /*-[
        original.start = start;
        return __new;
    ]-*/;

    
    public static native CMTimeRange copyWithduration(CMTimeRange original, CMTime duration) /*-[
        original.duration = duration;
        return __new;
    ]-*/;

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimeRangeZero")
    public static native CMTimeRange Zero();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimeRangeInvalid")
    public static native CMTimeRange Invalid();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeGetUnion")
    public native CMTimeRange union(CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeGetIntersection")
    public native CMTimeRange intersection(CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeEqual")
    public native boolean equals(CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeContainsTime")
    public native boolean containsTime(CMTime time);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeContainsTimeRange")
    public native boolean containsTimeRange(CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeGetEnd")
    public native CMTime getEnd();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeFromTimeToTime")
    public static native CMTimeRange fromTimeToTime(CMTime start, CMTime end);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeCopyAsDictionary")
    public native NSDictionary<?, ?> asDictionary(CFAllocator allocator);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeMakeFromDictionary")
    public static native CMTimeRange create(NSDictionary<?, ?> dict);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeCopyDescription")
    private static native String getDescription(CFAllocator allocator, CMTimeRange range);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeShow")
    public native void show();
    
}
