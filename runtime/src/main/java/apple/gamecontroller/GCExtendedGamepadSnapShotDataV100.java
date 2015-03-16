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





@Mapping("GCExtendedGamepadSnapShotDataV100") @Library("GameController/GameController.h")
public class GCExtendedGamepadSnapShotDataV100 
    extends Struct 
     {

    
    protected GCExtendedGamepadSnapShotDataV100() {}
    
    
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
    @DotMapping("leftThumbstickX")
    public native float getLeftThumbstickX();
    @DotMapping("leftThumbstickY")
    public native float getLeftThumbstickY();
    @DotMapping("rightThumbstickX")
    public native float getRightThumbstickX();
    @DotMapping("rightThumbstickY")
    public native float getRightThumbstickY();
    @DotMapping("leftTrigger")
    public native float getLeftTrigger();
    @DotMapping("rightTrigger")
    public native float getRightTrigger();
    
    public static native GCExtendedGamepadSnapShotDataV100 create(short version, short size, float dpadX, float dpadY, float buttonA, float buttonB, float buttonX, float buttonY, float leftShoulder, float rightShoulder, float leftThumbstickX, float leftThumbstickY, float rightThumbstickX, float rightThumbstickY, float leftTrigger, float rightTrigger) /*-[
        GCExtendedGamepadSnapShotDataV100 __new = { .version = version, .size = size, .dpadX = dpadX, .dpadY = dpadY, .buttonA = buttonA, .buttonB = buttonB, .buttonX = buttonX, .buttonY = buttonY, .leftShoulder = leftShoulder, .rightShoulder = rightShoulder, .leftThumbstickX = leftThumbstickX, .leftThumbstickY = leftThumbstickY, .rightThumbstickX = rightThumbstickX, .rightThumbstickY = rightThumbstickY, .leftTrigger = leftTrigger, .rightTrigger = rightTrigger };
        return __new;
    ]-*/;
    public static native GCExtendedGamepadSnapShotDataV100 copyWithversion(GCExtendedGamepadSnapShotDataV100 original, short version) /*-[
        original.version = version;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithsize(GCExtendedGamepadSnapShotDataV100 original, short size) /*-[
        original.size = size;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithdpadX(GCExtendedGamepadSnapShotDataV100 original, float dpadX) /*-[
        original.dpadX = dpadX;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithdpadY(GCExtendedGamepadSnapShotDataV100 original, float dpadY) /*-[
        original.dpadY = dpadY;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithbuttonA(GCExtendedGamepadSnapShotDataV100 original, float buttonA) /*-[
        original.buttonA = buttonA;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithbuttonB(GCExtendedGamepadSnapShotDataV100 original, float buttonB) /*-[
        original.buttonB = buttonB;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithbuttonX(GCExtendedGamepadSnapShotDataV100 original, float buttonX) /*-[
        original.buttonX = buttonX;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithbuttonY(GCExtendedGamepadSnapShotDataV100 original, float buttonY) /*-[
        original.buttonY = buttonY;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithleftShoulder(GCExtendedGamepadSnapShotDataV100 original, float leftShoulder) /*-[
        original.leftShoulder = leftShoulder;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithrightShoulder(GCExtendedGamepadSnapShotDataV100 original, float rightShoulder) /*-[
        original.rightShoulder = rightShoulder;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithleftThumbstickX(GCExtendedGamepadSnapShotDataV100 original, float leftThumbstickX) /*-[
        original.leftThumbstickX = leftThumbstickX;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithleftThumbstickY(GCExtendedGamepadSnapShotDataV100 original, float leftThumbstickY) /*-[
        original.leftThumbstickY = leftThumbstickY;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithrightThumbstickX(GCExtendedGamepadSnapShotDataV100 original, float rightThumbstickX) /*-[
        original.rightThumbstickX = rightThumbstickX;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithrightThumbstickY(GCExtendedGamepadSnapShotDataV100 original, float rightThumbstickY) /*-[
        original.rightThumbstickY = rightThumbstickY;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithleftTrigger(GCExtendedGamepadSnapShotDataV100 original, float leftTrigger) /*-[
        original.leftTrigger = leftTrigger;
        return original;
    ]-*/;

    
    public static native GCExtendedGamepadSnapShotDataV100 copyWithrightTrigger(GCExtendedGamepadSnapShotDataV100 original, float rightTrigger) /*-[
        original.rightTrigger = rightTrigger;
        return original;
    ]-*/;

    
    @GlobalFunction("GCExtendedGamepadSnapShotDataV100FromNSData")
    public static native boolean setData(GCExtendedGamepadSnapShotDataV100 snapshotData, NSData data);
    @GlobalFunction("NSDataFromGCExtendedGamepadSnapShotDataV100")
    public static native NSData getData(GCExtendedGamepadSnapShotDataV100 snapshotData);
    
}
