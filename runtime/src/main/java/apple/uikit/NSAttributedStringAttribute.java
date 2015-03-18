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


/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public class NSAttributedStringAttribute 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UITextAttributeFont")
    public static native NSString TextFontAttribute();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UITextAttributeTextColor")
    public static native NSString TextColorAttribute();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UITextAttributeTextShadowColor")
    public static native NSString TextShadowColorAttribute();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UITextAttributeTextShadowOffset")
    public static native NSString TextShadowOffsetAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeechAttributePunctuation")
    public static native NSString SpeechPunctuationAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeechAttributeLanguage")
    public static native NSString SpeechLanguageAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeechAttributePitch")
    public static native NSString SpeechPitchAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSFontAttributeName")
    public static native NSString FontAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSParagraphStyleAttributeName")
    public static native NSString ParagraphStyleAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSForegroundColorAttributeName")
    public static native NSString ForegroundColorAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSBackgroundColorAttributeName")
    public static native NSString BackgroundColorAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSLigatureAttributeName")
    public static native NSString LigatureAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSKernAttributeName")
    public static native NSString KernAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSStrikethroughStyleAttributeName")
    public static native NSString StrikethroughStyleAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSUnderlineStyleAttributeName")
    public static native NSString UnderlineStyleAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSStrokeColorAttributeName")
    public static native NSString StrokeColorAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSStrokeWidthAttributeName")
    public static native NSString StrokeWidthAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSShadowAttributeName")
    public static native NSString ShadowAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSTextEffectAttributeName")
    public static native NSString TextEffectAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSAttachmentAttributeName")
    public static native NSString AttachmentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSLinkAttributeName")
    public static native NSString LinkAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSBaselineOffsetAttributeName")
    public static native NSString BaselineOffsetAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSUnderlineColorAttributeName")
    public static native NSString UnderlineColorAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSStrikethroughColorAttributeName")
    public static native NSString StrikethroughColorAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSObliquenessAttributeName")
    public static native NSString ObliquenessAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSExpansionAttributeName")
    public static native NSString ExpansionAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSWritingDirectionAttributeName")
    public static native NSString WritingDirectionAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSVerticalGlyphFormAttributeName")
    public static native NSString VerticalGlyphFormAttribute();
    
}
