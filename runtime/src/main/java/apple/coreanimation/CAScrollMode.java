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
public class CAScrollMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAScrollNone")
    protected static native NSString NoneValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAScrollVertically")
    protected static native NSString VerticallyValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAScrollHorizontally")
    protected static native NSString HorizontallyValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAScrollBoth")
    protected static native NSString BothValue();
    
}
