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
@Library("AVFoundation/AVFoundation.h")
@Mapping("AVAudio3DMixingRenderingAlgorithm")
public final class AVAudio3DMixingRenderingAlgorithm extends ObjCEnum {
    
    @GlobalConstant("AVAudio3DMixingRenderingAlgorithmEqualPowerPanning")
    public static final long EqualPowerPanning = 0L;
    @GlobalConstant("AVAudio3DMixingRenderingAlgorithmSphericalHead")
    public static final long SphericalHead = 1L;
    @GlobalConstant("AVAudio3DMixingRenderingAlgorithmHRTF")
    public static final long HRTF = 2L;
    @GlobalConstant("AVAudio3DMixingRenderingAlgorithmSoundField")
    public static final long SoundField = 3L;
    @GlobalConstant("AVAudio3DMixingRenderingAlgorithmStereoPassThrough")
    public static final long StereoPassThrough = 5L;


}
