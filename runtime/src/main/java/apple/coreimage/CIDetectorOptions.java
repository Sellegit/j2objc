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
public class CIDetectorOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("CIDetectorAccuracy")
    protected static native NSString AccuracyKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CIDetectorTracking")
    protected static native NSString TrackingKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CIDetectorMinFeatureSize")
    protected static native NSString MinFeatureSizeKey();
    
}
