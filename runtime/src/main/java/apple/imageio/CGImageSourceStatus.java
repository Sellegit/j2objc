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
@Mapping("CGImageSourceStatus")
public final class CGImageSourceStatus extends ObjCEnum {
    
    @GlobalConstant("kCGImageStatusUnexpectedEOF")
    public static final long UnexpectedEOF = -5L;
    @GlobalConstant("kCGImageStatusInvalidData")
    public static final long InvalidData = -4L;
    @GlobalConstant("kCGImageStatusUnknownType")
    public static final long UnknownType = -3L;
    @GlobalConstant("kCGImageStatusReadingHeader")
    public static final long ReadingHeader = -2L;
    @GlobalConstant("kCGImageStatusIncomplete")
    public static final long Incomplete = -1L;
    @GlobalConstant("kCGImageStatusComplete")
    public static final long Complete = 0L;
    

}
