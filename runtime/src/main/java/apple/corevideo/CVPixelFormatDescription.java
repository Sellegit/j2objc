package apple.corevideo;


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
import apple.coremedia.*;
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreVideo")
public class CVPixelFormatDescription 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelFormatDescriptionCreateWithPixelFormatType")
    protected static native NSDictionary<NSString, ?> create(CFAllocator allocator, int pixelFormat);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelFormatDescriptionArrayCreateWithAllPixelFormatTypes")
    protected static native NSArray<?> createPixelFormatTypesArray(CFAllocator allocator);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelFormatDescriptionRegisterDescriptionWithPixelFormatType")
    public static native void registerDescription(CFDictionary description, int pixelFormat);
    
}
