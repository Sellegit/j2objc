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
@Mapping("ABPersonImageFormat")
public final class ABPersonImageFormat extends ObjCEnum {
    
    @GlobalConstant("kABPersonImageFormatThumbnail")
    public static final long Thumbnail = 0L;
    @GlobalConstant("kABPersonImageFormatOriginalSize")
    public static final long OriginalSize = 2L;
    

}
