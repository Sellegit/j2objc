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
@Library("ImageIO")
public class CGImagePropertyExif 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureTime")
    protected static native CFString ExposureTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFNumber")
    protected static native CFString FNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureProgram")
    protected static native CFString ExposureProgramKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSpectralSensitivity")
    protected static native CFString SpectralSensitivityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeedRatings")
    protected static native CFString ISOSpeedRatingsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifOECF")
    protected static native CFString OECFKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSensitivityType")
    protected static native CFString SensitivityTypeKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifStandardOutputSensitivity")
    protected static native CFString StandardOutputSensitivityKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifRecommendedExposureIndex")
    protected static native CFString RecommendedExposureIndexKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeed")
    protected static native CFString ISOSpeedKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeedLatitudeyyy")
    protected static native CFString ISOSpeedLatitudeyyyKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifISOSpeedLatitudezzz")
    protected static native CFString ISOSpeedLatitudezzzKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifVersion")
    protected static native CFString VersionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDateTimeOriginal")
    protected static native CFString DateTimeOriginalKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDateTimeDigitized")
    protected static native CFString DateTimeDigitizedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifComponentsConfiguration")
    protected static native CFString ComponentsConfigurationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCompressedBitsPerPixel")
    protected static native CFString CompressedBitsPerPixelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifShutterSpeedValue")
    protected static native CFString ShutterSpeedValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifApertureValue")
    protected static native CFString ApertureValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifBrightnessValue")
    protected static native CFString BrightnessValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureBiasValue")
    protected static native CFString ExposureBiasValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifMaxApertureValue")
    protected static native CFString MaxApertureValueKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectDistance")
    protected static native CFString SubjectDistanceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifMeteringMode")
    protected static native CFString MeteringModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLightSource")
    protected static native CFString LightSourceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFlash")
    protected static native CFString FlashKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalLength")
    protected static native CFString FocalLengthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectArea")
    protected static native CFString SubjectAreaKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifMakerNote")
    protected static native CFString MakerNoteKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifUserComment")
    protected static native CFString UserCommentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubsecTime")
    protected static native CFString SubsecTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubsecTimeOrginal")
    protected static native CFString SubsecTimeOrginalKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubsecTimeDigitized")
    protected static native CFString SubsecTimeDigitizedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFlashPixVersion")
    protected static native CFString FlashPixVersionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifColorSpace")
    protected static native CFString ColorSpaceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifPixelXDimension")
    protected static native CFString PixelXDimensionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifPixelYDimension")
    protected static native CFString PixelYDimensionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifRelatedSoundFile")
    protected static native CFString RelatedSoundFileKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFlashEnergy")
    protected static native CFString FlashEnergyKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSpatialFrequencyResponse")
    protected static native CFString SpatialFrequencyResponseKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalPlaneXResolution")
    protected static native CFString FocalPlaneXResolutionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalPlaneYResolution")
    protected static native CFString FocalPlaneYResolutionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalPlaneResolutionUnit")
    protected static native CFString FocalPlaneResolutionUnitKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectLocation")
    protected static native CFString SubjectLocationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureIndex")
    protected static native CFString ExposureIndexKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSensingMethod")
    protected static native CFString SensingMethodKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFileSource")
    protected static native CFString FileSourceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSceneType")
    protected static native CFString SceneTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCFAPattern")
    protected static native CFString CFAPatternKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCustomRendered")
    protected static native CFString CustomRenderedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifExposureMode")
    protected static native CFString ExposureModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifWhiteBalance")
    protected static native CFString WhiteBalanceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDigitalZoomRatio")
    protected static native CFString DigitalZoomRatioKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifFocalLenIn35mmFilm")
    protected static native CFString FocalLenIn35mmFilmKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSceneCaptureType")
    protected static native CFString SceneCaptureTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifGainControl")
    protected static native CFString GainControlKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifContrast")
    protected static native CFString ContrastKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSaturation")
    protected static native CFString SaturationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSharpness")
    protected static native CFString SharpnessKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDeviceSettingDescription")
    protected static native CFString DeviceSettingDescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifSubjectDistRange")
    protected static native CFString SubjectDistRangeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifImageUniqueID")
    protected static native CFString ImageUniqueIDKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifCameraOwnerName")
    protected static native CFString CameraOwnerNameKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifBodySerialNumber")
    protected static native CFString BodySerialNumberKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensSpecification")
    protected static native CFString LensSpecificationKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensMake")
    protected static native CFString LensMakeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensModel")
    protected static native CFString LensModelKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifLensSerialNumber")
    protected static native CFString LensSerialNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifGamma")
    protected static native CFString GammaKey();
    
}
