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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class SCNSceneRendererAdapter 
    extends Object 
    implements SCNSceneRenderer {

    
    
    
    @NotImplemented("scene")
    public SCNScene getScene() { throw new UnsupportedOperationException(); }
    @Mapping("setScene:")
    public void setScene(SCNScene v) { throw new UnsupportedOperationException(); }
    @NotImplemented("sceneTime")
    public double getSceneTime() { throw new UnsupportedOperationException(); }
    @Mapping("setSceneTime:")
    public void setSceneTime(double v) { throw new UnsupportedOperationException(); }
    @NotImplemented("delegate")
    public SCNSceneRendererDelegate getDelegate() { throw new UnsupportedOperationException(); }
    @Mapping("setDelegate:")
    public void setDelegate(SCNSceneRendererDelegate v) { throw new UnsupportedOperationException(); }
    @NotImplemented("isPlaying")
    public boolean isPlaying() { throw new UnsupportedOperationException(); }
    @Mapping("setPlaying:")
    public void setPlaying(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("loops")
    public boolean loops() { throw new UnsupportedOperationException(); }
    @Mapping("setLoops:")
    public void setLoops(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("pointOfView")
    public SCNNode getPointOfView() { throw new UnsupportedOperationException(); }
    @Mapping("setPointOfView:")
    public void setPointOfView(SCNNode v) { throw new UnsupportedOperationException(); }
    @NotImplemented("autoenablesDefaultLighting")
    public boolean autoenablesDefaultLighting() { throw new UnsupportedOperationException(); }
    @Mapping("setAutoenablesDefaultLighting:")
    public void setAutoenablesDefaultLighting(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("isJitteringEnabled")
    public boolean isJitteringEnabled() { throw new UnsupportedOperationException(); }
    @Mapping("setJitteringEnabled:")
    public void setJitteringEnabled(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("showsStatistics")
    public boolean showsStatistics() { throw new UnsupportedOperationException(); }
    @Mapping("setShowsStatistics:")
    public void setShowsStatistics(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("overlaySKScene")
    public SKScene getOverlaySKScene() { throw new UnsupportedOperationException(); }
    @Mapping("setOverlaySKScene:")
    public void setOverlaySKScene(SKScene v) { throw new UnsupportedOperationException(); }
    @NotImplemented("context")
    public EAGLContext getContext() { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("hitTest:options:")
    public NSArray<SCNHitTestResult> hitTest(CGPoint thePoint, SCNHitTestOptions options) { throw new UnsupportedOperationException(); }
    @NotImplemented("isNodeInsideFrustum:withPointOfView:")
    public boolean isNodeInsideFrustum(SCNNode node, SCNNode pointOfView) { throw new UnsupportedOperationException(); }
    @NotImplemented("projectPoint:")
    public SCNVector3 projectPoint(SCNVector3 point) { throw new UnsupportedOperationException(); }
    @NotImplemented("unprojectPoint:")
    public SCNVector3 unprojectPoint(SCNVector3 point) { throw new UnsupportedOperationException(); }
    @NotImplemented("prepareObject:shouldAbortBlock:")
    public boolean prepareObject(Object object, @Block Block0<Boolean> block) { throw new UnsupportedOperationException(); }
    @NotImplemented("prepareObjects:withCompletionHandler:")
    public void prepareObjects(NSArray<?> objects, @Block VoidBooleanBlock completionHandler) { throw new UnsupportedOperationException(); }
    
}
