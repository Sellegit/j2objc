package apple.glkit;


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
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("GLKit/GLKit.h") @Mapping("GLKTextureInfo")
public class GLKTextureInfo 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public GLKTextureInfo() { }
    
    
    @Mapping("name")
    public native int getName();
    @Mapping("target")
    public native int getTarget();
    @Mapping("width")
    public native int getWidth();
    @Mapping("height")
    public native int getHeight();
    @Mapping("alphaState")
    public native @Representing("GLKTextureInfoAlphaState") int getAlphaState();
    @Mapping("textureOrigin")
    public native @Representing("GLKTextureInfoOrigin") int getTextureOrigin();
    @Mapping("containsMipmaps")
    public native boolean containsMipmaps();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
