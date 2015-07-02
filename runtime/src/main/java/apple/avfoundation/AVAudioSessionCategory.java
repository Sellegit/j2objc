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
public class AVAudioSessionCategory 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("AVAudioSessionCategoryAmbient")
    public static native String AmbientValue();
    @GlobalConstant("AVAudioSessionCategorySoloAmbient")
    public static native String SoloAmbientValue();
    @GlobalConstant("AVAudioSessionCategoryPlayback")
    public static native String PlaybackValue();
    @GlobalConstant("AVAudioSessionCategoryRecord")
    public static native String RecordValue();
    @GlobalConstant("AVAudioSessionCategoryPlayAndRecord")
    public static native String PlayAndRecordValue();
    @GlobalConstant("AVAudioSessionCategoryAudioProcessing")
    public static native String AudioProcessingValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionCategoryMultiRoute")
    public static native String MultiRouteValue();

}
