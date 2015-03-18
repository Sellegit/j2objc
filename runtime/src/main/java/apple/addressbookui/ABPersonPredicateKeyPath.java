package apple.addressbookui;


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
import apple.uikit.*;
import apple.addressbook.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBookUI/AddressBookUI.h")
public class ABPersonPredicateKeyPath 
    extends NSPredicateKeyPath 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonNamePrefixProperty")
    public static native NSString NamePrefixValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonGivenNameProperty")
    public static native NSString GivenNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonMiddleNameProperty")
    public static native NSString MiddleNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonFamilyNameProperty")
    public static native NSString FamilyNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonNameSuffixProperty")
    public static native NSString NameSuffixValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPreviousFamilyNameProperty")
    public static native NSString PreviousFamilyNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonNicknameProperty")
    public static native NSString NicknameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneticGivenNameProperty")
    public static native NSString PhoneticGivenNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneticMiddleNameProperty")
    public static native NSString PhoneticMiddleNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneticFamilyNameProperty")
    public static native NSString PhoneticFamilyNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonOrganizationNameProperty")
    public static native NSString OrganizationNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonDepartmentNameProperty")
    public static native NSString DepartmentNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonJobTitleProperty")
    public static native NSString JobTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonBirthdayProperty")
    public static native NSString BirthdayValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonNoteProperty")
    public static native NSString NoteValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneNumbersProperty")
    public static native NSString PhoneNumbersValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonEmailAddressesProperty")
    public static native NSString EmailAddressesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonUrlAddressesProperty")
    public static native NSString UrlAddressesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonDatesProperty")
    public static native NSString DatesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonInstantMessageAddressesProperty")
    public static native NSString InstantMessageAddressesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonRelatedNamesProperty")
    public static native NSString RelatedNamesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonSocialProfilesProperty")
    public static native NSString SocialProfilesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPostalAddressesProperty")
    public static native NSString PostalAddressesValue();
    
}
