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
@Mapping("CGImageMetadataErrors")
public final class CGImageMetadataErrors extends ObjCEnum {
    
    @GlobalConstant("kCGImageMetadataErrorUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("kCGImageMetadataErrorUnsupportedFormat")
    public static final long UnsupportedFormat = 1L;
    @GlobalConstant("kCGImageMetadataErrorBadArgument")
    public static final long BadArgument = 2L;
    @GlobalConstant("kCGImageMetadataErrorConflictingArguments")
    public static final long ConflictingArguments = 3L;
    @GlobalConstant("kCGImageMetadataErrorPrefixConflict")
    public static final long PrefixConflict = 4L;


}
