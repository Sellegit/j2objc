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
public class CAEmitterRenderMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerUnordered")
    public static native NSString UnorderedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerOldestFirst")
    public static native NSString OldestFirstValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerOldestLast")
    public static native NSString OldestLastValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerBackToFront")
    public static native NSString BackToFrontValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerAdditive")
    public static native NSString AdditiveValue();
    
}
