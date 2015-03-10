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
public class ABAddressBook 
    extends CFType 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("ABAddressBookGetAuthorizationStatus")
    public static native ABAuthorizationStatus getAuthorizationStatus();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("ABAddressBookCreateWithOptions")
    protected static native ABAddressBook create(NSDictionary<NSString, ?> options, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalFunction("ABAddressBookCreate")
    public static native ABAddressBook create();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("ABAddressBookRequestAccessWithCompletion")
    public native void requestAccess(FunctionPtr completion);
    @GlobalFunction("ABAddressBookSave")
    protected native boolean save(Todo error);
    @GlobalFunction("ABAddressBookHasUnsavedChanges")
    public native boolean hasUnsavedChanges();
    @GlobalFunction("ABAddressBookAddRecord")
    protected native boolean addRecord(ABRecord record, Todo error);
    @GlobalFunction("ABAddressBookRemoveRecord")
    protected native boolean removeRecord(ABRecord record, Todo error);
    @GlobalFunction("ABAddressBookCopyLocalizedLabel")
    public static native String getLocalizedLabel(String label);
    @GlobalFunction("ABAddressBookRegisterExternalChangeCallback")
    protected native void registerExternalChangeCallback(FunctionPtr callback, @Pointer long context);
    @GlobalFunction("ABAddressBookUnregisterExternalChangeCallback")
    protected native void unregisterExternalChangeCallback(FunctionPtr callback, @Pointer long context);
    @GlobalFunction("ABAddressBookRevert")
    public native void revert();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyDefaultSource")
    public native ABRecord getDefaultSource();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookGetSourceWithRecordID")
    public native ABRecord getSource(int sourceID);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllSources")
    public native NSArray<?> getAllSources();
    @GlobalFunction("ABAddressBookGetPersonCount")
    public native @MachineSizedSInt long getPersonCount();
    @GlobalFunction("ABAddressBookGetPersonWithRecordID")
    public native ABPerson getPerson(int recordID);
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeople")
    public native List<ABPerson> getAllPeople();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeopleInSource")
    public native List<ABPerson> getAllPeopleInSource(ABRecord source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering")
    public native List<ABPerson> getAllPeopleInSource(ABRecord source, ABPersonSortOrdering sortOrdering);
    @GlobalFunction("ABAddressBookCopyPeopleWithName")
    public native List<ABPerson> getPeople(String name);
    @GlobalFunction("ABAddressBookGetGroupWithRecordID")
    public native ABGroup getGroup(int recordID);
    @GlobalFunction("ABAddressBookGetGroupCount")
    public native @MachineSizedSInt long getGroupCount();
    @GlobalFunction("ABAddressBookCopyArrayOfAllGroups")
    public native List<ABGroup> getAllGroups();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllGroupsInSource")
    public native List<ABGroup> getAllGroupsInSource(ABRecord source);
    
}
