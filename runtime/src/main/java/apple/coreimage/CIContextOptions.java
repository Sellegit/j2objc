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
@Library("CoreImage")
public class CIContextOptions 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCIContextOutputColorSpace")
    protected static native NSString OutputColorSpaceKey();
    @GlobalConstant("kCIContextWorkingColorSpace")
    protected static native NSString WorkingColorSpaceKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIContextWorkingFormat")
    protected static native NSString WorkingFormatKey();
    @GlobalConstant("kCIContextUseSoftwareRenderer")
    protected static native NSString UseSoftwareRendererKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCIContextPriorityRequestLow")
    protected static native NSString PriorityRequestLowKey();
    
}
