package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;


@Library("AVFoundation/AVFoundation.h")
@Mapping("AVKeyValueStatus")
public final class AVKeyValueStatus extends ObjCEnum {
    
    @GlobalConstant("AVKeyValueStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("AVKeyValueStatusLoading")
    public static final long Loading = 1L;
    @GlobalConstant("AVKeyValueStatusLoaded")
    public static final long Loaded = 2L;
    @GlobalConstant("AVKeyValueStatusFailed")
    public static final long Failed = 3L;
    @GlobalConstant("AVKeyValueStatusCancelled")
    public static final long Cancelled = 4L;


}
