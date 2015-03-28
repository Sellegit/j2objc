package apple.coremedia;


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
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


@Library("CoreMedia/CoreMedia.h")
@Mapping("CMAudioCodecType")
public final class CMAudioCodecType extends ObjCEnum {
    
    @GlobalConstant("kCMAudioCodecType_AAC_LCProtected")
    public static final long AAC_LCProtected = 1885430115L;
    @GlobalConstant("kCMAudioCodecType_AAC_AudibleProtected")
    public static final long AAC_AudibleProtected = 1633771875L;


}
