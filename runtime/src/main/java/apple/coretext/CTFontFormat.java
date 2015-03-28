package apple.coretext;


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


@Library("CoreText/CoreText.h")
@Mapping("CTFontFormat")
public final class CTFontFormat extends ObjCEnum {
    
    @GlobalConstant("kCTFontFormatUnrecognized")
    public static final long Unrecognized = 0L;
    @GlobalConstant("kCTFontFormatOpenTypePostScript")
    public static final long OpenTypePostScript = 1L;
    @GlobalConstant("kCTFontFormatOpenTypeTrueType")
    public static final long OpenTypeTrueType = 2L;
    @GlobalConstant("kCTFontFormatTrueType")
    public static final long TrueType = 3L;
    @GlobalConstant("kCTFontFormatPostScript")
    public static final long PostScript = 4L;
    @GlobalConstant("kCTFontFormatBitmap")
    public static final long Bitmap = 5L;


}
