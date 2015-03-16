package apple.gamecontroller;


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





@Mapping("GCRotationRate") @Library("GameController/GameController.h")
public class GCRotationRate 
    extends Struct 
     {

    
    protected GCRotationRate() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();
    @DotMapping("z")
    public native double getZ();
    
    public static native GCRotationRate create(double x, double y, double z) /*-[
        GCRotationRate __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native GCRotationRate copyWithx(GCRotationRate original, double x) /*-[
        original.x = x;
        return original;
    ]-*/;

    
    public static native GCRotationRate copyWithy(GCRotationRate original, double y) /*-[
        original.y = y;
        return original;
    ]-*/;

    
    public static native GCRotationRate copyWithz(GCRotationRate original, double z) /*-[
        original.z = z;
        return original;
    ]-*/;

    
}
