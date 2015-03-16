package apple.mapkit;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;





@Mapping("MKMapRect") @Library("MapKit/MapKit.h")
public class MKMapRect 
    extends Struct 
     {

    
    protected MKMapRect() {}
    
    
    @DotMapping("origin")
    public native MKMapPoint getOrigin();
    @DotMapping("size")
    public native MKMapSize getSize();
    
    public static native MKMapRect create(MKMapPoint origin, MKMapSize size) /*-[
        MKMapRect __new = { .origin = origin, .size = size };
        return __new;
    ]-*/;
    public static native MKMapRect copyWithorigin(MKMapRect original, MKMapPoint origin) /*-[
        original.origin = origin;
        return original;
    ]-*/;

    
    public static native MKMapRect copyWithsize(MKMapRect original, MKMapSize size) /*-[
        original.size = size;
        return original;
    ]-*/;

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MKMapRectWorld")
    public static native MKMapRect getWorldRect();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MKMapRectNull")
    public static native MKMapRect getNullRect();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectUnion")
    public static native MKMapRect union(MKMapRect rect1, MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectIntersection")
    public static native MKMapRect intersection(MKMapRect rect1, MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectInset")
    public static native MKMapRect inset(MKMapRect rect, double dx, double dy);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectOffset")
    public static native MKMapRect offset(MKMapRect rect, double dx, double dy);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectDivide")
    public static native void divide(MKMapRect rect, MKMapRect slice, MKMapRect remainder, double amount, CGRectEdge edge);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectContainsPoint")
    public static native boolean contains(MKMapRect rect, MKMapPoint point);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectContainsRect")
    public static native boolean contains(MKMapRect rect1, MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectIntersectsRect")
    public static native boolean intersects(MKMapRect rect1, MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectSpans180thMeridian")
    public static native boolean isSpanning180thMeridian(MKMapRect rect);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectRemainder")
    public static native MKMapRect remainder(MKMapRect rect);
    
}
