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
public class CTFontVariationAxes 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisIdentifierKey")
    protected static native CFString IdentifierKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisMinimumValueKey")
    protected static native CFString MinimumValueKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisMaximumValueKey")
    protected static native CFString MaximumValueKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisDefaultValueKey")
    protected static native CFString DefaultValueKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontVariationAxisNameKey")
    protected static native CFString NameKey();
    
}
