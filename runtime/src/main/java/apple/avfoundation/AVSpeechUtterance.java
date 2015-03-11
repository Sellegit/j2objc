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
 * @since Available in iOS 7.0 and later.
 */

@Library("AVFoundation") @Mapping("AVSpeechUtterance")
public class AVSpeechUtterance 
    extends NSObject 
    implements NSCopying {

    
    
    public AVSpeechUtterance() {}
    @Mapping("initWithString:")
    public AVSpeechUtterance(String string) { }
    
    
    @Mapping("voice")
    public native AVSpeechSynthesisVoice getVoice();
    @Mapping("setVoice:")
    public native void setVoice(AVSpeechSynthesisVoice v);
    @Mapping("speechString")
    public native String getSpeechString();
    @Mapping("rate")
    public native float getRate();
    @Mapping("setRate:")
    public native void setRate(float v);
    @Mapping("pitchMultiplier")
    public native float getPitchMultiplier();
    @Mapping("setPitchMultiplier:")
    public native void setPitchMultiplier(float v);
    @Mapping("volume")
    public native float getVolume();
    @Mapping("setVolume:")
    public native void setVolume(float v);
    @Mapping("preUtteranceDelay")
    public native double getPreUtteranceDelay();
    @Mapping("setPreUtteranceDelay:")
    public native void setPreUtteranceDelay(double v);
    @Mapping("postUtteranceDelay")
    public native double getPostUtteranceDelay();
    @Mapping("setPostUtteranceDelay:")
    public native void setPostUtteranceDelay(double v);
    
    
    
    @GlobalConstant("AVSpeechUtteranceMinimumSpeechRate")
    public static native float getMinimumSpeechRate();
    @GlobalConstant("AVSpeechUtteranceMaximumSpeechRate")
    public static native float getMaximumSpeechRate();
    @GlobalConstant("AVSpeechUtteranceDefaultSpeechRate")
    public static native float getDefaultSpeechRate();
    
    @Mapping("speechUtteranceWithString:")
    public static native AVSpeechUtterance create(String string);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
