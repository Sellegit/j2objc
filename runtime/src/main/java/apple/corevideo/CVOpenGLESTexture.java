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
@Library("CoreVideo/CoreVideo.h")
public class CVOpenGLESTexture 
    extends CVImageBuffer 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureGetTarget")
    public static native int getTarget(CVOpenGLESTexture image);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureGetName")
    public static native int getName(CVOpenGLESTexture image);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureIsFlipped")
    public static native boolean isFlipped(CVOpenGLESTexture image);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureGetCleanTexCoords")
    protected static native void getCleanTexCoords(CVOpenGLESTexture image, Todo lowerLeft, Todo lowerRight, Todo upperRight, Todo upperLeft);
    
}
