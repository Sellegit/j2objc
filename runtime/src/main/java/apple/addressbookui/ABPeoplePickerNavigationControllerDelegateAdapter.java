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
@Adapter
public abstract class ABPeoplePickerNavigationControllerDelegateAdapter 
    extends Object 
    implements ABPeoplePickerNavigationControllerDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("peoplePickerNavigationController:didSelectPerson:")
    public void didSelectPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("peoplePickerNavigationController:didSelectPerson:property:identifier:")
    public void didSelectPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person, ABProperty property, int identifier) { throw new UnsupportedOperationException(); }
    @NotImplemented("peoplePickerNavigationControllerDidCancel:")
    public void didCancel(ABPeoplePickerNavigationController peoplePicker) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("peoplePickerNavigationController:shouldContinueAfterSelectingPerson:")
    public boolean shouldContinueAfterSelectingPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("peoplePickerNavigationController:shouldContinueAfterSelectingPerson:property:identifier:")
    public boolean shouldContinueAfterSelectingPerson(ABPeoplePickerNavigationController peoplePicker, ABPerson person, ABProperty property, int identifier) { throw new UnsupportedOperationException(); }
    
}
