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
public class CIContextOptions 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCIContextOutputColorSpace")
    public static native NSString OutputColorSpaceKey();
    @GlobalConstant("kCIContextWorkingColorSpace")
    public static native NSString WorkingColorSpaceKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIContextWorkingFormat")
    public static native NSString WorkingFormatKey();
    @GlobalConstant("kCIContextUseSoftwareRenderer")
    public static native NSString UseSoftwareRendererKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIContextPriorityRequestLow")
    public static native NSString PriorityRequestLowKey();

}
