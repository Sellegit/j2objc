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

@Library("AVFoundation")
@Mapping("AVAudioCommonFormat")
public final class AVAudioCommonFormat extends ObjCEnum {
    
    @GlobalConstant("AVAudioOtherFormat")
    public static final long Other = 0L;
    @GlobalConstant("AVAudioPCMFormatFloat32")
    public static final long PCMFormatFloat32 = 1L;
    @GlobalConstant("AVAudioPCMFormatFloat64")
    public static final long PCMFormatFloat64 = 2L;
    @GlobalConstant("AVAudioPCMFormatInt16")
    public static final long PCMFormatInt16 = 3L;
    @GlobalConstant("AVAudioPCMFormatInt32")
    public static final long PCMFormatInt32 = 4L;
    

}
