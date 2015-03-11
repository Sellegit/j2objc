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



/**
 * @since Available in iOS 2.0 and later.
 */

@Library("AddressBookUI") @Mapping("ABPeoplePickerNavigationController")
public class ABPeoplePickerNavigationController 
    extends UINavigationController 
     {

    
    
    public ABPeoplePickerNavigationController() {}
    @Mapping("initWithRootViewController:")
    public ABPeoplePickerNavigationController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public ABPeoplePickerNavigationController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("peoplePickerDelegate")
    public native ABPeoplePickerNavigationControllerDelegate getPeoplePickerDelegate();
    @Mapping("setPeoplePickerDelegate:")
    public native void setPeoplePickerDelegate(ABPeoplePickerNavigationControllerDelegate v);
    @Mapping("displayedProperties")
    public native List<? extends ABProperty> getDisplayedProperties();
    @Mapping("setDisplayedProperties:")
    public native void setDisplayedProperties(List<? extends ABProperty> v);
    @Mapping("addressBook")
    public native ABAddressBook getAddressBook();
    @Mapping("setAddressBook:")
    public native void setAddressBook(ABAddressBook v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("predicateForEnablingPerson")
    public native NSPredicate getPredicateForEnablingPerson();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPredicateForEnablingPerson:")
    public native void setPredicateForEnablingPerson(NSPredicate v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("predicateForSelectionOfPerson")
    public native NSPredicate getPredicateForSelectionOfPerson();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPredicateForSelectionOfPerson:")
    public native void setPredicateForSelectionOfPerson(NSPredicate v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("predicateForSelectionOfProperty")
    public native NSPredicate getPredicateForSelectionOfProperty();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPredicateForSelectionOfProperty:")
    public native void setPredicateForSelectionOfProperty(NSPredicate v);
    
    
    
    
    
}
