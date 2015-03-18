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
    public static native ABAddressBook create(NSDictionary<?, ?> options, Todo error);
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
    public static native void requestAccess(ABAddressBook addressBook, FunctionPtr completion);
    @GlobalFunction("ABAddressBookSave")
    public static native boolean save(ABAddressBook addressBook, Todo error);
    @GlobalFunction("ABAddressBookHasUnsavedChanges")
    public static native boolean hasUnsavedChanges(ABAddressBook addressBook);
    @GlobalFunction("ABAddressBookAddRecord")
    public static native boolean addRecord(ABAddressBook addressBook, ABRecord record, Todo error);
    @GlobalFunction("ABAddressBookRemoveRecord")
    public static native boolean removeRecord(ABAddressBook addressBook, ABRecord record, Todo error);
    @GlobalFunction("ABAddressBookCopyLocalizedLabel")
    public static native String getLocalizedLabel(String label);
    @GlobalFunction("ABAddressBookRegisterExternalChangeCallback")
    public static native void registerExternalChangeCallback(ABAddressBook addressBook, FunctionPtr callback, Todo context);
    @GlobalFunction("ABAddressBookUnregisterExternalChangeCallback")
    public static native void unregisterExternalChangeCallback(ABAddressBook addressBook, FunctionPtr callback, Todo context);
    @GlobalFunction("ABAddressBookRevert")
    public static native void revert(ABAddressBook addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyDefaultSource")
    public static native ABRecord getDefaultSource(ABAddressBook addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookGetSourceWithRecordID")
    public static native ABRecord getSource(ABAddressBook addressBook, int sourceID);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllSources")
    public static native NSArray<?> getAllSources(ABAddressBook addressBook);
    @GlobalFunction("ABAddressBookGetPersonCount")
    public static native @MachineSizedSInt long getPersonCount(ABAddressBook addressBook);
    @GlobalFunction("ABAddressBookGetPersonWithRecordID")
    public static native ABPerson getPerson(ABAddressBook addressBook, int recordID);
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeople")
    public static native List<ABPerson> getAllPeople(ABAddressBook addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeopleInSource")
    public static native List<ABPerson> getAllPeopleInSource(ABAddressBook addressBook, ABRecord source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering")
    public static native List<ABPerson> getAllPeopleInSource(ABAddressBook addressBook, ABRecord source, ABPersonSortOrdering sortOrdering);
    @GlobalFunction("ABAddressBookCopyPeopleWithName")
    public static native List<ABPerson> getPeople(ABAddressBook addressBook, String name);
    @GlobalFunction("ABAddressBookGetGroupWithRecordID")
    public static native ABGroup getGroup(ABAddressBook addressBook, int recordID);
    @GlobalFunction("ABAddressBookGetGroupCount")
    public static native @MachineSizedSInt long getGroupCount(ABAddressBook addressBook);
    @GlobalFunction("ABAddressBookCopyArrayOfAllGroups")
    public static native List<ABGroup> getAllGroups(ABAddressBook addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllGroupsInSource")
    public static native List<ABGroup> getAllGroupsInSource(ABAddressBook addressBook, ABRecord source);
    
}
