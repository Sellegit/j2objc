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


@Mapping("CMSampleTimingInfo") @Library("CoreMedia/CoreMedia.h")
public class CMSampleTimingInfo 
    extends Struct 
     {

    
    private CMSampleTimingInfo() {}
    
    
    @DotMapping("duration")
    public native CMTime getDuration();
    @DotMapping("presentationTimeStamp")
    public native CMTime getPresentationTimeStamp();
    @DotMapping("decodeTimeStamp")
    public native CMTime getDecodeTimeStamp();

    public static native CMSampleTimingInfo create(CMTime duration, CMTime presentationTimeStamp, CMTime decodeTimeStamp) /*-[
        CMSampleTimingInfo __new = { .duration = duration, .presentationTimeStamp = presentationTimeStamp, .decodeTimeStamp = decodeTimeStamp };
        return __new;
    ]-*/;
    public static native CMSampleTimingInfo copyWithduration(CMSampleTimingInfo original, CMTime duration) /*-[
        CMSampleTimingInfo __new = { .duration = duration, .presentationTimeStamp = original.presentationTimeStamp, .decodeTimeStamp = original.decodeTimeStamp };
        return __new;
    ]-*/;


    public static native CMSampleTimingInfo copyWithpresentationTimeStamp(CMSampleTimingInfo original, CMTime presentationTimeStamp) /*-[
        CMSampleTimingInfo __new = { .duration = original.duration, .presentationTimeStamp = presentationTimeStamp, .decodeTimeStamp = original.decodeTimeStamp };
        return __new;
    ]-*/;


    public static native CMSampleTimingInfo copyWithdecodeTimeStamp(CMSampleTimingInfo original, CMTime decodeTimeStamp) /*-[
        CMSampleTimingInfo __new = { .duration = original.duration, .presentationTimeStamp = original.presentationTimeStamp, .decodeTimeStamp = decodeTimeStamp };
        return __new;
    ]-*/;


    public static final class Adapter {

        public CMTime duration;
        public CMTime presentationTimeStamp;
        public CMTime decodeTimeStamp;
        public Adapter(CMTime duration, CMTime presentationTimeStamp, CMTime decodeTimeStamp) {
            this.duration = duration;
            this.presentationTimeStamp = presentationTimeStamp;
            this.decodeTimeStamp = decodeTimeStamp;
        }
        public Adapter(CMSampleTimingInfo original) {
            this.duration = original.getDuration();
            this.presentationTimeStamp = original.getPresentationTimeStamp();
            this.decodeTimeStamp = original.getDecodeTimeStamp();
        }
        public CMSampleTimingInfo convert() {
            return create(duration, presentationTimeStamp, decodeTimeStamp);
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMTimingInfoInvalid")
    public static native CMSampleTimingInfo Invalid();

}
