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
public class AVAudioSettings 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("AVFormatIDKey")
    public static native String FormatIDKey();
    @GlobalConstant("AVSampleRateKey")
    public static native String SampleRateKey();
    @GlobalConstant("AVNumberOfChannelsKey")
    public static native String NumberOfChannelsKey();
    @GlobalConstant("AVLinearPCMBitDepthKey")
    public static native String BitDepthKey();
    @GlobalConstant("AVLinearPCMIsBigEndianKey")
    public static native String IsBigEndianKey();
    @GlobalConstant("AVLinearPCMIsFloatKey")
    public static native String IsFloatKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVLinearPCMIsNonInterleaved")
    public static native String IsNonInterleaved();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVChannelLayoutKey")
    public static native String ChannelLayoutKey();

}
