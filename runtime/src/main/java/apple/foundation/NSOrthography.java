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
 * @since Available in iOS 4.0 and later.
 */

@Library("Foundation") @Mapping("NSOrthography")
public class NSOrthography 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public NSOrthography() {}
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithDominantScript:languageMap:")
    public NSOrthography(String script, Map<String, List<String>> map) { }
    @Mapping("initWithCoder:")
    public NSOrthography(NSCoder aDecoder) { }
    
    
    @Mapping("dominantScript")
    public native String getDominantScript();
    @Mapping("languageMap")
    public native Map<String, List<String>> getLanguageMap();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("dominantLanguage")
    public native String getDominantLanguage();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("allScripts")
    public native List<String> getAllScripts();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("allLanguages")
    public native List<String> getAllLanguages();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("languagesForScript:")
    public native List<String> getLanguagesForScript(String script);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("dominantLanguageForScript:")
    public native String getDominantLanguageForScript(String script);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
