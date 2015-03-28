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


@Library("CoreImage/CoreImage.h") @Mapping("CIColorKernel")
public class CIColorKernel 
    extends CIKernel 
     {

    
    
    @Mapping("init")
    public CIColorKernel() { }

    


    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("applyWithExtent:arguments:")
    public native CIImage apply(CGRect extent, NSArray<?> args);

}
