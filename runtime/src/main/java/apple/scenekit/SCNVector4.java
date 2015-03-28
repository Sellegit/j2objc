package apple.scenekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;


@Mapping("SCNVector4") @Library("SceneKit/SceneKit.h")
public class SCNVector4 
    extends Struct 
     {

    
    private SCNVector4() {}
    
    
    @DotMapping("x")
    public native float getX();
    @DotMapping("y")
    public native float getY();
    @DotMapping("z")
    public native float getZ();
    @DotMapping("w")
    public native float getW();

    public static native SCNVector4 create(float x, float y, float z, float w) /*-[
        SCNVector4 __new = { .x = x, .y = y, .z = z, .w = w };
        return __new;
    ]-*/;
    public static native SCNVector4 copyWithx(SCNVector4 original, float x) /*-[
        SCNVector4 __new = { .x = x, .y = original.y, .z = original.z, .w = original.w };
        return __new;
    ]-*/;


    public static native SCNVector4 copyWithy(SCNVector4 original, float y) /*-[
        SCNVector4 __new = { .x = original.x, .y = y, .z = original.z, .w = original.w };
        return __new;
    ]-*/;


    public static native SCNVector4 copyWithz(SCNVector4 original, float z) /*-[
        SCNVector4 __new = { .x = original.x, .y = original.y, .z = z, .w = original.w };
        return __new;
    ]-*/;


    public static native SCNVector4 copyWithw(SCNVector4 original, float w) /*-[
        SCNVector4 __new = { .x = original.x, .y = original.y, .z = original.z, .w = w };
        return __new;
    ]-*/;


    public static final class Adapter {

        public float x;
        public float y;
        public float z;
        public float w;
        public Adapter(float x, float y, float z, float w) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
        public Adapter(SCNVector4 original) {
            this.x = original.getX();
            this.y = original.getY();
            this.z = original.getZ();
            this.w = original.getW();
        }
        public SCNVector4 convert() {
            return create(x, y, z, w);
        }
    }
    @GlobalConstant("SCNVector4Zero")
    public static native SCNVector4 Zero();

    @GlobalFunction("SCNVector4EqualToVector4")
    public static native boolean equalsTo(SCNVector4 a, SCNVector4 b);

}
