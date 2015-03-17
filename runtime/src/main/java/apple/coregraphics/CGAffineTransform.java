package apple.coregraphics;


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





@Mapping("CGAffineTransform") @Library("CoreGraphics/CoreGraphics.h")
public class CGAffineTransform 
    extends Struct 
     {

    
    protected CGAffineTransform() {}
    
    
    @DotMapping("a")
    public native @MachineSizedFloat double getA();
    @DotMapping("b")
    public native @MachineSizedFloat double getB();
    @DotMapping("c")
    public native @MachineSizedFloat double getC();
    @DotMapping("d")
    public native @MachineSizedFloat double getD();
    @DotMapping("tx")
    public native @MachineSizedFloat double getTx();
    @DotMapping("ty")
    public native @MachineSizedFloat double getTy();
    
    public static native CGAffineTransform create(@MachineSizedFloat double a, @MachineSizedFloat double b, @MachineSizedFloat double c, @MachineSizedFloat double d, @MachineSizedFloat double tx, @MachineSizedFloat double ty) /*-[
        CGAffineTransform __new = { .a = a, .b = b, .c = c, .d = d, .tx = tx, .ty = ty };
        return __new;
    ]-*/;
    public static native CGAffineTransform copyWitha(CGAffineTransform original, @MachineSizedFloat double a) /*-[
        CGAffineTransform __new = { .a = a, .b = original.b, .c = original.c, .d = original.d, .tx = original.tx, .ty = original.ty };
        return __new;
    ]-*/;

    
    public static native CGAffineTransform copyWithb(CGAffineTransform original, @MachineSizedFloat double b) /*-[
        CGAffineTransform __new = { .a = original.a, .b = b, .c = original.c, .d = original.d, .tx = original.tx, .ty = original.ty };
        return __new;
    ]-*/;

    
    public static native CGAffineTransform copyWithc(CGAffineTransform original, @MachineSizedFloat double c) /*-[
        CGAffineTransform __new = { .a = original.a, .b = original.b, .c = c, .d = original.d, .tx = original.tx, .ty = original.ty };
        return __new;
    ]-*/;

    
    public static native CGAffineTransform copyWithd(CGAffineTransform original, @MachineSizedFloat double d) /*-[
        CGAffineTransform __new = { .a = original.a, .b = original.b, .c = original.c, .d = d, .tx = original.tx, .ty = original.ty };
        return __new;
    ]-*/;

    
    public static native CGAffineTransform copyWithtx(CGAffineTransform original, @MachineSizedFloat double tx) /*-[
        CGAffineTransform __new = { .a = original.a, .b = original.b, .c = original.c, .d = original.d, .tx = tx, .ty = original.ty };
        return __new;
    ]-*/;

    
    public static native CGAffineTransform copyWithty(CGAffineTransform original, @MachineSizedFloat double ty) /*-[
        CGAffineTransform __new = { .a = original.a, .b = original.b, .c = original.c, .d = original.d, .tx = original.tx, .ty = ty };
        return __new;
    ]-*/;

    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("CGAffineTransformIdentity")
    public static native CGAffineTransform Identity();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformMakeTranslation")
    public static native CGAffineTransform createTranslation(@MachineSizedFloat double tx, @MachineSizedFloat double ty);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformMakeScale")
    public static native CGAffineTransform createScale(@MachineSizedFloat double sx, @MachineSizedFloat double sy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformMakeRotation")
    public static native CGAffineTransform createRotation(@MachineSizedFloat double angle);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformIsIdentity")
    public static native boolean isIdentity(CGAffineTransform t);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformTranslate")
    public static native CGAffineTransform translate(CGAffineTransform t, @MachineSizedFloat double tx, @MachineSizedFloat double ty);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformScale")
    public static native CGAffineTransform scale(CGAffineTransform t, @MachineSizedFloat double sx, @MachineSizedFloat double sy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformRotate")
    public static native CGAffineTransform rotate(CGAffineTransform t, @MachineSizedFloat double angle);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformInvert")
    public static native CGAffineTransform invert(CGAffineTransform t);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformConcat")
    public static native CGAffineTransform concat(CGAffineTransform t1, CGAffineTransform t2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGAffineTransformEqualToTransform")
    public static native boolean equalToTransform(CGAffineTransform t1, CGAffineTransform t2);
    
}
