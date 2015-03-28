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


@Mapping("CMQuaternion") @Library("CoreMotion/CoreMotion.h")
public class CMQuaternion 
    extends Struct 
     {

    
    private CMQuaternion() {}
    
    
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
        CMQuaternion __new = { .x = x, .y = original.y, .z = original.z, .w = original.w };
        return __new;
    ]-*/;


    public static native CMQuaternion copyWithy(CMQuaternion original, double y) /*-[
        CMQuaternion __new = { .x = original.x, .y = y, .z = original.z, .w = original.w };
        return __new;
    ]-*/;


    public static native CMQuaternion copyWithz(CMQuaternion original, double z) /*-[
        CMQuaternion __new = { .x = original.x, .y = original.y, .z = z, .w = original.w };
        return __new;
    ]-*/;


    public static native CMQuaternion copyWithw(CMQuaternion original, double w) /*-[
        CMQuaternion __new = { .x = original.x, .y = original.y, .z = original.z, .w = w };
        return __new;
    ]-*/;


    public static final class Adapter {

        public double x;
        public double y;
        public double z;
        public double w;
        public Adapter(double x, double y, double z, double w) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
        public Adapter(CMQuaternion original) {
            this.x = original.getX();
            this.y = original.getY();
            this.z = original.getZ();
            this.w = original.getW();
        }
        public CMQuaternion convert() {
            return create(x, y, z, w);
        }
    }
}
