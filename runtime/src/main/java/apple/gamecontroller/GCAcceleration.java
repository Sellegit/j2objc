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





@Mapping("GCAcceleration") @Library("GameController/GameController.h")
public class GCAcceleration 
    extends Struct 
     {

    
    private GCAcceleration() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();
    @DotMapping("z")
    public native double getZ();
    
    public static native GCAcceleration create(double x, double y, double z) /*-[
        GCAcceleration __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native GCAcceleration copyWithx(GCAcceleration original, double x) /*-[
        GCAcceleration __new = { .x = x, .y = original.y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native GCAcceleration copyWithy(GCAcceleration original, double y) /*-[
        GCAcceleration __new = { .x = original.x, .y = y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native GCAcceleration copyWithz(GCAcceleration original, double z) /*-[
        GCAcceleration __new = { .x = original.x, .y = original.y, .z = z };
        return __new;
    ]-*/;

    
}
