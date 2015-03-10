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
public class AVOutputSettingsPreset 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVOutputSettingsPreset640x480")
    public static native NSString _640x480Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVOutputSettingsPreset960x540")
    public static native NSString _960x540Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVOutputSettingsPreset1280x720")
    public static native NSString _1280x720Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVOutputSettingsPreset1920x1080")
    public static native NSString _1920x1080Value();
    
}
