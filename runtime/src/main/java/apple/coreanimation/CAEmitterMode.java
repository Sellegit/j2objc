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
public class CAEmitterMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerPoints")
    public static native NSString PointsValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerOutline")
    public static native NSString OutlineValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerSurface")
    public static native NSString SurfaceValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerVolume")
    public static native NSString VolumeValue();
    
}
