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
public class AVVideoCompressionSettings 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoAverageBitRateKey")
    public static native String AverageBitRateKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVVideoQualityKey")
    public static native String QualityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVVideoMaxKeyFrameIntervalKey")
    public static native String MaxKeyFrameIntervalKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVVideoMaxKeyFrameIntervalDurationKey")
    public static native String MaxKeyFrameIntervalDurationKey();

}
