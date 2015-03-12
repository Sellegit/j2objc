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
public class CVOpenGLESTextureCache 
    extends CFType 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheCreate")
    protected static native CVReturn create(CFAllocator allocator, CFDictionary cacheAttributes, EAGLContext eaglContext, CFDictionary textureAttributes, Todo cacheOut);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheCreateTextureFromImage")
    protected static native CVReturn createTexture(CFAllocator allocator, CVOpenGLESTextureCache textureCache, CVImageBuffer sourceImage, CFDictionary textureAttributes, int target, int internalFormat, int width, int height, int format, int type, @MachineSizedUInt long planeIndex, Todo textureOut);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheFlush")
    public native void flush(long options);
    
}
