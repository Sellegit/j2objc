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





@Library("CoreImage/CoreImage.h") @Mapping("CIContext")
public class CIContext 
    extends NSObject 
     {

    
    
    public CIContext() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("drawImage:atPoint:fromRect:")
    public native void drawImage(CIImage im, CGPoint p, CGRect src);
    @Mapping("drawImage:inRect:fromRect:")
    public native void drawImage(CIImage im, CGRect dest, CGRect src);
    @Mapping("createCGImage:fromRect:")
    public native CGImage createCGImage(CIImage im, CGRect r);
    @Mapping("createCGImage:fromRect:format:colorSpace:")
    public native CGImage createCGImage(CIImage im, CGRect r, int f, CGColorSpace cs);
    @Mapping("render:toBitmap:rowBytes:bounds:format:colorSpace:")
    public native void render(CIImage im, Todo data, int rb, CGRect r, int f, CGColorSpace cs);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("inputImageMaximumSize")
    public native CGSize getInputImageMaximumSize();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("outputImageMaximumSize")
    public native CGSize getOutputImageMaximumSize();
    
}
