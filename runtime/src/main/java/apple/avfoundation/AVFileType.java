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
public class AVFileType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeQuickTimeMovie")
    public static native String QuickTimeMovie();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeMPEG4")
    public static native String MPEG4();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeAppleM4V")
    public static native String AppleM4V();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeAppleM4A")
    public static native String AppleM4A();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileType3GPP")
    public static native String _3GPP();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVFileType3GPP2")
    public static native String _3GPP2();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeCoreAudioFormat")
    public static native String CoreAudioFormat();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeWAVE")
    public static native String WAVE();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeAIFF")
    public static native String AIFF();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeAIFC")
    public static native String AIFC();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVFileTypeAMR")
    public static native String AMR();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVFileTypeMPEGLayer3")
    public static native String MPEGLayer3();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVFileTypeSunAU")
    public static native String SunAU();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVFileTypeAC3")
    public static native String AC3();

}
