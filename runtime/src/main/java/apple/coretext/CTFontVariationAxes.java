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
public class CTFontVariationAxes 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisIdentifierKey")
    public static native CFString IdentifierKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisMinimumValueKey")
    public static native CFString MinimumValueKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisMaximumValueKey")
    public static native CFString MaximumValueKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisDefaultValueKey")
    public static native CFString DefaultValueKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisNameKey")
    public static native CFString NameKey();
    
}
