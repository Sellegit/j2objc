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
@Mapping("CMMediaType")
public final class CMMediaType extends ObjCEnum {
    
    @GlobalConstant("kCMMediaType_Video")
    public static final long Video = 1986618469L;
    @GlobalConstant("kCMMediaType_Audio")
    public static final long Audio = 1936684398L;
    @GlobalConstant("kCMMediaType_Muxed")
    public static final long Muxed = 1836415096L;
    @GlobalConstant("kCMMediaType_Text")
    public static final long Text = 1952807028L;
    @GlobalConstant("kCMMediaType_ClosedCaption")
    public static final long ClosedCaption = 1668047728L;
    @GlobalConstant("kCMMediaType_Subtitle")
    public static final long Subtitle = 1935832172L;
    @GlobalConstant("kCMMediaType_TimeCode")
    public static final long TimeCode = 1953325924L;
    @GlobalConstant("kCMMediaType_Metadata")
    public static final long Metadata = 1835365473L;
    

}
