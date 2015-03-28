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


@Library("GameController/GameController.h") @Mapping("GCExtendedGamepad")
public class GCExtendedGamepad 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public GCExtendedGamepad() { }

    
    @Mapping("controller")
    public native GCController getController();
    @Mapping("valueChangedHandler")
    public native @Block VoidBlock2<GCExtendedGamepad, GCControllerElement> getValueChangedHandler();
    @Mapping("setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock2<GCExtendedGamepad, GCControllerElement> v);
    @Mapping("dpad")
    public native GCControllerDirectionPad getDpad();
    @Mapping("buttonA")
    public native GCControllerButtonInput getButtonA();
    @Mapping("buttonB")
    public native GCControllerButtonInput getButtonB();
    @Mapping("buttonX")
    public native GCControllerButtonInput getButtonX();
    @Mapping("buttonY")
    public native GCControllerButtonInput getButtonY();
    @Mapping("leftThumbstick")
    public native GCControllerDirectionPad getLeftThumbstick();
    @Mapping("rightThumbstick")
    public native GCControllerDirectionPad getRightThumbstick();
    @Mapping("leftShoulder")
    public native GCControllerButtonInput getLeftShoulder();
    @Mapping("rightShoulder")
    public native GCControllerButtonInput getRightShoulder();
    @Mapping("leftTrigger")
    public native GCControllerButtonInput getLeftTrigger();
    @Mapping("rightTrigger")
    public native GCControllerButtonInput getRightTrigger();

    
    
    @Mapping("saveSnapshot")
    public native GCExtendedGamepadSnapshot saveSnapshot();

}
