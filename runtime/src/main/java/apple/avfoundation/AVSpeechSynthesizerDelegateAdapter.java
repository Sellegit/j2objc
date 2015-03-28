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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class AVSpeechSynthesizerDelegateAdapter 
    extends Object 
    implements AVSpeechSynthesizerDelegate {

    
    
    


    
    
    @NotImplemented("speechSynthesizer:didStartSpeechUtterance:")
    public void didStartSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance) { throw new UnsupportedOperationException(); }
    @NotImplemented("speechSynthesizer:didFinishSpeechUtterance:")
    public void didFinishSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance) { throw new UnsupportedOperationException(); }
    @NotImplemented("speechSynthesizer:didPauseSpeechUtterance:")
    public void didPauseSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance) { throw new UnsupportedOperationException(); }
    @NotImplemented("speechSynthesizer:didContinueSpeechUtterance:")
    public void didContinueSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance) { throw new UnsupportedOperationException(); }
    @NotImplemented("speechSynthesizer:didCancelSpeechUtterance:")
    public void didCancelSpeechUtterance(AVSpeechSynthesizer synthesizer, AVSpeechUtterance utterance) { throw new UnsupportedOperationException(); }
    @NotImplemented("speechSynthesizer:willSpeakRangeOfSpeechString:utterance:")
    public void willSpeak(AVSpeechSynthesizer synthesizer, NSRange characterRange, AVSpeechUtterance utterance) { throw new UnsupportedOperationException(); }

}
