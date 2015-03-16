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
public class CIImageOptions 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCIImageColorSpace")
    protected static native CFString ColorSpaceKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIImageProperties")
    protected static native CFString PropertiesKey();
    
}
