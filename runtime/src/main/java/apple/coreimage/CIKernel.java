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





@Library("CoreImage") @Mapping("CIKernel")
public class CIKernel 
    extends NSObject 
     {

    
    
    public CIKernel() {}
    
    
    
    
    
    
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("applyWithExtent:roiCallback:arguments:")
    public native CIImage apply(CGRect extent, @Block(" (,)") Block2<Integer, CGRect, CGRect> callback, NSArray<?> args);
    @Mapping("kernelsWithString:")
    public static native NSArray<CIKernel> createKernels(String s);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("kernelWithString:")
    public static native CIKernel create(String string);
    
}
