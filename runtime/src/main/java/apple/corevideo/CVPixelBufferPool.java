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
public class CVPixelBufferPool 
    extends CFType 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferPoolGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferPoolCreate")
    protected static native CVReturn create(CFAllocator allocator, CFDictionary poolAttributes, CFDictionary pixelBufferAttributes, Todo poolOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferPoolGetAttributes")
    public native NSDictionary<NSString, ?> getAttributes();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferPoolGetPixelBufferAttributes")
    public native NSDictionary<NSString, ?> getPixelBufferAttributes();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferPoolCreatePixelBuffer")
    protected static native CVReturn createPixelBuffer(CFAllocator allocator, CVPixelBufferPool pixelBufferPool, Todo pixelBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferPoolCreatePixelBufferWithAuxAttributes")
    protected static native CVReturn createPixelBuffer(CFAllocator allocator, CVPixelBufferPool pixelBufferPool, CFDictionary auxAttributes, Todo pixelBufferOut);
    
}
