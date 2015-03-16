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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("GameController/GameController.h") @Mapping("GCMotion")
public class GCMotion 
    extends NSObject 
     {

    
    
    public GCMotion() {}
    
    
    @Mapping("controller")
    public native GCController getController();
    @Mapping("valueChangedHandler")
    public native @Block VoidBlock2<GCGamepad, GCControllerElement> getValueChangedHandler();
    @Mapping("setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock2<GCGamepad, GCControllerElement> v);
    @Mapping("gravity")
    public native GCAcceleration getGravity();
    @Mapping("userAcceleration")
    public native GCAcceleration getUserAcceleration();
    @Mapping("attitude")
    public native GCQuaternion getAttitude();
    @Mapping("rotationRate")
    public native GCRotationRate getRotationRate();
    
    
    
    
    
}
