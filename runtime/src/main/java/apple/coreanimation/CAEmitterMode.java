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
public class CAEmitterMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerPoints")
    protected static native NSString PointsValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerOutline")
    protected static native NSString OutlineValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerSurface")
    protected static native NSString SurfaceValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCAEmitterLayerVolume")
    protected static native NSString VolumeValue();
    
}
