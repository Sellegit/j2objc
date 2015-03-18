package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("QuartzCore/QuartzCore.h")
public class CAGravity 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityCenter")
    public static native NSString CenterValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTop")
    public static native NSString TopValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottom")
    public static native NSString BottomValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityLeft")
    public static native NSString LeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityRight")
    public static native NSString RightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTopLeft")
    public static native NSString TopLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTopRight")
    public static native NSString TopRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottomLeft")
    public static native NSString BottomLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottomRight")
    public static native NSString BottomRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResize")
    public static native NSString ResizeValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResizeAspect")
    public static native NSString ResizeAspectValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResizeAspectFill")
    public static native NSString ResizeAspectFillValue();
    
}
