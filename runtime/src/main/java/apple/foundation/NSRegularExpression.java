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

@Library("Foundation/Foundation.h") @Mapping("NSRegularExpression")
public class NSRegularExpression 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    @Mapping("initWithPattern:options:error:")
    public NSRegularExpression(String pattern, @Representing("NSRegularExpressionOptions") long options, Todo error) { }
    @Mapping("init")
    public NSRegularExpression() { }
    
    
    @Mapping("pattern")
    public native String getPattern();
    @Mapping("options")
    public native @Representing("NSRegularExpressionOptions") long getOptions();
    @Mapping("numberOfCaptureGroups")
    public native @MachineSizedUInt long getNumberOfCaptureGroups();
    
    
    
    @Mapping("escapedPatternForString:")
    public static native String getEscapedPattern(String string);
    @Mapping("enumerateMatchesInString:options:range:usingBlock:")
    public native void enumerateMatches(String string, @Representing("NSMatchingOptions") long options, NSRange range, @Block VoidBlock3<NSTextCheckingResult, NSMatchingFlags, Todo> block);
    @Mapping("matchesInString:options:range:")
    public native NSArray<NSTextCheckingResult> getMatches(String string, @Representing("NSMatchingOptions") long options, NSRange range);
    @Mapping("numberOfMatchesInString:options:range:")
    public native @MachineSizedUInt long getNumberOfMatches(String string, @Representing("NSMatchingOptions") long options, NSRange range);
    @Mapping("firstMatchInString:options:range:")
    public native NSTextCheckingResult getFirstMatch(String string, @Representing("NSMatchingOptions") long options, NSRange range);
    @Mapping("rangeOfFirstMatchInString:options:range:")
    public native NSRange getRangeOfFirstMatch(String string, @Representing("NSMatchingOptions") long options, NSRange range);
    @Mapping("stringByReplacingMatchesInString:options:range:withTemplate:")
    public native String newStringByReplacingMatches(String string, @Representing("NSMatchingOptions") long options, NSRange range, String templ);
    @Mapping("replaceMatchesInString:options:range:withTemplate:")
    public native @MachineSizedUInt long replaceMatches(NSMutableString string, @Representing("NSMatchingOptions") long options, NSRange range, String templ);
    @Mapping("replacementStringForResult:inString:offset:template:")
    public native String getReplacementString(NSTextCheckingResult result, String string, @MachineSizedSInt long offset, String templ);
    @Mapping("escapedTemplateForString:")
    public static native String getEscapedTemplate(String string);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
