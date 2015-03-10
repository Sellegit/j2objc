package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox")
public class AudioToolbox 
    extends Object 
     {

    
    public static final int Constant__kAudioFileMarkerType_Generic = 0;
    public static final int Constant__kAudioFormatProperty_HardwareCodecCapabilities = 1752654691;
    public static final int Constant__kAudioDecoderComponentType = 1633969507;
    public static final int Constant__kAudioEncoderComponentType = 1634037347;
    public static final int Constant__kAudioQueueProperty_HardwareCodecPolicy = 1634820976;
    public static final int Constant__kAudioQueueProperty_ChannelAssignments = 1634820961;
    public static final int Constant__kAudioSessionSetActiveFlag_NotifyOthersOnDeactivation = 1;
    public static final int Constant__kAudioSessionCategory_UserInterfaceSoundEffects = 1969841784;
    public static final int Constant__kAudioSessionCategory_LiveAudio = 1818850917;
    public static final int Constant__kAudioSessionProperty_AudioRoute = 1919907188;
    public static final int Constant__kAudioConverterPropertyCanResumeFromInterruption = 1668441705;
    public static final int Constant__kAudioConverterErr_HardwareInUse = 1752656245;
    public static final int Constant__kAudioConverterErr_NoHardwarePermission = 1885696621;
    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_RouteChangeKey_Reason")
    public static native CFString Value__kAudioSession_RouteChangeKey_Reason();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_AudioRouteChangeKey_PreviousRouteDescription")
    public static native CFString Value__kAudioSession_AudioRouteChangeKey_PreviousRouteDescription();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_AudioRouteChangeKey_CurrentRouteDescription")
    public static native CFString Value__kAudioSession_AudioRouteChangeKey_CurrentRouteDescription();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_AudioRouteKey_Inputs")
    public static native CFString Value__kAudioSession_AudioRouteKey_Inputs();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_AudioRouteKey_Outputs")
    public static native CFString Value__kAudioSession_AudioRouteKey_Outputs();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_AudioRouteKey_Type")
    public static native CFString Value__kAudioSession_AudioRouteKey_Type();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionInputRoute_LineIn")
    public static native CFString Value__kAudioSessionInputRoute_LineIn();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionInputRoute_BuiltInMic")
    public static native CFString Value__kAudioSessionInputRoute_BuiltInMic();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionInputRoute_HeadsetMic")
    public static native CFString Value__kAudioSessionInputRoute_HeadsetMic();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionInputRoute_BluetoothHFP")
    public static native CFString Value__kAudioSessionInputRoute_BluetoothHFP();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionInputRoute_USBAudio")
    public static native CFString Value__kAudioSessionInputRoute_USBAudio();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_LineOut")
    public static native CFString Value__kAudioSessionOutputRoute_LineOut();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_Headphones")
    public static native CFString Value__kAudioSessionOutputRoute_Headphones();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_BluetoothHFP")
    public static native CFString Value__kAudioSessionOutputRoute_BluetoothHFP();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_BluetoothA2DP")
    public static native CFString Value__kAudioSessionOutputRoute_BluetoothA2DP();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_BuiltInReceiver")
    public static native CFString Value__kAudioSessionOutputRoute_BuiltInReceiver();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_BuiltInSpeaker")
    public static native CFString Value__kAudioSessionOutputRoute_BuiltInSpeaker();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_USBAudio")
    public static native CFString Value__kAudioSessionOutputRoute_USBAudio();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_HDMI")
    public static native CFString Value__kAudioSessionOutputRoute_HDMI();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSessionOutputRoute_AirPlay")
    public static native CFString Value__kAudioSessionOutputRoute_AirPlay();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_InputSourceKey_ID")
    public static native CFString Value__kAudioSession_InputSourceKey_ID();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_InputSourceKey_Description")
    public static native CFString Value__kAudioSession_InputSourceKey_Description();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_OutputDestinationKey_ID")
    public static native CFString Value__kAudioSession_OutputDestinationKey_ID();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kAudioSession_OutputDestinationKey_Description")
    public static native CFString Value__kAudioSession_OutputDestinationKey_Description();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFormatGetPropertyInfo")
    public static native int function__AudioFormatGetPropertyInfo(int inPropertyID, int inSpecifierSize, Todo inSpecifier, Todo outPropertyDataSize);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFormatGetProperty")
    public static native int function__AudioFormatGetProperty(int inPropertyID, int inSpecifierSize, Todo inSpecifier, Todo ioPropertyDataSize, Todo outPropertyData);
    
}
