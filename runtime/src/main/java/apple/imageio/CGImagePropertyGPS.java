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
public class CGImagePropertyGPS 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSVersion")
    protected static native CFString VersionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLatitudeRef")
    protected static native CFString LatitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLatitude")
    protected static native CFString LatitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLongitudeRef")
    protected static native CFString LongitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSLongitude")
    protected static native CFString LongitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSAltitudeRef")
    protected static native CFString AltitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSAltitude")
    protected static native CFString AltitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSTimeStamp")
    protected static native CFString TimeStampKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSSatellites")
    protected static native CFString SatellitesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSStatus")
    protected static native CFString StatusKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSMeasureMode")
    protected static native CFString MeasureModeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDOP")
    protected static native CFString DOPKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSSpeedRef")
    protected static native CFString SpeedRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSSpeed")
    protected static native CFString SpeedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSTrackRef")
    protected static native CFString TrackRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSTrack")
    protected static native CFString TrackKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSImgDirectionRef")
    protected static native CFString ImgDirectionRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSImgDirection")
    protected static native CFString ImgDirectionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSMapDatum")
    protected static native CFString MapDatumKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLatitudeRef")
    protected static native CFString DestLatitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLatitude")
    protected static native CFString DestLatitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLongitudeRef")
    protected static native CFString DestLongitudeRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestLongitude")
    protected static native CFString DestLongitudeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestBearingRef")
    protected static native CFString DestBearingRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestBearing")
    protected static native CFString DestBearingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestDistanceRef")
    protected static native CFString DestDistanceRefKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDestDistance")
    protected static native CFString DestDistanceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSProcessingMethod")
    protected static native CFString ProcessingMethodKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSAreaInformation")
    protected static native CFString AreaInformationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDateStamp")
    protected static native CFString DateStampKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDifferental")
    protected static native CFString DifferentalKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSHPositioningError")
    protected static native CFString HPositioningErrorKey();
    
}
