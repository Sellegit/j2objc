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
public class CTFontNameKey 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontCopyrightNameKey")
    public static native CFString CopyrightValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFamilyNameKey")
    public static native CFString FamilyValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSubFamilyNameKey")
    public static native CFString SubFamilyValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontStyleNameKey")
    public static native CFString StyleValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontUniqueNameKey")
    public static native CFString UniqueValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFullNameKey")
    public static native CFString FullValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVersionNameKey")
    public static native CFString VersionValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontPostScriptNameKey")
    public static native CFString PostScriptValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontTrademarkNameKey")
    public static native CFString TrademarkValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontManufacturerNameKey")
    public static native CFString ManufacturerValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDesignerNameKey")
    public static native CFString DesignerValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDescriptionNameKey")
    public static native CFString DescriptionValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVendorURLNameKey")
    public static native CFString VendorURLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDesignerURLNameKey")
    public static native CFString DesignerURLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontLicenseNameKey")
    public static native CFString LicenseValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontLicenseURLNameKey")
    public static native CFString LicenseURLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSampleTextNameKey")
    public static native CFString SampleTextValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontPostScriptCIDNameKey")
    public static native CFString PostScriptCIDValue();
    
}
