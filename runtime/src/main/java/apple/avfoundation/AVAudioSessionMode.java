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
@Library("AVFoundation")
public class AVAudioSessionMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVAudioSessionModeDefault")
    public static native NSString DefaultValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVAudioSessionModeVoiceChat")
    public static native NSString VoiceChatValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVAudioSessionModeGameChat")
    public static native NSString GameChatValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVAudioSessionModeVideoRecording")
    public static native NSString VideoRecordingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVAudioSessionModeMeasurement")
    public static native NSString MeasurementValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionModeMoviePlayback")
    public static native NSString MoviePlaybackValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionModeVideoChat")
    public static native NSString VideoChatValue();
    
}
