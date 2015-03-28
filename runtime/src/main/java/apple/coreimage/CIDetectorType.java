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
public class CIDetectorType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("CIDetectorTypeFace")
    public static native NSString FaceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CIDetectorTypeRectangle")
    public static native NSString RectangleValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CIDetectorTypeQRCode")
    public static native NSString QRCodeValue();

}
