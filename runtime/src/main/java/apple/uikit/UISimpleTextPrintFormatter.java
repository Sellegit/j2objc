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
 * @since Available in iOS 4.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UISimpleTextPrintFormatter")
public class UISimpleTextPrintFormatter 
    extends UIPrintFormatter 
     {

    
    
    public UISimpleTextPrintFormatter() {}
    @Mapping("initWithText:")
    public UISimpleTextPrintFormatter(String text) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithAttributedText:")
    public UISimpleTextPrintFormatter(NSAttributedString attributedText) { }
    
    
    @Mapping("text")
    public native String getText();
    @Mapping("setText:")
    public native void setText(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Mapping("font")
    public native UIFont getFont();
    @Mapping("setFont:")
    public native void setFont(UIFont v);
    @Mapping("color")
    public native UIColor getColor();
    @Mapping("setColor:")
    public native void setColor(UIColor v);
    @Mapping("textAlignment")
    public native @Representing("NSTextAlignment") @MachineSizedSInt long getTextAlignment();
    @Mapping("setTextAlignment:")
    public native void setTextAlignment(@Representing("NSTextAlignment") @MachineSizedSInt long v);
    
    
    
    
    
}
