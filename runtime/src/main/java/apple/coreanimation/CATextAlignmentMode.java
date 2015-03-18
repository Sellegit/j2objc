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
public class CATextAlignmentMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCAAlignmentNatural")
    public static native NSString NaturalValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCAAlignmentLeft")
    public static native NSString LeftValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCAAlignmentRight")
    public static native NSString RightValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCAAlignmentCenter")
    public static native NSString CenterValue();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("kCAAlignmentJustified")
    public static native NSString JustifiedValue();
    
}
