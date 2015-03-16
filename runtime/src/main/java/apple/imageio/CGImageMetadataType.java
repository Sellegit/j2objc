package apple.imageio;


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





@Library("ImageIO/ImageIO.h")
@Mapping("CGImageMetadataType")
public final class CGImageMetadataType extends ObjCEnum {
    
    @GlobalConstant("kCGImageMetadataTypeInvalid")
    public static final long Invalid = -1L;
    @GlobalConstant("kCGImageMetadataTypeDefault")
    public static final long Default = 0L;
    @GlobalConstant("kCGImageMetadataTypeString")
    public static final long String = 1L;
    @GlobalConstant("kCGImageMetadataTypeArrayUnordered")
    public static final long ArrayUnordered = 2L;
    @GlobalConstant("kCGImageMetadataTypeArrayOrdered")
    public static final long ArrayOrdered = 3L;
    @GlobalConstant("kCGImageMetadataTypeAlternateArray")
    public static final long AlternateArray = 4L;
    @GlobalConstant("kCGImageMetadataTypeAlternateText")
    public static final long AlternateText = 5L;
    @GlobalConstant("kCGImageMetadataTypeStructure")
    public static final long Structure = 6L;
    

}
