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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKView")
public class SKView 
    extends UIView 
     {

    
    
    public SKView() {}
    @Mapping("initWithFrame:")
    public SKView(CGRect frame) { }
    
    
    @Mapping("isPaused")
    public native boolean isPaused();
    @Mapping("setPaused:")
    public native void setPaused(boolean v);
    @Mapping("showsFPS")
    public native boolean showsFPS();
    @Mapping("setShowsFPS:")
    public native void setShowsFPS(boolean v);
    @Mapping("showsDrawCount")
    public native boolean showsDrawCount();
    @Mapping("setShowsDrawCount:")
    public native void setShowsDrawCount(boolean v);
    @Mapping("showsNodeCount")
    public native boolean showsNodeCount();
    @Mapping("setShowsNodeCount:")
    public native void setShowsNodeCount(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("showsQuadCount")
    public native boolean showsQuadCount();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShowsQuadCount:")
    public native void setShowsQuadCount(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("showsPhysics")
    public native boolean showsPhysics();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShowsPhysics:")
    public native void setShowsPhysics(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("showsFields")
    public native boolean showsFields();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShowsFields:")
    public native void setShowsFields(boolean v);
    @Mapping("isAsynchronous")
    public native boolean isAsynchronous();
    @Mapping("setAsynchronous:")
    public native void setAsynchronous(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("allowsTransparency")
    public native boolean allowsTransparency();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAllowsTransparency:")
    public native void setAllowsTransparency(boolean v);
    @Mapping("ignoresSiblingOrder")
    public native boolean ignoresSiblingOrder();
    @Mapping("setIgnoresSiblingOrder:")
    public native void setIgnoresSiblingOrder(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shouldCullNonVisibleNodes")
    public native boolean shouldCullNonVisibleNodes();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShouldCullNonVisibleNodes:")
    public native void setShouldCullNonVisibleNodes(boolean v);
    @Mapping("frameInterval")
    public native @MachineSizedSInt long getFrameInterval();
    @Mapping("setFrameInterval:")
    public native void setFrameInterval(@MachineSizedSInt long v);
    @Mapping("scene")
    public native SKScene getScene();
    
    
    
    @Mapping("presentScene:")
    public native void presentScene(SKScene scene);
    @Mapping("presentScene:transition:")
    public native void presentScene(SKScene scene, SKTransition transition);
    @Mapping("textureFromNode:")
    public native SKTexture getTextureFromNode(SKNode node);
    @Mapping("textureFromNode:crop:")
    public native SKTexture getTextureFromNode(SKNode node, CGRect crop);
    @Mapping("convertPoint:toScene:")
    public native CGPoint convertPointToScene(CGPoint point, SKScene scene);
    @Mapping("convertPoint:fromScene:")
    public native CGPoint convertPointFromScene(CGPoint point, SKScene scene);
    
}
