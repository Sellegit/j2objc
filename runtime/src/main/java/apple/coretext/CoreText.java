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
@Library("CoreText")
public class CoreText 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCTFontOpenTypeFeatureTag")
    public static native String Value__kCTFontOpenTypeFeatureTag();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCTFontOpenTypeFeatureValue")
    public static native String Value__kCTFontOpenTypeFeatureValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeIdentifierKey")
    public static native String CTFontFeatureTypeIdentifierKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeNameKey")
    public static native String CTFontFeatureTypeNameKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeExclusiveKey")
    public static native String CTFontFeatureTypeExclusiveKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureTypeSelectorsKey")
    public static native String CTFontFeatureTypeSelectorsKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorIdentifierKey")
    public static native String CTFontFeatureSelectorIdentifierKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorNameKey")
    public static native String CTFontFeatureSelectorNameKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorDefaultKey")
    public static native String CTFontFeatureSelectorDefaultKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSelectorSettingKey")
    public static native String CTFontFeatureSelectorSettingKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassRoman")
    public static native String Value__kCTBaselineClassRoman();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassIdeographicCentered")
    public static native String Value__kCTBaselineClassIdeographicCentered();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassIdeographicLow")
    public static native String Value__kCTBaselineClassIdeographicLow();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassIdeographicHigh")
    public static native String Value__kCTBaselineClassIdeographicHigh();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassHanging")
    public static native String Value__kCTBaselineClassHanging();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassMath")
    public static native String Value__kCTBaselineClassMath();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineReferenceFont")
    public static native String Value__kCTBaselineReferenceFont();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineOriginalFont")
    public static native String Value__kCTBaselineOriginalFont();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontManagerErrorDomain")
    public static native String Value__kCTFontManagerErrorDomain();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontManagerErrorFontURLsKey")
    public static native String Value__kCTFontManagerErrorFontURLsKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCTFontManagerRegisteredFontsChangedNotification")
    public static native String Value__kCTFontManagerRegisteredFontsChangedNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontAttributeName")
    public static native String Value__kCTFontAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTForegroundColorFromContextAttributeName")
    public static native String Value__kCTForegroundColorFromContextAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTKernAttributeName")
    public static native String Value__kCTKernAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTLigatureAttributeName")
    public static native String Value__kCTLigatureAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTForegroundColorAttributeName")
    public static native String Value__kCTForegroundColorAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTParagraphStyleAttributeName")
    public static native String Value__kCTParagraphStyleAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTStrokeWidthAttributeName")
    public static native String Value__kCTStrokeWidthAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTStrokeColorAttributeName")
    public static native String Value__kCTStrokeColorAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTUnderlineStyleAttributeName")
    public static native String Value__kCTUnderlineStyleAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTSuperscriptAttributeName")
    public static native String Value__kCTSuperscriptAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTUnderlineColorAttributeName")
    public static native String Value__kCTUnderlineColorAttributeName();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCTVerticalFormsAttributeName")
    public static native String Value__kCTVerticalFormsAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTGlyphInfoAttributeName")
    public static native String Value__kCTGlyphInfoAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTCharacterShapeAttributeName")
    public static native String Value__kCTCharacterShapeAttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCTLanguageAttributeName")
    public static native String Value__kCTLanguageAttributeName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTRunDelegateAttributeName")
    public static native String Value__kCTRunDelegateAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineClassAttributeName")
    public static native String Value__kCTBaselineClassAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineInfoAttributeName")
    public static native String Value__kCTBaselineInfoAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTBaselineReferenceInfoAttributeName")
    public static native String Value__kCTBaselineReferenceInfoAttributeName();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTWritingDirectionAttributeName")
    public static native String Value__kCTWritingDirectionAttributeName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCTRubyAnnotationAttributeName")
    public static native String Value__kCTRubyAnnotationAttributeName();
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGetCoreTextVersion")
    public static native int function__CTGetCoreTextVersion();
    
}
