package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSTextCheckingAddressComponents 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingNameKey")
    public static native NSString NameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingJobTitleKey")
    public static native NSString JobTitleKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingOrganizationKey")
    public static native NSString OrganizationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingStreetKey")
    public static native NSString StreetKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingCityKey")
    public static native NSString CityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingStateKey")
    public static native NSString StateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingZIPKey")
    public static native NSString ZIPKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingCountryKey")
    public static native NSString CountryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingPhoneKey")
    public static native NSString PhoneKey();
    
}
