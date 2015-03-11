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


@Mapping("AVAudioEnvironmentDistanceAttenuationModel")
public final class AVAudioEnvironmentDistanceAttenuationModel extends ObjCEnum {
    
    @GlobalConstant("AVAudioEnvironmentDistanceAttenuationModelExponential")
    public static final long Exponential = 1L;
    @GlobalConstant("AVAudioEnvironmentDistanceAttenuationModelInverse")
    public static final long Inverse = 2L;
    @GlobalConstant("AVAudioEnvironmentDistanceAttenuationModelLinear")
    public static final long Linear = 3L;
    

}
