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





@Mapping("GLKVector4") @Library("GLKit")
public class GLKVector4 
    extends Struct 
     {

    
    protected GLKVector4() {}
    
    
    @DotMapping("v")
    public native FloatBuffer getV();
    
    public static native GLKVector4 create(FloatBuffer v) /*-[
        GLKVector4 __new = { .v = v };
        return __new;
    ]-*/;
    public static native GLKVector4 copyWithv(GLKVector4 original, FloatBuffer v) /*-[
        original.v = v;
        return original;
    ]-*/;

    
    @GlobalFunction("GLKVector4Make")
    public static native GLKVector4 createPrime(float x, float y, float z, float w);
    @GlobalFunction("GLKVector4MakeWithArray")
    public static native GLKVector4 createPrime(FloatBuffer values);
    @GlobalFunction("GLKVector4MakeWithVector3")
    public static native GLKVector4 createPrime(GLKVector3 vector, float w);
    @GlobalFunction("GLKVector4Negate")
    public native GLKVector4 negate();
    @GlobalFunction("GLKVector4Add")
    public native GLKVector4 add(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Subtract")
    public native GLKVector4 subtract(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Multiply")
    public native GLKVector4 multiply(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Divide")
    public native GLKVector4 divide(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AddScalar")
    public native GLKVector4 addScalar(float value);
    @GlobalFunction("GLKVector4SubtractScalar")
    public native GLKVector4 subtractScalar(float value);
    @GlobalFunction("GLKVector4MultiplyScalar")
    public native GLKVector4 multiplyScalar(float value);
    @GlobalFunction("GLKVector4DivideScalar")
    public native GLKVector4 divideScalar(float value);
    @GlobalFunction("GLKVector4Maximum")
    public native GLKVector4 maximum(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Minimum")
    public native GLKVector4 minimum(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllEqualToVector4")
    public native boolean allEqualToVector4(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllEqualToScalar")
    public native boolean allEqualToScalar(float value);
    @GlobalFunction("GLKVector4AllGreaterThanVector4")
    public native boolean allGreaterThanVector4(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllGreaterThanScalar")
    public native boolean allGreaterThanScalar(float value);
    @GlobalFunction("GLKVector4AllGreaterThanOrEqualToVector4")
    public native boolean allGreaterThanOrEqualToVector4(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllGreaterThanOrEqualToScalar")
    public native boolean allGreaterThanOrEqualToScalar(float value);
    @GlobalFunction("GLKVector4Normalize")
    public native GLKVector4 normalize();
    @GlobalFunction("GLKVector4DotProduct")
    public native float dotProduct(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Length")
    public native float length();
    @GlobalFunction("GLKVector4Distance")
    public native float distance(GLKVector4 vectorEnd);
    @GlobalFunction("GLKVector4Lerp")
    public native GLKVector4 lerp(GLKVector4 vectorEnd, float t);
    @GlobalFunction("GLKVector4CrossProduct")
    public native GLKVector4 crossProduct(GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Project")
    public native GLKVector4 project(GLKVector4 projectionVector);
    
}
