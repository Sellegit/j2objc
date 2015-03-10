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
@Library("UIKit")
public class UIFontDescriptorTraits 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontSymbolicTrait")
    protected static native NSString SymbolicTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontWeightTrait")
    protected static native NSString WeightTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontWidthTrait")
    protected static native NSString WidthTrait();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIFontSlantTrait")
    protected static native NSString SlantTrait();
    
}
