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
    protected static native NSString NamePrefixValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonGivenNameProperty")
    protected static native NSString GivenNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonMiddleNameProperty")
    protected static native NSString MiddleNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonFamilyNameProperty")
    protected static native NSString FamilyNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonNameSuffixProperty")
    protected static native NSString NameSuffixValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPreviousFamilyNameProperty")
    protected static native NSString PreviousFamilyNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonNicknameProperty")
    protected static native NSString NicknameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneticGivenNameProperty")
    protected static native NSString PhoneticGivenNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneticMiddleNameProperty")
    protected static native NSString PhoneticMiddleNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneticFamilyNameProperty")
    protected static native NSString PhoneticFamilyNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonOrganizationNameProperty")
    protected static native NSString OrganizationNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonDepartmentNameProperty")
    protected static native NSString DepartmentNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonJobTitleProperty")
    protected static native NSString JobTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonBirthdayProperty")
    protected static native NSString BirthdayValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonNoteProperty")
    protected static native NSString NoteValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPhoneNumbersProperty")
    protected static native NSString PhoneNumbersValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonEmailAddressesProperty")
    protected static native NSString EmailAddressesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonUrlAddressesProperty")
    protected static native NSString UrlAddressesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonDatesProperty")
    protected static native NSString DatesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonInstantMessageAddressesProperty")
    protected static native NSString InstantMessageAddressesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonRelatedNamesProperty")
    protected static native NSString RelatedNamesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonSocialProfilesProperty")
    protected static native NSString SocialProfilesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("ABPersonPostalAddressesProperty")
    protected static native NSString PostalAddressesValue();
    
}
