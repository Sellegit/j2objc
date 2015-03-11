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
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("QuartzCore")
public class CAGravity 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityCenter")
    protected static native NSString CenterValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTop")
    protected static native NSString TopValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottom")
    protected static native NSString BottomValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityLeft")
    protected static native NSString LeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityRight")
    protected static native NSString RightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTopLeft")
    protected static native NSString TopLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTopRight")
    protected static native NSString TopRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottomLeft")
    protected static native NSString BottomLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottomRight")
    protected static native NSString BottomRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResize")
    protected static native NSString ResizeValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResizeAspect")
    protected static native NSString ResizeAspectValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResizeAspectFill")
    protected static native NSString ResizeAspectFillValue();
    
}
