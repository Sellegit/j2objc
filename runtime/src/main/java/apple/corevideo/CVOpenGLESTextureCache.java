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

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CVOpenGLESTextureCacheRef") @Library("CoreVideo/CoreVideo.h")
public class CVOpenGLESTextureCache 
    extends CFType 
     {

    
    
    protected CVOpenGLESTextureCache() {}

    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheCreate")
    public static native CVReturn create(CFAllocator allocator, CFDictionary cacheAttributes, EAGLContext eaglContext, CFDictionary textureAttributes, Todo cacheOut);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheCreateTextureFromImage")
    public static native CVReturn createTexture(CFAllocator allocator, CVOpenGLESTextureCache textureCache, CVImageBuffer sourceImage, CFDictionary textureAttributes, int target, int internalFormat, int width, int height, int format, int type, @MachineSizedUInt long planeIndex, Todo textureOut);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureCacheFlush")
    public static native void flush(CVOpenGLESTextureCache textureCache, long options);

}
