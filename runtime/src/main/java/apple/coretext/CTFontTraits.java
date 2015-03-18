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
public class CTFontTraits 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSymbolicTrait")
    public static native CFString SymbolicTrait();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontWeightTrait")
    public static native CFString WeightTrait();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontWidthTrait")
    public static native CFString WidthTrait();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFontSlantTrait")
    public static native CFString SlantTrait();
    
}
