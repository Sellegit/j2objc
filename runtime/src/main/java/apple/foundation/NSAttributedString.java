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
 * @since Available in iOS 3.2 and later.
 */

@Library("Foundation") @Mapping("NSAttributedString")
public class NSAttributedString 
    extends NSObject 
    implements NSCopying {

    
    
    public NSAttributedString() {}
    @Mapping("initWithString:")
    public NSAttributedString(String str) { }
    @Mapping("initWithString:attributes:")
    public NSAttributedString(String str, NSDictionary<?, ?> attrs) { }
    @Mapping("initWithAttributedString:")
    public NSAttributedString(NSAttributedString attrStr) { }
    
    
    @Mapping("string")
    public native String getString();
    @Mapping("length")
    public native @MachineSizedUInt long length();
    
    
    
    @Mapping("attributesAtIndex:effectiveRange:")
    public native NSDictionary<NSString, NSObject> getAttributesDictionary(@MachineSizedUInt long location, NSRange range);
    @Mapping("attribute:atIndex:effectiveRange:")
    public native Object getAttribute(String attrName, @MachineSizedUInt long location, NSRange range);
    @Mapping("attributedSubstringFromRange:")
    public native NSAttributedString substring(NSRange range);
    @Mapping("attributesAtIndex:longestEffectiveRange:inRange:")
    public native NSDictionary<NSString, NSObject> getAttributesDictionary(@MachineSizedUInt long location, NSRange range, NSRange rangeLimit);
    @Mapping("attribute:atIndex:longestEffectiveRange:inRange:")
    public native Object getAttribute(String attrName, @MachineSizedUInt long location, NSRange range, NSRange rangeLimit);
    @Mapping("isEqualToAttributedString:")
    public native boolean equalsTo(NSAttributedString other);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
