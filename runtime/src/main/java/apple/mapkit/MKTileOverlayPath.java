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

    
    private MKTileOverlayPath() {}
    
    
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
        MKTileOverlayPath __new = { .x = x, .y = original.y, .z = original.z, .contentScaleFactor = original.contentScaleFactor };
        return __new;
    ]-*/;

    
    public static native MKTileOverlayPath copyWithy(MKTileOverlayPath original, @MachineSizedSInt long y) /*-[
        MKTileOverlayPath __new = { .x = original.x, .y = y, .z = original.z, .contentScaleFactor = original.contentScaleFactor };
        return __new;
    ]-*/;

    
    public static native MKTileOverlayPath copyWithz(MKTileOverlayPath original, @MachineSizedSInt long z) /*-[
        MKTileOverlayPath __new = { .x = original.x, .y = original.y, .z = z, .contentScaleFactor = original.contentScaleFactor };
        return __new;
    ]-*/;

    
    public static native MKTileOverlayPath copyWithcontentScaleFactor(MKTileOverlayPath original, @MachineSizedFloat double contentScaleFactor) /*-[
        MKTileOverlayPath __new = { .x = original.x, .y = original.y, .z = original.z, .contentScaleFactor = contentScaleFactor };
        return __new;
    ]-*/;

    
}
