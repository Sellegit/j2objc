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
    public static native ABGroup create(ABRecord source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABGroupCopySource")
    public static native ABRecord source(ABRecord group);
    @GlobalFunction("ABGroupCopyArrayOfAllMembers")
    public static native List<ABPerson> getAllMembers(ABRecord group);
    @GlobalFunction("ABGroupCopyArrayOfAllMembersWithSortOrdering")
    public static native List<ABPerson> getAllMembers(ABRecord group, ABPersonSortOrdering sortOrdering);
    @GlobalFunction("ABGroupAddMember")
    public static native boolean addMember(ABRecord group, ABRecord person, Todo error);
    @GlobalFunction("ABGroupRemoveMember")
    public static native boolean removeMember(ABRecord group, ABRecord member, Todo error);
    
}
