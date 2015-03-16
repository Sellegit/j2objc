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
public class AVAssetExportPreset 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPresetLowQuality")
    public static native NSString LowQualityValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPresetMediumQuality")
    public static native NSString MediumQualityValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPresetHighestQuality")
    public static native NSString HighestQualityValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPreset640x480")
    public static native NSString Size640x480Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPreset960x540")
    public static native NSString Size960x540Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPreset1280x720")
    public static native NSString Size1280x720Value();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVAssetExportPreset1920x1080")
    public static native NSString Size1920x1080Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPresetAppleM4A")
    public static native NSString AppleM4AValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVAssetExportPresetPassthrough")
    public static native NSString PassthroughValue();
    
}
