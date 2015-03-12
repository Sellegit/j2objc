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





@Library("SceneKit") @Mapping("SCNSceneRenderer")
public interface SCNSceneRenderer 
    extends NSObjectProtocol {

    
    
    @Mapping("scene")
    SCNScene getScene();
    @Mapping("setScene:")
    void setScene(SCNScene v);
    @Mapping("sceneTime")
    double getSceneTime();
    @Mapping("setSceneTime:")
    void setSceneTime(double v);
    @Mapping("delegate")
    SCNSceneRendererDelegate getDelegate();
    @Mapping("setDelegate:")
    void setDelegate(SCNSceneRendererDelegate v);
    @Mapping("isPlaying")
    boolean isPlaying();
    @Mapping("setPlaying:")
    void setPlaying(boolean v);
    @Mapping("loops")
    boolean loops();
    @Mapping("setLoops:")
    void setLoops(boolean v);
    @Mapping("pointOfView")
    SCNNode getPointOfView();
    @Mapping("setPointOfView:")
    void setPointOfView(SCNNode v);
    @Mapping("autoenablesDefaultLighting")
    boolean autoenablesDefaultLighting();
    @Mapping("setAutoenablesDefaultLighting:")
    void setAutoenablesDefaultLighting(boolean v);
    @Mapping("isJitteringEnabled")
    boolean isJitteringEnabled();
    @Mapping("setJitteringEnabled:")
    void setJitteringEnabled(boolean v);
    @Mapping("showsStatistics")
    boolean showsStatistics();
    @Mapping("setShowsStatistics:")
    void setShowsStatistics(boolean v);
    @Mapping("overlaySKScene")
    SKScene getOverlaySKScene();
    @Mapping("setOverlaySKScene:")
    void setOverlaySKScene(SKScene v);
    @Mapping("context")
    EAGLContext getContext();
    
    
    @Mapping("hitTest:options:")
    NSArray<SCNHitTestResult> hitTest(CGPoint thePoint, NSDictionary<?, ?> options);
    @Mapping("isNodeInsideFrustum:withPointOfView:")
    boolean isNodeInsideFrustum(SCNNode node, SCNNode pointOfView);
    @Mapping("projectPoint:")
    SCNVector3 projectPoint(SCNVector3 point);
    @Mapping("unprojectPoint:")
    SCNVector3 unprojectPoint(SCNVector3 point);
    @Mapping("prepareObject:shouldAbortBlock:")
    boolean prepareObject(Object object, @Block Block0<Boolean> block);
    @Mapping("prepareObjects:withCompletionHandler:")
    void prepareObjects(NSArray<?> objects, @Block VoidBooleanBlock completionHandler);
    
    /*<adapter>*/
    /*</adapter>*/
}
