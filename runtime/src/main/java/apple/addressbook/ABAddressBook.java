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
    extends Object 
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
    public static native ABAddressBookRef create(NSDictionary<?, ?> options, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalFunction("ABAddressBookCreate")
    public static native ABAddressBookRef create();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("ABAddressBookRequestAccessWithCompletion")
    public static native void requestAccess(ABAddressBookRef addressBook, FunctionPtr completion);
    @GlobalFunction("ABAddressBookSave")
    public static native boolean save(ABAddressBookRef addressBook, Todo error);
    @GlobalFunction("ABAddressBookHasUnsavedChanges")
    public static native boolean hasUnsavedChanges(ABAddressBookRef addressBook);
    @GlobalFunction("ABAddressBookAddRecord")
    public static native boolean addRecord(ABAddressBookRef addressBook, ABRecordRef record, Todo error);
    @GlobalFunction("ABAddressBookRemoveRecord")
    public static native boolean removeRecord(ABAddressBookRef addressBook, ABRecordRef record, Todo error);
    @GlobalFunction("ABAddressBookCopyLocalizedLabel")
    public static native String getLocalizedLabel(String label);
    @GlobalFunction("ABAddressBookRegisterExternalChangeCallback")
    public static native void registerExternalChangeCallback(ABAddressBookRef addressBook, FunctionPtr callback, Todo context);
    @GlobalFunction("ABAddressBookUnregisterExternalChangeCallback")
    public static native void unregisterExternalChangeCallback(ABAddressBookRef addressBook, FunctionPtr callback, Todo context);
    @GlobalFunction("ABAddressBookRevert")
    public static native void revert(ABAddressBookRef addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyDefaultSource")
    public static native ABRecordRef getDefaultSource(ABAddressBookRef addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookGetSourceWithRecordID")
    public static native ABRecordRef getSource(ABAddressBookRef addressBook, int sourceID);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllSources")
    public static native NSArray<?> getAllSources(ABAddressBookRef addressBook);
    @GlobalFunction("ABAddressBookGetPersonCount")
    public static native @MachineSizedSInt long getPersonCount(ABAddressBookRef addressBook);
    @GlobalFunction("ABAddressBookGetPersonWithRecordID")
    public static native ABPerson getPerson(ABAddressBookRef addressBook, int recordID);
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeople")
    public static native List<ABPerson> getAllPeople(ABAddressBookRef addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeopleInSource")
    public static native List<ABPerson> getAllPeopleInSource(ABAddressBookRef addressBook, ABRecordRef source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering")
    public static native List<ABPerson> getAllPeopleInSource(ABAddressBookRef addressBook, ABRecordRef source, @Representing("ABPersonSortOrdering") long sortOrdering);
    @GlobalFunction("ABAddressBookCopyPeopleWithName")
    public static native List<ABPerson> getPeople(ABAddressBookRef addressBook, String name);
    @GlobalFunction("ABAddressBookGetGroupWithRecordID")
    public static native ABGroup getGroup(ABAddressBookRef addressBook, int recordID);
    @GlobalFunction("ABAddressBookGetGroupCount")
    public static native @MachineSizedSInt long getGroupCount(ABAddressBookRef addressBook);
    @GlobalFunction("ABAddressBookCopyArrayOfAllGroups")
    public static native List<ABGroup> getAllGroups(ABAddressBookRef addressBook);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABAddressBookCopyArrayOfAllGroupsInSource")
    public static native List<ABGroup> getAllGroupsInSource(ABAddressBookRef addressBook, ABRecordRef source);
    
}
