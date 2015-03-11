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
    public native ABRecord source();
    @GlobalFunction("ABGroupCopyArrayOfAllMembers")
    public native List<ABPerson> getAllMembers();
    @GlobalFunction("ABGroupCopyArrayOfAllMembersWithSortOrdering")
    public native List<ABPerson> getAllMembers(ABPersonSortOrdering sortOrdering);
    @GlobalFunction("ABGroupAddMember")
    protected native boolean addMember(ABPerson person, Todo error);
    @GlobalFunction("ABGroupRemoveMember")
    protected native boolean removeMember(ABPerson member, Todo error);
    
}
