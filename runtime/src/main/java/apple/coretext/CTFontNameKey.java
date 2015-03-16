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
    protected static native CFString CopyrightValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFamilyNameKey")
    protected static native CFString FamilyValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSubFamilyNameKey")
    protected static native CFString SubFamilyValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontStyleNameKey")
    protected static native CFString StyleValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontUniqueNameKey")
    protected static native CFString UniqueValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontFullNameKey")
    protected static native CFString FullValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVersionNameKey")
    protected static native CFString VersionValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontPostScriptNameKey")
    protected static native CFString PostScriptValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontTrademarkNameKey")
    protected static native CFString TrademarkValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontManufacturerNameKey")
    protected static native CFString ManufacturerValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDesignerNameKey")
    protected static native CFString DesignerValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDescriptionNameKey")
    protected static native CFString DescriptionValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVendorURLNameKey")
    protected static native CFString VendorURLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontDesignerURLNameKey")
    protected static native CFString DesignerURLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontLicenseNameKey")
    protected static native CFString LicenseValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontLicenseURLNameKey")
    protected static native CFString LicenseURLValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSampleTextNameKey")
    protected static native CFString SampleTextValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontPostScriptCIDNameKey")
    protected static native CFString PostScriptCIDValue();
    
}
