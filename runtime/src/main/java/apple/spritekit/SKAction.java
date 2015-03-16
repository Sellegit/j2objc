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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKAction")
public class SKAction 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public SKAction() {}
    
    
    @Mapping("duration")
    public native double getDuration();
    @Mapping("setDuration:")
    public native void setDuration(double v);
    @Mapping("timingMode")
    public native @Representing("SKActionTimingMode") @MachineSizedSInt long getTimingMode();
    @Mapping("setTimingMode:")
    public native void setTimingMode(@Representing("SKActionTimingMode") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("timingFunction")
    public native @Block Block1<Float, Float> getTimingFunction();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setTimingFunction:")
    public native void setTimingFunction(@Block Block1<Float, Float> v);
    @Mapping("speed")
    public native @MachineSizedFloat double getSpeed();
    @Mapping("setSpeed:")
    public native void setSpeed(@MachineSizedFloat double v);
    
    
    
    @Mapping("reversedAction")
    public native SKAction reversedAction();
    @Mapping("moveBy:duration:")
    public static native SKAction moveBy(CGVector delta, double sec);
    @Mapping("moveByX:y:duration:")
    public static native SKAction moveBy(@MachineSizedFloat double deltaX, @MachineSizedFloat double deltaY, double sec);
    @Mapping("moveTo:duration:")
    public static native SKAction moveTo(CGPoint location, double sec);
    @Mapping("moveToX:duration:")
    public static native SKAction moveToX(@MachineSizedFloat double x, double sec);
    @Mapping("moveToY:duration:")
    public static native SKAction moveToY(@MachineSizedFloat double y, double sec);
    @Mapping("rotateByAngle:duration:")
    public static native SKAction rotateBy(@MachineSizedFloat double radians, double sec);
    @Mapping("rotateToAngle:duration:")
    public static native SKAction rotateTo(@MachineSizedFloat double radians, double sec);
    @Mapping("rotateToAngle:duration:shortestUnitArc:")
    public static native SKAction rotateTo(@MachineSizedFloat double radians, double sec, boolean shortestUnitArc);
    @Mapping("resizeByWidth:height:duration:")
    public static native SKAction resizeBy(@MachineSizedFloat double width, @MachineSizedFloat double height, double duration);
    @Mapping("resizeToWidth:height:duration:")
    public static native SKAction resizeTo(@MachineSizedFloat double width, @MachineSizedFloat double height, double duration);
    @Mapping("resizeToWidth:duration:")
    public static native SKAction resizeToWidth(@MachineSizedFloat double width, double duration);
    @Mapping("resizeToHeight:duration:")
    public static native SKAction resizeToHeight(@MachineSizedFloat double height, double duration);
    @Mapping("scaleBy:duration:")
    public static native SKAction scaleBy(@MachineSizedFloat double scale, double sec);
    @Mapping("scaleXBy:y:duration:")
    public static native SKAction scaleBy(@MachineSizedFloat double xScale, @MachineSizedFloat double yScale, double sec);
    @Mapping("scaleTo:duration:")
    public static native SKAction scaleTo(@MachineSizedFloat double scale, double sec);
    @Mapping("scaleXTo:y:duration:")
    public static native SKAction scaleTo(@MachineSizedFloat double xScale, @MachineSizedFloat double yScale, double sec);
    @Mapping("scaleXTo:duration:")
    public static native SKAction scaleXTo(@MachineSizedFloat double scale, double sec);
    @Mapping("scaleYTo:duration:")
    public static native SKAction scaleYTo(@MachineSizedFloat double scale, double sec);
    @Mapping("sequence:")
    public static native SKAction sequence(NSArray<?> actions);
    @Mapping("group:")
    public static native SKAction group(NSArray<?> actions);
    @Mapping("repeatAction:count:")
    public static native SKAction repeat(SKAction action, @MachineSizedUInt long count);
    @Mapping("repeatActionForever:")
    public static native SKAction repeatForever(SKAction action);
    @Mapping("fadeInWithDuration:")
    public static native SKAction fadeIn(double sec);
    @Mapping("fadeOutWithDuration:")
    public static native SKAction fadeOut(double sec);
    @Mapping("fadeAlphaBy:duration:")
    public static native SKAction fadeAlphaBy(@MachineSizedFloat double factor, double sec);
    @Mapping("fadeAlphaTo:duration:")
    public static native SKAction fadeAlphaTo(@MachineSizedFloat double alpha, double sec);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("hide")
    public static native SKAction hide();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("unhide")
    public static native SKAction unhide();
    @Mapping("setTexture:")
    public static native SKAction setTexture(SKTexture texture);
    @Mapping("setTexture:resize:")
    public static native SKAction setTexture(SKTexture texture, boolean resize);
    @Mapping("animateWithTextures:timePerFrame:")
    public static native SKAction animate(NSArray<?> textures, double sec);
    @Mapping("animateWithTextures:timePerFrame:resize:restore:")
    public static native SKAction animate(NSArray<?> textures, double sec, boolean resize, boolean restore);
    @Mapping("playSoundFileNamed:waitForCompletion:")
    public static native SKAction playSound(String soundFile, boolean wait);
    @Mapping("colorizeWithColor:colorBlendFactor:duration:")
    public static native SKAction colorize(UIColor color, @MachineSizedFloat double colorBlendFactor, double sec);
    @Mapping("colorizeWithColorBlendFactor:duration:")
    public static native SKAction colorize(@MachineSizedFloat double colorBlendFactor, double sec);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("falloffTo:duration:")
    public static native SKAction falloffTo(float falloff, double sec);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("falloffBy:duration:")
    public static native SKAction falloffBy(float falloff, double sec);
    @Mapping("followPath:duration:")
    public static native SKAction followPath(CGPath path, double sec);
    @Mapping("followPath:asOffset:orientToPath:duration:")
    public static native SKAction followPath(CGPath path, boolean offset, boolean orient, double sec);
    @Mapping("followPath:speed:")
    public static native SKAction followPathWithSpeed(CGPath path, @MachineSizedFloat double speed);
    @Mapping("followPath:asOffset:orientToPath:speed:")
    public static native SKAction followPathWithSpeed(CGPath path, boolean offset, boolean orient, @MachineSizedFloat double speed);
    @Mapping("speedBy:duration:")
    public static native SKAction speedBy(@MachineSizedFloat double speed, double sec);
    @Mapping("speedTo:duration:")
    public static native SKAction speedTo(@MachineSizedFloat double speed, double sec);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("reachTo:rootNode:duration:")
    public static native SKAction reachTo(CGPoint position, SKNode root, double sec);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("reachTo:rootNode:velocity:")
    public static native SKAction reachToWithVelocity(CGPoint position, SKNode root, @MachineSizedFloat double velocity);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("reachToNode:rootNode:duration:")
    public static native SKAction reachToNode(SKNode node, SKNode root, double sec);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("reachToNode:rootNode:velocity:")
    public static native SKAction reachToNodeWithVelocity(SKNode node, SKNode root, @MachineSizedFloat double velocity);
    @Mapping("strengthTo:duration:")
    public static native SKAction strengthTo(float strength, double sec);
    @Mapping("strengthBy:duration:")
    public static native SKAction strengthBy(float strength, double sec);
    @Mapping("waitForDuration:")
    public static native SKAction wait(double sec);
    @Mapping("waitForDuration:withRange:")
    public static native SKAction wait(double sec, double durationRange);
    @Mapping("removeFromParent")
    public static native SKAction removeFromParent();
    @Mapping("runBlock:")
    public static native SKAction runBlock(@Block Runnable block);
    @Mapping("runBlock:queue:")
    public static native SKAction runBlock(@Block Runnable block, DispatchQueue queue);
    @Mapping("runAction:onChildWithName:")
    public static native SKAction runAction(SKAction action, String name);
    @Mapping("customActionWithDuration:actionBlock:")
    public static native SKAction customAction(double seconds, @Block("(,@MachineSizedFloat)") VoidBlock2<SKNode, Double> block);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
