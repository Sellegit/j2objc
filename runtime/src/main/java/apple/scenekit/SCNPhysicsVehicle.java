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


@Library("SceneKit/SceneKit.h") @Mapping("SCNPhysicsVehicle")
public class SCNPhysicsVehicle 
    extends SCNPhysicsBehavior 
     {

    
    
    @Mapping("init")
    public SCNPhysicsVehicle() { }

    
    @Mapping("speedInKilometersPerHour")
    public native @MachineSizedFloat double getSpeedInKilometersPerHour();
    @Mapping("wheels")
    public native NSArray<SCNPhysicsVehicleWheel> getWheels();
    @Mapping("chassisBody")
    public native SCNPhysicsBody getChassisBody();

    
    
    @Mapping("applyEngineForce:forWheelAtIndex:")
    public native void applyEngineForceForWheel(@MachineSizedFloat double value, @MachineSizedSInt long index);
    @Mapping("setSteeringAngle:forWheelAtIndex:")
    public native void setSteeringAngleForWheel(@MachineSizedFloat double value, @MachineSizedSInt long index);
    @Mapping("applyBrakingForce:forWheelAtIndex:")
    public native void applyBrakingForceForWheel(@MachineSizedFloat double value, @MachineSizedSInt long index);
    @Mapping("vehicleWithChassisBody:wheels:")
    public static native SCNPhysicsVehicle create(SCNPhysicsBody chassisBody, NSArray<?> wheels);

}
