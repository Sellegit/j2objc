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

@Library("UIKit") @Mapping("NSMutableParagraphStyle")
public class NSMutableParagraphStyle 
    extends NSParagraphStyle 
     {

    
    
    public NSMutableParagraphStyle() {}
    
    
    @Mapping("lineSpacing")
    public native @MachineSizedFloat double getLineSpacing();
    @Mapping("setLineSpacing:")
    public native void setLineSpacing(@MachineSizedFloat double v);
    @Mapping("paragraphSpacing")
    public native @MachineSizedFloat double getParagraphSpacing();
    @Mapping("setParagraphSpacing:")
    public native void setParagraphSpacing(@MachineSizedFloat double v);
    @Mapping("alignment")
    public native @Representing("NSTextAlignment") @MachineSizedSInt long getAlignment();
    @Mapping("setAlignment:")
    public native void setAlignment(@Representing("NSTextAlignment") @MachineSizedSInt long v);
    @Mapping("firstLineHeadIndent")
    public native @MachineSizedFloat double getFirstLineHeadIndent();
    @Mapping("setFirstLineHeadIndent:")
    public native void setFirstLineHeadIndent(@MachineSizedFloat double v);
    @Mapping("headIndent")
    public native @MachineSizedFloat double getHeadIndent();
    @Mapping("setHeadIndent:")
    public native void setHeadIndent(@MachineSizedFloat double v);
    @Mapping("tailIndent")
    public native @MachineSizedFloat double getTailIndent();
    @Mapping("setTailIndent:")
    public native void setTailIndent(@MachineSizedFloat double v);
    @Mapping("lineBreakMode")
    public native @Representing("NSLineBreakMode") @MachineSizedSInt long getLineBreakMode();
    @Mapping("setLineBreakMode:")
    public native void setLineBreakMode(@Representing("NSLineBreakMode") @MachineSizedSInt long v);
    @Mapping("minimumLineHeight")
    public native @MachineSizedFloat double getMinimumLineHeight();
    @Mapping("setMinimumLineHeight:")
    public native void setMinimumLineHeight(@MachineSizedFloat double v);
    @Mapping("maximumLineHeight")
    public native @MachineSizedFloat double getMaximumLineHeight();
    @Mapping("setMaximumLineHeight:")
    public native void setMaximumLineHeight(@MachineSizedFloat double v);
    @Mapping("baseWritingDirection")
    public native @Representing("NSWritingDirection") @MachineSizedSInt long getBaseWritingDirection();
    @Mapping("setBaseWritingDirection:")
    public native void setBaseWritingDirection(@Representing("NSWritingDirection") @MachineSizedSInt long v);
    @Mapping("lineHeightMultiple")
    public native @MachineSizedFloat double getLineHeightMultiple();
    @Mapping("setLineHeightMultiple:")
    public native void setLineHeightMultiple(@MachineSizedFloat double v);
    @Mapping("paragraphSpacingBefore")
    public native @MachineSizedFloat double getParagraphSpacingBefore();
    @Mapping("setParagraphSpacingBefore:")
    public native void setParagraphSpacingBefore(@MachineSizedFloat double v);
    @Mapping("hyphenationFactor")
    public native float getHyphenationFactor();
    @Mapping("setHyphenationFactor:")
    public native void setHyphenationFactor(float v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tabStops")
    public native NSArray<NSTextTab> getTabStops();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTabStops:")
    public native void setTabStops(NSArray<NSTextTab> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("defaultTabInterval")
    public native @MachineSizedFloat double getDefaultTabInterval();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setDefaultTabInterval:")
    public native void setDefaultTabInterval(@MachineSizedFloat double v);
    
    
    
    
    
}
