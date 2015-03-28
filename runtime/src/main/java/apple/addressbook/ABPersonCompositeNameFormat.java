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
@Mapping("ABPersonCompositeNameFormat")
public final class ABPersonCompositeNameFormat extends ObjCEnum {
    
    @GlobalConstant("kABPersonCompositeNameFormatFirstNameFirst")
    public static final long FirstNameFirst = 0L;
    @GlobalConstant("kABPersonCompositeNameFormatLastNameFirst")
    public static final long LastNameFirst = 1L;


}
