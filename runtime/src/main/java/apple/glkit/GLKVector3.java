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





@Mapping("GLKVector3") @Library("GLKit")
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
        return __new;
    ]-*/;

    
    @GlobalFunction("GLKVector3Make")
    public static native GLKVector3 createPrime(float x, float y, float z);
    @GlobalFunction("GLKVector3MakeWithArray")
    public static native GLKVector3 createPrime(FloatBuffer values);
    @GlobalFunction("GLKVector3Negate")
    public native GLKVector3 negate();
    @GlobalFunction("GLKVector3Add")
    public native GLKVector3 add(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Subtract")
    public native GLKVector3 subtract(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Multiply")
    public native GLKVector3 multiply(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Divide")
    public native GLKVector3 divide(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AddScalar")
    public native GLKVector3 addScalar(float value);
    @GlobalFunction("GLKVector3SubtractScalar")
    public native GLKVector3 subtractScalar(float value);
    @GlobalFunction("GLKVector3MultiplyScalar")
    public native GLKVector3 multiplyScalar(float value);
    @GlobalFunction("GLKVector3DivideScalar")
    public native GLKVector3 divideScalar(float value);
    @GlobalFunction("GLKVector3Maximum")
    public native GLKVector3 maximum(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Minimum")
    public native GLKVector3 minimum(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllEqualToVector3")
    public native boolean allEqualToVector3(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllEqualToScalar")
    public native boolean allEqualToScalar(float value);
    @GlobalFunction("GLKVector3AllGreaterThanVector3")
    public native boolean allGreaterThanVector3(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllGreaterThanScalar")
    public native boolean allGreaterThanScalar(float value);
    @GlobalFunction("GLKVector3AllGreaterThanOrEqualToVector3")
    public native boolean allGreaterThanOrEqualToVector3(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3AllGreaterThanOrEqualToScalar")
    public native boolean allGreaterThanOrEqualToScalar(float value);
    @GlobalFunction("GLKVector3Normalize")
    public native GLKVector3 normalize();
    @GlobalFunction("GLKVector3DotProduct")
    public native float dotProduct(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Length")
    public native float length();
    @GlobalFunction("GLKVector3Distance")
    public native float distance(GLKVector3 vectorEnd);
    @GlobalFunction("GLKVector3Lerp")
    public native GLKVector3 lerp(GLKVector3 vectorEnd, float t);
    @GlobalFunction("GLKVector3CrossProduct")
    public native GLKVector3 crossProduct(GLKVector3 vectorRight);
    @GlobalFunction("GLKVector3Project")
    public native GLKVector3 project(GLKVector3 projectionVector);
    
}
