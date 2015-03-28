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
public class ABPersonInstantMessageAccount 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonInstantMessageServiceKey")
    public static native CFString ServiceKey();
    @GlobalConstant("kABPersonInstantMessageUsernameKey")
    public static native CFString UsernameKey();

}
