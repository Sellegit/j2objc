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





@Mapping("SCNVector4") @Library("SceneKit")
public class SCNVector4 
    extends Struct 
     {

    
    protected SCNVector4() {}
    
    
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
        original.x = x;
        return original;
    ]-*/;

    
    public static native SCNVector4 copyWithy(SCNVector4 original, float y) /*-[
        original.y = y;
        return original;
    ]-*/;

    
    public static native SCNVector4 copyWithz(SCNVector4 original, float z) /*-[
        original.z = z;
        return original;
    ]-*/;

    
    public static native SCNVector4 copyWithw(SCNVector4 original, float w) /*-[
        original.w = w;
        return original;
    ]-*/;

    
    @GlobalConstant("SCNVector4Zero")
    public static native SCNVector4 Zero();
    
    @GlobalFunction("SCNVector4EqualToVector4")
    public native boolean equalsTo(SCNVector4 b);
    
}
