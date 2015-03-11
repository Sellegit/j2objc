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
@Library("QuartzCore")
public class CATransitionType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionFade")
    protected static native NSString FadeValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionMoveIn")
    protected static native NSString MoveInValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionPush")
    protected static native NSString PushValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCATransitionReveal")
    protected static native NSString RevealValue();
    
}
