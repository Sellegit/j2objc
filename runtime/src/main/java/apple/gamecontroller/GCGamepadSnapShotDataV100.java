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





@Mapping("GCGamepadSnapShotDataV100") @Library("GameController/GameController.h")
public class GCGamepadSnapShotDataV100 
    extends Struct 
     {

    
    private GCGamepadSnapShotDataV100() {}
    
    
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
    
    
    @GlobalFunction("GCGamepadSnapShotDataV100FromNSData")
    public static native boolean setData(GCGamepadSnapShotDataV100 snapshotData, NSData data);
    @GlobalFunction("NSDataFromGCGamepadSnapShotDataV100")
    public static native NSData getData(GCGamepadSnapShotDataV100 snapshotData);
    
}
