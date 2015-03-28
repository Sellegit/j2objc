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
@Mapping("AVPlayerItemStatus")
public final class AVPlayerItemStatus extends ObjCEnum {
    
    @GlobalConstant("AVPlayerItemStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("AVPlayerItemStatusReadyToPlay")
    public static final long ReadyToPlay = 1L;
    @GlobalConstant("AVPlayerItemStatusFailed")
    public static final long Failed = 2L;


}
