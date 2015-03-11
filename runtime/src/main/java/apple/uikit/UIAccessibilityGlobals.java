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


/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit")
public class UIAccessibilityGlobals 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementDidFinishNotification")
    public static native NSString AnnouncementDidFinishNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementKeyStringValue")
    public static native NSString AnnouncementKeyStringValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementKeyWasSuccessful")
    public static native NSString AnnouncementKeyWasSuccessful();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityNotificationSwitchControlIdentifier")
    public static native String SwitchControlIdentifier();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityVoiceOverStatusChanged")
    public static native NSString VoiceOverStatusChangedNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityMonoAudioStatusDidChangeNotification")
    public static native NSString MonoAudioStatusDidChangeNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityClosedCaptioningStatusDidChangeNotification")
    public static native NSString ClosedCaptioningStatusDidChangeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityInvertColorsStatusDidChangeNotification")
    public static native NSString InvertColorsStatusDidChangeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityGuidedAccessStatusDidChangeNotification")
    public static native NSString GuidedAccessStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityBoldTextStatusDidChangeNotification")
    public static native NSString BoldTextStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityGrayscaleStatusDidChangeNotification")
    public static native NSString GrayscaleStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityReduceTransparencyStatusDidChangeNotification")
    public static native NSString ReduceTransparencyStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityReduceMotionStatusDidChangeNotification")
    public static native NSString ReduceMotionStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityDarkerSystemColorsStatusDidChangeNotification")
    public static native NSString DarkerSystemColorsStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilitySwitchControlStatusDidChangeNotification")
    public static native NSString SwitchControlStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeakSelectionStatusDidChangeNotification")
    public static native NSString SpeakSelectionStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeakScreenStatusDidChangeNotification")
    public static native NSString SpeakScreenStatusDidChangeNotification();
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("UIAccessibilityZoomFocusChanged")
    public static native void zoomFocusChanged(UIAccessibilityZoomType type, CGRect frame, UIView view);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("UIAccessibilityRegisterGestureConflictWithZoom")
    public static native void registerGestureConflictWithZoom();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("UIAccessibilityConvertFrameToScreenCoordinates")
    public static native CGRect convertFrameToScreenCoordinates(CGRect rect, UIView view);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("UIAccessibilityConvertPathToScreenCoordinates")
    public static native UIBezierPath convertPathToScreenCoordinates(UIBezierPath path, UIView view);
    @GlobalFunction("UIAccessibilityPostNotification")
    protected static native void postNotification(int notification, Object argument);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsVoiceOverRunning")
    public static native boolean isVoiceOverRunning();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsMonoAudioEnabled")
    public static native boolean isMonoAudioEnabled();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsClosedCaptioningEnabled")
    public static native boolean isClosedCaptioningEnabled();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsInvertColorsEnabled")
    public static native boolean isInvertColorsEnabled();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsGuidedAccessEnabled")
    public static native boolean isGuidedAccessEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsBoldTextEnabled")
    public static native boolean isBoldTextEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsGrayscaleEnabled")
    public static native boolean isGrayscaleEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsReduceTransparencyEnabled")
    public static native boolean isReduceTransparencyEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsReduceMotionEnabled")
    public static native boolean isReduceMotionEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityDarkerSystemColorsEnabled")
    public static native boolean areDarkerSystemColorsEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsSwitchControlRunning")
    public static native boolean isSwitchControlRunning();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsSpeakSelectionEnabled")
    public static native boolean isSpeakSelectionEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UIAccessibilityIsSpeakScreenEnabled")
    public static native boolean isSpeakScreenEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("UIAccessibilityRequestGuidedAccessSession")
    public static native void requestGuidedAccessSession(boolean enable, @Block VoidBooleanBlock completionHandler);
    
}
