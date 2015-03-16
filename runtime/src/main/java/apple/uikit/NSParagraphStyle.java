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
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("NSParagraphStyle")
public class NSParagraphStyle 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public NSParagraphStyle() {}
    
    
    @Mapping("lineSpacing")
    public native @MachineSizedFloat double getLineSpacing();
    @Mapping("paragraphSpacing")
    public native @MachineSizedFloat double getParagraphSpacing();
    @Mapping("alignment")
    public native @Representing("NSTextAlignment") @MachineSizedSInt long getAlignment();
    @Mapping("headIndent")
    public native @MachineSizedFloat double getHeadIndent();
    @Mapping("tailIndent")
    public native @MachineSizedFloat double getTailIndent();
    @Mapping("firstLineHeadIndent")
    public native @MachineSizedFloat double getFirstLineHeadIndent();
    @Mapping("minimumLineHeight")
    public native @MachineSizedFloat double getMinimumLineHeight();
    @Mapping("maximumLineHeight")
    public native @MachineSizedFloat double getMaximumLineHeight();
    @Mapping("lineBreakMode")
    public native @Representing("NSLineBreakMode") @MachineSizedSInt long getLineBreakMode();
    @Mapping("baseWritingDirection")
    public native @Representing("NSWritingDirection") @MachineSizedSInt long getBaseWritingDirection();
    @Mapping("lineHeightMultiple")
    public native @MachineSizedFloat double getLineHeightMultiple();
    @Mapping("paragraphSpacingBefore")
    public native @MachineSizedFloat double getParagraphSpacingBefore();
    @Mapping("hyphenationFactor")
    public native float getHyphenationFactor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tabStops")
    public native NSArray<NSTextTab> getTabStops();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("defaultTabInterval")
    public native @MachineSizedFloat double getDefaultTabInterval();
    
    
    
    @Mapping("defaultParagraphStyle")
    public static native NSParagraphStyle getDefaultParagraphStyle();
    @Mapping("defaultWritingDirectionForLanguage:")
    public static native @Representing("NSWritingDirection") @MachineSizedSInt long getDefaultWritingDirection(String languageName);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
