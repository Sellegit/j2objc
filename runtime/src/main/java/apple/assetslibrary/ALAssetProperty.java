package apple.assetslibrary;


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
import apple.imageio.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AssetsLibrary/AssetsLibrary.h")
public class ALAssetProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyType")
    public static native NSString TypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyLocation")
    public static native NSString LocationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyDuration")
    public static native NSString DurationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyOrientation")
    public static native NSString OrientationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyDate")
    public static native NSString DateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyRepresentations")
    public static native NSString RepresentationsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyURLs")
    public static native NSString URLsValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ALAssetPropertyAssetURL")
    public static native NSString AssetURLValue();

}
