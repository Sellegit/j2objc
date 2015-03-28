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


@Mapping("GLKQuaternion") @Library("GLKit/GLKit.h")
public class GLKQuaternion 
    extends Struct 
     {

    
    private GLKQuaternion() {}
    
    


    
    @GlobalConstant("GLKQuaternionIdentity")
    public static native GLKQuaternion Identity();

    @GlobalFunction("GLKQuaternionMake")
    public static native GLKQuaternion createPrime(float x, float y, float z, float w);
    @GlobalFunction("GLKQuaternionMakeWithVector3")
    public static native GLKQuaternion createPrime(GLKVector3 vector, float scalar);
    @GlobalFunction("GLKQuaternionMakeWithArray")
    public static native GLKQuaternion createPrime(FloatBuffer values);
    @GlobalFunction("GLKQuaternionMakeWithAngleAndAxis")
    public static native GLKQuaternion createRotation(float radians, float x, float y, float z);
    @GlobalFunction("GLKQuaternionMakeWithAngleAndVector3Axis")
    public static native GLKQuaternion createRotation(float radians, GLKVector3 axisVector);
    @GlobalFunction("GLKQuaternionMakeWithMatrix3")
    public static native GLKQuaternion createPrime(GLKMatrix3 matrix);
    @GlobalFunction("GLKQuaternionMakeWithMatrix4")
    public static native GLKQuaternion createPrime(GLKMatrix4 matrix);
    @GlobalFunction("GLKQuaternionAngle")
    public static native float angle(GLKQuaternion quaternion);
    @GlobalFunction("GLKQuaternionAxis")
    public static native GLKVector3 axis(GLKQuaternion quaternion);
    @GlobalFunction("GLKQuaternionAdd")
    public static native GLKQuaternion add(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight);
    @GlobalFunction("GLKQuaternionSubtract")
    public static native GLKQuaternion subtract(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight);
    @GlobalFunction("GLKQuaternionMultiply")
    public static native GLKQuaternion multiply(GLKQuaternion quaternionLeft, GLKQuaternion quaternionRight);
    @GlobalFunction("GLKQuaternionSlerp")
    public static native GLKQuaternion slerp(GLKQuaternion quaternionStart, GLKQuaternion quaternionEnd, float t);
    @GlobalFunction("GLKQuaternionLength")
    public static native float length(GLKQuaternion quaternion);
    @GlobalFunction("GLKQuaternionConjugate")
    public static native GLKQuaternion conjugate(GLKQuaternion quaternion);
    @GlobalFunction("GLKQuaternionInvert")
    public static native GLKQuaternion invert(GLKQuaternion quaternion);
    @GlobalFunction("GLKQuaternionNormalize")
    public static native GLKQuaternion normalize(GLKQuaternion quaternion);
    @GlobalFunction("GLKQuaternionRotateVector3")
    public static native GLKVector3 rotateVector3(GLKQuaternion quaternion, GLKVector3 vector);
    @GlobalFunction("GLKQuaternionRotateVector3Array")
    public static native void rotateVector3Array(GLKQuaternion quaternion, GLKVector3 vectors, @MachineSizedUInt long vectorCount);
    @GlobalFunction("GLKQuaternionRotateVector4")
    public static native GLKVector4 rotateVector4(GLKQuaternion quaternion, GLKVector4 vector);
    @GlobalFunction("GLKQuaternionRotateVector4Array")
    public static native void rotateVector4Array(GLKQuaternion quaternion, GLKVector4 vectors, @MachineSizedUInt long vectorCount);

}
