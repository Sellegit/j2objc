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
@Mapping("NSStringEncoding")
public final class NSStringEncoding extends ObjCEnum {
    
    @GlobalConstant("NSASCIIStringEncoding")
    public static final long ASCII = 1L;
    @GlobalConstant("NSNEXTSTEPStringEncoding")
    public static final long NEXTSTEP = 2L;
    @GlobalConstant("NSJapaneseEUCStringEncoding")
    public static final long JapaneseEUC = 3L;
    @GlobalConstant("NSUTF8StringEncoding")
    public static final long UTF8 = 4L;
    @GlobalConstant("NSISOLatin1StringEncoding")
    public static final long ISOLatin1 = 5L;
    @GlobalConstant("NSSymbolStringEncoding")
    public static final long Symbol = 6L;
    @GlobalConstant("NSNonLossyASCIIStringEncoding")
    public static final long NonLossyASCII = 7L;
    @GlobalConstant("NSShiftJISStringEncoding")
    public static final long ShiftJIS = 8L;
    @GlobalConstant("NSISOLatin2StringEncoding")
    public static final long ISOLatin2 = 9L;
    @GlobalConstant("NSUnicodeStringEncoding")
    public static final long Unicode = 10L;
    @GlobalConstant("NSWindowsCP1251StringEncoding")
    public static final long WindowsCP1251 = 11L;
    @GlobalConstant("NSWindowsCP1252StringEncoding")
    public static final long WindowsCP1252 = 12L;
    @GlobalConstant("NSWindowsCP1253StringEncoding")
    public static final long WindowsCP1253 = 13L;
    @GlobalConstant("NSWindowsCP1254StringEncoding")
    public static final long WindowsCP1254 = 14L;
    @GlobalConstant("NSWindowsCP1250StringEncoding")
    public static final long WindowsCP1250 = 15L;
    @GlobalConstant("NSISO2022JPStringEncoding")
    public static final long ISO2022JP = 21L;
    @GlobalConstant("NSMacOSRomanStringEncoding")
    public static final long MacOSRoman = 30L;
    @GlobalConstant("NSUTF16StringEncoding")
    public static final long UTF16 = 10L;
    @GlobalConstant("NSUTF16BigEndianStringEncoding")
    public static final long UTF16BigEndian = -1879047936L;
    @GlobalConstant("NSUTF16LittleEndianStringEncoding")
    public static final long UTF16LittleEndian = -1811939072L;
    @GlobalConstant("NSUTF32StringEncoding")
    public static final long UTF32 = -1946156800L;
    @GlobalConstant("NSUTF32BigEndianStringEncoding")
    public static final long UTF32BigEndian = -1744830208L;
    @GlobalConstant("NSUTF32LittleEndianStringEncoding")
    public static final long UTF32LittleEndian = -1677721344L;
    @GlobalConstant("NSProprietaryStringEncoding")
    public static final long Proprietary = 65536L;
    

}
