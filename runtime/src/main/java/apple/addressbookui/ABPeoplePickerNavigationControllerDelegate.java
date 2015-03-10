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





@Library("AddressBookUI") @Mapping("ABPeoplePickerNavigationControllerDelegate")
public interface ABPeoplePickerNavigationControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("peoplePickerNavigationController:didSelectPerson:")
    void didSelectPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("peoplePickerNavigationController:didSelectPerson:property:identifier:")
    void didSelectPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person, ABProperty property, int identifier);
    @Mapping("peoplePickerNavigationControllerDidCancel:")
    void didCancel(ABPeoplePickerNavigationController peoplePicker);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("peoplePickerNavigationController:shouldContinueAfterSelectingPerson:")
    boolean shouldContinueAfterSelectingPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("peoplePickerNavigationController:shouldContinueAfterSelectingPerson:property:identifier:")
    boolean shouldContinueAfterSelectingPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person, ABProperty property, int identifier);
    
    /*<adapter>*/
    /*</adapter>*/
}
