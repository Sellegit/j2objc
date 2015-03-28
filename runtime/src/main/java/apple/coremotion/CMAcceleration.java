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


@Mapping("CMAcceleration") @Library("CoreMotion/CoreMotion.h")
public class CMAcceleration 
    extends Struct 
     {

    
    private CMAcceleration() {}
    
    
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
        CMAcceleration __new = { .x = x, .y = original.y, .z = original.z };
        return __new;
    ]-*/;


    public static native CMAcceleration copyWithy(CMAcceleration original, double y) /*-[
        CMAcceleration __new = { .x = original.x, .y = y, .z = original.z };
        return __new;
    ]-*/;


    public static native CMAcceleration copyWithz(CMAcceleration original, double z) /*-[
        CMAcceleration __new = { .x = original.x, .y = original.y, .z = z };
        return __new;
    ]-*/;


    public static final class Adapter {

        public double x;
        public double y;
        public double z;
        public Adapter(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public Adapter(CMAcceleration original) {
            this.x = original.getX();
            this.y = original.getY();
            this.z = original.getZ();
        }
        public CMAcceleration convert() {
            return create(x, y, z);
        }
    }
}
