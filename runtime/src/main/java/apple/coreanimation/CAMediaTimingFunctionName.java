package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("QuartzCore/QuartzCore.h")
public class CAMediaTimingFunctionName 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAMediaTimingFunctionLinear")
    public static native NSString LinearValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAMediaTimingFunctionEaseIn")
    public static native NSString EaseInValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAMediaTimingFunctionEaseOut")
    public static native NSString EaseOutValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAMediaTimingFunctionEaseInEaseOut")
    public static native NSString EaseInEaseOutValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCAMediaTimingFunctionDefault")
    public static native NSString DefaultValue();

}
