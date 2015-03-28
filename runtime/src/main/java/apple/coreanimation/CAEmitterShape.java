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
public class CAEmitterShape 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerPoint")
    public static native NSString PointValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerLine")
    public static native NSString LineValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerRectangle")
    public static native NSString RectangleValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerCuboid")
    public static native NSString CuboidValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerCircle")
    public static native NSString CircleValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerSphere")
    public static native NSString SphereValue();

}
