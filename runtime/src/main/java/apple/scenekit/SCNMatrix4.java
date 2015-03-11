package apple.scenekit;


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
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;





@Mapping("SCNMatrix4") @Library("SceneKit")
public class SCNMatrix4 
    extends Struct 
     {

    
    protected SCNMatrix4() {}
    
    
    @DotMapping("m11")
    public native float getM11();
    @DotMapping("m12")
    public native float getM12();
    @DotMapping("m13")
    public native float getM13();
    @DotMapping("m14")
    public native float getM14();
    @DotMapping("m21")
    public native float getM21();
    @DotMapping("m22")
    public native float getM22();
    @DotMapping("m23")
    public native float getM23();
    @DotMapping("m24")
    public native float getM24();
    @DotMapping("m31")
    public native float getM31();
    @DotMapping("m32")
    public native float getM32();
    @DotMapping("m33")
    public native float getM33();
    @DotMapping("m34")
    public native float getM34();
    @DotMapping("m41")
    public native float getM41();
    @DotMapping("m42")
    public native float getM42();
    @DotMapping("m43")
    public native float getM43();
    @DotMapping("m44")
    public native float getM44();
    
    public static native SCNMatrix4 create(float m11, float m12, float m13, float m14, float m21, float m22, float m23, float m24, float m31, float m32, float m33, float m34, float m41, float m42, float m43, float m44) /*-[
        SCNMatrix4 __new = { .m11 = m11, .m12 = m12, .m13 = m13, .m14 = m14, .m21 = m21, .m22 = m22, .m23 = m23, .m24 = m24, .m31 = m31, .m32 = m32, .m33 = m33, .m34 = m34, .m41 = m41, .m42 = m42, .m43 = m43, .m44 = m44 };
        return __new;
    ]-*/;
    public static native SCNMatrix4 copyWithm11(SCNMatrix4 original, float m11) /*-[
        original.m11 = m11;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm12(SCNMatrix4 original, float m12) /*-[
        original.m12 = m12;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm13(SCNMatrix4 original, float m13) /*-[
        original.m13 = m13;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm14(SCNMatrix4 original, float m14) /*-[
        original.m14 = m14;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm21(SCNMatrix4 original, float m21) /*-[
        original.m21 = m21;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm22(SCNMatrix4 original, float m22) /*-[
        original.m22 = m22;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm23(SCNMatrix4 original, float m23) /*-[
        original.m23 = m23;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm24(SCNMatrix4 original, float m24) /*-[
        original.m24 = m24;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm31(SCNMatrix4 original, float m31) /*-[
        original.m31 = m31;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm32(SCNMatrix4 original, float m32) /*-[
        original.m32 = m32;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm33(SCNMatrix4 original, float m33) /*-[
        original.m33 = m33;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm34(SCNMatrix4 original, float m34) /*-[
        original.m34 = m34;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm41(SCNMatrix4 original, float m41) /*-[
        original.m41 = m41;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm42(SCNMatrix4 original, float m42) /*-[
        original.m42 = m42;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm43(SCNMatrix4 original, float m43) /*-[
        original.m43 = m43;
        return __new;
    ]-*/;

    
    public static native SCNMatrix4 copyWithm44(SCNMatrix4 original, float m44) /*-[
        original.m44 = m44;
        return __new;
    ]-*/;

    
    @GlobalConstant("SCNMatrix4Identity")
    public static native SCNMatrix4 Identity();
    
    @GlobalFunction("SCNMatrix4MakeRotation")
    public static native SCNMatrix4 createRotation(float angle, float x, float y, float z);
    @GlobalFunction("SCNMatrix4Scale")
    public native SCNMatrix4 scale(float x, float y, float z);
    @GlobalFunction("SCNMatrix4Rotate")
    public native SCNMatrix4 rotate(float angle, float x, float y, float z);
    @GlobalFunction("SCNMatrix4Invert")
    public native SCNMatrix4 invert();
    @GlobalFunction("SCNMatrix4Mult")
    public native SCNMatrix4 mult(SCNMatrix4 matB);
    @GlobalFunction("SCNMatrix4IsIdentity")
    public native boolean isIdentity();
    @GlobalFunction("SCNMatrix4EqualToMatrix4")
    public native boolean equalsTo(SCNMatrix4 matB);
    @GlobalFunction("SCNMatrix4ToGLKMatrix4")
    public native GLKMatrix4 toGLKMatrix4();
    @GlobalFunction("SCNMatrix4FromGLKMatrix4")
    public static native SCNMatrix4 fromGLKMatrix4(GLKMatrix4 mat);
    
}
