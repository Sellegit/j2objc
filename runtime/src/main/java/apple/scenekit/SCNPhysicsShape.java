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





@Library("SceneKit") @Mapping("SCNPhysicsShape")
public class SCNPhysicsShape 
    extends NSObject 
    implements NSCopying {

    
    
    public SCNPhysicsShape() {}
    
    
    
    
    
    
    @Mapping("shapeWithGeometry:options:")
    public static native SCNPhysicsShape create(SCNGeometry geometry, NSDictionary<?, ?> options);
    @Mapping("shapeWithNode:options:")
    public static native SCNPhysicsShape create(SCNNode node, NSDictionary<?, ?> options);
    @Mapping("shapeWithShapes:transforms:")
    public static native SCNPhysicsShape create(NSArray<?> shapes, NSArray<?> transforms);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
