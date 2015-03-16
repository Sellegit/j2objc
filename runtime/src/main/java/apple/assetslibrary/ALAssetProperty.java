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
    protected static native NSString TypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyLocation")
    protected static native NSString LocationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyDuration")
    protected static native NSString DurationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyOrientation")
    protected static native NSString OrientationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyDate")
    protected static native NSString DateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyRepresentations")
    protected static native NSString RepresentationsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("ALAssetPropertyURLs")
    protected static native NSString URLsValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ALAssetPropertyAssetURL")
    protected static native NSString AssetURLValue();
    
}
