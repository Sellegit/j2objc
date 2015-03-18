package apple.coremotion;


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





@Mapping("CMMagneticField") @Library("CoreMotion/CoreMotion.h")
public class CMMagneticField 
    extends Struct 
     {

    
    private CMMagneticField() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();
    @DotMapping("z")
    public native double getZ();
    
    public static native CMMagneticField create(double x, double y, double z) /*-[
        CMMagneticField __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native CMMagneticField copyWithx(CMMagneticField original, double x) /*-[
        CMMagneticField __new = { .x = x, .y = original.y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native CMMagneticField copyWithy(CMMagneticField original, double y) /*-[
        CMMagneticField __new = { .x = original.x, .y = y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native CMMagneticField copyWithz(CMMagneticField original, double z) /*-[
        CMMagneticField __new = { .x = original.x, .y = original.y, .z = z };
        return __new;
    ]-*/;

    
}
