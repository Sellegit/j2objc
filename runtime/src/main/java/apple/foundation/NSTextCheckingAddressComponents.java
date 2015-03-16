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
    protected static native NSString NameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingJobTitleKey")
    protected static native NSString JobTitleKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingOrganizationKey")
    protected static native NSString OrganizationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingStreetKey")
    protected static native NSString StreetKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingCityKey")
    protected static native NSString CityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingStateKey")
    protected static native NSString StateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingZIPKey")
    protected static native NSString ZIPKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingCountryKey")
    protected static native NSString CountryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSTextCheckingPhoneKey")
    protected static native NSString PhoneKey();
    
}
