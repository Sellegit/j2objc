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
public class CAFilter 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAFilterNearest")
    public static native NSString NearestValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAFilterLinear")
    public static native NSString LinearValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCAFilterTrilinear")
    public static native NSString TrilinearValue();

}
