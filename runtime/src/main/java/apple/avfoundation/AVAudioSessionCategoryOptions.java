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
 * @since Available in iOS 6.0 and later.
 */


@Mapping("AVAudioSessionCategoryOptions")
public final class AVAudioSessionCategoryOptions extends ObjCEnum {
    
    @GlobalConstant("AVAudioSessionCategoryOptionMixWithOthers")
    public static final long MixWithOthers = 1L;
    @GlobalConstant("AVAudioSessionCategoryOptionDuckOthers")
    public static final long DuckOthers = 2L;
    @GlobalConstant("AVAudioSessionCategoryOptionAllowBluetooth")
    public static final long AllowBluetooth = 4L;
    @GlobalConstant("AVAudioSessionCategoryOptionDefaultToSpeaker")
    public static final long DefaultToSpeaker = 8L;
    

}
