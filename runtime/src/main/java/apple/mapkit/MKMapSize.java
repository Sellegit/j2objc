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





@Mapping("MKMapSize") @Library("MapKit/MapKit.h")
public class MKMapSize 
    extends Struct 
     {

    
    protected MKMapSize() {}
    
    
    @DotMapping("width")
    public native double getWidth();
    @DotMapping("height")
    public native double getHeight();
    
    public static native MKMapSize create(double width, double height) /*-[
        MKMapSize __new = { .width = width, .height = height };
        return __new;
    ]-*/;
    public static native MKMapSize copyWithwidth(MKMapSize original, double width) /*-[
        original.width = width;
        return original;
    ]-*/;

    
    public static native MKMapSize copyWithheight(MKMapSize original, double height) /*-[
        original.height = height;
        return original;
    ]-*/;

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MKMapSizeWorld")
    public static native MKMapSize getWorldSize();
    
}
