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





@Mapping("CGPoint") @Library("CoreGraphics")
public class CGPoint 
    extends Struct 
     {

    
    protected CGPoint() {}
    
    
    @DotMapping("x")
    public native @MachineSizedFloat double getX();
    @DotMapping("y")
    public native @MachineSizedFloat double getY();
    
    public static native CGPoint create(@MachineSizedFloat double x, @MachineSizedFloat double y) /*-[
        CGPoint __new = { .x = x, .y = y };
        return __new;
    ]-*/;
    public static native CGPoint copyWithx(CGPoint original, @MachineSizedFloat double x) /*-[
        original.x = x;
        return original;
    ]-*/;

    
    public static native CGPoint copyWithy(CGPoint original, @MachineSizedFloat double y) /*-[
        original.y = y;
        return original;
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
    public native boolean equalToPoint(CGPoint point2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPointCreateDictionaryRepresentation")
    public native NSDictionary<NSString, NSNumber> toDictionary();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPointMakeWithDictionaryRepresentation")
    private static native boolean fromDictionary(NSDictionary<?, ?> dict, CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPointApplyAffineTransform")
    public native CGPoint apply(CGAffineTransform t);
    
}
