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





@Mapping("GLKVector4") @Library("GLKit/GLKit.h")
public class GLKVector4 
    extends Struct 
     {

    
    private GLKVector4() {}
    
    
    
    
    
    @GlobalFunction("GLKVector4Make")
    public static native GLKVector4 createPrime(float x, float y, float z, float w);
    @GlobalFunction("GLKVector4MakeWithArray")
    public static native GLKVector4 createPrime(FloatBuffer values);
    @GlobalFunction("GLKVector4MakeWithVector3")
    public static native GLKVector4 createPrime(GLKVector3 vector, float w);
    @GlobalFunction("GLKVector4Negate")
    public static native GLKVector4 negate(GLKVector4 vector);
    @GlobalFunction("GLKVector4Add")
    public static native GLKVector4 add(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Subtract")
    public static native GLKVector4 subtract(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Multiply")
    public static native GLKVector4 multiply(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Divide")
    public static native GLKVector4 divide(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AddScalar")
    public static native GLKVector4 addScalar(GLKVector4 vector, float value);
    @GlobalFunction("GLKVector4SubtractScalar")
    public static native GLKVector4 subtractScalar(GLKVector4 vector, float value);
    @GlobalFunction("GLKVector4MultiplyScalar")
    public static native GLKVector4 multiplyScalar(GLKVector4 vector, float value);
    @GlobalFunction("GLKVector4DivideScalar")
    public static native GLKVector4 divideScalar(GLKVector4 vector, float value);
    @GlobalFunction("GLKVector4Maximum")
    public static native GLKVector4 maximum(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Minimum")
    public static native GLKVector4 minimum(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllEqualToVector4")
    public static native boolean allEqualToVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllEqualToScalar")
    public static native boolean allEqualToScalar(GLKVector4 vector, float value);
    @GlobalFunction("GLKVector4AllGreaterThanVector4")
    public static native boolean allGreaterThanVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllGreaterThanScalar")
    public static native boolean allGreaterThanScalar(GLKVector4 vector, float value);
    @GlobalFunction("GLKVector4AllGreaterThanOrEqualToVector4")
    public static native boolean allGreaterThanOrEqualToVector4(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4AllGreaterThanOrEqualToScalar")
    public static native boolean allGreaterThanOrEqualToScalar(GLKVector4 vector, float value);
    @GlobalFunction("GLKVector4Normalize")
    public static native GLKVector4 normalize(GLKVector4 vector);
    @GlobalFunction("GLKVector4DotProduct")
    public static native float dotProduct(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Length")
    public static native float length(GLKVector4 vector);
    @GlobalFunction("GLKVector4Distance")
    public static native float distance(GLKVector4 vectorStart, GLKVector4 vectorEnd);
    @GlobalFunction("GLKVector4Lerp")
    public static native GLKVector4 lerp(GLKVector4 vectorStart, GLKVector4 vectorEnd, float t);
    @GlobalFunction("GLKVector4CrossProduct")
    public static native GLKVector4 crossProduct(GLKVector4 vectorLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKVector4Project")
    public static native GLKVector4 project(GLKVector4 vectorToProject, GLKVector4 projectionVector);
    
}
