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
public class AVAudioSessionOrientation 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionOrientationTop")
    public static native String TopValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionOrientationBottom")
    public static native String BottomValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionOrientationFront")
    public static native String FrontValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionOrientationBack")
    public static native String BackValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVAudioSessionOrientationLeft")
    public static native String LeftValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVAudioSessionOrientationRight")
    public static native String RightValue();

}
