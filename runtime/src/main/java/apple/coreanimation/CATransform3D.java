package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;





@Mapping("CATransform3D") @Library("QuartzCore/QuartzCore.h")
public class CATransform3D 
    extends Struct 
     {

    
    private CATransform3D() {}
    
    
    @DotMapping("m11")
    public native @MachineSizedFloat double getM11();
    @DotMapping("m12")
    public native @MachineSizedFloat double getM12();
    @DotMapping("m13")
    public native @MachineSizedFloat double getM13();
    @DotMapping("m14")
    public native @MachineSizedFloat double getM14();
    @DotMapping("m21")
    public native @MachineSizedFloat double getM21();
    @DotMapping("m22")
    public native @MachineSizedFloat double getM22();
    @DotMapping("m23")
    public native @MachineSizedFloat double getM23();
    @DotMapping("m24")
    public native @MachineSizedFloat double getM24();
    @DotMapping("m31")
    public native @MachineSizedFloat double getM31();
    @DotMapping("m32")
    public native @MachineSizedFloat double getM32();
    @DotMapping("m33")
    public native @MachineSizedFloat double getM33();
    @DotMapping("m34")
    public native @MachineSizedFloat double getM34();
    @DotMapping("m41")
    public native @MachineSizedFloat double getM41();
    @DotMapping("m42")
    public native @MachineSizedFloat double getM42();
    @DotMapping("m43")
    public native @MachineSizedFloat double getM43();
    @DotMapping("m44")
    public native @MachineSizedFloat double getM44();
    
    public static native CATransform3D create(@MachineSizedFloat double m11, @MachineSizedFloat double m12, @MachineSizedFloat double m13, @MachineSizedFloat double m14, @MachineSizedFloat double m21, @MachineSizedFloat double m22, @MachineSizedFloat double m23, @MachineSizedFloat double m24, @MachineSizedFloat double m31, @MachineSizedFloat double m32, @MachineSizedFloat double m33, @MachineSizedFloat double m34, @MachineSizedFloat double m41, @MachineSizedFloat double m42, @MachineSizedFloat double m43, @MachineSizedFloat double m44) /*-[
        CATransform3D __new = { .m11 = m11, .m12 = m12, .m13 = m13, .m14 = m14, .m21 = m21, .m22 = m22, .m23 = m23, .m24 = m24, .m31 = m31, .m32 = m32, .m33 = m33, .m34 = m34, .m41 = m41, .m42 = m42, .m43 = m43, .m44 = m44 };
        return __new;
    ]-*/;
    public static native CATransform3D copyWithm11(CATransform3D original, @MachineSizedFloat double m11) /*-[
        CATransform3D __new = { .m11 = m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm12(CATransform3D original, @MachineSizedFloat double m12) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm13(CATransform3D original, @MachineSizedFloat double m13) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm14(CATransform3D original, @MachineSizedFloat double m14) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm21(CATransform3D original, @MachineSizedFloat double m21) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm22(CATransform3D original, @MachineSizedFloat double m22) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm23(CATransform3D original, @MachineSizedFloat double m23) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm24(CATransform3D original, @MachineSizedFloat double m24) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm31(CATransform3D original, @MachineSizedFloat double m31) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm32(CATransform3D original, @MachineSizedFloat double m32) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm33(CATransform3D original, @MachineSizedFloat double m33) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm34(CATransform3D original, @MachineSizedFloat double m34) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm41(CATransform3D original, @MachineSizedFloat double m41) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = m41, .m42 = original.m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm42(CATransform3D original, @MachineSizedFloat double m42) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = m42, .m43 = original.m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm43(CATransform3D original, @MachineSizedFloat double m43) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = m43, .m44 = original.m44 };
        return __new;
    ]-*/;

    
    public static native CATransform3D copyWithm44(CATransform3D original, @MachineSizedFloat double m44) /*-[
        CATransform3D __new = { .m11 = original.m11, .m12 = original.m12, .m13 = original.m13, .m14 = original.m14, .m21 = original.m21, .m22 = original.m22, .m23 = original.m23, .m24 = original.m24, .m31 = original.m31, .m32 = original.m32, .m33 = original.m33, .m34 = original.m34, .m41 = original.m41, .m42 = original.m42, .m43 = original.m43, .m44 = m44 };
        return __new;
    ]-*/;

    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("CATransform3DIdentity")
    public static native CATransform3D Identity();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DIsIdentity")
    public static native boolean isIdentity(CATransform3D t);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DEqualToTransform")
    public static native boolean equalToTransform(CATransform3D a, CATransform3D b);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DMakeTranslation")
    public static native CATransform3D createTranslation(@MachineSizedFloat double tx, @MachineSizedFloat double ty, @MachineSizedFloat double tz);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DMakeScale")
    public static native CATransform3D createScale(@MachineSizedFloat double sx, @MachineSizedFloat double sy, @MachineSizedFloat double sz);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DMakeRotation")
    public static native CATransform3D createRotation(@MachineSizedFloat double angle, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double z);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DTranslate")
    public static native CATransform3D translate(CATransform3D t, @MachineSizedFloat double tx, @MachineSizedFloat double ty, @MachineSizedFloat double tz);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DScale")
    public static native CATransform3D scale(CATransform3D t, @MachineSizedFloat double sx, @MachineSizedFloat double sy, @MachineSizedFloat double sz);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DRotate")
    public static native CATransform3D rotate(CATransform3D t, @MachineSizedFloat double angle, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double z);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DConcat")
    public static native CATransform3D concat(CATransform3D a, CATransform3D b);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DInvert")
    public static native CATransform3D invert(CATransform3D t);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DMakeAffineTransform")
    public static native CATransform3D createAffineTransform(CGAffineTransform m);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DIsAffine")
    public static native boolean isAffine(CATransform3D t);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CATransform3DGetAffineTransform")
    public static native CGAffineTransform getAffineTransform(CATransform3D t);
    
}
