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
public class AVAudioBitRateStrategy 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioBitRateStrategy_Constant")
    public static native String ConstantValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioBitRateStrategy_LongTermAverage")
    public static native String LongTermAverageValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioBitRateStrategy_VariableConstrained")
    public static native String VariableConstrainedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioBitRateStrategy_Variable")
    public static native String VariableValue();

}
