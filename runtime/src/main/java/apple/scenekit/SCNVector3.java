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





@Mapping("SCNVector3") @Library("SceneKit")
public class SCNVector3 
    extends Struct 
     {

    
    protected SCNVector3() {}
    
    
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
        original.x = x;
        return __new;
    ]-*/;

    
    public static native SCNVector3 copyWithy(SCNVector3 original, float y) /*-[
        original.y = y;
        return __new;
    ]-*/;

    
    public static native SCNVector3 copyWithz(SCNVector3 original, float z) /*-[
        original.z = z;
        return __new;
    ]-*/;

    
    @GlobalConstant("SCNVector3Zero")
    public static native SCNVector3 Zero();
    
    @GlobalFunction("SCNVector3EqualToVector3")
    public native boolean equalsTo(SCNVector3 b);
    
}
