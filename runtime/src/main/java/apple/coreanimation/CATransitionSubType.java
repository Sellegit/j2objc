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
    public static native NSString FromRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFromLeft")
    public static native NSString FromLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFromTop")
    public static native NSString FromTopValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFromBottom")
    public static native NSString FromBottomValue();

}
