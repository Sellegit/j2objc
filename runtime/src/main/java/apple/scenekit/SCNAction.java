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





@Library("SceneKit/SceneKit.h") @Mapping("SCNAction")
public class SCNAction 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public SCNAction() { }
    
    
    @Mapping("duration")
    public native double getDuration();
    @Mapping("setDuration:")
    public native void setDuration(double v);
    @Mapping("timingMode")
    public native @Representing("SCNActionTimingMode") long getTimingMode();
    @Mapping("setTimingMode:")
    public native void setTimingMode(@Representing("SCNActionTimingMode") long v);
    @Mapping("timingFunction")
    public native @Block Block1<Float, Float> getTimingFunction();
    @Mapping("setTimingFunction:")
    public native void setTimingFunction(@Block Block1<Float, Float> v);
    @Mapping("speed")
    public native @MachineSizedFloat double getSpeed();
    @Mapping("setSpeed:")
    public native void setSpeed(@MachineSizedFloat double v);
    
    
    
    @Mapping("reversedAction")
    public native SCNAction getReversedAction();
    @Mapping("moveByX:y:z:duration:")
    public static native SCNAction moveBy(@MachineSizedFloat double deltaX, @MachineSizedFloat double deltaY, @MachineSizedFloat double deltaZ, double duration);
    @Mapping("moveBy:duration:")
    public static native SCNAction moveBy(SCNVector3 delta, double duration);
    @Mapping("moveTo:duration:")
    public static native SCNAction moveTo(SCNVector3 location, double duration);
    @Mapping("rotateByX:y:z:duration:")
    public static native SCNAction rotateBy(@MachineSizedFloat double xAngle, @MachineSizedFloat double yAngle, @MachineSizedFloat double zAngle, double duration);
    @Mapping("rotateToX:y:z:duration:")
    public static native SCNAction rotateTo(@MachineSizedFloat double xAngle, @MachineSizedFloat double yAngle, @MachineSizedFloat double zAngle, double duration);
    @Mapping("rotateToX:y:z:duration:shortestUnitArc:")
    public static native SCNAction rotateTo(@MachineSizedFloat double xAngle, @MachineSizedFloat double yAngle, @MachineSizedFloat double zAngle, double duration, boolean shortestUnitArc);
    @Mapping("rotateByAngle:aroundAxis:duration:")
    public static native SCNAction rotateBy(@MachineSizedFloat double angle, SCNVector3 axis, double duration);
    @Mapping("rotateToAxisAngle:duration:")
    public static native SCNAction rotateTo(SCNVector4 axisAngle, double duration);
    @Mapping("scaleBy:duration:")
    public static native SCNAction scaleBy(@MachineSizedFloat double scale, double sec);
    @Mapping("scaleTo:duration:")
    public static native SCNAction scaleTo(@MachineSizedFloat double scale, double sec);
    @Mapping("sequence:")
    public static native SCNAction sequence(NSArray<?> actions);
    @Mapping("group:")
    public static native SCNAction group(NSArray<?> actions);
    @Mapping("repeatAction:count:")
    public static native SCNAction repeat(SCNAction action, @MachineSizedUInt long count);
    @Mapping("repeatActionForever:")
    public static native SCNAction repeatForever(SCNAction action);
    @Mapping("fadeInWithDuration:")
    public static native SCNAction fadeIn(double sec);
    @Mapping("fadeOutWithDuration:")
    public static native SCNAction fadeOut(double sec);
    @Mapping("fadeOpacityBy:duration:")
    public static native SCNAction fadeOpacityBy(@MachineSizedFloat double factor, double sec);
    @Mapping("fadeOpacityTo:duration:")
    public static native SCNAction fadeOpacityTo(@MachineSizedFloat double opacity, double sec);
    @Mapping("waitForDuration:")
    public static native SCNAction wait(double sec);
    @Mapping("waitForDuration:withRange:")
    public static native SCNAction wait(double sec, double durationRange);
    @Mapping("removeFromParentNode")
    public static native SCNAction removeFromParentNode();
    @Mapping("runBlock:")
    public static native SCNAction run(@Block VoidBlock1<SCNNode> block);
    @Mapping("runBlock:queue:")
    public static native SCNAction run(@Block VoidBlock1<SCNNode> block, DispatchQueue queue);
    @Mapping("javaScriptActionWithScript:duration:")
    public static native SCNAction javaScript(String script, double seconds);
    @Mapping("customActionWithDuration:actionBlock:")
    public static native SCNAction custom(double seconds, @Block("(,@MachineSizedFloat)") VoidBlock2<SCNNode, Double> block);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
