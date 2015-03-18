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





@Library("GameController/GameController.h") @Mapping("GCGamepad")
public class GCGamepad 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public GCGamepad() { }
    
    
    @Mapping("controller")
    public native GCController getController();
    @Mapping("valueChangedHandler")
    public native @Block VoidBlock2<GCGamepad, GCControllerElement> getValueChangedHandler();
    @Mapping("setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock2<GCGamepad, GCControllerElement> v);
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
    @Mapping("leftShoulder")
    public native GCControllerButtonInput getLeftShoulder();
    @Mapping("rightShoulder")
    public native GCControllerButtonInput getRightShoulder();
    
    
    
    @Mapping("saveSnapshot")
    public native GCGamepadSnapshot saveSnapshot();
    
}
