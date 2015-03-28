package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h")
@Mapping("NSByteCountFormatterUnits")
public final class NSByteCountFormatterUnits extends ObjCEnum {
    
    @GlobalConstant("NSByteCountFormatterUseDefault")
    public static final long Default = 0L;
    @GlobalConstant("NSByteCountFormatterUseBytes")
    public static final long Bytes = 1L;
    @GlobalConstant("NSByteCountFormatterUseKB")
    public static final long KB = 2L;
    @GlobalConstant("NSByteCountFormatterUseMB")
    public static final long MB = 4L;
    @GlobalConstant("NSByteCountFormatterUseGB")
    public static final long GB = 8L;
    @GlobalConstant("NSByteCountFormatterUseTB")
    public static final long TB = 16L;
    @GlobalConstant("NSByteCountFormatterUsePB")
    public static final long PB = 32L;
    @GlobalConstant("NSByteCountFormatterUseEB")
    public static final long EB = 64L;
    @GlobalConstant("NSByteCountFormatterUseZB")
    public static final long ZB = 128L;
    @GlobalConstant("NSByteCountFormatterUseYBOrHigher")
    public static final long YBOrHigher = 65280L;
    @GlobalConstant("NSByteCountFormatterUseAll")
    public static final long All = 65535L;


}
