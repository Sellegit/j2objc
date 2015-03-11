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





@Mapping("CMAcceleration")
public class CMAcceleration 
    extends Struct 
     {

    
    protected CMAcceleration() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();
    @DotMapping("z")
    public native double getZ();
    
    public static native CMAcceleration create(double x, double y, double z) /*-[
        CMAcceleration __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native CMAcceleration copyWithx(CMAcceleration original, double x) /*-[
        original.x = x;
        return __new;
    ]-*/;

    
    public static native CMAcceleration copyWithy(CMAcceleration original, double y) /*-[
        original.y = y;
        return __new;
    ]-*/;

    
    public static native CMAcceleration copyWithz(CMAcceleration original, double z) /*-[
        original.z = z;
        return __new;
    ]-*/;

    
}
