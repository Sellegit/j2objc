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


@Library("SpriteKit/SpriteKit.h") @Mapping("SKTransition")
public class SKTransition 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SKTransition() { }

    
    @Mapping("pausesIncomingScene")
    public native boolean pausesIncomingScene();
    @Mapping("setPausesIncomingScene:")
    public native void setPausesIncomingScene(boolean v);
    @Mapping("pausesOutgoingScene")
    public native boolean pausesOutgoingScene();
    @Mapping("setPausesOutgoingScene:")
    public native void setPausesOutgoingScene(boolean v);

    
    
    @Mapping("crossFadeWithDuration:")
    public static native SKTransition crossFade(double sec);
    @Mapping("fadeWithDuration:")
    public static native SKTransition fade(double sec);
    @Mapping("fadeWithColor:duration:")
    public static native SKTransition fade(UIColor color, double sec);
    @Mapping("flipHorizontalWithDuration:")
    public static native SKTransition flipHorizontal(double sec);
    @Mapping("flipVerticalWithDuration:")
    public static native SKTransition flipVertical(double sec);
    @Mapping("revealWithDirection:duration:")
    public static native SKTransition reveal(@Representing("SKTransitionDirection") long direction, double sec);
    @Mapping("moveInWithDirection:duration:")
    public static native SKTransition moveIn(@Representing("SKTransitionDirection") long direction, double sec);
    @Mapping("pushWithDirection:duration:")
    public static native SKTransition push(@Representing("SKTransitionDirection") long direction, double sec);
    @Mapping("doorsOpenHorizontalWithDuration:")
    public static native SKTransition doorsOpenHorizontal(double sec);
    @Mapping("doorsOpenVerticalWithDuration:")
    public static native SKTransition doorsOpenVertical(double sec);
    @Mapping("doorsCloseHorizontalWithDuration:")
    public static native SKTransition doorsCloseHorizontal(double sec);
    @Mapping("doorsCloseVerticalWithDuration:")
    public static native SKTransition doorsCloseVertical(double sec);
    @Mapping("doorwayWithDuration:")
    public static native SKTransition doorway(double sec);
    @Mapping("transitionWithCIFilter:duration:")
    public static native SKTransition create(CIFilter filter, double sec);

}
