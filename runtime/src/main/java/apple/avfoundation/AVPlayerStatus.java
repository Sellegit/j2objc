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





@Library("AVFoundation")
@Mapping("AVPlayerStatus")
public final class AVPlayerStatus extends ObjCEnum {
    
    @GlobalConstant("AVPlayerStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("AVPlayerStatusReadyToPlay")
    public static final long ReadyToPlay = 1L;
    @GlobalConstant("AVPlayerStatusFailed")
    public static final long Failed = 2L;
    

}
