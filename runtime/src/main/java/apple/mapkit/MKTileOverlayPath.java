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





@Mapping("MKTileOverlayPath") @Library("MapKit/MapKit.h")
public class MKTileOverlayPath 
    extends Struct 
     {

    
    protected MKTileOverlayPath() {}
    
    
    @DotMapping("x")
    public native @MachineSizedSInt long getX();
    @DotMapping("y")
    public native @MachineSizedSInt long getY();
    @DotMapping("z")
    public native @MachineSizedSInt long getZ();
    @DotMapping("contentScaleFactor")
    public native @MachineSizedFloat double getContentScaleFactor();
    
    public static native MKTileOverlayPath create(@MachineSizedSInt long x, @MachineSizedSInt long y, @MachineSizedSInt long z, @MachineSizedFloat double contentScaleFactor) /*-[
        MKTileOverlayPath __new = { .x = x, .y = y, .z = z, .contentScaleFactor = contentScaleFactor };
        return __new;
    ]-*/;
    public static native MKTileOverlayPath copyWithx(MKTileOverlayPath original, @MachineSizedSInt long x) /*-[
        original.x = x;
        return original;
    ]-*/;

    
    public static native MKTileOverlayPath copyWithy(MKTileOverlayPath original, @MachineSizedSInt long y) /*-[
        original.y = y;
        return original;
    ]-*/;

    
    public static native MKTileOverlayPath copyWithz(MKTileOverlayPath original, @MachineSizedSInt long z) /*-[
        original.z = z;
        return original;
    ]-*/;

    
    public static native MKTileOverlayPath copyWithcontentScaleFactor(MKTileOverlayPath original, @MachineSizedFloat double contentScaleFactor) /*-[
        original.contentScaleFactor = contentScaleFactor;
        return original;
    ]-*/;

    
}
