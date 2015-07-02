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
public class AVAudioSessionPort 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortLineIn")
    public static native String LineInValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortBuiltInMic")
    public static native String BuiltInMicValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortHeadsetMic")
    public static native String HeadsetMicValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortLineOut")
    public static native String LineOutValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortHeadphones")
    public static native String HeadphonesValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortBluetoothA2DP")
    public static native String BluetoothA2DPValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortBuiltInReceiver")
    public static native String BuiltInReceiverValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortBuiltInSpeaker")
    public static native String BuiltInSpeakerValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortHDMI")
    public static native String HDMIValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortAirPlay")
    public static native String AirPlayValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortBluetoothLE")
    public static native String BluetoothLEValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortBluetoothHFP")
    public static native String BluetoothHFPValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortUSBAudio")
    public static native String USBAudioValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionPortCarAudio")
    public static native String CarAudioValue();

}
