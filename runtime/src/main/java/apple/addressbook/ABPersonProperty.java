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
@Library("AddressBook")
public class ABPersonProperty 
    extends ABProperty 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonFirstNameProperty")
    protected static native int FirstNameValue();
    @GlobalConstant("kABPersonLastNameProperty")
    protected static native int LastNameValue();
    @GlobalConstant("kABPersonMiddleNameProperty")
    protected static native int MiddleNameValue();
    @GlobalConstant("kABPersonPrefixProperty")
    protected static native int PrefixValue();
    @GlobalConstant("kABPersonSuffixProperty")
    protected static native int SuffixValue();
    @GlobalConstant("kABPersonNicknameProperty")
    protected static native int NicknameValue();
    @GlobalConstant("kABPersonFirstNamePhoneticProperty")
    protected static native int FirstNamePhoneticValue();
    @GlobalConstant("kABPersonLastNamePhoneticProperty")
    protected static native int LastNamePhoneticValue();
    @GlobalConstant("kABPersonMiddleNamePhoneticProperty")
    protected static native int MiddleNamePhoneticValue();
    @GlobalConstant("kABPersonOrganizationProperty")
    protected static native int OrganizationValue();
    @GlobalConstant("kABPersonJobTitleProperty")
    protected static native int JobTitleValue();
    @GlobalConstant("kABPersonDepartmentProperty")
    protected static native int DepartmentValue();
    @GlobalConstant("kABPersonEmailProperty")
    protected static native int EmailValue();
    @GlobalConstant("kABPersonBirthdayProperty")
    protected static native int BirthdayValue();
    @GlobalConstant("kABPersonNoteProperty")
    protected static native int NoteValue();
    @GlobalConstant("kABPersonCreationDateProperty")
    protected static native int CreationDateValue();
    @GlobalConstant("kABPersonModificationDateProperty")
    protected static native int ModificationDateValue();
    @GlobalConstant("kABPersonAddressProperty")
    protected static native int AddressValue();
    @GlobalConstant("kABPersonDateProperty")
    protected static native int DateValue();
    @GlobalConstant("kABPersonKindProperty")
    protected static native int KindValue();
    @GlobalConstant("kABPersonPhoneProperty")
    protected static native int PhoneValue();
    @GlobalConstant("kABPersonInstantMessageProperty")
    protected static native int InstantMessageValue();
    @GlobalConstant("kABPersonURLProperty")
    protected static native int URLValue();
    @GlobalConstant("kABPersonRelatedNamesProperty")
    protected static native int RelatedNamesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileProperty")
    protected static native int SocialProfileValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kABPersonAlternateBirthdayProperty")
    protected static native int AlternateBirthdayValue();
    
    @GlobalFunction("ABPersonGetTypeOfProperty")
    protected static native ABPropertyType getType(int property);
    @GlobalFunction("ABPersonCopyLocalizedPropertyName")
    protected static native String getLocalizedPropertyName(int property);
    
}
