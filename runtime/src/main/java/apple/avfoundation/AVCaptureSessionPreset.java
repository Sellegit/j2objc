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
public class AVCaptureSessionPreset 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPresetPhoto")
    public static native String PhotoValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPresetHigh")
    public static native String HighValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPresetMedium")
    public static native String MediumValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPresetLow")
    public static native String LowValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPreset352x288")
    public static native String _352x288Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPreset640x480")
    public static native String _640x480Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPreset1280x720")
    public static native String _1280x720Value();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPreset1920x1080")
    public static native String _1920x1080Value();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPresetiFrame960x540")
    public static native String iFrame960x540Value();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPresetiFrame1280x720")
    public static native String iFrame1280x720Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVCaptureSessionPresetInputPriority")
    public static native String InputPriorityValue();

}
