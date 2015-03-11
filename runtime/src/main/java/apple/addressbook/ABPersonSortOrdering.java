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





@Library("AddressBook")
@Mapping("ABPersonSortOrdering")
public final class ABPersonSortOrdering extends ObjCEnum {
    
    @GlobalConstant("kABPersonSortByFirstName")
    public static final long FirstName = 0L;
    @GlobalConstant("kABPersonSortByLastName")
    public static final long LastName = 1L;
    

}
