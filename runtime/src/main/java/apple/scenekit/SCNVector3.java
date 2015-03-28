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


@Mapping("SCNVector3") @Library("SceneKit/SceneKit.h")
public class SCNVector3 
    extends Struct 
     {

    
    private SCNVector3() {}
    
    
    @DotMapping("x")
    public native float getX();
    @DotMapping("y")
    public native float getY();
    @DotMapping("z")
    public native float getZ();

    public static native SCNVector3 create(float x, float y, float z) /*-[
        SCNVector3 __new = { .x = x, .y = y, .z = z };
        return __new;
    ]-*/;
    public static native SCNVector3 copyWithx(SCNVector3 original, float x) /*-[
        SCNVector3 __new = { .x = x, .y = original.y, .z = original.z };
        return __new;
    ]-*/;


    public static native SCNVector3 copyWithy(SCNVector3 original, float y) /*-[
        SCNVector3 __new = { .x = original.x, .y = y, .z = original.z };
        return __new;
    ]-*/;


    public static native SCNVector3 copyWithz(SCNVector3 original, float z) /*-[
        SCNVector3 __new = { .x = original.x, .y = original.y, .z = z };
        return __new;
    ]-*/;


    public static final class Adapter {

        public float x;
        public float y;
        public float z;
        public Adapter(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public Adapter(SCNVector3 original) {
            this.x = original.getX();
            this.y = original.getY();
            this.z = original.getZ();
        }
        public SCNVector3 convert() {
            return create(x, y, z);
        }
    }
    @GlobalConstant("SCNVector3Zero")
    public static native SCNVector3 Zero();

    @GlobalFunction("SCNVector3EqualToVector3")
    public static native boolean equalsTo(SCNVector3 a, SCNVector3 b);

}
