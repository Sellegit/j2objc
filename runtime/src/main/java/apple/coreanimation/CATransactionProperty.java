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
public class CATransactionProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransactionAnimationDuration")
    public static native NSString AnimationDurationValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransactionDisableActions")
    public static native NSString DisableActionsValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCATransactionAnimationTimingFunction")
    public static native NSString AnimationTimingFunctionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCATransactionCompletionBlock")
    public static native NSString CompletionBlockValue();
    
}
