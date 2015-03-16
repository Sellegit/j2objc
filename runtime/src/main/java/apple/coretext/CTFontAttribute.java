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
public class CTFontAttribute 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontURLAttribute")
    protected static native CFString URLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontNameAttribute")
    protected static native CFString NameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDisplayNameAttribute")
    protected static native CFString DisplayNameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFamilyNameAttribute")
    protected static native CFString FamilyNameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontStyleNameAttribute")
    protected static native CFString StyleNameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontTraitsAttribute")
    protected static native CFString TraitsValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAttribute")
    protected static native CFString VariationValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSizeAttribute")
    protected static native CFString SizeValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontMatrixAttribute")
    protected static native CFString MatrixValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontCascadeListAttribute")
    protected static native CFString CascadeListValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontCharacterSetAttribute")
    protected static native CFString CharacterSetValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontLanguagesAttribute")
    protected static native CFString LanguagesValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontBaselineAdjustAttribute")
    protected static native CFString BaselineAdjustValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontMacintoshEncodingsAttribute")
    protected static native CFString MacintoshEncodingsValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeaturesAttribute")
    protected static native CFString FeaturesValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSettingsAttribute")
    protected static native CFString FeatureSettingsValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFixedAdvanceAttribute")
    protected static native CFString FixedAdvanceValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontOrientationAttribute")
    protected static native CFString OrientationValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFormatAttribute")
    protected static native CFString FormatValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontRegistrationScopeAttribute")
    protected static native CFString RegistrationScopeValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontPriorityAttribute")
    protected static native CFString PriorityValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontEnabledAttribute")
    protected static native CFString EnabledValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDownloadableAttribute")
    protected static native CFString DownloadableValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCTFontDownloadedAttribute")
    protected static native CFString DownloadedValue();
    
}
