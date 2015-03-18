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





@Library("CoreImage/CoreImage.h") @Mapping("CIDetector")
public class CIDetector 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CIDetector() { }
    
    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("featuresInImage:")
    public native NSArray<CIFeature> findFeatures(CIImage image);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("featuresInImage:options:")
    public native NSArray<CIFeature> findFeatures(CIImage image, NSDictionary<?, ?> options);
    
}
