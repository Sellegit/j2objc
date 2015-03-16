package apple.coregraphics;


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
import apple.uikit.*;





@Library("CoreGraphics/CoreGraphics.h")
@Mapping("CGPDFObjectType")
public final class CGPDFObjectType extends ObjCEnum {
    
    @GlobalConstant("kCGPDFObjectTypeNull")
    public static final long Null = 1L;
    @GlobalConstant("kCGPDFObjectTypeBoolean")
    public static final long Boolean = 2L;
    @GlobalConstant("kCGPDFObjectTypeInteger")
    public static final long Integer = 3L;
    @GlobalConstant("kCGPDFObjectTypeReal")
    public static final long Real = 4L;
    @GlobalConstant("kCGPDFObjectTypeName")
    public static final long Name = 5L;
    @GlobalConstant("kCGPDFObjectTypeString")
    public static final long String = 6L;
    @GlobalConstant("kCGPDFObjectTypeArray")
    public static final long Array = 7L;
    @GlobalConstant("kCGPDFObjectTypeDictionary")
    public static final long Dictionary = 8L;
    @GlobalConstant("kCGPDFObjectTypeStream")
    public static final long Stream = 9L;
    

}
