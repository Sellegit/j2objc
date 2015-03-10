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
    public native int getTarget();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureGetName")
    public native int getName();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureIsFlipped")
    public native boolean isFlipped();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CVOpenGLESTextureGetCleanTexCoords")
    protected native void getCleanTexCoords(Todo lowerLeft, Todo lowerRight, Todo upperRight, Todo upperLeft);
    
}
