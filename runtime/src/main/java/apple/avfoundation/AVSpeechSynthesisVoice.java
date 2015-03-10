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

@Library("AVFoundation") @Mapping("AVSpeechSynthesisVoice")
public class AVSpeechSynthesisVoice 
    extends NSObject 
     {

    
    
    public AVSpeechSynthesisVoice() {}
    
    
    @Mapping("language")
    public native String getLanguage();
    
    
    
    @Mapping("speechVoices")
    public static native NSArray<AVSpeechSynthesisVoice> getSpeechVoices();
    @Mapping("currentLanguageCode")
    public static native String getCurrentLanguageCode();
    @Mapping("voiceWithLanguage:")
    public static native AVSpeechSynthesisVoice create(String language);
    
}
