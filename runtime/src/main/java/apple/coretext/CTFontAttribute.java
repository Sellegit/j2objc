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
    public static native CFString URLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontNameAttribute")
    public static native CFString NameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDisplayNameAttribute")
    public static native CFString DisplayNameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFamilyNameAttribute")
    public static native CFString FamilyNameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontStyleNameAttribute")
    public static native CFString StyleNameValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontTraitsAttribute")
    public static native CFString TraitsValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAttribute")
    public static native CFString VariationValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSizeAttribute")
    public static native CFString SizeValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontMatrixAttribute")
    public static native CFString MatrixValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontCascadeListAttribute")
    public static native CFString CascadeListValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontCharacterSetAttribute")
    public static native CFString CharacterSetValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontLanguagesAttribute")
    public static native CFString LanguagesValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontBaselineAdjustAttribute")
    public static native CFString BaselineAdjustValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontMacintoshEncodingsAttribute")
    public static native CFString MacintoshEncodingsValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeaturesAttribute")
    public static native CFString FeaturesValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFeatureSettingsAttribute")
    public static native CFString FeatureSettingsValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFixedAdvanceAttribute")
    public static native CFString FixedAdvanceValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontOrientationAttribute")
    public static native CFString OrientationValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFormatAttribute")
    public static native CFString FormatValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontRegistrationScopeAttribute")
    public static native CFString RegistrationScopeValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontPriorityAttribute")
    public static native CFString PriorityValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontEnabledAttribute")
    public static native CFString EnabledValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCTFontDownloadableAttribute")
    public static native CFString DownloadableValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCTFontDownloadedAttribute")
    public static native CFString DownloadedValue();

}
