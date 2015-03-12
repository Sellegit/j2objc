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





@Mapping("GLKVector2") @Library("GLKit")
public class GLKVector2 
    extends Struct 
     {

    
    protected GLKVector2() {}
    
    
    @DotMapping("v")
    public native FloatBuffer getV();
    
    public static native GLKVector2 create(FloatBuffer v) /*-[
        GLKVector2 __new = { .v = v };
        return __new;
    ]-*/;
    public static native GLKVector2 copyWithv(GLKVector2 original, FloatBuffer v) /*-[
        original.v = v;
        return original;
    ]-*/;

    
    @GlobalFunction("GLKVector2Make")
    public static native GLKVector2 createPrime(float x, float y);
    @GlobalFunction("GLKVector2MakeWithArray")
    public static native GLKVector2 createPrime(FloatBuffer values);
    @GlobalFunction("GLKVector2Negate")
    public native GLKVector2 negate();
    @GlobalFunction("GLKVector2Add")
    public native GLKVector2 add(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Subtract")
    public native GLKVector2 subtract(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Multiply")
    public native GLKVector2 multiply(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Divide")
    public native GLKVector2 divide(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AddScalar")
    public native GLKVector2 addScalar(float value);
    @GlobalFunction("GLKVector2SubtractScalar")
    public native GLKVector2 subtractScalar(float value);
    @GlobalFunction("GLKVector2MultiplyScalar")
    public native GLKVector2 multiplyScalar(float value);
    @GlobalFunction("GLKVector2DivideScalar")
    public native GLKVector2 divideScalar(float value);
    @GlobalFunction("GLKVector2Maximum")
    public native GLKVector2 maximum(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Minimum")
    public native GLKVector2 minimum(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllEqualToVector2")
    public native boolean allEqualToVector2(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllEqualToScalar")
    public native boolean allEqualToScalar(float value);
    @GlobalFunction("GLKVector2AllGreaterThanVector2")
    public native boolean allGreaterThanVector2(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllGreaterThanScalar")
    public native boolean allGreaterThanScalar(float value);
    @GlobalFunction("GLKVector2AllGreaterThanOrEqualToVector2")
    public native boolean allGreaterThanOrEqualToVector2(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllGreaterThanOrEqualToScalar")
    public native boolean allGreaterThanOrEqualToScalar(float value);
    @GlobalFunction("GLKVector2Normalize")
    public native GLKVector2 normalize();
    @GlobalFunction("GLKVector2DotProduct")
    public native float dotProduct(GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Length")
    public native float length();
    @GlobalFunction("GLKVector2Distance")
    public native float distance(GLKVector2 vectorEnd);
    @GlobalFunction("GLKVector2Lerp")
    public native GLKVector2 lerp(GLKVector2 vectorEnd, float t);
    @GlobalFunction("GLKVector2Project")
    public native GLKVector2 project(GLKVector2 projectionVector);
    
}
