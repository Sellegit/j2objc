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





@Mapping("CGRect") @Library("CoreGraphics")
public class CGRect 
    extends Struct 
     {

    
    protected CGRect() {}
    
    
    @DotMapping("origin")
    public native CGPoint getOrigin();
    @DotMapping("size")
    public native CGSize getSize();
    
    public static native CGRect create(CGPoint origin, CGSize size) /*-[
        CGRect __new = { .origin = origin, .size = size };
        return __new;
    ]-*/;
    public static native CGRect copyWithorigin(CGRect original, CGPoint origin) /*-[
        original.origin = origin;
        return original;
    ]-*/;

    
    public static native CGRect copyWithsize(CGRect original, CGSize size) /*-[
        original.size = size;
        return original;
    ]-*/;

    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("CGRectZero")
    public static native CGRect Zero();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("CGRectNull")
    public static native CGRect Null();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("CGRectInfinite")
    public static native CGRect Infinite();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetMinX")
    public native @MachineSizedFloat double getMinX();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetMidX")
    public native @MachineSizedFloat double getMidX();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetMaxX")
    public native @MachineSizedFloat double getMaxX();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetMinY")
    public native @MachineSizedFloat double getMinY();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetMidY")
    public native @MachineSizedFloat double getMidY();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetMaxY")
    public native @MachineSizedFloat double getMaxY();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetWidth")
    public native @MachineSizedFloat double getWidth();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectGetHeight")
    public native @MachineSizedFloat double getHeight();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectEqualToRect")
    public native boolean equalToRect(CGRect rect2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectStandardize")
    public native CGRect standardize();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectIsEmpty")
    public native boolean isEmpty();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectIsNull")
    public native boolean isNull();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectIsInfinite")
    public native boolean isInfinite();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectInset")
    public native CGRect inset(@MachineSizedFloat double dx, @MachineSizedFloat double dy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectIntegral")
    public native CGRect integral();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectUnion")
    public native CGRect union(CGRect r2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectIntersection")
    public native CGRect intersection(CGRect r2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectOffset")
    public native CGRect offset(@MachineSizedFloat double dx, @MachineSizedFloat double dy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectDivide")
    public native void divide(CGRect slice, CGRect remainder, @MachineSizedFloat double amount, CGRectEdge edge);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectContainsPoint")
    public native boolean contains(CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectContainsRect")
    public native boolean contains(CGRect rect2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectIntersectsRect")
    public native boolean intersects(CGRect rect2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectCreateDictionaryRepresentation")
    public native NSDictionary<NSString, NSNumber> toDictionary();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectMakeWithDictionaryRepresentation")
    private static native boolean fromDictionary(NSDictionary<?, ?> dict, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGRectApplyAffineTransform")
    public native CGRect apply(CGAffineTransform t);
    
}
