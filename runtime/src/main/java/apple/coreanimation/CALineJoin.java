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
public class CALineJoin 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCALineJoinMiter")
    protected static native NSString MiterValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCALineJoinRound")
    protected static native NSString RoundValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCALineJoinBevel")
    protected static native NSString BevelValue();
    
}
