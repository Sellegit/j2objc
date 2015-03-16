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





@Library("AddressBook/AddressBook.h")
@Mapping("ABAddressBookErrorCode")
public final class ABAddressBookErrorCode extends ObjCEnum {
    
    @GlobalConstant("kABOperationNotPermittedByStoreError")
    public static final long Store = 0L;
    @GlobalConstant("kABOperationNotPermittedByUserError")
    public static final long User = 1L;
    

}
