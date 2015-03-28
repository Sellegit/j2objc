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


@Mapping("GLKMatrix3") @Library("GLKit/GLKit.h")
public class GLKMatrix3 
    extends Struct 
     {

    
    private GLKMatrix3() {}
    
    


    
    @GlobalConstant("GLKMatrix3Identity")
    public static native GLKMatrix3 Identity();

    @GlobalFunction("GLKMatrix3Make")
    public static native GLKMatrix3 createPrime(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22);
    @GlobalFunction("GLKMatrix3MakeAndTranspose")
    public static native GLKMatrix3 createAndTranspose(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22);
    @GlobalFunction("GLKMatrix3MakeWithArray")
    public static native GLKMatrix3 createPrime(FloatBuffer values);
    @GlobalFunction("GLKMatrix3MakeWithArrayAndTranspose")
    public static native GLKMatrix3 createAndTranspose(FloatBuffer values);
    @GlobalFunction("GLKMatrix3MakeWithRows")
    public static native GLKMatrix3 createWithRows(GLKVector3 row0, GLKVector3 row1, GLKVector3 row2);
    @GlobalFunction("GLKMatrix3MakeWithColumns")
    public static native GLKMatrix3 createWithColumns(GLKVector3 column0, GLKVector3 column1, GLKVector3 column2);
    @GlobalFunction("GLKMatrix3MakeWithQuaternion")
    public static native GLKMatrix3 createPrime(GLKQuaternion quaternion);
    @GlobalFunction("GLKMatrix3MakeScale")
    public static native GLKMatrix3 createScale(float sx, float sy, float sz);
    @GlobalFunction("GLKMatrix3MakeRotation")
    public static native GLKMatrix3 createRotation(float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrix3MakeXRotation")
    public static native GLKMatrix3 createXRotation(float radians);
    @GlobalFunction("GLKMatrix3MakeYRotation")
    public static native GLKMatrix3 createYRotation(float radians);
    @GlobalFunction("GLKMatrix3MakeZRotation")
    public static native GLKMatrix3 createZRotation(float radians);
    @GlobalFunction("GLKMatrix3GetMatrix2")
    public static native GLKMatrix2 getMatrix2(GLKMatrix3 matrix);
    @GlobalFunction("GLKMatrix3GetRow")
    public static native GLKVector3 getRow(GLKMatrix3 matrix, int row);
    @GlobalFunction("GLKMatrix3GetColumn")
    public static native GLKVector3 getColumn(GLKMatrix3 matrix, int column);
    @GlobalFunction("GLKMatrix3SetRow")
    public static native GLKMatrix3 setRow(GLKMatrix3 matrix, int row, GLKVector3 vector);
    @GlobalFunction("GLKMatrix3SetColumn")
    public static native GLKMatrix3 setColumn(GLKMatrix3 matrix, int column, GLKVector3 vector);
    @GlobalFunction("GLKMatrix3Transpose")
    public static native GLKMatrix3 transpose(GLKMatrix3 matrix);
    @GlobalFunction("GLKMatrix3Invert")
    public static native GLKMatrix3 invert(GLKMatrix3 matrix, Todo isInvertible);
    @GlobalFunction("GLKMatrix3InvertAndTranspose")
    public static native GLKMatrix3 invertAndTranspose(GLKMatrix3 matrix, Todo isInvertible);
    @GlobalFunction("GLKMatrix3Multiply")
    public static native GLKMatrix3 multiply(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight);
    @GlobalFunction("GLKMatrix3Add")
    public static native GLKMatrix3 add(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight);
    @GlobalFunction("GLKMatrix3Subtract")
    public static native GLKMatrix3 subtract(GLKMatrix3 matrixLeft, GLKMatrix3 matrixRight);
    @GlobalFunction("GLKMatrix3Scale")
    public static native GLKMatrix3 scale(GLKMatrix3 matrix, float sx, float sy, float sz);
    @GlobalFunction("GLKMatrix3ScaleWithVector3")
    public static native GLKMatrix3 scale(GLKMatrix3 matrix, GLKVector3 scaleVector);
    @GlobalFunction("GLKMatrix3ScaleWithVector4")
    public static native GLKMatrix3 scale(GLKMatrix3 matrix, GLKVector4 scaleVector);
    @GlobalFunction("GLKMatrix3Rotate")
    public static native GLKMatrix3 rotate(GLKMatrix3 matrix, float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrix3RotateWithVector3")
    public static native GLKMatrix3 rotate(GLKMatrix3 matrix, float radians, GLKVector3 axisVector);
    @GlobalFunction("GLKMatrix3RotateWithVector4")
    public static native GLKMatrix3 rotate(GLKMatrix3 matrix, float radians, GLKVector4 axisVector);
    @GlobalFunction("GLKMatrix3RotateX")
    public static native GLKMatrix3 rotateX(GLKMatrix3 matrix, float radians);
    @GlobalFunction("GLKMatrix3RotateY")
    public static native GLKMatrix3 rotateY(GLKMatrix3 matrix, float radians);
    @GlobalFunction("GLKMatrix3RotateZ")
    public static native GLKMatrix3 rotateZ(GLKMatrix3 matrix, float radians);
    @GlobalFunction("GLKMatrix3MultiplyVector3")
    public static native GLKVector3 multiplyVector3(GLKMatrix3 matrixLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKMatrix3MultiplyVector3Array")
    public static native void multiplyVector3Array(GLKMatrix3 matrix, GLKVector3 vectors, @MachineSizedUInt long vectorCount);

}
