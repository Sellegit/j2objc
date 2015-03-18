package apple.coreimage;


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
import apple.corevideo.*;
import apple.imageio.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreImage/CoreImage.h")
public class CIDetectorFeatureOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("CIDetectorImageOrientation")
    public static native NSString ImageOrientationKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CIDetectorEyeBlink")
    public static native NSString EyeBlinkKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CIDetectorSmile")
    public static native NSString SmileKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CIDetectorFocalLength")
    public static native NSString FocalLengthKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CIDetectorAspectRatio")
    public static native NSString AspectRatioKey();
    
}
