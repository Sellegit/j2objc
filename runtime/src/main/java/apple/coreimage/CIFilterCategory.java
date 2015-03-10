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
@Library("CoreImage")
public class CIFilterCategory 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCICategoryDistortionEffect")
    protected static native NSString DistortionEffectValue();
    @GlobalConstant("kCICategoryGeometryAdjustment")
    protected static native NSString GeometryAdjustmentValue();
    @GlobalConstant("kCICategoryCompositeOperation")
    protected static native NSString CompositeOperationValue();
    @GlobalConstant("kCICategoryHalftoneEffect")
    protected static native NSString HalftoneEffectValue();
    @GlobalConstant("kCICategoryColorAdjustment")
    protected static native NSString ColorAdjustmentValue();
    @GlobalConstant("kCICategoryColorEffect")
    protected static native NSString ColorEffectValue();
    @GlobalConstant("kCICategoryTransition")
    protected static native NSString TransitionValue();
    @GlobalConstant("kCICategoryTileEffect")
    protected static native NSString TileEffectValue();
    @GlobalConstant("kCICategoryGenerator")
    protected static native NSString GeneratorValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCICategoryReduction")
    protected static native NSString ReductionValue();
    @GlobalConstant("kCICategoryGradient")
    protected static native NSString GradientValue();
    @GlobalConstant("kCICategoryStylize")
    protected static native NSString StylizeValue();
    @GlobalConstant("kCICategorySharpen")
    protected static native NSString SharpenValue();
    @GlobalConstant("kCICategoryBlur")
    protected static native NSString BlurValue();
    @GlobalConstant("kCICategoryVideo")
    protected static native NSString VideoValue();
    @GlobalConstant("kCICategoryStillImage")
    protected static native NSString StillImageValue();
    @GlobalConstant("kCICategoryInterlaced")
    protected static native NSString InterlacedValue();
    @GlobalConstant("kCICategoryNonSquarePixels")
    protected static native NSString NonSquarePixelsValue();
    @GlobalConstant("kCICategoryHighDynamicRange")
    protected static native NSString HighDynamicRangeValue();
    @GlobalConstant("kCICategoryBuiltIn")
    protected static native NSString BuiltInValue();
    
}
