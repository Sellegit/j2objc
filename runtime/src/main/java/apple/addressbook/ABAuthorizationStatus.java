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
@Mapping("ABAuthorizationStatus")
public final class ABAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("kABAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("kABAuthorizationStatusRestricted")
    public static final long Restricted = 1L;
    @GlobalConstant("kABAuthorizationStatusDenied")
    public static final long Denied = 2L;
    @GlobalConstant("kABAuthorizationStatusAuthorized")
    public static final long Authorized = 3L;
    

}
