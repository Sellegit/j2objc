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
public class CATextTruncationMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCATruncationNone")
    protected static native NSString NoneValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCATruncationStart")
    protected static native NSString StartValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCATruncationEnd")
    protected static native NSString EndValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCATruncationMiddle")
    protected static native NSString MiddleValue();
    
}
