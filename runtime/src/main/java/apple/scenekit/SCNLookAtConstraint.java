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


@Library("SceneKit/SceneKit.h") @Mapping("SCNLookAtConstraint")
public class SCNLookAtConstraint 
    extends SCNConstraint 
     {

    
    
    @Mapping("init")
    public SCNLookAtConstraint() { }

    
    @Mapping("target")
    public native SCNNode getTarget();
    @Mapping("gimbalLockEnabled")
    public native boolean isGimbalLockEnabled();
    @Mapping("setGimbalLockEnabled:")
    public native void setGimbalLockEnabled(boolean v);

    
    
    @Mapping("lookAtConstraintWithTarget:")
    public static native SCNLookAtConstraint create(SCNNode target);

}
