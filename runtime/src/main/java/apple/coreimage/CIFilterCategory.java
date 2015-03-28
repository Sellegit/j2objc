package apple.coreimage;


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
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreImage/CoreImage.h")
public class CIFilterCategory 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCICategoryDistortionEffect")
    public static native NSString DistortionEffectValue();
    @GlobalConstant("kCICategoryGeometryAdjustment")
    public static native NSString GeometryAdjustmentValue();
    @GlobalConstant("kCICategoryCompositeOperation")
    public static native NSString CompositeOperationValue();
    @GlobalConstant("kCICategoryHalftoneEffect")
    public static native NSString HalftoneEffectValue();
    @GlobalConstant("kCICategoryColorAdjustment")
    public static native NSString ColorAdjustmentValue();
    @GlobalConstant("kCICategoryColorEffect")
    public static native NSString ColorEffectValue();
    @GlobalConstant("kCICategoryTransition")
    public static native NSString TransitionValue();
    @GlobalConstant("kCICategoryTileEffect")
    public static native NSString TileEffectValue();
    @GlobalConstant("kCICategoryGenerator")
    public static native NSString GeneratorValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCICategoryReduction")
    public static native NSString ReductionValue();
    @GlobalConstant("kCICategoryGradient")
    public static native NSString GradientValue();
    @GlobalConstant("kCICategoryStylize")
    public static native NSString StylizeValue();
    @GlobalConstant("kCICategorySharpen")
    public static native NSString SharpenValue();
    @GlobalConstant("kCICategoryBlur")
    public static native NSString BlurValue();
    @GlobalConstant("kCICategoryVideo")
    public static native NSString VideoValue();
    @GlobalConstant("kCICategoryStillImage")
    public static native NSString StillImageValue();
    @GlobalConstant("kCICategoryInterlaced")
    public static native NSString InterlacedValue();
    @GlobalConstant("kCICategoryNonSquarePixels")
    public static native NSString NonSquarePixelsValue();
    @GlobalConstant("kCICategoryHighDynamicRange")
    public static native NSString HighDynamicRangeValue();
    @GlobalConstant("kCICategoryBuiltIn")
    public static native NSString BuiltInValue();

}
