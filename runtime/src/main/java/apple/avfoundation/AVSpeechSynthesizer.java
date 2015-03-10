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

@Library("AVFoundation") @Mapping("AVSpeechSynthesizer")
public class AVSpeechSynthesizer 
    extends NSObject 
     {

    
    
    public AVSpeechSynthesizer() {}
    
    
    @Mapping("delegate")
    public native AVSpeechSynthesizerDelegate getDelegate();
    public native void setDelegate(AVSpeechSynthesizerDelegate v);
    @Mapping("isSpeaking")
    public native boolean isSpeaking();
    @Mapping("isPaused")
    public native boolean isPaused();
    
    
    
    @Mapping("speakUtterance:")
    public native void enqueueSpeakUtterance(AVSpeechUtterance utterance);
    @Mapping("stopSpeakingAtBoundary:")
    public native boolean stopSpeaking(@Representing("AVSpeechBoundary") @MachineSizedSInt long boundary);
    @Mapping("pauseSpeakingAtBoundary:")
    public native boolean pauseSpeaking(@Representing("AVSpeechBoundary") @MachineSizedSInt long boundary);
    @Mapping("continueSpeaking")
    public native boolean continueSpeaking();
    
}
