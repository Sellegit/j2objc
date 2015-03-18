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





@Mapping("CMRotationRate") @Library("CoreMotion/CoreMotion.h")
public class CMRotationRate 
    extends Struct 
     {

    
    private CMRotationRate() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();
    @DotMapping("z")
    public native double getZ();
    
    public static native CMRotationRate create(double x, double y, double z) /*-[
        CMRotationRate __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native CMRotationRate copyWithx(CMRotationRate original, double x) /*-[
        CMRotationRate __new = { .x = x, .y = original.y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native CMRotationRate copyWithy(CMRotationRate original, double y) /*-[
        CMRotationRate __new = { .x = original.x, .y = y, .z = original.z };
        return __new;
    ]-*/;

    
    public static native CMRotationRate copyWithz(CMRotationRate original, double z) /*-[
        CMRotationRate __new = { .x = original.x, .y = original.y, .z = z };
        return __new;
    ]-*/;

    
}
