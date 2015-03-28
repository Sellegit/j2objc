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
public class AVAudioEncoderSettings 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("AVEncoderAudioQualityKey")
    public static native NSString AudioQualityKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVEncoderAudioQualityForVBRKey")
    public static native NSString AudioQualityForVBRKey();
    @GlobalConstant("AVEncoderBitRateKey")
    public static native NSString BitRateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVEncoderBitRatePerChannelKey")
    public static native NSString BitRatePerChannelKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVEncoderBitRateStrategyKey")
    public static native NSString BitRateStrategyKey();
    @GlobalConstant("AVEncoderBitDepthHintKey")
    public static native NSString BitDepthHintKey();

}
