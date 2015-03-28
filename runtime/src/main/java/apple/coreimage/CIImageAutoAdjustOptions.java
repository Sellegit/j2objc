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
public class CIImageAutoAdjustOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustEnhance")
    public static native CFString EnhanceKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustRedEye")
    public static native CFString RedEyeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustFeatures")
    public static native CFString FeaturesKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustCrop")
    public static native CFString CropKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustLevel")
    public static native CFString LevelKey();

}
