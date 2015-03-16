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





@Library("SceneKit/SceneKit.h") @Mapping("SCNView")
public class SCNView 
    extends UIView 
    implements SCNSceneRenderer, SCNTechniqueSupport {

    
    
    public SCNView() {}
    @Mapping("initWithFrame:options:")
    public SCNView(CGRect frame, NSDictionary<?, ?> options) { }
    @Mapping("initWithFrame:")
    public SCNView(CGRect frame) { }
    
    
    @Mapping("scene")
    public native SCNScene getScene();
    @Mapping("setScene:")
    public native void setScene(SCNScene v);
    @Mapping("allowsCameraControl")
    public native boolean allowsCameraControl();
    @Mapping("setAllowsCameraControl:")
    public native void setAllowsCameraControl(boolean v);
    @Mapping("eaglContext")
    public native EAGLContext getEaglContext();
    @Mapping("setEaglContext:")
    public native void setEaglContext(EAGLContext v);
    @Mapping("preferredFramesPerSecond")
    public native @MachineSizedSInt long getPreferredFramesPerSecond();
    @Mapping("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@MachineSizedSInt long v);
    @Mapping("antialiasingMode")
    public native @Representing("SCNAntialiasingMode") @MachineSizedUInt long getAntialiasingMode();
    @Mapping("setAntialiasingMode:")
    public native void setAntialiasingMode(@Representing("SCNAntialiasingMode") @MachineSizedUInt long v);
    @Mapping("sceneTime")
    public native double getSceneTime();
    @Mapping("setSceneTime:")
    public native void setSceneTime(double v);
    @Mapping("delegate")
    public native SCNSceneRendererDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(SCNSceneRendererDelegate v);
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
    @Mapping("isJitteringEnabled")
    public native boolean isJitteringEnabled();
    @Mapping("setJitteringEnabled:")
    public native void setJitteringEnabled(boolean v);
    @Mapping("showsStatistics")
    public native boolean showsStatistics();
    @Mapping("setShowsStatistics:")
    public native void setShowsStatistics(boolean v);
    @Mapping("overlaySKScene")
    public native SKScene getOverlaySKScene();
    @Mapping("setOverlaySKScene:")
    public native void setOverlaySKScene(SKScene v);
    @Mapping("context")
    public native EAGLContext getContext();
    @Mapping("technique")
    public native SCNTechnique getTechnique();
    @Mapping("setTechnique:")
    public native void setTechnique(SCNTechnique v);
    
    
    
    @Mapping("snapshot")
    public native UIImage snapshot();
    @Mapping("play:")
    public native void play(Object sender);
    @Mapping("pause:")
    public native void pause(Object sender);
    @Mapping("stop:")
    public native void stop(Object sender);
    @Mapping("hitTest:options:")
    public native NSArray<SCNHitTestResult> hitTest(CGPoint thePoint, NSDictionary<?, ?> options);
    @Mapping("isNodeInsideFrustum:withPointOfView:")
    public native boolean isNodeInsideFrustum(SCNNode node, SCNNode pointOfView);
    @Mapping("projectPoint:")
    public native SCNVector3 projectPoint(SCNVector3 point);
    @Mapping("unprojectPoint:")
    public native SCNVector3 unprojectPoint(SCNVector3 point);
    @Mapping("prepareObject:shouldAbortBlock:")
    public native boolean prepareObject(Object object, @Block Block0<Boolean> block);
    @Mapping("prepareObjects:withCompletionHandler:")
    public native void prepareObjects(NSArray<?> objects, @Block VoidBooleanBlock completionHandler);
    
}
