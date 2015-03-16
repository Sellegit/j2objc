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
public class CALineCap 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCALineCapButt")
    protected static native NSString ButtValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCALineCapRound")
    protected static native NSString RoundValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCALineCapSquare")
    protected static native NSString SquareValue();
    
}
