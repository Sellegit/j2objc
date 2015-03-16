package apple.spritekit;


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
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("SpriteKit/SpriteKit.h") @Mapping("SK3DNode")
public class SK3DNode 
    extends SKNode 
     {

    
    
    public SK3DNode() {}
    @Mapping("initWithViewportSize:")
    public SK3DNode(CGSize viewportSize) { }
    @Mapping("initWithCoder:")
    public SK3DNode(NSCoder aDecoder) { }
    
    
    @Mapping("viewportSize")
    public native CGSize getViewportSize();
    @Mapping("setViewportSize:")
    public native void setViewportSize(CGSize v);
    @Mapping("scnScene")
    public native SCNScene getSceneKitScene();
    @Mapping("setScnScene:")
    public native void setSceneKitScene(SCNScene v);
    @Mapping("sceneTime")
    public native double getSceneTime();
    @Mapping("setSceneTime:")
    public native void setSceneTime(double v);
    @Mapping("isPlaying")
    public native boolean isPlaying();
    @Mapping("setPlaying:")
    public native void setPlaying(boolean v);
    @Mapping("loops")
    public native boolean loops();
    @Mapping("setLoops:")
    public native void setLoops(boolean v);
    @Mapping("pointOfView")
    public native SCNNode getPointOfView();
    @Mapping("setPointOfView:")
    public native void setPointOfView(SCNNode v);
    @Mapping("autoenablesDefaultLighting")
    public native boolean autoenablesDefaultLighting();
    @Mapping("setAutoenablesDefaultLighting:")
    public native void setAutoenablesDefaultLighting(boolean v);
    
    
    
    @Mapping("hitTest:options:")
    public native NSArray<SCNHitTestResult> hitTest(CGPoint thePoint, NSDictionary<?, ?> options);
    @Mapping("projectPoint:")
    public native SKVector3 projectPoint(SKVector3 point);
    @Mapping("unprojectPoint:")
    public native SKVector3 unprojectPoint(SKVector3 point);
    @Mapping("nodeWithViewportSize:")
    public static native SK3DNode create(CGSize viewportSize);
    
}
