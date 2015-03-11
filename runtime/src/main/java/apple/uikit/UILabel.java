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
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit") @Mapping("UILabel")
public class UILabel 
    extends UIView 
    implements NSCoding {

    
    
    public UILabel() {}
    @Mapping("initWithFrame:")
    public UILabel(CGRect frame) { }
    
    
    @Mapping("text")
    public native String getText();
    @Mapping("setText:")
    public native void setText(String v);
    @Mapping("font")
    public native UIFont getFont();
    @Mapping("setFont:")
    public native void setFont(UIFont v);
    @Mapping("textColor")
    public native UIColor getTextColor();
    @Mapping("setTextColor:")
    public native void setTextColor(UIColor v);
    @Mapping("shadowColor")
    public native UIColor getShadowColor();
    @Mapping("setShadowColor:")
    public native void setShadowColor(UIColor v);
    @Mapping("shadowOffset")
    public native CGSize getShadowOffset();
    @Mapping("setShadowOffset:")
    public native void setShadowOffset(CGSize v);
    @Mapping("textAlignment")
    public native @Representing("NSTextAlignment") @MachineSizedSInt long getTextAlignment();
    @Mapping("setTextAlignment:")
    public native void setTextAlignment(@Representing("NSTextAlignment") @MachineSizedSInt long v);
    @Mapping("lineBreakMode")
    public native @Representing("NSLineBreakMode") @MachineSizedSInt long getLineBreakMode();
    @Mapping("setLineBreakMode:")
    public native void setLineBreakMode(@Representing("NSLineBreakMode") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Mapping("highlightedTextColor")
    public native UIColor getHighlightedTextColor();
    @Mapping("setHighlightedTextColor:")
    public native void setHighlightedTextColor(UIColor v);
    @Mapping("isHighlighted")
    public native boolean isHighlighted();
    @Mapping("setHighlighted:")
    public native void setHighlighted(boolean v);
    @Mapping("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Mapping("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("numberOfLines")
    public native @MachineSizedSInt long getNumberOfLines();
    @Mapping("setNumberOfLines:")
    public native void setNumberOfLines(@MachineSizedSInt long v);
    @Mapping("adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();
    @Mapping("setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("adjustsLetterSpacingToFitWidth")
    public native boolean adjustsLetterSpacingToFitWidth();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setAdjustsLetterSpacingToFitWidth:")
    public native void setAdjustsLetterSpacingToFitWidth(boolean v);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("minimumFontSize")
    public native @MachineSizedFloat double getMinimumFontSize();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setMinimumFontSize:")
    public native void setMinimumFontSize(@MachineSizedFloat double v);
    @Mapping("baselineAdjustment")
    public native @Representing("UIBaselineAdjustment") @MachineSizedSInt long getBaselineAdjustment();
    @Mapping("setBaselineAdjustment:")
    public native void setBaselineAdjustment(@Representing("UIBaselineAdjustment") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("minimumScaleFactor")
    public native @MachineSizedFloat double getMinimumScaleFactor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("preferredMaxLayoutWidth")
    public native @MachineSizedFloat double getPreferredMaxLayoutWidth();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(@MachineSizedFloat double v);
    
    
    
    @Mapping("textRectForBounds:limitedToNumberOfLines:")
    public native CGRect getTextRect(CGRect bounds, @MachineSizedSInt long numberOfLines);
    @Mapping("drawTextInRect:")
    public native void drawText(CGRect rect);
    
}
