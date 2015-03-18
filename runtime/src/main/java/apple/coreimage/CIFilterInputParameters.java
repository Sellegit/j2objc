package apple.coreimage;


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
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreImage/CoreImage.h")
public class CIFilterInputParameters 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIOutputImageKey")
    public static native NSString OutputImageKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIInputBackgroundImageKey")
    public static native NSString BackgroundImageKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIInputImageKey")
    public static native NSString ImageKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCIInputVersionKey")
    public static native NSString VersionKey();
    
}
