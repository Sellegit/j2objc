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





@Library("SceneKit") @Mapping("SCNPhysicsVehicleWheel")
public class SCNPhysicsVehicleWheel 
    extends NSObject 
    implements NSCopying {

    
    
    public SCNPhysicsVehicleWheel() {}
    
    
    @Mapping("node")
    public native SCNNode getNode();
    @Mapping("suspensionStiffness")
    public native @MachineSizedFloat double getSuspensionStiffness();
    public native void setSuspensionStiffness(@MachineSizedFloat double v);
    @Mapping("suspensionCompression")
    public native @MachineSizedFloat double getSuspensionCompression();
    public native void setSuspensionCompression(@MachineSizedFloat double v);
    @Mapping("suspensionDamping")
    public native @MachineSizedFloat double getSuspensionDamping();
    public native void setSuspensionDamping(@MachineSizedFloat double v);
    @Mapping("maximumSuspensionTravel")
    public native @MachineSizedFloat double getMaximumSuspensionTravel();
    public native void setMaximumSuspensionTravel(@MachineSizedFloat double v);
    @Mapping("frictionSlip")
    public native @MachineSizedFloat double getFrictionSlip();
    public native void setFrictionSlip(@MachineSizedFloat double v);
    @Mapping("maximumSuspensionForce")
    public native @MachineSizedFloat double getMaximumSuspensionForce();
    public native void setMaximumSuspensionForce(@MachineSizedFloat double v);
    @Mapping("connectionPosition")
    public native SCNVector3 getConnectionPosition();
    public native void setConnectionPosition(SCNVector3 v);
    @Mapping("steeringAxis")
    public native SCNVector3 getSteeringAxis();
    public native void setSteeringAxis(SCNVector3 v);
    @Mapping("axle")
    public native SCNVector3 getAxle();
    public native void setAxle(SCNVector3 v);
    @Mapping("radius")
    public native @MachineSizedFloat double getRadius();
    public native void setRadius(@MachineSizedFloat double v);
    @Mapping("suspensionRestLength")
    public native @MachineSizedFloat double getSuspensionRestLength();
    public native void setSuspensionRestLength(@MachineSizedFloat double v);
    
    
    
    @Mapping("wheelWithNode:")
    public static native SCNPhysicsVehicleWheel create(SCNNode node);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
