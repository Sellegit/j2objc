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
public class ABPersonKind 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonKindPerson")
    protected static native CFNumber PersonValue();
    @GlobalConstant("kABPersonKindOrganization")
    protected static native CFNumber OrganizationValue();
    
}
