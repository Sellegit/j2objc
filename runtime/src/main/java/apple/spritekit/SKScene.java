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





@Library("SpriteKit") @Mapping("SKScene")
public class SKScene 
    extends SKEffectNode 
     {

    
    
    public SKScene() {}
    @Mapping("initWithSize:")
    public SKScene(CGSize size) { }
    @Mapping("initWithCoder:")
    public SKScene(NSCoder aDecoder) { }
    
    
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("setSize:")
    public native void setSize(CGSize v);
    @Mapping("scaleMode")
    public native @Representing("SKSceneScaleMode") @MachineSizedSInt long getScaleMode();
    @Mapping("setScaleMode:")
    public native void setScaleMode(@Representing("SKSceneScaleMode") @MachineSizedSInt long v);
    @Mapping("backgroundColor")
    public native UIColor getBackgroundColor();
    @Mapping("setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("delegate")
    public native SKSceneDelegate getDelegate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDelegate:")
    public native void setDelegate(SKSceneDelegate v);
    @Mapping("anchorPoint")
    public native CGPoint getAnchorPoint();
    @Mapping("setAnchorPoint:")
    public native void setAnchorPoint(CGPoint v);
    @Mapping("physicsWorld")
    public native SKPhysicsWorld getPhysicsWorld();
    @Mapping("view")
    public native SKView getView();
    
    
    
    @Mapping("convertPointFromView:")
    public native CGPoint convertPointFromView(CGPoint point);
    @Mapping("convertPointToView:")
    public native CGPoint convertPointToView(CGPoint point);
    @Mapping("update:")
    public native void update(double currentTime);
    @Mapping("didEvaluateActions")
    public native void didEvaluateActions();
    @Mapping("didSimulatePhysics")
    public native void didSimulatePhysics();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("didApplyConstraints")
    public native void didApplyConstraints();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("didFinishUpdate")
    public native void didFinishUpdate();
    @Mapping("didMoveToView:")
    public native void didMoveToView(SKView view);
    @Mapping("willMoveFromView:")
    public native void willMoveFromView(SKView view);
    @Mapping("didChangeSize:")
    public native void didChangeSize(CGSize oldSize);
    @Mapping("sceneWithSize:")
    public static native SKScene create(CGSize size);
    
}
