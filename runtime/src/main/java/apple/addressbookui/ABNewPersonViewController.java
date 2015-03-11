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

@Library("AddressBookUI") @Mapping("ABNewPersonViewController")
public class ABNewPersonViewController 
    extends UIViewController 
     {

    
    
    public ABNewPersonViewController() {}
    @Mapping("initWithNibName:bundle:")
    public ABNewPersonViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("newPersonViewDelegate")
    public native ABNewPersonViewControllerDelegate getNewPersonViewDelegate();
    public native void setNewPersonViewDelegate(ABNewPersonViewControllerDelegate v);
    @Mapping("addressBook")
    public native ABAddressBook getAddressBook();
    public native void setAddressBook(ABAddressBook v);
    @Mapping("displayedPerson")
    public native ABPerson getDisplayedPerson();
    public native void setDisplayedPerson(ABPerson v);
    @Mapping("parentGroup")
    public native ABGroup getParentGroup();
    public native void setParentGroup(ABGroup v);
    
    
    
    
    
}
