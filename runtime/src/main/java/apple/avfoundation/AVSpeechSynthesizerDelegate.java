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





@Library("AVFoundation") @Mapping("AVSpeechSynthesizerDelegate")
public interface AVSpeechSynthesizerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("speechSynthesizer:didStartSpeechUtterance:")
    void didStartSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance);
    @Mapping("speechSynthesizer:didFinishSpeechUtterance:")
    void didFinishSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance);
    @Mapping("speechSynthesizer:didPauseSpeechUtterance:")
    void didPauseSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance);
    @Mapping("speechSynthesizer:didContinueSpeechUtterance:")
    void didContinueSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance);
    @Mapping("speechSynthesizer:didCancelSpeechUtterance:")
    void didCancelSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance);
    @Mapping("speechSynthesizer:willSpeakRangeOfSpeechString:utterance:")
    void willSpeak(AVSpeechSynthesizer synthesizer, NSRange characterRange, AVSpeechUtterance utterance);
    
    /*<adapter>*/
    /*</adapter>*/
}
