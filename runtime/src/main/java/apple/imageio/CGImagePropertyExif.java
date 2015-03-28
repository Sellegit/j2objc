package apple.imageio;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("ImageIO/ImageIO.h")
public class CGImagePropertyExif 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureTime")
    public static native CFString ExposureTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFNumber")
    public static native CFString FNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureProgram")
    public static native CFString ExposureProgramKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSpectralSensitivity")
    public static native CFString SpectralSensitivityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeedRatings")
    public static native CFString ISOSpeedRatingsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifOECF")
    public static native CFString OECFKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSensitivityType")
    public static native CFString SensitivityTypeKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifStandardOutputSensitivity")
    public static native CFString StandardOutputSensitivityKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifRecommendedExposureIndex")
    public static native CFString RecommendedExposureIndexKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeed")
    public static native CFString ISOSpeedKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeedLatitudeyyy")
    public static native CFString ISOSpeedLatitudeyyyKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeedLatitudezzz")
    public static native CFString ISOSpeedLatitudezzzKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifVersion")
    public static native CFString VersionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDateTimeOriginal")
    public static native CFString DateTimeOriginalKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDateTimeDigitized")
    public static native CFString DateTimeDigitizedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifComponentsConfiguration")
    public static native CFString ComponentsConfigurationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCompressedBitsPerPixel")
    public static native CFString CompressedBitsPerPixelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifShutterSpeedValue")
    public static native CFString ShutterSpeedValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifApertureValue")
    public static native CFString ApertureValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifBrightnessValue")
    public static native CFString BrightnessValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureBiasValue")
    public static native CFString ExposureBiasValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifMaxApertureValue")
    public static native CFString MaxApertureValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectDistance")
    public static native CFString SubjectDistanceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifMeteringMode")
    public static native CFString MeteringModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLightSource")
    public static native CFString LightSourceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFlash")
    public static native CFString FlashKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalLength")
    public static native CFString FocalLengthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectArea")
    public static native CFString SubjectAreaKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifMakerNote")
    public static native CFString MakerNoteKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifUserComment")
    public static native CFString UserCommentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubsecTime")
    public static native CFString SubsecTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubsecTimeOrginal")
    public static native CFString SubsecTimeOrginalKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubsecTimeDigitized")
    public static native CFString SubsecTimeDigitizedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFlashPixVersion")
    public static native CFString FlashPixVersionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifColorSpace")
    public static native CFString ColorSpaceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifPixelXDimension")
    public static native CFString PixelXDimensionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifPixelYDimension")
    public static native CFString PixelYDimensionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifRelatedSoundFile")
    public static native CFString RelatedSoundFileKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFlashEnergy")
    public static native CFString FlashEnergyKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSpatialFrequencyResponse")
    public static native CFString SpatialFrequencyResponseKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalPlaneXResolution")
    public static native CFString FocalPlaneXResolutionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalPlaneYResolution")
    public static native CFString FocalPlaneYResolutionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalPlaneResolutionUnit")
    public static native CFString FocalPlaneResolutionUnitKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectLocation")
    public static native CFString SubjectLocationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureIndex")
    public static native CFString ExposureIndexKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSensingMethod")
    public static native CFString SensingMethodKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFileSource")
    public static native CFString FileSourceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSceneType")
    public static native CFString SceneTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCFAPattern")
    public static native CFString CFAPatternKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCustomRendered")
    public static native CFString CustomRenderedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureMode")
    public static native CFString ExposureModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifWhiteBalance")
    public static native CFString WhiteBalanceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDigitalZoomRatio")
    public static native CFString DigitalZoomRatioKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalLenIn35mmFilm")
    public static native CFString FocalLenIn35mmFilmKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSceneCaptureType")
    public static native CFString SceneCaptureTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifGainControl")
    public static native CFString GainControlKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifContrast")
    public static native CFString ContrastKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSaturation")
    public static native CFString SaturationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSharpness")
    public static native CFString SharpnessKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDeviceSettingDescription")
    public static native CFString DeviceSettingDescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectDistRange")
    public static native CFString SubjectDistRangeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifImageUniqueID")
    public static native CFString ImageUniqueIDKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCameraOwnerName")
    public static native CFString CameraOwnerNameKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifBodySerialNumber")
    public static native CFString BodySerialNumberKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensSpecification")
    public static native CFString LensSpecificationKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensMake")
    public static native CFString LensMakeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensModel")
    public static native CFString LensModelKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensSerialNumber")
    public static native CFString LensSerialNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifGamma")
    public static native CFString GammaKey();

}
