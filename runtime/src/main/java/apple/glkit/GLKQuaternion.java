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





@Mapping("GLKQuaternion") @Library("GLKit")
public class GLKQuaternion 
    extends Struct 
     {

    
    protected GLKQuaternion() {}
    
    
    @DotMapping("q")
    public native FloatBuffer getQ();
    
    public static native GLKQuaternion create(FloatBuffer q) /*-[
        GLKQuaternion __new = { .q = q };
        return __new;
    ]-*/;
    public static native GLKQuaternion copyWithq(GLKQuaternion original, FloatBuffer q) /*-[
        original.q = q;
        return __new;
    ]-*/;

    
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
    public native float angle();
    @GlobalFunction("GLKQuaternionAxis")
    public native GLKVector3 axis();
    @GlobalFunction("GLKQuaternionAdd")
    public native GLKQuaternion add(GLKQuaternion quaternionRight);
    @GlobalFunction("GLKQuaternionSubtract")
    public native GLKQuaternion subtract(GLKQuaternion quaternionRight);
    @GlobalFunction("GLKQuaternionMultiply")
    public native GLKQuaternion multiply(GLKQuaternion quaternionRight);
    @GlobalFunction("GLKQuaternionSlerp")
    public native GLKQuaternion slerp(GLKQuaternion quaternionEnd, float t);
    @GlobalFunction("GLKQuaternionLength")
    public native float length();
    @GlobalFunction("GLKQuaternionConjugate")
    public native GLKQuaternion conjugate();
    @GlobalFunction("GLKQuaternionInvert")
    public native GLKQuaternion invert();
    @GlobalFunction("GLKQuaternionNormalize")
    public native GLKQuaternion normalize();
    @GlobalFunction("GLKQuaternionRotateVector3")
    public native GLKVector3 rotateVector3(GLKVector3 vector);
    @GlobalFunction("GLKQuaternionRotateVector3Array")
    public native void rotateVector3Array(GLKVector3 vectors, @MachineSizedUInt long vectorCount);
    @GlobalFunction("GLKQuaternionRotateVector4")
    public native GLKVector4 rotateVector4(GLKVector4 vector);
    @GlobalFunction("GLKQuaternionRotateVector4Array")
    public native void rotateVector4Array(GLKVector4 vectors, @MachineSizedUInt long vectorCount);
    
}
