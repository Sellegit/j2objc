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





@Mapping("GLKVector3") @Library("GLKit/GLKit.h")
public class GLKVector3 
    extends Struct 
     {

    
    protected GLKVector3() {}
    
    
    @DotMapping("v")
    public native FloatBuffer getV();
    
    public static native GLKVector3 create(FloatBuffer v) /*-[
        GLKVector3 __new = { .v = v };
        return __new;
    ]-*/;
    public static native GLKVector3 copyWithv(GLKVector3 original, FloatBuffer v) /*-[
        original.v = v;
        return original;
    ]-*/;

    
    @GlobalFunction("GLKVector3Make")
    public static native GLKVector3 createPrime(float x, float y, float z);
    @GlobalFunction("GLKVector3MakeWithArray")
    public static native GLKVector3 createPrime(FloatBuffer values);
    @GlobalFunction("GLKVector3Negate")
    public static native GLKVector3 negate(GLKVector3 vector);
    @GlobalFunction("GLKVector3Add")
    public static native GLKVector3 add(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Subtract")
    public static native GLKVector3 subtract(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Multiply")
    public static native GLKVector3 multiply(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Divide")
    public static native GLKVector3 divide(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AddScalar")
    public static native GLKVector3 addScalar(GLKVector3 vector, float value);
    @GlobalFunction("GLKVector3SubtractScalar")
    public static native GLKVector3 subtractScalar(GLKVector3 vector, float value);
    @GlobalFunction("GLKVector3MultiplyScalar")
    public static native GLKVector3 multiplyScalar(GLKVector3 vector, float value);
    @GlobalFunction("GLKVector3DivideScalar")
    public static native GLKVector3 divideScalar(GLKVector3 vector, float value);
    @GlobalFunction("GLKVector3Maximum")
    public static native GLKVector3 maximum(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Minimum")
    public static native GLKVector3 minimum(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllEqualToVector3")
    public static native boolean allEqualToVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllEqualToScalar")
    public static native boolean allEqualToScalar(GLKVector3 vector, float value);
    @GlobalFunction("GLKVector3AllGreaterThanVector3")
    public static native boolean allGreaterThanVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllGreaterThanScalar")
    public static native boolean allGreaterThanScalar(GLKVector3 vector, float value);
    @GlobalFunction("GLKVector3AllGreaterThanOrEqualToVector3")
    public static native boolean allGreaterThanOrEqualToVector3(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllGreaterThanOrEqualToScalar")
    public static native boolean allGreaterThanOrEqualToScalar(GLKVector3 vector, float value);
    @GlobalFunction("GLKVector3Normalize")
    public static native GLKVector3 normalize(GLKVector3 vector);
    @GlobalFunction("GLKVector3DotProduct")
    public static native float dotProduct(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Length")
    public static native float length(GLKVector3 vector);
    @GlobalFunction("GLKVector3Distance")
    public static native float distance(GLKVector3 vectorStart, GLKVector3 vectorEnd);
    @GlobalFunction("GLKVector3Lerp")
    public static native GLKVector3 lerp(GLKVector3 vectorStart, GLKVector3 vectorEnd, float t);
    @GlobalFunction("GLKVector3CrossProduct")
    public static native GLKVector3 crossProduct(GLKVector3 vectorLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Project")
    public static native GLKVector3 project(GLKVector3 vectorToProject, GLKVector3 projectionVector);
    
}
