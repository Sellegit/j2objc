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


@Library("SceneKit/SceneKit.h") @Mapping("SCNIKConstraint")
public class SCNIKConstraint 
    extends SCNConstraint 
     {

    
    
    @Mapping("init")
    public SCNIKConstraint() { }

    
    @Mapping("chainRootNode")
    public native SCNNode getChainRootNode();
    @Mapping("targetPosition")
    public native SCNVector3 getTargetPosition();
    @Mapping("setTargetPosition:")
    public native void setTargetPosition(SCNVector3 v);

    
    
    @Mapping("setMaxAllowedRotationAngle:forJoint:")
    public native void setMaxAllowedRotationAngleForJoint(@MachineSizedFloat double angle, SCNNode node);
    @Mapping("maxAllowedRotationAngleForJoint:")
    public native @MachineSizedFloat double getMaxAllowedRotationAngleForJoint(SCNNode node);
    @Mapping("inverseKinematicsConstraintWithChainRootNode:")
    public static native SCNIKConstraint create(SCNNode chainRootNode);

}
