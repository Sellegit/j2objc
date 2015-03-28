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
public class AVAudioTimePitchAlgorithm 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioTimePitchAlgorithmLowQualityZeroLatency")
    public static native NSString LowQualityZeroLatencyValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioTimePitchAlgorithmTimeDomain")
    public static native NSString TimeDomainValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioTimePitchAlgorithmSpectral")
    public static native NSString SpectralValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioTimePitchAlgorithmVarispeed")
    public static native NSString VarispeedValue();

}
