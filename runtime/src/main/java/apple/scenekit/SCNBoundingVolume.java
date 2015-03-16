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





@Library("SceneKit/SceneKit.h") @Mapping("SCNBoundingVolume")
public interface SCNBoundingVolume 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("getBoundingBoxMin:max:")
    boolean getBoundingBox(SCNVector3 min, SCNVector3 max);
    @Mapping("getBoundingSphereCenter:radius:")
    boolean getBoundingSphere(SCNVector3 center, Todo radius);
    @Mapping("setBoundingBoxMin:max:")
    void setBoundingBox(SCNVector3 min, SCNVector3 max);
    
    /*<adapter>*/
    /*</adapter>*/
}
