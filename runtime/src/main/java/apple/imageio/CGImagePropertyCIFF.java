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
public class CGImagePropertyCIFF 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFDescription")
    public static native CFString DescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFFirmware")
    public static native CFString FirmwareKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFOwnerName")
    public static native CFString OwnerNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFImageName")
    public static native CFString ImageNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFImageFileName")
    public static native CFString ImageFileNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFReleaseMethod")
    public static native CFString ReleaseMethodKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFReleaseTiming")
    public static native CFString ReleaseTimingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFRecordID")
    public static native CFString RecordIDKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFSelfTimingTime")
    public static native CFString SelfTimingTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFCameraSerialNumber")
    public static native CFString CameraSerialNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFImageSerialNumber")
    public static native CFString ImageSerialNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFContinuousDrive")
    public static native CFString ContinuousDriveKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFFocusMode")
    public static native CFString FocusModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFMeteringMode")
    public static native CFString MeteringModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFShootingMode")
    public static native CFString ShootingModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFLensModel")
    public static native CFString LensModelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFLensMaxMM")
    public static native CFString LensMaxMMKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFLensMinMM")
    public static native CFString LensMinMMKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFWhiteBalanceIndex")
    public static native CFString WhiteBalanceIndexKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFFlashExposureComp")
    public static native CFString FlashExposureCompKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFMeasuredEV")
    public static native CFString MeasuredEVKey();

}
