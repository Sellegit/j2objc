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





@Mapping("GCQuaternion") @Library("GameController/GameController.h")
public class GCQuaternion 
    extends Struct 
     {

    
    private GCQuaternion() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();
    @DotMapping("z")
    public native double getZ();
    @DotMapping("w")
    public native double getW();
    
    public static native GCQuaternion create(double x, double y, double z, double w) /*-[
        GCQuaternion __new = { .x = x, .y = y, .z = z, .w = w };
        return __new;
    ]-*/;
    public static native GCQuaternion copyWithx(GCQuaternion original, double x) /*-[
        GCQuaternion __new = { .x = x, .y = original.y, .z = original.z, .w = original.w };
        return __new;
    ]-*/;

    
    public static native GCQuaternion copyWithy(GCQuaternion original, double y) /*-[
        GCQuaternion __new = { .x = original.x, .y = y, .z = original.z, .w = original.w };
        return __new;
    ]-*/;

    
    public static native GCQuaternion copyWithz(GCQuaternion original, double z) /*-[
        GCQuaternion __new = { .x = original.x, .y = original.y, .z = z, .w = original.w };
        return __new;
    ]-*/;

    
    public static native GCQuaternion copyWithw(GCQuaternion original, double w) /*-[
        GCQuaternion __new = { .x = original.x, .y = original.y, .z = original.z, .w = w };
        return __new;
    ]-*/;

    
}
