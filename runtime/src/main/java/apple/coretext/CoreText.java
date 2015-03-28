package apple.coretext;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreText/CoreText.h")
public class CoreText 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCTFontOpenTypeFeatureTag")
    public static native CFString Value__kCTFontOpenTypeFeatureTag();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCTFontOpenTypeFeatureValue")
    public static native CFString Value__kCTFontOpenTypeFeatureValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeIdentifierKey")
    public static native CFString CTFontFeatureTypeIdentifierKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeNameKey")
    public static native CFString CTFontFeatureTypeNameKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeExclusiveKey")
    public static native CFString CTFontFeatureTypeExclusiveKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeSelectorsKey")
    public static native CFString CTFontFeatureTypeSelectorsKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorIdentifierKey")
    public static native CFString CTFontFeatureSelectorIdentifierKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorNameKey")
    public static native CFString CTFontFeatureSelectorNameKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorDefaultKey")
    public static native CFString CTFontFeatureSelectorDefaultKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorSettingKey")
    public static native CFString CTFontFeatureSelectorSettingKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassRoman")
    public static native CFString Value__kCTBaselineClassRoman();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassIdeographicCentered")
    public static native CFString Value__kCTBaselineClassIdeographicCentered();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassIdeographicLow")
    public static native CFString Value__kCTBaselineClassIdeographicLow();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassIdeographicHigh")
    public static native CFString Value__kCTBaselineClassIdeographicHigh();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassHanging")
    public static native CFString Value__kCTBaselineClassHanging();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassMath")
    public static native CFString Value__kCTBaselineClassMath();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineReferenceFont")
    public static native CFString Value__kCTBaselineReferenceFont();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineOriginalFont")
    public static native CFString Value__kCTBaselineOriginalFont();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontManagerErrorDomain")
    public static native CFString Value__kCTFontManagerErrorDomain();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontManagerErrorFontURLsKey")
    public static native CFString Value__kCTFontManagerErrorFontURLsKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCTFontManagerRegisteredFontsChangedNotification")
    public static native CFString Value__kCTFontManagerRegisteredFontsChangedNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontAttributeName")
    public static native CFString Value__kCTFontAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTForegroundColorFromContextAttributeName")
    public static native CFString Value__kCTForegroundColorFromContextAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTKernAttributeName")
    public static native CFString Value__kCTKernAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTLigatureAttributeName")
    public static native CFString Value__kCTLigatureAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTForegroundColorAttributeName")
    public static native CFString Value__kCTForegroundColorAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTParagraphStyleAttributeName")
    public static native CFString Value__kCTParagraphStyleAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTStrokeWidthAttributeName")
    public static native CFString Value__kCTStrokeWidthAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTStrokeColorAttributeName")
    public static native CFString Value__kCTStrokeColorAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTUnderlineStyleAttributeName")
    public static native CFString Value__kCTUnderlineStyleAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTSuperscriptAttributeName")
    public static native CFString Value__kCTSuperscriptAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTUnderlineColorAttributeName")
    public static native CFString Value__kCTUnderlineColorAttributeName();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCTVerticalFormsAttributeName")
    public static native CFString Value__kCTVerticalFormsAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTGlyphInfoAttributeName")
    public static native CFString Value__kCTGlyphInfoAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTCharacterShapeAttributeName")
    public static native CFString Value__kCTCharacterShapeAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCTLanguageAttributeName")
    public static native CFString Value__kCTLanguageAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTRunDelegateAttributeName")
    public static native CFString Value__kCTRunDelegateAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassAttributeName")
    public static native CFString Value__kCTBaselineClassAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineInfoAttributeName")
    public static native CFString Value__kCTBaselineInfoAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineReferenceInfoAttributeName")
    public static native CFString Value__kCTBaselineReferenceInfoAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTWritingDirectionAttributeName")
    public static native CFString Value__kCTWritingDirectionAttributeName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCTRubyAnnotationAttributeName")
    public static native CFString Value__kCTRubyAnnotationAttributeName();

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGetCoreTextVersion")
    public static native int function__CTGetCoreTextVersion();

}
