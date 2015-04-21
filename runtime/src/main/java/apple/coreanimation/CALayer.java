package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;


@Library("QuartzCore/QuartzCore.h") @Mapping("CALayer")
public class CALayer 
    extends NSObject 
    implements NSCoding, CAMediaTiming {

    
    
    @Mapping("initWithLayer:")
    public CALayer(Object layer) { }
    @Mapping("init")
    public CALayer() { }

    
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("setBounds:")
    public native void setBounds(CGRect v);
    @Mapping("position")
    public native CGPoint getPosition();
    @Mapping("setPosition:")
    public native void setPosition(CGPoint v);
    @Mapping("zPosition")
    public native @MachineSizedFloat double getZPosition();
    @Mapping("setZPosition:")
    public native void setZPosition(@MachineSizedFloat double v);
    @Mapping("anchorPoint")
    public native CGPoint getAnchorPoint();
    @Mapping("setAnchorPoint:")
    public native void setAnchorPoint(CGPoint v);
    @Mapping("anchorPointZ")
    public native @MachineSizedFloat double getAnchorPointZ();
    @Mapping("setAnchorPointZ:")
    public native void setAnchorPointZ(@MachineSizedFloat double v);
    @Mapping("transform")
    public native CATransform3D getTransform();
    @Mapping("setTransform:")
    public native void setTransform(CATransform3D v);
    @Mapping("frame")
    public native CGRect getFrame();
    @Mapping("setFrame:")
    public native void setFrame(CGRect v);
    @Mapping("isHidden")
    public native boolean isHidden();
    @Mapping("setHidden:")
    public native void setHidden(boolean v);
    @Mapping("isDoubleSided")
    public native boolean isDoubleSided();
    @Mapping("setDoubleSided:")
    public native void setDoubleSided(boolean v);
    @Mapping("isGeometryFlipped")
    public native boolean isGeometryFlipped();
    @Mapping("setGeometryFlipped:")
    public native void setGeometryFlipped(boolean v);
    @Mapping("superlayer")
    public native CALayer getSuperlayer();
    @Mapping("sublayers")
    public native NSArray<CALayer> getSublayers();
    @Mapping("setSublayers:")
    public native void setSublayers(NSArray<CALayer> v);
    @Mapping("sublayerTransform")
    public native CATransform3D getSublayerTransform();
    @Mapping("setSublayerTransform:")
    public native void setSublayerTransform(CATransform3D v);
    @Mapping("mask")
    public native CALayer getMask();
    @Mapping("setMask:")
    public native void setMask(CALayer v);
    @Mapping("masksToBounds")
    public native boolean masksToBounds();
    @Mapping("setMasksToBounds:")
    public native void setMasksToBounds(boolean v);
    @Mapping("contents")
    public native Object getContents();
    @Mapping("setContents:")
    public native void setContents(Object v);
    @Mapping("contentsRect")
    public native CGRect getContentsRect();
    @Mapping("setContentsRect:")
    public native void setContentsRect(CGRect v);
    @Mapping("contentsGravity")
    public native String getContentsGravity();
    @Mapping("setContentsGravity:")
    public native void setContentsGravity(String v);
    @Mapping("contentsScale")
    public native @MachineSizedFloat double getContentsScale();
    @Mapping("setContentsScale:")
    public native void setContentsScale(@MachineSizedFloat double v);
    @Mapping("contentsCenter")
    public native CGRect getContentsCenter();
    @Mapping("setContentsCenter:")
    public native void setContentsCenter(CGRect v);
    @Mapping("minificationFilter")
    public native CAFilter getMinificationFilter();
    @Mapping("setMinificationFilter:")
    public native void setMinificationFilter(CAFilter v);
    @Mapping("magnificationFilter")
    public native CAFilter getMagnificationFilter();
    @Mapping("setMagnificationFilter:")
    public native void setMagnificationFilter(CAFilter v);
    @Mapping("minificationFilterBias")
    public native float getMinificationFilterBias();
    @Mapping("setMinificationFilterBias:")
    public native void setMinificationFilterBias(float v);
    @Mapping("isOpaque")
    public native boolean isOpaque();
    @Mapping("setOpaque:")
    public native void setOpaque(boolean v);
    @Mapping("needsDisplayOnBoundsChange")
    public native boolean needsDisplayOnBoundsChange();
    @Mapping("setNeedsDisplayOnBoundsChange:")
    public native void setNeedsDisplayOnBoundsChange(boolean v);
    @Mapping("drawsAsynchronously")
    public native boolean drawsAsynchronously();
    @Mapping("setDrawsAsynchronously:")
    public native void setDrawsAsynchronously(boolean v);
    @Mapping("edgeAntialiasingMask")
    public native CAEdgeAntialiasingMask getEdgeAntialiasingMask();
    @Mapping("setEdgeAntialiasingMask:")
    public native void setEdgeAntialiasingMask(CAEdgeAntialiasingMask v);
    @Mapping("allowsEdgeAntialiasing")
    public native boolean allowsEdgeAntialiasing();
    @Mapping("setAllowsEdgeAntialiasing:")
    public native void setAllowsEdgeAntialiasing(boolean v);
    @Mapping("backgroundColor")
    public native CGColor getBackgroundColor();
    @Mapping("setBackgroundColor:")
    public native void setBackgroundColor(CGColor v);
    @Mapping("cornerRadius")
    public native @MachineSizedFloat double getCornerRadius();
    @Mapping("setCornerRadius:")
    public native void setCornerRadius(@MachineSizedFloat double v);
    @Mapping("borderWidth")
    public native @MachineSizedFloat double getBorderWidth();
    @Mapping("setBorderWidth:")
    public native void setBorderWidth(@MachineSizedFloat double v);
    @Mapping("borderColor")
    public native CGColor getBorderColor();
    @Mapping("setBorderColor:")
    public native void setBorderColor(CGColor v);
    @Mapping("opacity")
    public native float getOpacity();
    @Mapping("setOpacity:")
    public native void setOpacity(float v);
    @Mapping("allowsGroupOpacity")
    public native boolean allowsGroupOpacity();
    @Mapping("setAllowsGroupOpacity:")
    public native void setAllowsGroupOpacity(boolean v);
    @Mapping("compositingFilter")
    public native CIFilter getCompositingFilter();
    @Mapping("setCompositingFilter:")
    public native void setCompositingFilter(CIFilter v);
    @Mapping("filters")
    public native NSArray<CIFilter> getFilters();
    @Mapping("setFilters:")
    public native void setFilters(NSArray<CIFilter> v);
    @Mapping("backgroundFilters")
    public native NSArray<CIFilter> getBackgroundFilters();
    @Mapping("setBackgroundFilters:")
    public native void setBackgroundFilters(NSArray<CIFilter> v);
    @Mapping("shouldRasterize")
    public native boolean shouldRasterize();
    @Mapping("setShouldRasterize:")
    public native void setShouldRasterize(boolean v);
    @Mapping("rasterizationScale")
    public native @MachineSizedFloat double getRasterizationScale();
    @Mapping("setRasterizationScale:")
    public native void setRasterizationScale(@MachineSizedFloat double v);
    @Mapping("shadowColor")
    public native CGColor getShadowColor();
    @Mapping("setShadowColor:")
    public native void setShadowColor(CGColor v);
    @Mapping("shadowOpacity")
    public native float getShadowOpacity();
    @Mapping("setShadowOpacity:")
    public native void setShadowOpacity(float v);
    @Mapping("shadowOffset")
    public native CGSize getShadowOffset();
    @Mapping("setShadowOffset:")
    public native void setShadowOffset(CGSize v);
    @Mapping("shadowRadius")
    public native @MachineSizedFloat double getShadowRadius();
    @Mapping("setShadowRadius:")
    public native void setShadowRadius(@MachineSizedFloat double v);
    @Mapping("shadowPath")
    public native CGPath getShadowPath();
    @Mapping("setShadowPath:")
    public native void setShadowPath(CGPath v);
    @Mapping("actions")
    public native NSDictionary<String, CAAction> getActions();
    @Mapping("setActions:")
    public native void setActions(NSDictionary<String, CAAction> v);
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("delegate")
    public native CALayerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(CALayerDelegate v);
    @Mapping("style")
    public native NSDictionary<String, NSObject> getStyle();
    @Mapping("setStyle:")
    public native void setStyle(NSDictionary<String, NSObject> v);
    @Mapping("visibleRect")
    public native CGRect getVisibleRect();
    @Mapping("beginTime")
    public native double getBeginTime();
    @Mapping("setBeginTime:")
    public native void setBeginTime(double v);
    @Mapping("duration")
    public native double getDuration();
    @Mapping("setDuration:")
    public native void setDuration(double v);
    @Mapping("speed")
    public native float getSpeed();
    @Mapping("setSpeed:")
    public native void setSpeed(float v);
    @Mapping("timeOffset")
    public native double getTimeOffset();
    @Mapping("setTimeOffset:")
    public native void setTimeOffset(double v);
    @Mapping("repeatCount")
    public native float getRepeatCount();
    @Mapping("setRepeatCount:")
    public native void setRepeatCount(float v);
    @Mapping("repeatDuration")
    public native double getRepeatDuration();
    @Mapping("setRepeatDuration:")
    public native void setRepeatDuration(double v);
    @Mapping("autoreverses")
    public native boolean autoreverses();
    @Mapping("setAutoreverses:")
    public native void setAutoreverses(boolean v);
    @Mapping("fillMode")
    public native CAFillMode getFillMode();
    @Mapping("setFillMode:")
    public native void setFillMode(CAFillMode v);

    
    
    @Mapping("presentationLayer")
    public native CALayer getPresentationLayer();
    @Mapping("modelLayer")
    public native CALayer getModelLayer();
    @Mapping("shouldArchiveValueForKey:")
    public native boolean shouldArchiveValue(String key);
    @Mapping("affineTransform")
    public native CGAffineTransform getAffineTransform();
    @Mapping("setAffineTransform:")
    public native void setAffineTransform(CGAffineTransform m);
    @Mapping("contentsAreFlipped")
    public native boolean areContentsFlipped();
    @Mapping("removeFromSuperlayer")
    public native void removeFromSuperlayer();
    @Mapping("addSublayer:")
    public native void addSublayer(CALayer layer);
    @Mapping("insertSublayer:atIndex:")
    public native void insertSublayerAt(CALayer layer, int idx);
    @Mapping("insertSublayer:below:")
    public native void insertSublayerBelow(CALayer layer, CALayer sibling);
    @Mapping("insertSublayer:above:")
    public native void insertSublayerAbove(CALayer layer, CALayer sibling);
    @Mapping("replaceSublayer:with:")
    public native void replaceSublayer(CALayer layer, CALayer layer2);
    @Mapping("convertPoint:fromLayer:")
    public native CGPoint convertPointFromLayer(CGPoint p, CALayer l);
    @Mapping("convertPoint:toLayer:")
    public native CGPoint convertPointToLayer(CGPoint p, CALayer l);
    @Mapping("convertRect:fromLayer:")
    public native CGRect convertRectFromLayer(CGRect r, CALayer l);
    @Mapping("convertRect:toLayer:")
    public native CGRect convertRectToLayer(CGRect r, CALayer l);
    @Mapping("convertTime:fromLayer:")
    public native double convertTimeFromLayer(double t, CALayer l);
    @Mapping("convertTime:toLayer:")
    public native double convertTimeToLayer(double t, CALayer l);
    @Mapping("hitTest:")
    public native CALayer hitTest(CGPoint p);
    @Mapping("containsPoint:")
    public native boolean containsPoint(CGPoint p);
    @Mapping("display")
    public native void display();
    @Mapping("setNeedsDisplay")
    public native void setNeedsDisplay();
    @Mapping("setNeedsDisplayInRect:")
    public native void setNeedsDisplay(CGRect r);
    @Mapping("needsDisplay")
    public native boolean needsDisplay();
    @Mapping("displayIfNeeded")
    public native void displayIfNeeded();
    @Mapping("drawInContext:")
    public native void draw(CGContext ctx);
    @Mapping("renderInContext:")
    public native void render(CGContext ctx);
    @Mapping("preferredFrameSize")
    public native CGSize getPreferredFrameSize();
    @Mapping("setNeedsLayout")
    public native void setNeedsLayout();
    @Mapping("needsLayout")
    public native boolean needsLayout();
    @Mapping("layoutIfNeeded")
    public native void layoutIfNeeded();
    @Mapping("layoutSublayers")
    public native void layoutSublayers();
    @Mapping("actionForKey:")
    public native CAAction getAction(String event);
    @Mapping("addAnimation:forKey:")
    public native void addAnimation(CAAnimation anim, String key);
    @Mapping("removeAllAnimations")
    public native void removeAllAnimations();
    @Mapping("removeAnimationForKey:")
    public native void removeAnimation(String key);
    @Mapping("animationKeys")
    public native NSArray<String> getAnimationKeys();
    @Mapping("animationForKey:")
    public native CAAnimation getAnimation(String key);
    @Mapping("layer")
    public static native CALayer create();
    @Mapping("defaultValueForKey:")
    public static native Object getDefaultValue(String key);
    @Mapping("needsDisplayForKey:")
    public static native boolean needsDisplay(String key);
    @Mapping("defaultActionForKey:")
    public static native CAAction getDefaultAction(String event);
    @Mapping("scrollPoint:")
    public native void scrollTo(CGPoint p);
    @Mapping("scrollRectToVisible:")
    public native void scrollTo(CGRect r);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
