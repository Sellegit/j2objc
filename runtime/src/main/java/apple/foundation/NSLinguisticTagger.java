package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSLinguisticTagger")
public class NSLinguisticTagger 
    extends NSObject 
     {

    
    
    public NSLinguisticTagger() {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithTagSchemes:options:")
    public NSLinguisticTagger(NSArray<?> tagSchemes, @MachineSizedUInt long opts) { }
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tagSchemes")
    public native List<NSLinguisticTagScheme> getTagSchemes();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("string")
    public native String getString();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setString:")
    public native void setString(String v);
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setOrthography:range:")
    public native void setOrthography(NSOrthography orthography, NSRange range);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("orthographyAtIndex:effectiveRange:")
    public native NSOrthography getOrthography(@MachineSizedUInt long charIndex, NSRange effectiveRange);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("stringEditedInRange:changeInLength:")
    public native void stringEditedInRange(NSRange newRange, @MachineSizedSInt long delta);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("enumerateTagsInRange:scheme:options:usingBlock:")
    public native void enumerateTagsInRange(NSRange range, String tagScheme, @Representing("NSLinguisticTaggerOptions") @MachineSizedUInt long opts, Todo block);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("sentenceRangeForRange:")
    public native NSRange getSentenceRange(NSRange range);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tagAtIndex:scheme:tokenRange:sentenceRange:")
    public native String getTag(@MachineSizedUInt long charIndex, String tagScheme, NSRange tokenRange, NSRange sentenceRange);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("availableTagSchemesForLanguage:")
    public static native List<NSLinguisticTagScheme> getAvailableTagSchemes(String language);
    
}
