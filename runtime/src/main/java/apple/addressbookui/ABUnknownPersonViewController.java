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

@Library("AddressBookUI/AddressBookUI.h") @Mapping("ABUnknownPersonViewController")
public class ABUnknownPersonViewController 
    extends UIViewController 
     {

    
    
    public ABUnknownPersonViewController() {}
    @Mapping("initWithNibName:bundle:")
    public ABUnknownPersonViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("unknownPersonViewDelegate")
    public native ABUnknownPersonViewControllerDelegate getUnknownPersonViewDelegate();
    @Mapping("setUnknownPersonViewDelegate:")
    public native void setUnknownPersonViewDelegate(ABUnknownPersonViewControllerDelegate v);
    @Mapping("addressBook")
    public native ABAddressBook getAddressBook();
    @Mapping("setAddressBook:")
    public native void setAddressBook(ABAddressBook v);
    @Mapping("displayedPerson")
    public native ABPerson getDisplayedPerson();
    @Mapping("setDisplayedPerson:")
    public native void setDisplayedPerson(ABPerson v);
    @Mapping("alternateName")
    public native String getAlternateName();
    @Mapping("setAlternateName:")
    public native void setAlternateName(String v);
    @Mapping("message")
    public native String getMessage();
    @Mapping("setMessage:")
    public native void setMessage(String v);
    @Mapping("allowsActions")
    public native boolean allowsActions();
    @Mapping("setAllowsActions:")
    public native void setAllowsActions(boolean v);
    @Mapping("allowsAddingToAddressBook")
    public native boolean allowsAddingToAddressBook();
    @Mapping("setAllowsAddingToAddressBook:")
    public native void setAllowsAddingToAddressBook(boolean v);
    
    
    
    
    
}
