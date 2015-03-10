package apple.gamecontroller;


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





@Mapping("GCGamepadSnapShotDataV100") @Library("GameController")
public class GCGamepadSnapShotDataV100 
    extends Struct 
     {

    
    protected GCGamepadSnapShotDataV100() {}
    
    
    @DotMapping("version")
    public native short getVersion();
    @DotMapping("size")
    public native short getSize();
    @DotMapping("dpadX")
    public native float getDpadX();
    @DotMapping("dpadY")
    public native float getDpadY();
    @DotMapping("buttonA")
    public native float getButtonA();
    @DotMapping("buttonB")
    public native float getButtonB();
    @DotMapping("buttonX")
    public native float getButtonX();
    @DotMapping("buttonY")
    public native float getButtonY();
    @DotMapping("leftShoulder")
    public native float getLeftShoulder();
    @DotMapping("rightShoulder")
    public native float getRightShoulder();
    
    public static native GCGamepadSnapShotDataV100 create(short version, short size, float dpadX, float dpadY, float buttonA, float buttonB, float buttonX, float buttonY, float leftShoulder, float rightShoulder) /*-[
        GCGamepadSnapShotDataV100 __new = { .version = version, .size = size, .dpadX = dpadX, .dpadY = dpadY, .buttonA = buttonA, .buttonB = buttonB, .buttonX = buttonX, .buttonY = buttonY, .leftShoulder = leftShoulder, .rightShoulder = rightShoulder };
        return __new;
    ]-*/;
    public static native GCGamepadSnapShotDataV100 copyWithversion(GCGamepadSnapShotDataV100 original, short version) /*-[
        original.version = version;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithsize(GCGamepadSnapShotDataV100 original, short size) /*-[
        original.size = size;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithdpadX(GCGamepadSnapShotDataV100 original, float dpadX) /*-[
        original.dpadX = dpadX;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithdpadY(GCGamepadSnapShotDataV100 original, float dpadY) /*-[
        original.dpadY = dpadY;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithbuttonA(GCGamepadSnapShotDataV100 original, float buttonA) /*-[
        original.buttonA = buttonA;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithbuttonB(GCGamepadSnapShotDataV100 original, float buttonB) /*-[
        original.buttonB = buttonB;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithbuttonX(GCGamepadSnapShotDataV100 original, float buttonX) /*-[
        original.buttonX = buttonX;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithbuttonY(GCGamepadSnapShotDataV100 original, float buttonY) /*-[
        original.buttonY = buttonY;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithleftShoulder(GCGamepadSnapShotDataV100 original, float leftShoulder) /*-[
        original.leftShoulder = leftShoulder;
        return __new;
    ]-*/;

    
    public static native GCGamepadSnapShotDataV100 copyWithrightShoulder(GCGamepadSnapShotDataV100 original, float rightShoulder) /*-[
        original.rightShoulder = rightShoulder;
        return __new;
    ]-*/;

    
    @GlobalFunction("GCGamepadSnapShotDataV100FromNSData")
    public native boolean setData(NSData data);
    @GlobalFunction("NSDataFromGCGamepadSnapShotDataV100")
    public native NSData getData();
    
}
