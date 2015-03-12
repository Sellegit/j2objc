package apple.coremotion;


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





@Mapping("CMRotationMatrix")
public class CMRotationMatrix 
    extends Struct 
     {

    
    protected CMRotationMatrix() {}
    
    
    @DotMapping("m11")
    public native double getM11();
    @DotMapping("m12")
    public native double getM12();
    @DotMapping("m13")
    public native double getM13();
    @DotMapping("m21")
    public native double getM21();
    @DotMapping("m22")
    public native double getM22();
    @DotMapping("m23")
    public native double getM23();
    @DotMapping("m31")
    public native double getM31();
    @DotMapping("m32")
    public native double getM32();
    @DotMapping("m33")
    public native double getM33();
    
    public static native CMRotationMatrix create(double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33) /*-[
        CMRotationMatrix __new = { .m11 = m11, .m12 = m12, .m13 = m13, .m21 = m21, .m22 = m22, .m23 = m23, .m31 = m31, .m32 = m32, .m33 = m33 };
        return __new;
    ]-*/;
    public static native CMRotationMatrix copyWithm11(CMRotationMatrix original, double m11) /*-[
        original.m11 = m11;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm12(CMRotationMatrix original, double m12) /*-[
        original.m12 = m12;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm13(CMRotationMatrix original, double m13) /*-[
        original.m13 = m13;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm21(CMRotationMatrix original, double m21) /*-[
        original.m21 = m21;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm22(CMRotationMatrix original, double m22) /*-[
        original.m22 = m22;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm23(CMRotationMatrix original, double m23) /*-[
        original.m23 = m23;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm31(CMRotationMatrix original, double m31) /*-[
        original.m31 = m31;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm32(CMRotationMatrix original, double m32) /*-[
        original.m32 = m32;
        return original;
    ]-*/;

    
    public static native CMRotationMatrix copyWithm33(CMRotationMatrix original, double m33) /*-[
        original.m33 = m33;
        return original;
    ]-*/;

    
}
