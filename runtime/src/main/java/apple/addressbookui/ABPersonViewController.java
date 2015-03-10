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

@Library("AddressBookUI") @Mapping("ABPersonViewController")
public class ABPersonViewController 
    extends UIViewController 
     {

    
    
    public ABPersonViewController() {}
    @Mapping("initWithNibName:bundle:")
    public ABPersonViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("personViewDelegate")
    public native ABPersonViewControllerDelegate getPersonViewDelegate();
    public native void setPersonViewDelegate(ABPersonViewControllerDelegate v);
    @Mapping("addressBook")
    public native ABAddressBook getAddressBook();
    public native void setAddressBook(ABAddressBook v);
    @Mapping("displayedPerson")
    public native ABPerson getDisplayedPerson();
    public native void setDisplayedPerson(ABPerson v);
    @Mapping("displayedProperties")
    public native List<? extends ABProperty> getDisplayedProperties();
    public native void setDisplayedProperties(List<? extends ABProperty> v);
    @Mapping("allowsEditing")
    public native boolean allowsEditing();
    public native void setAllowsEditing(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("allowsActions")
    public native boolean allowsActions();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public native void setAllowsActions(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("shouldShowLinkedPeople")
    public native boolean shouldShowLinkedPeople();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public native void setShouldShowLinkedPeople(boolean v);
    
    
    
    @Mapping("setHighlightedItemForProperty:withIdentifier:")
    public native void setHighlightedItem(ABPersonProperty property, int identifier);
    
}
