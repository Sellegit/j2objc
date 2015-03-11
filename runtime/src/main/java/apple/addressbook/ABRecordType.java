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
@Mapping("ABRecordType")
public final class ABRecordType extends ObjCEnum {
    
    @GlobalConstant("kABPersonType")
    public static final long Person = 0L;
    @GlobalConstant("kABGroupType")
    public static final long Group = 1L;
    @GlobalConstant("kABSourceType")
    public static final long Source = 2L;
    

}
