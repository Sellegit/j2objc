package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 3.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UITextChecker")
public class UITextChecker 
    extends NSObject 
     {

    
    
    public UITextChecker() {}
    
    
    
    
    
    
    @Mapping("rangeOfMisspelledWordInString:range:startingAt:wrap:language:")
    public native NSRange getRangeOfMisspelledWordInString(String stringToCheck, NSRange range, @MachineSizedSInt long startingOffset, boolean wrapFlag, String language);
    @Mapping("guessesForWordRange:inString:language:")
    public native List<String> getGuessesForWord(NSRange range, String string, String language);
    @Mapping("completionsForPartialWordRange:inString:language:")
    public native List<String> getCompletionsForPartialWord(NSRange range, String string, String language);
    @Mapping("ignoreWord:")
    public native void ignoreWord(String wordToIgnore);
    @Mapping("ignoredWords")
    public native List<String> getIgnoredWords();
    @Mapping("setIgnoredWords:")
    public native void setIgnoredWords(NSArray<?> words);
    @Mapping("learnWord:")
    public static native void learnWord(String word);
    @Mapping("hasLearnedWord:")
    public static native boolean hasLearnedWord(String word);
    @Mapping("unlearnWord:")
    public static native void unlearnWord(String word);
    @Mapping("availableLanguages")
    public static native List<String> getAvailableLanguages();
    
}
