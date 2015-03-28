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
@Mapping("ABPropertyType")
public final class ABPropertyType extends ObjCEnum {
    
    @GlobalConstant("kABInvalidPropertyType")
    public static final long Invalid = 0L;
    @GlobalConstant("kABStringPropertyType")
    public static final long String = 1L;
    @GlobalConstant("kABIntegerPropertyType")
    public static final long Integer = 2L;
    @GlobalConstant("kABRealPropertyType")
    public static final long Real = 3L;
    @GlobalConstant("kABDateTimePropertyType")
    public static final long DateTime = 4L;
    @GlobalConstant("kABDictionaryPropertyType")
    public static final long Dictionary = 5L;
    @GlobalConstant("kABMultiStringPropertyType")
    public static final long MultiString = 257L;
    @GlobalConstant("kABMultiIntegerPropertyType")
    public static final long MultiInteger = 258L;
    @GlobalConstant("kABMultiRealPropertyType")
    public static final long MultiReal = 259L;
    @GlobalConstant("kABMultiDateTimePropertyType")
    public static final long MultiDateTime = 260L;
    @GlobalConstant("kABMultiDictionaryPropertyType")
    public static final long MultiDictionary = 261L;


}
