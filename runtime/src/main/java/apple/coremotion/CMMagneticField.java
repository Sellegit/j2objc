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





@Mapping("CMMagneticField")
public class CMMagneticField 
    extends Struct 
     {

    
    protected CMMagneticField() {}
    
    
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
        original.x = x;
        return __new;
    ]-*/;

    
    public static native CMMagneticField copyWithy(CMMagneticField original, double y) /*-[
        original.y = y;
        return __new;
    ]-*/;

    
    public static native CMMagneticField copyWithz(CMMagneticField original, double z) /*-[
        original.z = z;
        return __new;
    ]-*/;

    
}
