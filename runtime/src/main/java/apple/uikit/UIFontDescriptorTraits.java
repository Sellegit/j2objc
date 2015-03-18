package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public class UIFontDescriptorTraits 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontSymbolicTrait")
    public static native NSString SymbolicTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontWeightTrait")
    public static native NSString WeightTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontWidthTrait")
    public static native NSString WidthTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontSlantTrait")
    public static native NSString SlantTrait();
    
}
