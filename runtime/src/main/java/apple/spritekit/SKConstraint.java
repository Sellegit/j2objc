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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("SpriteKit/SpriteKit.h") @Mapping("SKConstraint")
public class SKConstraint 
    extends NSObject 
    implements NSCoding, NSCopying {

    
    
    public SKConstraint() {}
    
    
    @Mapping("enabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("referenceNode")
    public native SKNode getReferenceNode();
    @Mapping("setReferenceNode:")
    public native void setReferenceNode(SKNode v);
    
    
    
    @Mapping("positionX:")
    public static native SKConstraint positionX(SKRange range);
    @Mapping("positionY:")
    public static native SKConstraint positionY(SKRange range);
    @Mapping("positionX:Y:")
    public static native SKConstraint positionXY(SKRange xRange, SKRange yRange);
    @Mapping("distance:toNode:")
    public static native SKConstraint distanceToNode(SKRange range, SKNode node);
    @Mapping("distance:toPoint:")
    public static native SKConstraint distanceToPoint(SKRange range, CGPoint point);
    @Mapping("distance:toPoint:inNode:")
    public static native SKConstraint distanceToPointInNode(SKRange range, CGPoint point, SKNode node);
    @Mapping("zRotation:")
    public static native SKConstraint zRotation(SKRange zRange);
    @Mapping("orientToNode:offset:")
    public static native SKConstraint orientToNode(SKNode node, SKRange radians);
    @Mapping("orientToPoint:offset:")
    public static native SKConstraint orientToPoint(CGPoint point, SKRange radians);
    @Mapping("orientToPoint:inNode:offset:")
    public static native SKConstraint orientToPointInNode(CGPoint point, SKNode node, SKRange radians);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
