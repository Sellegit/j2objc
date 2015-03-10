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



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("AVAudioPlayerNodeBufferOptions")
public final class AVAudioPlayerNodeBufferOptions extends ObjCEnum {
    
    @GlobalConstant("AVAudioPlayerNodeBufferLoops")
    public static final long Loops = 1L;
    @GlobalConstant("AVAudioPlayerNodeBufferInterrupts")
    public static final long Interrupts = 2L;
    @GlobalConstant("AVAudioPlayerNodeBufferInterruptsAtLoop")
    public static final long InterruptsAtLoop = 4L;
    

}
