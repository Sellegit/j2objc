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


@Mapping("SCNMatrix4") @Library("SceneKit/SceneKit.h")
public class SCNMatrix4 
    extends Struct 
     {

    
    private SCNMatrix4() {}
    
    
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
        SCNMatrix4 __new = { .m11 = m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm12(SCNMatrix4 original, float m12) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm13(SCNMatrix4 original, float m13) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm14(SCNMatrix4 original, float m14) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm21(SCNMatrix4 original, float m21) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm22(SCNMatrix4 original, float m22) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm23(SCNMatrix4 original, float m23) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm24(SCNMatrix4 original, float m24) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm31(SCNMatrix4 original, float m31) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm32(SCNMatrix4 original, float m32) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm33(SCNMatrix4 original, float m33) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm34(SCNMatrix4 original, float m34) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm41(SCNMatrix4 original, float m41) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm42(SCNMatrix4 original, float m42) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm43(SCNMatrix4 original, float m43) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = m43, .m44 = original.m44 };
        return __new;
    ]-*/;


    public static native SCNMatrix4 copyWithm44(SCNMatrix4 original, float m44) /*-[
        SCNMatrix4 __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = m44 };
        return __new;
    ]-*/;


    public static final class Adapter {

        public float m11;
        public float m12;
        public float m13;
        public float m14;
        public float m21;
        public float m22;
        public float m23;
        public float m24;
        public float m31;
        public float m32;
        public float m33;
        public float m34;
        public float m41;
        public float m42;
        public float m43;
        public float m44;
        public Adapter(float m11, float m12, float m13, float m14, float m21, float m22, float m23, float m24, float m31, float m32, float m33, float m34, float m41, float m42, float m43, float m44) {
            this.m11 = m11;
            this.m12 = m12;
            this.m13 = m13;
            this.m14 = m14;
            this.m21 = m21;
            this.m22 = m22;
            this.m23 = m23;
            this.m24 = m24;
            this.m31 = m31;
            this.m32 = m32;
            this.m33 = m33;
            this.m34 = m34;
            this.m41 = m41;
            this.m42 = m42;
            this.m43 = m43;
            this.m44 = m44;
        }
        public Adapter(SCNMatrix4 original) {
            this.m11 = original.getM11();
            this.m12 = original.getM12();
            this.m13 = original.getM13();
            this.m14 = original.getM14();
            this.m21 = original.getM21();
            this.m22 = original.getM22();
            this.m23 = original.getM23();
            this.m24 = original.getM24();
            this.m31 = original.getM31();
            this.m32 = original.getM32();
            this.m33 = original.getM33();
            this.m34 = original.getM34();
            this.m41 = original.getM41();
            this.m42 = original.getM42();
            this.m43 = original.getM43();
            this.m44 = original.getM44();
        }
        public SCNMatrix4 convert() {
            return create(m11, m12, m13, m14, m21, m22, m23, m24, m31, m32, m33, m34, m41, m42, m43, m44);
        }
    }
    @GlobalConstant("SCNMatrix4Identity")
    public static native SCNMatrix4 Identity();

    @GlobalFunction("SCNMatrix4MakeRotation")
    public static native SCNMatrix4 createRotation(float angle, float x, float y, float z);
    @GlobalFunction("SCNMatrix4Scale")
    public static native SCNMatrix4 scale(SCNMatrix4 mat, float x, float y, float z);
    @GlobalFunction("SCNMatrix4Rotate")
    public static native SCNMatrix4 rotate(SCNMatrix4 mat, float angle, float x, float y, float z);
    @GlobalFunction("SCNMatrix4Invert")
    public static native SCNMatrix4 invert(SCNMatrix4 mat);
    @GlobalFunction("SCNMatrix4Mult")
    public static native SCNMatrix4 mult(SCNMatrix4 matA, SCNMatrix4 matB);
    @GlobalFunction("SCNMatrix4IsIdentity")
    public static native boolean isIdentity(SCNMatrix4 mat);
    @GlobalFunction("SCNMatrix4EqualToMatrix4")
    public static native boolean equalsTo(SCNMatrix4 matA, SCNMatrix4 matB);
    @GlobalFunction("SCNMatrix4ToGLKMatrix4")
    public static native GLKMatrix4 toGLKMatrix4(SCNMatrix4 mat);
    @GlobalFunction("SCNMatrix4FromGLKMatrix4")
    public static native SCNMatrix4 fromGLKMatrix4(GLKMatrix4 mat);

}
