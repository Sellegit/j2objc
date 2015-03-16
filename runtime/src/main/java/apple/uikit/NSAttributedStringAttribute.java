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
    protected static native NSString TextFontAttribute();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UITextAttributeTextColor")
    protected static native NSString TextColorAttribute();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UITextAttributeTextShadowColor")
    protected static native NSString TextShadowColorAttribute();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("UITextAttributeTextShadowOffset")
    protected static native NSString TextShadowOffsetAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeechAttributePunctuation")
    protected static native NSString SpeechPunctuationAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeechAttributeLanguage")
    protected static native NSString SpeechLanguageAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeechAttributePitch")
    protected static native NSString SpeechPitchAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSFontAttributeName")
    protected static native NSString FontAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSParagraphStyleAttributeName")
    protected static native NSString ParagraphStyleAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSForegroundColorAttributeName")
    protected static native NSString ForegroundColorAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSBackgroundColorAttributeName")
    protected static native NSString BackgroundColorAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSLigatureAttributeName")
    protected static native NSString LigatureAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSKernAttributeName")
    protected static native NSString KernAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSStrikethroughStyleAttributeName")
    protected static native NSString StrikethroughStyleAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSUnderlineStyleAttributeName")
    protected static native NSString UnderlineStyleAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSStrokeColorAttributeName")
    protected static native NSString StrokeColorAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSStrokeWidthAttributeName")
    protected static native NSString StrokeWidthAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSShadowAttributeName")
    protected static native NSString ShadowAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSTextEffectAttributeName")
    protected static native NSString TextEffectAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSAttachmentAttributeName")
    protected static native NSString AttachmentAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSLinkAttributeName")
    protected static native NSString LinkAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSBaselineOffsetAttributeName")
    protected static native NSString BaselineOffsetAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSUnderlineColorAttributeName")
    protected static native NSString UnderlineColorAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSStrikethroughColorAttributeName")
    protected static native NSString StrikethroughColorAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSObliquenessAttributeName")
    protected static native NSString ObliquenessAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSExpansionAttributeName")
    protected static native NSString ExpansionAttribute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSWritingDirectionAttributeName")
    protected static native NSString WritingDirectionAttribute();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSVerticalGlyphFormAttributeName")
    protected static native NSString VerticalGlyphFormAttribute();
    
}
