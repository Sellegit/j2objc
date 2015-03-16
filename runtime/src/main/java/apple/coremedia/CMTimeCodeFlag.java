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
@Mapping("CMTimeCodeFlag")
public final class CMTimeCodeFlag extends ObjCEnum {
    
    @GlobalConstant("kCMTimeCodeFlag_DropFrame")
    public static final long DropFrame = 1L;
    @GlobalConstant("kCMTimeCodeFlag_24HourMax")
    public static final long _24HourMax = 2L;
    @GlobalConstant("kCMTimeCodeFlag_NegTimesOK")
    public static final long NegTimesOK = 4L;
    

}
