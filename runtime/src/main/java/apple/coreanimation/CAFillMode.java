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
public class CAFillMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAFillModeForwards")
    protected static native NSString ForwardsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAFillModeBackwards")
    protected static native NSString BackwardsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAFillModeBoth")
    protected static native NSString BothValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAFillModeRemoved")
    protected static native NSString RemovedValue();
    
}
