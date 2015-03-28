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
public class CGImagePropertyIPTCContactInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoCity")
    public static native CFString CityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoCountry")
    public static native CFString CountryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoAddress")
    public static native CFString AddressKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoPostalCode")
    public static native CFString PostalCodeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoStateProvince")
    public static native CFString StateProvinceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoEmails")
    public static native CFString EmailsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoPhones")
    public static native CFString PhonesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContactInfoWebURLs")
    public static native CFString WebURLsKey();

}
