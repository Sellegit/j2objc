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


@Mapping("GLKVector2") @Library("GLKit/GLKit.h")
public class GLKVector2 
    extends Struct 
     {

    
    private GLKVector2() {}
    
    


    
    @GlobalFunction("GLKVector2Make")
    public static native GLKVector2 createPrime(float x, float y);
    @GlobalFunction("GLKVector2MakeWithArray")
    public static native GLKVector2 createPrime(FloatBuffer values);
    @GlobalFunction("GLKVector2Negate")
    public static native GLKVector2 negate(GLKVector2 vector);
    @GlobalFunction("GLKVector2Add")
    public static native GLKVector2 add(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Subtract")
    public static native GLKVector2 subtract(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Multiply")
    public static native GLKVector2 multiply(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Divide")
    public static native GLKVector2 divide(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AddScalar")
    public static native GLKVector2 addScalar(GLKVector2 vector, float value);
    @GlobalFunction("GLKVector2SubtractScalar")
    public static native GLKVector2 subtractScalar(GLKVector2 vector, float value);
    @GlobalFunction("GLKVector2MultiplyScalar")
    public static native GLKVector2 multiplyScalar(GLKVector2 vector, float value);
    @GlobalFunction("GLKVector2DivideScalar")
    public static native GLKVector2 divideScalar(GLKVector2 vector, float value);
    @GlobalFunction("GLKVector2Maximum")
    public static native GLKVector2 maximum(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Minimum")
    public static native GLKVector2 minimum(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllEqualToVector2")
    public static native boolean allEqualToVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllEqualToScalar")
    public static native boolean allEqualToScalar(GLKVector2 vector, float value);
    @GlobalFunction("GLKVector2AllGreaterThanVector2")
    public static native boolean allGreaterThanVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllGreaterThanScalar")
    public static native boolean allGreaterThanScalar(GLKVector2 vector, float value);
    @GlobalFunction("GLKVector2AllGreaterThanOrEqualToVector2")
    public static native boolean allGreaterThanOrEqualToVector2(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2AllGreaterThanOrEqualToScalar")
    public static native boolean allGreaterThanOrEqualToScalar(GLKVector2 vector, float value);
    @GlobalFunction("GLKVector2Normalize")
    public static native GLKVector2 normalize(GLKVector2 vector);
    @GlobalFunction("GLKVector2DotProduct")
    public static native float dotProduct(GLKVector2 vectorLeft, GLKVector2 vectorRight);
    @GlobalFunction("GLKVector2Length")
    public static native float length(GLKVector2 vector);
    @GlobalFunction("GLKVector2Distance")
    public static native float distance(GLKVector2 vectorStart, GLKVector2 vectorEnd);
    @GlobalFunction("GLKVector2Lerp")
    public static native GLKVector2 lerp(GLKVector2 vectorStart, GLKVector2 vectorEnd, float t);
    @GlobalFunction("GLKVector2Project")
    public static native GLKVector2 project(GLKVector2 vectorToProject, GLKVector2 projectionVector);

}
