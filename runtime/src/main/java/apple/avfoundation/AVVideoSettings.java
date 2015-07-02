package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AVFoundation/AVFoundation.h")
public class AVVideoSettings 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoCodecKey")
    public static native String CodecKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoWidthKey")
    public static native String WidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoHeightKey")
    public static native String HeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoPixelAspectRatioKey")
    public static native String PixelAspectRatioKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoPixelAspectRatioHorizontalSpacingKey")
    public static native String PixelAspectRatioHorizontalSpacingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoPixelAspectRatioVerticalSpacingKey")
    public static native String PixelAspectRatioVerticalSpacingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoCleanApertureKey")
    public static native String CleanApertureKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVVideoScalingModeKey")
    public static native String ScalingModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoCompressionPropertiesKey")
    public static native String CompressionPropertiesKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVVideoAllowFrameReorderingKey")
    public static native String AllowFrameReorderingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoProfileLevelKey")
    public static native String ProfileLevelKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVVideoH264EntropyModeKey")
    public static native String H264EntropyModeKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVVideoExpectedSourceFrameRateKey")
    public static native String ExpectedSourceFrameRateKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVVideoAverageNonDroppableFrameRateKey")
    public static native String AverageNonDroppableFrameRateKey();

}
