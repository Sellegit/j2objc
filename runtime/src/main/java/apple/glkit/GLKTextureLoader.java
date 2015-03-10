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

@Library("GLKit") @Mapping("GLKTextureLoader")
public class GLKTextureLoader 
    extends NSObject 
     {

    
    
    public GLKTextureLoader() {}
    @Mapping("initWithSharegroup:")
    public GLKTextureLoader(EAGLSharegroup sharegroup) { }
    
    
    
    
    
    
    @Mapping("textureWithContentsOfFile:options:queue:completionHandler:")
    public native void loadTexture(String path, GLKTextureLoaderOptions options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithContentsOfURL:options:queue:completionHandler:")
    public native void loadTexture(NSURL url, GLKTextureLoaderOptions options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithContentsOfData:options:queue:completionHandler:")
    public native void createTexture(NSData data, GLKTextureLoaderOptions options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithCGImage:options:queue:completionHandler:")
    public native void createTexture(CGImage cgImage, GLKTextureLoaderOptions options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("cubeMapWithContentsOfFiles:options:queue:completionHandler:")
    public native void loadCubeMap(List<String> paths, GLKTextureLoaderOptions options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("cubeMapWithContentsOfFile:options:queue:completionHandler:")
    public native void loadCubeMap(String path, GLKTextureLoaderOptions options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("cubeMapWithContentsOfURL:options:queue:completionHandler:")
    public native void loadCubeMap(NSURL url, GLKTextureLoaderOptions options, DispatchQueue queue, @Block VoidBlock2<GLKTextureInfo, NSError> block);
    @Mapping("textureWithContentsOfFile:options:error:")
    public static native GLKTextureInfo loadTexture(String path, GLKTextureLoaderOptions options, Todo outError);
    @Mapping("textureWithContentsOfURL:options:error:")
    public static native GLKTextureInfo loadTexture(NSURL url, GLKTextureLoaderOptions options, Todo outError);
    @Mapping("textureWithContentsOfData:options:error:")
    public static native GLKTextureInfo createTexture(NSData data, GLKTextureLoaderOptions options, Todo outError);
    @Mapping("textureWithCGImage:options:error:")
    public static native GLKTextureInfo createTexture(CGImage cgImage, GLKTextureLoaderOptions options, Todo outError);
    @Mapping("cubeMapWithContentsOfFiles:options:error:")
    public static native GLKTextureInfo loadCubeMap(List<String> paths, GLKTextureLoaderOptions options, Todo outError);
    @Mapping("cubeMapWithContentsOfFile:options:error:")
    public static native GLKTextureInfo loadCubeMap(String path, GLKTextureLoaderOptions options, Todo outError);
    @Mapping("cubeMapWithContentsOfURL:options:error:")
    public static native GLKTextureInfo loadCubeMap(NSURL url, GLKTextureLoaderOptions options, Todo outError);
    
}
