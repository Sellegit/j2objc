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





@Mapping("CMTimeRange") @Library("CoreMedia/CoreMedia.h")
public class CMTimeRange 
    extends Struct 
     {

    
    private CMTimeRange() {}
    
    
    @DotMapping("start")
    public native CMTime getStart();
    @DotMapping("duration")
    public native CMTime getDuration();
    
    public static native CMTimeRange create(CMTime start, CMTime duration) /*-[
        CMTimeRange __new = { .start = start, .duration = duration };
        return __new;
    ]-*/;
    public static native CMTimeRange copyWithstart(CMTimeRange original, CMTime start) /*-[
        CMTimeRange __new = { .start = start, .duration = original.duration };
        return __new;
    ]-*/;

    
    public static native CMTimeRange copyWithduration(CMTimeRange original, CMTime duration) /*-[
        CMTimeRange __new = { .start = original.start, .duration = duration };
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
    public static native CMTimeRange union(CMTimeRange range1, CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeGetIntersection")
    public static native CMTimeRange intersection(CMTimeRange range1, CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeEqual")
    public static native boolean equals(CMTimeRange range1, CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeContainsTime")
    public static native boolean containsTime(CMTimeRange range, CMTime time);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeContainsTimeRange")
    public static native boolean containsTimeRange(CMTimeRange range1, CMTimeRange range2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeGetEnd")
    public static native CMTime getEnd(CMTimeRange range);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeFromTimeToTime")
    public static native CMTimeRange fromTimeToTime(CMTime start, CMTime end);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeCopyAsDictionary")
    public static native CFDictionary asDictionary(CMTimeRange range, CFAllocator allocator);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeMakeFromDictionary")
    public static native CMTimeRange create(CFDictionary dict);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeCopyDescription")
    public static native CFString getDescription(CFAllocator allocator, CMTimeRange range);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeRangeShow")
    public static native void show(CMTimeRange range);
    
}
