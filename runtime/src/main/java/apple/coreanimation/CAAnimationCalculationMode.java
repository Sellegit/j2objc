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
public class CAAnimationCalculationMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAAnimationLinear")
    protected static native NSString LinearValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAAnimationDiscrete")
    protected static native NSString DiscreteValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAAnimationPaced")
    protected static native NSString PacedValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCAAnimationCubic")
    protected static native NSString CubicValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCAAnimationCubicPaced")
    protected static native NSString CubicPacedValue();
    
}
