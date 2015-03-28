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
public class ABGroup 
    extends ABRecord 
     {

    
    
    
    
    
    @GlobalFunction("ABGroupCreate")
    public static native ABGroup create();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABGroupCreateInSource")
    public static native ABGroup create(ABRecordRef source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABGroupCopySource")
    public static native ABRecordRef source(ABRecordRef group);
    @GlobalFunction("ABGroupCopyArrayOfAllMembers")
    public static native List<ABPerson> getAllMembers(ABRecordRef group);
    @GlobalFunction("ABGroupCopyArrayOfAllMembersWithSortOrdering")
    public static native List<ABPerson> getAllMembers(ABRecordRef group, @Representing("ABPersonSortOrdering") long sortOrdering);
    @GlobalFunction("ABGroupAddMember")
    public static native boolean addMember(ABRecordRef group, ABRecordRef person, Todo error);
    @GlobalFunction("ABGroupRemoveMember")
    public static native boolean removeMember(ABRecordRef group, ABRecordRef member, Todo error);

}
