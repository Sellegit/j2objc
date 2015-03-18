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





@Mapping("CGPoint") @Library("CoreGraphics/CoreGraphics.h")
public class CGPoint 
    extends Struct 
     {

    
    private CGPoint() {}
    
    
    @DotMapping("x")
    public native @MachineSizedFloat double getX();
    @DotMapping("y")
    public native @MachineSizedFloat double getY();
    
    public static native CGPoint create(@MachineSizedFloat double x, @MachineSizedFloat double y) /*-[
        CGPoint __new = { .x = x, .y = y };
        return __new;
    ]-*/;
    public static native CGPoint copyWithx(CGPoint original, @MachineSizedFloat double x) /*-[
        CGPoint __new = { .x = x, .y = original.y };
        return __new;
    ]-*/;

    
    public static native CGPoint copyWithy(CGPoint original, @MachineSizedFloat double y) /*-[
        CGPoint __new = { .x = original.x, .y = y };
        return __new;
    ]-*/;

    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("CGPointZero")
    public static native CGPoint Zero();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPointEqualToPoint")
    public static native boolean equalToPoint(CGPoint point1, CGPoint point2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPointCreateDictionaryRepresentation")
    public static native NSDictionary<NSString, NSNumber> toDictionary(CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPointMakeWithDictionaryRepresentation")
    public static native boolean fromDictionary(NSDictionary<?, ?> dict, CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPointApplyAffineTransform")
    public static native CGPoint apply(CGPoint point, CGAffineTransform t);
    
}
