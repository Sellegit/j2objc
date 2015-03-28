package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFStringBuiltInEncodings")
public final class CFStringBuiltInEncodings extends ObjCEnum {
    
    @GlobalConstant("kCFStringEncodingMacRoman")
    public static final long MacRoman = 0L;
    @GlobalConstant("kCFStringEncodingWindowsLatin1")
    public static final long WindowsLatin1 = 1280L;
    @GlobalConstant("kCFStringEncodingISOLatin1")
    public static final long ISOLatin1 = 513L;
    @GlobalConstant("kCFStringEncodingNextStepLatin")
    public static final long NextStepLatin = 2817L;
    @GlobalConstant("kCFStringEncodingASCII")
    public static final long ASCII = 1536L;
    @GlobalConstant("kCFStringEncodingUnicode")
    public static final long Unicode = 256L;
    @GlobalConstant("kCFStringEncodingUTF8")
    public static final long UTF8 = 134217984L;
    @GlobalConstant("kCFStringEncodingNonLossyASCII")
    public static final long NonLossyASCII = 3071L;
    @GlobalConstant("kCFStringEncodingUTF16")
    public static final long UTF16 = 256L;
    @GlobalConstant("kCFStringEncodingUTF16BE")
    public static final long UTF16BE = 268435712L;
    @GlobalConstant("kCFStringEncodingUTF16LE")
    public static final long UTF16LE = 335544576L;
    @GlobalConstant("kCFStringEncodingUTF32")
    public static final long UTF32 = 201326848L;
    @GlobalConstant("kCFStringEncodingUTF32BE")
    public static final long UTF32BE = 402653440L;
    @GlobalConstant("kCFStringEncodingUTF32LE")
    public static final long UTF32LE = 469762304L;


}
