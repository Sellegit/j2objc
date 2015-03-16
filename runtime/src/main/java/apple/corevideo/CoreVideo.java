package apple.corevideo;


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
import apple.coremedia.*;
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreVideo/CoreVideo.h")
public class CoreVideo 
    extends Object 
     {

    
    public static final int CVTimeIsIndefinite = 1;
    public static final int CVTimeStampVideoHostTimeValid = 3;
    public static final int CVTimeStampIsInterlaced = 196608;
    
    
    
    
    
    @GlobalConstant("kCVZeroTime")
    public static native CVTime CVTimeZeroTime();
    @GlobalConstant("kCVIndefiniteTime")
    public static native CVTime CVTimeIndefiniteTime();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVBufferPropagatedAttachmentsKey")
    public static native CFString CVBufferPropagatedAttachmentsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVBufferNonPropagatedAttachmentsKey")
    public static native CFString CVBufferNonPropagatedAttachmentsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVBufferMovieTimeKey")
    public static native CFString CVBufferMovieTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVBufferTimeValueKey")
    public static native CFString CVBufferTimeValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVBufferTimeScaleKey")
    public static native CFString CVBufferTimeScaleKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferCGColorSpaceKey")
    public static native CFString CVImageBufferCGColorSpaceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferCleanApertureKey")
    public static native CFString CVImageBufferCleanApertureKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferCleanApertureWidthKey")
    public static native CFString CVImageBufferCleanApertureWidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferCleanApertureHeightKey")
    public static native CFString CVImageBufferCleanApertureHeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferCleanApertureHorizontalOffsetKey")
    public static native CFString CVImageBufferCleanApertureHorizontalOffsetKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferCleanApertureVerticalOffsetKey")
    public static native CFString CVImageBufferCleanApertureVerticalOffsetKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferPreferredCleanApertureKey")
    public static native CFString CVImageBufferPreferredCleanApertureKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferFieldCountKey")
    public static native CFString CVImageBufferFieldCountKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferFieldDetailKey")
    public static native CFString CVImageBufferFieldDetailKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferFieldDetailTemporalTopFirst")
    public static native CFString CVImageBufferFieldDetailTemporalTopFirst();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferFieldDetailTemporalBottomFirst")
    public static native CFString CVImageBufferFieldDetailTemporalBottomFirst();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferFieldDetailSpatialFirstLineEarly")
    public static native CFString CVImageBufferFieldDetailSpatialFirstLineEarly();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferFieldDetailSpatialFirstLineLate")
    public static native CFString CVImageBufferFieldDetailSpatialFirstLineLate();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferPixelAspectRatioKey")
    public static native CFString CVImageBufferPixelAspectRatioKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferPixelAspectRatioHorizontalSpacingKey")
    public static native CFString CVImageBufferPixelAspectRatioHorizontalSpacingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferPixelAspectRatioVerticalSpacingKey")
    public static native CFString CVImageBufferPixelAspectRatioVerticalSpacingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferDisplayDimensionsKey")
    public static native CFString CVImageBufferDisplayDimensionsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferDisplayWidthKey")
    public static native CFString CVImageBufferDisplayWidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferDisplayHeightKey")
    public static native CFString CVImageBufferDisplayHeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferGammaLevelKey")
    public static native CFString CVImageBufferGammaLevelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferICCProfileKey")
    public static native CFString CVImageBufferICCProfileKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferYCbCrMatrixKey")
    public static native CFString CVImageBufferYCbCrMatrixKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferYCbCrMatrix_ITU_R_709_2")
    public static native CFString CVImageBufferYCbCrMatrixITU_R_709_2();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferYCbCrMatrix_ITU_R_601_4")
    public static native CFString CVImageBufferYCbCrMatrixITU_R_601_4();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferYCbCrMatrix_SMPTE_240M_1995")
    public static native CFString CVImageBufferYCbCrMatrixSMPTE_240M_1995();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferColorPrimariesKey")
    public static native CFString CVImageBufferColorPrimariesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferColorPrimaries_ITU_R_709_2")
    public static native CFString CVImageBufferColorPrimariesITU_R_709_2();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferColorPrimaries_EBU_3213")
    public static native CFString CVImageBufferColorPrimariesEBU_3213();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferColorPrimaries_SMPTE_C")
    public static native CFString CVImageBufferColorPrimariesSMPTE_C();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCVImageBufferColorPrimaries_P22")
    public static native CFString CVImageBufferColorPrimariesP22();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferTransferFunctionKey")
    public static native CFString CVImageBufferTransferFunctionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferTransferFunction_ITU_R_709_2")
    public static native CFString CVImageBufferTransferFunctionITU_R_709_2();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferTransferFunction_SMPTE_240M_1995")
    public static native CFString CVImageBufferTransferFunctionSMPTE_240M_1995();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferTransferFunction_UseGamma")
    public static native CFString CVImageBufferTransferFunctionUseGamma();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocationTopFieldKey")
    public static native CFString CVImageBufferChromaLocationTopFieldKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocationBottomFieldKey")
    public static native CFString CVImageBufferChromaLocationBottomFieldKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocation_Left")
    public static native CFString CVImageBufferChromaLocationLeft();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocation_Center")
    public static native CFString CVImageBufferChromaLocationCenter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocation_TopLeft")
    public static native CFString CVImageBufferChromaLocationTopLeft();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocation_Top")
    public static native CFString CVImageBufferChromaLocationTop();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocation_BottomLeft")
    public static native CFString CVImageBufferChromaLocationBottomLeft();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocation_Bottom")
    public static native CFString CVImageBufferChromaLocationBottom();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaLocation_DV420")
    public static native CFString CVImageBufferChromaLocationDV420();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaSubsamplingKey")
    public static native CFString CVImageBufferChromaSubsamplingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaSubsampling_420")
    public static native CFString CVImageBufferChromaSubsampling_420();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaSubsampling_422")
    public static native CFString CVImageBufferChromaSubsampling_422();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVImageBufferChromaSubsampling_411")
    public static native CFString CVImageBufferChromaSubsampling_411();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCVImageBufferAlphaChannelIsOpaque")
    public static native CFString Value__kCVImageBufferAlphaChannelIsOpaque();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPoolMinimumBufferCountKey")
    public static native CFString CVPixelBufferPoolPoolMinimumBufferCountKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPoolMaximumBufferAgeKey")
    public static native CFString CVPixelBufferPoolPoolMaximumBufferAgeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPoolAllocationThresholdKey")
    public static native CFString CVPixelBufferPoolPoolAllocationThresholdKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPoolFreeBufferNotification")
    public static native CFString CVPixelBufferPoolFreeBufferNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCVOpenGLESTextureCacheMaximumTextureAgeKey")
    public static native CFString CVOpenGLESTextureCacheMaximumTextureAgeKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCVMetalTextureCacheMaximumTextureAgeKey")
    public static native CFString Value__kCVMetalTextureCacheMaximumTextureAgeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatName")
    public static native CFString CVPixelFormatName();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatConstant")
    public static native CFString CVPixelFormatConstant();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatCodecType")
    public static native CFString CVPixelFormatCodecType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatFourCC")
    public static native CFString CVPixelFormatFourCC();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCVPixelFormatContainsAlpha")
    public static native CFString CVPixelFormatContainsAlpha();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCVPixelFormatContainsYCbCr")
    public static native CFString CVPixelFormatContainsYCbCr();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCVPixelFormatContainsRGB")
    public static native CFString CVPixelFormatContainsRGB();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatPlanes")
    public static native CFString CVPixelFormatPlanes();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatBlockWidth")
    public static native CFString CVPixelFormatBlockWidth();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatBlockHeight")
    public static native CFString CVPixelFormatBlockHeight();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatBitsPerBlock")
    public static native CFString CVPixelFormatBitsPerBlock();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatBlockHorizontalAlignment")
    public static native CFString CVPixelFormatBlockHorizontalAlignment();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatBlockVerticalAlignment")
    public static native CFString CVPixelFormatBlockVerticalAlignment();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatBlackBlock")
    public static native CFString CVPixelFormatBlackBlock();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatHorizontalSubsampling")
    public static native CFString CVPixelFormatHorizontalSubsampling();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatVerticalSubsampling")
    public static native CFString CVPixelFormatVerticalSubsampling();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatOpenGLFormat")
    public static native CFString CVPixelFormatOpenGLFormat();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatOpenGLType")
    public static native CFString CVPixelFormatOpenGLType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatOpenGLInternalFormat")
    public static native CFString CVPixelFormatOpenGLInternalFormat();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatCGBitmapInfo")
    public static native CFString CVPixelFormatCGBitmapInfo();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatQDCompatibility")
    public static native CFString CVPixelFormatQDCompatibility();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatCGBitmapContextCompatibility")
    public static native CFString CVPixelFormatCGBitmapContextCompatibility();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatCGImageCompatibility")
    public static native CFString CVPixelFormatCGImageCompatibility();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatOpenGLCompatibility")
    public static native CFString CVPixelFormatOpenGLCompatibility();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCVPixelFormatOpenGLESCompatibility")
    public static native CFString CVPixelFormatOpenGLESCompatibility();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelFormatFillExtendedPixelsCallback")
    public static native CFString CVPixelFormatFillExtendedPixelsCallback();
    
}
