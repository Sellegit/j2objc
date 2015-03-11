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





@Mapping("GCQuaternion")
public class GCQuaternion 
    extends Struct 
     {

    
    protected GCQuaternion() {}
    
    
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
        original.x = x;
        return __new;
    ]-*/;

    
    public static native GCQuaternion copyWithy(GCQuaternion original, double y) /*-[
        original.y = y;
        return __new;
    ]-*/;

    
    public static native GCQuaternion copyWithz(GCQuaternion original, double z) /*-[
        original.z = z;
        return __new;
    ]-*/;

    
    public static native GCQuaternion copyWithw(GCQuaternion original, double w) /*-[
        original.w = w;
        return __new;
    ]-*/;

    
}
