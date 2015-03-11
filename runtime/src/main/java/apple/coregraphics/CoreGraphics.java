package apple.coregraphics;


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
import apple.uikit.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreGraphics")
 class CoreGraphics 
    extends Object 
     {

    
    public static final int CGFLOAT_IS_DOUBLE = 0;
    public static final int CGFLOAT_DEFINED = 1;
    public static final int CGVECTOR_DEFINED = 1;
    public static final int CGGlyphMin = 0;
    public static final int CGGlyphMax = 1;
    public static final int CGPDFDataFormatRaw = 0;
    public static final int CGPDFDataFormatJPEGEncoded = 1;
    public static final int CGPDFDataFormatJPEG2000 = 2;
    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGFontVariationAxisName")
    public static native String kCGFontVariationAxisName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGFontVariationAxisMinValue")
    public static native String kCGFontVariationAxisMinValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGFontVariationAxisMaxValue")
    public static native String kCGFontVariationAxisMaxValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCGFontVariationAxisDefaultValue")
    public static native String kCGFontVariationAxisDefaultValue();
    
}
