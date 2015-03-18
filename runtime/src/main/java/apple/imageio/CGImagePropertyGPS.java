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
public class CGImagePropertyGPS 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSVersion")
    public static native CFString VersionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLatitudeRef")
    public static native CFString LatitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLatitude")
    public static native CFString LatitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLongitudeRef")
    public static native CFString LongitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLongitude")
    public static native CFString LongitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSAltitudeRef")
    public static native CFString AltitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSAltitude")
    public static native CFString AltitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSTimeStamp")
    public static native CFString TimeStampKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSSatellites")
    public static native CFString SatellitesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSStatus")
    public static native CFString StatusKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSMeasureMode")
    public static native CFString MeasureModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDOP")
    public static native CFString DOPKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSSpeedRef")
    public static native CFString SpeedRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSSpeed")
    public static native CFString SpeedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSTrackRef")
    public static native CFString TrackRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSTrack")
    public static native CFString TrackKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSImgDirectionRef")
    public static native CFString ImgDirectionRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSImgDirection")
    public static native CFString ImgDirectionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSMapDatum")
    public static native CFString MapDatumKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLatitudeRef")
    public static native CFString DestLatitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLatitude")
    public static native CFString DestLatitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLongitudeRef")
    public static native CFString DestLongitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLongitude")
    public static native CFString DestLongitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestBearingRef")
    public static native CFString DestBearingRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestBearing")
    public static native CFString DestBearingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestDistanceRef")
    public static native CFString DestDistanceRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestDistance")
    public static native CFString DestDistanceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSProcessingMethod")
    public static native CFString ProcessingMethodKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSAreaInformation")
    public static native CFString AreaInformationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDateStamp")
    public static native CFString DateStampKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDifferental")
    public static native CFString DifferentalKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSHPositioningError")
    public static native CFString HPositioningErrorKey();
    
}
