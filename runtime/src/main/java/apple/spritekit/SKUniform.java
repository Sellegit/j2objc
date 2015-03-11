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

@Library("SpriteKit") @Mapping("SKUniform")
public class SKUniform 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public SKUniform() {}
    @Mapping("initWithName:")
    public SKUniform(String name) { }
    @Mapping("initWithName:texture:")
    public SKUniform(String name, SKTexture texture) { }
    @Mapping("initWithName:float:")
    public SKUniform(String name, float value) { }
    @Mapping("initWithName:floatVector2:")
    public SKUniform(String name, GLKVector2 value) { }
    @Mapping("initWithName:floatVector3:")
    public SKUniform(String name, GLKVector3 value) { }
    @Mapping("initWithName:floatVector4:")
    public SKUniform(String name, GLKVector4 value) { }
    @Mapping("initWithName:floatMatrix2:")
    public SKUniform(String name, GLKMatrix2 value) { }
    @Mapping("initWithName:floatMatrix3:")
    public SKUniform(String name, GLKMatrix3 value) { }
    @Mapping("initWithName:floatMatrix4:")
    public SKUniform(String name, GLKMatrix4 value) { }
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("uniformType")
    public native @Representing("SKUniformType") @MachineSizedSInt long getUniformType();
    @Mapping("textureValue")
    public native SKTexture getTextureValue();
    @Mapping("setTextureValue:")
    public native void setTextureValue(SKTexture v);
    @Mapping("floatValue")
    public native float getFloatValue();
    @Mapping("setFloatValue:")
    public native void setFloatValue(float v);
    @Mapping("floatVector2Value")
    public native GLKVector2 getFloatVector2Value();
    @Mapping("setFloatVector2Value:")
    public native void setFloatVector2Value(GLKVector2 v);
    @Mapping("floatVector3Value")
    public native GLKVector3 getFloatVector3Value();
    @Mapping("setFloatVector3Value:")
    public native void setFloatVector3Value(GLKVector3 v);
    @Mapping("floatVector4Value")
    public native GLKVector4 getFloatVector4Value();
    @Mapping("setFloatVector4Value:")
    public native void setFloatVector4Value(GLKVector4 v);
    @Mapping("floatMatrix2Value")
    public native GLKMatrix2 getFloatMatrix2Value();
    @Mapping("setFloatMatrix2Value:")
    public native void setFloatMatrix2Value(GLKMatrix2 v);
    @Mapping("floatMatrix3Value")
    public native GLKMatrix3 getFloatMatrix3Value();
    @Mapping("setFloatMatrix3Value:")
    public native void setFloatMatrix3Value(GLKMatrix3 v);
    @Mapping("floatMatrix4Value")
    public native GLKMatrix4 getFloatMatrix4Value();
    @Mapping("setFloatMatrix4Value:")
    public native void setFloatMatrix4Value(GLKMatrix4 v);
    
    
    
    @Mapping("uniformWithName:")
    public static native SKUniform create(String name);
    @Mapping("uniformWithName:texture:")
    public static native SKUniform create(String name, SKTexture texture);
    @Mapping("uniformWithName:float:")
    public static native SKUniform create(String name, float value);
    @Mapping("uniformWithName:floatVector2:")
    public static native SKUniform create(String name, GLKVector2 value);
    @Mapping("uniformWithName:floatVector3:")
    public static native SKUniform create(String name, GLKVector3 value);
    @Mapping("uniformWithName:floatVector4:")
    public static native SKUniform create(String name, GLKVector4 value);
    @Mapping("uniformWithName:floatMatrix2:")
    public static native SKUniform create(String name, GLKMatrix2 value);
    @Mapping("uniformWithName:floatMatrix3:")
    public static native SKUniform create(String name, GLKMatrix3 value);
    @Mapping("uniformWithName:floatMatrix4:")
    public static native SKUniform create(String name, GLKMatrix4 value);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
