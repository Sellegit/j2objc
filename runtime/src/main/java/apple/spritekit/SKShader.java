package apple.spritekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("SpriteKit/SpriteKit.h") @Mapping("SKShader")
public class SKShader 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public SKShader() {}
    @Mapping("initWithSource:")
    public SKShader(String source) { }
    @Mapping("initWithSource:uniforms:")
    public SKShader(String source, NSArray<?> uniforms) { }
    
    
    @Mapping("source")
    public native String getSource();
    @Mapping("setSource:")
    public native void setSource(String v);
    @Mapping("uniforms")
    public native NSArray<SKUniform> getUniforms();
    @Mapping("setUniforms:")
    public native void setUniforms(NSArray<SKUniform> v);
    
    
    
    @Mapping("addUniform:")
    public native void addUniform(SKUniform uniform);
    @Mapping("uniformNamed:")
    public native SKUniform getUniform(String name);
    @Mapping("removeUniformNamed:")
    public native void removeUniform(String name);
    @Mapping("shader")
    public static native SKShader create();
    @Mapping("shaderWithSource:")
    public static native SKShader create(String source);
    @Mapping("shaderWithSource:uniforms:")
    public static native SKShader create(String source, NSArray<?> uniforms);
    @Mapping("shaderWithFileNamed:")
    private static native SKShader createWithFile(String name);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
