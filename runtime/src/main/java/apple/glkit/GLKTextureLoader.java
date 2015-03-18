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

@Library("GLKit/GLKit.h") @Mapping("GLKTextureLoader")
public class GLKTextureLoader 
    extends NSObject 
     {

    
    
    @Mapping("initWithSharegroup:")
    public GLKTextureLoader(EAGLSharegroup sharegroup) { }
    @Mapping("init")
    public GLKTextureLoader() { }
    
    
    
    
    
    
    @Mapping("textureWithContentsOfFile:options:queue:completionHandler:")
    public native void loadTexture(String path, NSDictionary<?, ?> options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithContentsOfURL:options:queue:completionHandler:")
    public native void loadTexture(NSURL url, NSDictionary<?, ?> options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithContentsOfData:options:queue:completionHandler:")
    public native void createTexture(NSData data, NSDictionary<?, ?> options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithCGImage:options:queue:completionHandler:")
    public native void createTexture(CGImage cgImage, NSDictionary<?, ?> options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("cubeMapWithContentsOfFiles:options:queue:completionHandler:")
    public native void loadCubeMap(NSArray<?> paths, NSDictionary<?, ?> options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("cubeMapWithContentsOfFile:options:queue:completionHandler:")
    public native void loadCubeMap(String path, NSDictionary<?, ?> options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("cubeMapWithContentsOfURL:options:queue:completionHandler:")
    public native void loadCubeMap(NSURL url, NSDictionary<?, ?> options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithContentsOfFile:options:error:")
    public static native GLKTextureInfo loadTexture(String path, NSDictionary<?, ?> options, Todo outError);
    @Mapping("textureWithContentsOfURL:options:error:")
    public static native GLKTextureInfo loadTexture(NSURL url, NSDictionary<?, ?> options, Todo outError);
    @Mapping("textureWithContentsOfData:options:error:")
    public static native GLKTextureInfo createTexture(NSData data, NSDictionary<?, ?> options, Todo outError);
    @Mapping("textureWithCGImage:options:error:")
    public static native GLKTextureInfo createTexture(CGImage cgImage, NSDictionary<?, ?> options, Todo outError);
    @Mapping("cubeMapWithContentsOfFiles:options:error:")
    public static native GLKTextureInfo loadCubeMap(NSArray<?> paths, NSDictionary<?, ?> options, Todo outError);
    @Mapping("cubeMapWithContentsOfFile:options:error:")
    public static native GLKTextureInfo loadCubeMap(String path, NSDictionary<?, ?> options, Todo outError);
    @Mapping("cubeMapWithContentsOfURL:options:error:")
    public static native GLKTextureInfo loadCubeMap(NSURL url, NSDictionary<?, ?> options, Todo outError);
    
}
