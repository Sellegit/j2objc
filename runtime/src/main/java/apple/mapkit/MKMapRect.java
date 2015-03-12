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





@Mapping("MKMapRect") @Library("MapKit")
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
    public native MKMapRect union(MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectIntersection")
    public native MKMapRect intersection(MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectInset")
    public native MKMapRect inset(double dx, double dy);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectOffset")
    public native MKMapRect offset(double dx, double dy);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectDivide")
    public native void divide(MKMapRect slice, MKMapRect remainder, double amount, CGRectEdge edge);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectContainsPoint")
    public native boolean contains(MKMapPoint point);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectContainsRect")
    public native boolean contains(MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectIntersectsRect")
    public native boolean intersects(MKMapRect rect2);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectSpans180thMeridian")
    public native boolean isSpanning180thMeridian();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapRectRemainder")
    public native MKMapRect remainder();
    
}
