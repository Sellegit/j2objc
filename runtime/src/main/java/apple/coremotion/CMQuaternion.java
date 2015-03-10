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





@Mapping("CMQuaternion")
public class CMQuaternion 
    extends Struct 
     {

    
    protected CMQuaternion() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();
    @DotMapping("z")
    public native double getZ();
    @DotMapping("w")
    public native double getW();
    
    public static native CMQuaternion create(double x, double y, double z, double w) /*-[
        CMQuaternion __new = { .x = x, .y = y, .z = z, .w = w };
        return __new;
    ]-*/;
    public static native CMQuaternion copyWithx(CMQuaternion original, double x) /*-[
        original.x = x;
        return __new;
    ]-*/;

    
    public static native CMQuaternion copyWithy(CMQuaternion original, double y) /*-[
        original.y = y;
        return __new;
    ]-*/;

    
    public static native CMQuaternion copyWithz(CMQuaternion original, double z) /*-[
        original.z = z;
        return __new;
    ]-*/;

    
    public static native CMQuaternion copyWithw(CMQuaternion original, double w) /*-[
        original.w = w;
        return __new;
    ]-*/;

    
}
