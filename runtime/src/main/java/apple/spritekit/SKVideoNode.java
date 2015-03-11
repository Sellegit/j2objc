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





@Library("SpriteKit") @Mapping("SKVideoNode")
public class SKVideoNode 
    extends SKNode 
     {

    
    
    public SKVideoNode() {}
    @Mapping("initWithAVPlayer:")
    public SKVideoNode(AVPlayer player) { }
    @Mapping("initWithVideoFileNamed:")
    public SKVideoNode(String videoFile) { }
    @Mapping("initWithVideoURL:")
    public SKVideoNode(NSURL url) { }
    @Mapping("initWithCoder:")
    public SKVideoNode(NSCoder aDecoder) { }
    
    
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("setSize:")
    public native void setSize(CGSize v);
    @Mapping("anchorPoint")
    public native CGPoint getAnchorPoint();
    @Mapping("setAnchorPoint:")
    public native void setAnchorPoint(CGPoint v);
    
    
    
    @Mapping("play")
    public native void play();
    @Mapping("pause")
    public native void pause();
    @Mapping("videoNodeWithAVPlayer:")
    public static native SKVideoNode create(AVPlayer player);
    @Mapping("videoNodeWithVideoFileNamed:")
    public static native SKVideoNode create(String videoFile);
    @Mapping("videoNodeWithVideoURL:")
    public static native SKVideoNode create(NSURL videoURL);
    
}
