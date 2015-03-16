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
@Mapping("AVPlayerActionAtItemEnd")
public final class AVPlayerActionAtItemEnd extends ObjCEnum {
    
    @GlobalConstant("AVPlayerActionAtItemEndAdvance")
    public static final long Advance = 0L;
    @GlobalConstant("AVPlayerActionAtItemEndPause")
    public static final long Pause = 1L;
    @GlobalConstant("AVPlayerActionAtItemEndNone")
    public static final long None = 2L;
    

}
