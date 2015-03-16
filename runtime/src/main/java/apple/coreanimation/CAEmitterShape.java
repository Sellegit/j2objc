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
@Library("QuartzCore/QuartzCore.h")
public class CAEmitterShape 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerPoint")
    protected static native NSString PointValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerLine")
    protected static native NSString LineValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerRectangle")
    protected static native NSString RectangleValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerCuboid")
    protected static native NSString CuboidValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerCircle")
    protected static native NSString CircleValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerSphere")
    protected static native NSString SphereValue();
    
}
