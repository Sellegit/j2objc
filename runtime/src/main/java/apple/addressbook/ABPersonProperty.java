package apple.addressbook;


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
@Library("AddressBook/AddressBook.h")
public class ABPersonProperty 
    extends ABProperty 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonFirstNameProperty")
    public static native int FirstNameValue();
    @GlobalConstant("kABPersonLastNameProperty")
    public static native int LastNameValue();
    @GlobalConstant("kABPersonMiddleNameProperty")
    public static native int MiddleNameValue();
    @GlobalConstant("kABPersonPrefixProperty")
    public static native int PrefixValue();
    @GlobalConstant("kABPersonSuffixProperty")
    public static native int SuffixValue();
    @GlobalConstant("kABPersonNicknameProperty")
    public static native int NicknameValue();
    @GlobalConstant("kABPersonFirstNamePhoneticProperty")
    public static native int FirstNamePhoneticValue();
    @GlobalConstant("kABPersonLastNamePhoneticProperty")
    public static native int LastNamePhoneticValue();
    @GlobalConstant("kABPersonMiddleNamePhoneticProperty")
    public static native int MiddleNamePhoneticValue();
    @GlobalConstant("kABPersonOrganizationProperty")
    public static native int OrganizationValue();
    @GlobalConstant("kABPersonJobTitleProperty")
    public static native int JobTitleValue();
    @GlobalConstant("kABPersonDepartmentProperty")
    public static native int DepartmentValue();
    @GlobalConstant("kABPersonEmailProperty")
    public static native int EmailValue();
    @GlobalConstant("kABPersonBirthdayProperty")
    public static native int BirthdayValue();
    @GlobalConstant("kABPersonNoteProperty")
    public static native int NoteValue();
    @GlobalConstant("kABPersonCreationDateProperty")
    public static native int CreationDateValue();
    @GlobalConstant("kABPersonModificationDateProperty")
    public static native int ModificationDateValue();
    @GlobalConstant("kABPersonAddressProperty")
    public static native int AddressValue();
    @GlobalConstant("kABPersonDateProperty")
    public static native int DateValue();
    @GlobalConstant("kABPersonKindProperty")
    public static native int KindValue();
    @GlobalConstant("kABPersonPhoneProperty")
    public static native int PhoneValue();
    @GlobalConstant("kABPersonInstantMessageProperty")
    public static native int InstantMessageValue();
    @GlobalConstant("kABPersonURLProperty")
    public static native int URLValue();
    @GlobalConstant("kABPersonRelatedNamesProperty")
    public static native int RelatedNamesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileProperty")
    public static native int SocialProfileValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayProperty")
    public static native int AlternateBirthdayValue();

    @GlobalFunction("ABPersonGetTypeOfProperty")
    public static native ABPropertyType getType(int property);
    @GlobalFunction("ABPersonCopyLocalizedPropertyName")
    public static native CFString getLocalizedPropertyName(int property);

}
