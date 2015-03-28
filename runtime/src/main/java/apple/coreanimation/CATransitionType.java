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
public class CATransitionType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFade")
    public static native NSString FadeValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionMoveIn")
    public static native NSString MoveInValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionPush")
    public static native NSString PushValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionReveal")
    public static native NSString RevealValue();

}
