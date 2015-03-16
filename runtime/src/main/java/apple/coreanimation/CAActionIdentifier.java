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
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("QuartzCore/QuartzCore.h")
public class CAActionIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAOnOrderIn")
    public static native String OnOrderIn();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAOnOrderOut")
    public static native String OnOrderOut();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransition")
    public static native String Transition();
    
}
