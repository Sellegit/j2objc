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





@Library("SpriteKit") @Mapping("SKShapeNode")
public class SKShapeNode 
    extends SKNode 
     {

    
    
    public SKShapeNode() {}
    @Mapping("initWithCoder:")
    public SKShapeNode(NSCoder aDecoder) { }
    
    
    @Mapping("path")
    public native CGPath getPath();
    public native void setPath(CGPath v);
    @Mapping("strokeColor")
    public native UIColor getStrokeColor();
    public native void setStrokeColor(UIColor v);
    @Mapping("fillColor")
    public native UIColor getFillColor();
    public native void setFillColor(UIColor v);
    @Mapping("blendMode")
    public native @Representing("SKBlendMode") @MachineSizedSInt long getBlendMode();
    public native void setBlendMode(@Representing("SKBlendMode") @MachineSizedSInt long v);
    @Mapping("isAntialiased")
    public native boolean isAntialiased();
    public native void setAntialiased(boolean v);
    @Mapping("lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    public native void setLineWidth(@MachineSizedFloat double v);
    @Mapping("glowWidth")
    public native @MachineSizedFloat double getGlowWidth();
    public native void setGlowWidth(@MachineSizedFloat double v);
    @Mapping("lineCap")
    public native @Representing("CGLineCap") int getLineCap();
    public native void setLineCap(@Representing("CGLineCap") int v);
    @Mapping("lineJoin")
    public native @Representing("CGLineJoin") int getLineJoin();
    public native void setLineJoin(@Representing("CGLineJoin") int v);
    @Mapping("miterLimit")
    public native @MachineSizedFloat double getMiterLimit();
    public native void setMiterLimit(@MachineSizedFloat double v);
    @Mapping("lineLength")
    public native @MachineSizedFloat double getLineLength();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("fillTexture")
    public native SKTexture getFillTexture();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setFillTexture(SKTexture v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("fillShader")
    public native SKShader getFillShader();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setFillShader(SKShader v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("strokeTexture")
    public native SKTexture getStrokeTexture();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setStrokeTexture(SKTexture v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("strokeShader")
    public native SKShader getStrokeShader();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setStrokeShader(SKShader v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithPath:")
    public static native SKShapeNode createPath(CGPath path);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithPath:centered:")
    public static native SKShapeNode createPath(CGPath path, boolean centered);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithRect:")
    public static native SKShapeNode createRect(CGRect rect);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithRectOfSize:")
    public static native SKShapeNode createRect(CGSize size);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithRect:cornerRadius:")
    public static native SKShapeNode createRect(CGRect rect, @MachineSizedFloat double cornerRadius);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithRectOfSize:cornerRadius:")
    public static native SKShapeNode createRect(CGSize size, @MachineSizedFloat double cornerRadius);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithCircleOfRadius:")
    public static native SKShapeNode createCircle(@MachineSizedFloat double radius);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithEllipseInRect:")
    public static native SKShapeNode createEllipse(CGRect rect);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithEllipseOfSize:")
    public static native SKShapeNode createEllipse(CGSize size);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithPoints:count:")
    public static native SKShapeNode createWithPoints(CGPoint points, @MachineSizedUInt long numPoints);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shapeNodeWithSplinePoints:count:")
    public static native SKShapeNode createWithSplinePoints(CGPoint points, @MachineSizedUInt long numPoints);
    
}
