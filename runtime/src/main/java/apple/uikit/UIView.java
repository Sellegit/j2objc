package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/**
 * @since Available in iOS 2.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIView")
public class UIView 
    extends UIResponder 
    implements NSCoding, UIAppearanceContainer, UIDynamicItem, UITraitEnvironment, UICoordinateSpace, UIAccessibilityIdentification {

    
    
    @Mapping("initWithFrame:")
    public UIView(CGRect frame) { }
    @Mapping("init")
    public UIView() { }

    
    @Mapping("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Mapping("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Mapping("tag")
    public native @MachineSizedSInt long getTag();
    @Mapping("setTag:")
    public native void setTag(@MachineSizedSInt long v);
    @Mapping("layer")
    public native CALayer getLayer();
    @Mapping("frame")
    public native CGRect getFrame();
    @Mapping("setFrame:")
    public native void setFrame(CGRect v);
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("setBounds:")
    public native void setBounds(CGRect v);
    @Mapping("center")
    public native CGPoint getCenter();
    @Mapping("setCenter:")
    public native void setCenter(CGPoint v);
    @Mapping("transform")
    public native CGAffineTransform getTransform();
    @Mapping("setTransform:")
    public native void setTransform(CGAffineTransform v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("contentScaleFactor")
    public native @MachineSizedFloat double getContentScaleFactor();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setContentScaleFactor:")
    public native void setContentScaleFactor(@MachineSizedFloat double v);
    @Mapping("isMultipleTouchEnabled")
    public native boolean isMultipleTouchEnabled();
    @Mapping("setMultipleTouchEnabled:")
    public native void setMultipleTouchEnabled(boolean v);
    @Mapping("isExclusiveTouch")
    public native boolean isExclusiveTouch();
    @Mapping("setExclusiveTouch:")
    public native void setExclusiveTouch(boolean v);
    @Mapping("autoresizesSubviews")
    public native boolean autoresizesSubviews();
    @Mapping("setAutoresizesSubviews:")
    public native void setAutoresizesSubviews(boolean v);
    @Mapping("autoresizingMask")
    public native @Representing("UIViewAutoresizing") long getAutoresizingMask();
    @Mapping("setAutoresizingMask:")
    public native void setAutoresizingMask(@Representing("UIViewAutoresizing") long v);
    @Mapping("superview")
    public native UIView getSuperview();
    @Mapping("subviews")
    public native NSArray<UIView> getSubviews();
    @Mapping("window")
    public native UIWindow getWindow();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("layoutMargins")
    public native UIEdgeInsets getLayoutMargins();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setLayoutMargins:")
    public native void setLayoutMargins(UIEdgeInsets v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preservesSuperviewLayoutMargins")
    public native boolean preservesSuperviewLayoutMargins();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPreservesSuperviewLayoutMargins:")
    public native void setPreservesSuperviewLayoutMargins(boolean v);
    @Mapping("clipsToBounds")
    public native boolean clipsToBounds();
    @Mapping("setClipsToBounds:")
    public native void setClipsToBounds(boolean v);
    @Mapping("backgroundColor")
    public native UIColor getBackgroundColor();
    @Mapping("setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Mapping("alpha")
    public native @MachineSizedFloat double getAlpha();
    @Mapping("setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Mapping("isOpaque")
    public native boolean isOpaque();
    @Mapping("setOpaque:")
    public native void setOpaque(boolean v);
    @Mapping("clearsContextBeforeDrawing")
    public native boolean clearsContextBeforeDrawing();
    @Mapping("setClearsContextBeforeDrawing:")
    public native void setClearsContextBeforeDrawing(boolean v);
    @Mapping("isHidden")
    public native boolean isHidden();
    @Mapping("setHidden:")
    public native void setHidden(boolean v);
    @Mapping("contentMode")
    public native @Representing("UIViewContentMode") long getContentMode();
    @Mapping("setContentMode:")
    public native void setContentMode(@Representing("UIViewContentMode") long v);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("contentStretch")
    public native CGRect getContentStretch();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setContentStretch:")
    public native void setContentStretch(CGRect v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("maskView")
    public native UIView getMaskView();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setMaskView:")
    public native void setMaskView(UIView v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tintAdjustmentMode")
    public native @Representing("UIViewTintAdjustmentMode") long getTintAdjustmentMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTintAdjustmentMode:")
    public native void setTintAdjustmentMode(@Representing("UIViewTintAdjustmentMode") long v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("gestureRecognizers")
    public native NSArray<UIGestureRecognizer> getGestureRecognizers();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setGestureRecognizers:")
    public native void setGestureRecognizers(NSArray<UIGestureRecognizer> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("motionEffects")
    public native NSArray<UIMotionEffect> getMotionEffects();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setMotionEffects:")
    public native void setMotionEffects(NSArray<UIMotionEffect> v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("restorationIdentifier")
    public native String getRestorationIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setRestorationIdentifier:")
    public native void setRestorationIdentifier(String v);
    @Mapping("traitCollection")
    public native UITraitCollection getTraitCollection();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);

    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIViewNoIntrinsicMetric")
    public static native @MachineSizedFloat double NoIntrinsicMetric();

    @Mapping("hitTest:withEvent:")
    public native UIView hitTest(CGPoint point, UIEvent event);
    @Mapping("pointInside:withEvent:")
    public native boolean isPointInside(CGPoint point, UIEvent event);
    @Mapping("convertPoint:toView:")
    public native CGPoint convertPointToView(CGPoint point, UIView view);
    @Mapping("convertPoint:fromView:")
    public native CGPoint convertPointFromView(CGPoint point, UIView view);
    @Mapping("convertRect:toView:")
    public native CGRect convertRectToView(CGRect rect, UIView view);
    @Mapping("convertRect:fromView:")
    public native CGRect convertRectFromView(CGRect rect, UIView view);
    @Mapping("sizeThatFits:")
    public native CGSize getSizeThatFits(CGSize size);
    @Mapping("sizeToFit")
    public native void sizeToFit();
    @Mapping("removeFromSuperview")
    public native void removeFromSuperview();
    @Mapping("insertSubview:atIndex:")
    public native void insertSubview(UIView view, @MachineSizedSInt long index);
    @Mapping("exchangeSubviewAtIndex:withSubviewAtIndex:")
    public native void exchangeSubview(@MachineSizedSInt long index1, @MachineSizedSInt long index2);
    @Mapping("addSubview:")
    public native void addSubview(UIView view);
    @Mapping("insertSubview:belowSubview:")
    public native void insertSubviewBelow(UIView view, UIView siblingSubview);
    @Mapping("insertSubview:aboveSubview:")
    public native void insertSubviewAbove(UIView view, UIView siblingSubview);
    @Mapping("bringSubviewToFront:")
    public native void bringSubviewToFront(UIView view);
    @Mapping("sendSubviewToBack:")
    public native void sendSubviewToBack(UIView view);
    @Mapping("didAddSubview:")
    public native void didAddSubview(UIView subview);
    @Mapping("willRemoveSubview:")
    public native void willRemoveSubview(UIView subview);
    @Mapping("willMoveToSuperview:")
    public native void willMoveToSuperview(UIView newSuperview);
    @Mapping("didMoveToSuperview")
    public native void didMoveToSuperview();
    @Mapping("willMoveToWindow:")
    public native void willMoveToWindow(UIWindow newWindow);
    @Mapping("didMoveToWindow")
    public native void didMoveToWindow();
    @Mapping("isDescendantOfView:")
    public native boolean isDescendantOf(UIView view);
    @Mapping("viewWithTag:")
    public native UIView getViewWithTag(@MachineSizedSInt long tag);
    @Mapping("setNeedsLayout")
    public native void setNeedsLayout();
    @Mapping("layoutIfNeeded")
    public native void layoutIfNeeded();
    @Mapping("layoutSubviews")
    public native void layoutSubviews();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("layoutMarginsDidChange")
    public native void layoutMarginsDidChange();
    @Mapping("drawRect:")
    public native void draw(CGRect rect);
    @Mapping("setNeedsDisplay")
    public native void setNeedsDisplay();
    @Mapping("setNeedsDisplayInRect:")
    public native void setNeedsDisplay(CGRect rect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tintColorDidChange")
    public native void tintColorDidChange();
    @Mapping("beginAnimations:context:")
    public static native void beginAnimations(String animationID, Todo context);
    @Mapping("commitAnimations")
    public static native void commitAnimations();
    @Mapping("setAnimationDelegate:")
    public static native void setAnimationDelegate(Object delegate);
    @Mapping("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(Selector selector);
    @Mapping("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(Selector selector);
    @Mapping("setAnimationDuration:")
    public static native void setAnimationDurationInSeconds(double duration);
    @Mapping("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);
    @Mapping("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);
    @Mapping("setAnimationCurve:")
    public static native void setAnimationCurve(@Representing("UIViewAnimationCurve") long curve);
    @Mapping("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);
    @Mapping("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);
    @Mapping("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);
    @Mapping("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransition(@Representing("UIViewAnimationTransition") long transition, UIView view, boolean cache);
    @Mapping("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);
    @Mapping("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("performWithoutAnimation:")
    public static native void performWithoutAnimation(@Block Runnable actionsWithoutAnimation);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("animateWithDuration:delay:options:animations:completion:")
    public static native void animate(double duration, double delay, @Representing("UIViewAnimationOptions") long options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("animateWithDuration:animations:completion:")
    public static native void animate(double duration, @Block Runnable animations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("animateWithDuration:animations:")
    public static native void animate(double duration, @Block Runnable animations);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animate(double duration, double delay, @MachineSizedFloat double dampingRatio, @MachineSizedFloat double velocity, @Representing("UIViewAnimationOptions") long options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("transitionWithView:duration:options:animations:completion:")
    public static native void transition(UIView view, double duration, @Representing("UIViewAnimationOptions") long options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("transitionFromView:toView:duration:options:completion:")
    public static native void transition(UIView fromView, UIView toView, double duration, @Representing("UIViewAnimationOptions") long options, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimation(@Representing("UISystemAnimation") long animation, NSArray<?> views, @Representing("UIViewAnimationOptions") long options, @Block Runnable parallelAnimations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframes(double duration, double delay, @Representing("UIViewKeyframeAnimationOptions") long options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframe(double frameStartTime, double frameDuration, @Block Runnable animations);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("addGestureRecognizer:")
    public native void addGestureRecognizer(UIGestureRecognizer gestureRecognizer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("removeGestureRecognizer:")
    public native void removeGestureRecognizer(UIGestureRecognizer gestureRecognizer);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addMotionEffect:")
    public native void addMotionEffect(UIMotionEffect effect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("removeMotionEffect:")
    public native void removeMotionEffect(UIMotionEffect effect);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("constraints")
    public native NSArray<NSLayoutConstraint> getConstraints();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("addConstraint:")
    public native void addConstraint(NSLayoutConstraint constraint);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("addConstraints:")
    public native void addConstraints(NSArray<?> constraints);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("removeConstraint:")
    public native void removeConstraint(NSLayoutConstraint constraint);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("removeConstraints:")
    public native void removeConstraints(NSArray<?> constraints);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("updateConstraintsIfNeeded")
    public native void updateConstraintsIfNeeded();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("updateConstraints")
    public native void updateConstraints();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("needsUpdateConstraints")
    public native boolean needsUpdateConstraints();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setNeedsUpdateConstraints")
    public native void setNeedsUpdateConstraints();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("translatesAutoresizingMaskIntoConstraints")
    public native boolean translatesAutoresizingMaskIntoConstraints();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setTranslatesAutoresizingMaskIntoConstraints:")
    public native void setTranslatesAutoresizingMaskIntoConstraints(boolean flag);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("alignmentRectForFrame:")
    public native CGRect getAlignmentRectForFrame(CGRect frame);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("frameForAlignmentRect:")
    public native CGRect getFrameForAlignmentRect(CGRect alignmentRect);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("alignmentRectInsets")
    public native UIEdgeInsets getAlignmentRectInsets();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("viewForBaselineLayout")
    public native UIView getViewForBaselineLayout();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("intrinsicContentSize")
    public native CGSize getIntrinsicContentSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("invalidateIntrinsicContentSize")
    public native void invalidateIntrinsicContentSize();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("contentHuggingPriorityForAxis:")
    public native float getContentHuggingPriority(@Representing("UILayoutConstraintAxis") long axis);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setContentHuggingPriority:forAxis:")
    public native void setContentHuggingPriority(float priority, @Representing("UILayoutConstraintAxis") long axis);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("contentCompressionResistancePriorityForAxis:")
    public native float getContentCompressionResistancePriority(@Representing("UILayoutConstraintAxis") long axis);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setContentCompressionResistancePriority:forAxis:")
    public native void setContentCompressionResistancePriority(float priority, @Representing("UILayoutConstraintAxis") long axis);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("systemLayoutSizeFittingSize:")
    public native CGSize getSystemLayoutSizeFittingSize(CGSize targetSize);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:")
    public native CGSize getSystemLayoutSizeFittingSize(CGSize targetSize, float horizontalFittingPriority, float verticalFittingPriority);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("constraintsAffectingLayoutForAxis:")
    public native NSArray<NSLayoutConstraint> getConstraintsAffectingLayout(@Representing("UILayoutConstraintAxis") long axis);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("exerciseAmbiguityInLayout")
    public native void exerciseAmbiguityInLayout();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("encodeRestorableStateWithCoder:")
    public native void encodeRestorableState(NSCoder coder);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("decodeRestorableStateWithCoder:")
    public native void decodeRestorableState(NSCoder coder);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("snapshotViewAfterScreenUpdates:")
    public native UIView getSnapshot(boolean afterUpdates);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:")
    public native UIView getResizableSnapshot(CGRect rect, boolean afterUpdates, UIEdgeInsets capInsets);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("drawViewHierarchyInRect:afterScreenUpdates:")
    public native boolean drawViewHierarchy(CGRect rect, boolean afterUpdates);
    @Mapping("endEditing:")
    public native boolean endEditing(boolean force);
    @Mapping("viewPrintFormatter")
    public native UIViewPrintFormatter getViewPrintFormatter();
    @Mapping("drawRect:forViewPrintFormatter:")
    public native void draw(CGRect rect, UIViewPrintFormatter formatter);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertPoint:toCoordinateSpace:")
    public native CGPoint convertPointToCoordinateSpace(CGPoint point, UICoordinateSpace coordinateSpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertPoint:fromCoordinateSpace:")
    public native CGPoint convertPointFromCoordinateSpace(CGPoint point, UICoordinateSpace coordinateSpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertRect:toCoordinateSpace:")
    public native CGRect convertRectToCoordinateSpace(CGRect rect, UICoordinateSpace coordinateSpace);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("convertRect:fromCoordinateSpace:")
    public native CGRect convertRectFromCoordinateSpace(CGRect rect, UICoordinateSpace coordinateSpace);

}
