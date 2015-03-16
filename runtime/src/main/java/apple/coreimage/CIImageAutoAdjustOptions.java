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
    protected static native CFString EnhanceKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustRedEye")
    protected static native CFString RedEyeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustFeatures")
    protected static native CFString FeaturesKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustCrop")
    protected static native CFString CropKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIImageAutoAdjustLevel")
    protected static native CFString LevelKey();
    
}
