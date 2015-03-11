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





@Library("SceneKit") @Mapping("SCNRenderer")
public class SCNRenderer 
    extends NSObject 
    implements SCNSceneRenderer, SCNTechniqueSupport {

    
    
    public SCNRenderer() {}
    
    
    @Mapping("scene")
    public native SCNScene getScene();
    @Mapping("setScene:")
    public native void setScene(SCNScene v);
    @Mapping("nextFrameTime")
    public native double getNextFrameTime();
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
    
    
    
    @Mapping("render")
    public native void render();
    @Mapping("renderAtTime:")
    public native void renderAtTime(double time);
    @Mapping("rendererWithContext:options:")
    public static native SCNRenderer create(EAGLContext context, NSDictionary<?, ?> options);
    @Mapping("hitTest:options:")
    public native NSArray<SCNHitTestResult> hitTest(CGPoint thePoint, SCNHitTestOptions options);
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
