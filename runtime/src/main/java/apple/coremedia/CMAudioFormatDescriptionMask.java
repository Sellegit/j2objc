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





@Library("CoreMedia")
@Mapping("CMAudioFormatDescriptionMask")
public final class CMAudioFormatDescriptionMask extends ObjCEnum {
    
    @GlobalConstant("kCMAudioFormatDescriptionMask_StreamBasicDescription")
    public static final long StreamBasicDescription = 1L;
    @GlobalConstant("kCMAudioFormatDescriptionMask_MagicCookie")
    public static final long MagicCookie = 2L;
    @GlobalConstant("kCMAudioFormatDescriptionMask_ChannelLayout")
    public static final long ChannelLayout = 4L;
    @GlobalConstant("kCMAudioFormatDescriptionMask_Extensions")
    public static final long Extensions = 8L;
    @GlobalConstant("kCMAudioFormatDescriptionMask_All")
    public static final long All = 15L;
    

}
