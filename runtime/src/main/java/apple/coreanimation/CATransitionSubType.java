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
public class CATransitionSubType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFromRight")
    protected static native NSString FromRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFromLeft")
    protected static native NSString FromLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFromTop")
    protected static native NSString FromTopValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFromBottom")
    protected static native NSString FromBottomValue();
    
}
