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
@Mapping("CMClosedCaptionFormatType")
public final class CMClosedCaptionFormatType extends ObjCEnum {
    
    @GlobalConstant("kCMClosedCaptionFormatType_CEA608")
    public static final long _CEA608 = 1664495672L;
    @GlobalConstant("kCMClosedCaptionFormatType_CEA708")
    public static final long _CEA708 = 1664561208L;
    @GlobalConstant("kCMClosedCaptionFormatType_ATSC")
    public static final long _ATSC = 1635017571L;


}
