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
public class CTFrameAttributes 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCTFrameProgressionAttributeName")
    protected static native CFString Progression();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("kCTFramePathFillRuleAttributeName")
    protected static native CFString PathFillRule();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("kCTFramePathWidthAttributeName")
    protected static native CFString PathWidth();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCTFrameClippingPathsAttributeName")
    protected static native CFString ClippingPaths();
    
}
