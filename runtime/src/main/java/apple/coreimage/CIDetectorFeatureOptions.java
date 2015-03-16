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
    protected static native NSString ImageOrientationKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CIDetectorEyeBlink")
    protected static native NSString EyeBlinkKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CIDetectorSmile")
    protected static native NSString SmileKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CIDetectorFocalLength")
    protected static native NSString FocalLengthKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CIDetectorAspectRatio")
    protected static native NSString AspectRatioKey();
    
}
