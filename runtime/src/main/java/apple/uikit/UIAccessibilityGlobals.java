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
@Library("UIKit/UIKit.h")
public class UIAccessibilityGlobals 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementDidFinishNotification")
    public static native String AnnouncementDidFinishNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementKeyStringValue")
    public static native String AnnouncementKeyStringValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementKeyWasSuccessful")
    public static native String AnnouncementKeyWasSuccessful();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityNotificationSwitchControlIdentifier")
    public static native String SwitchControlIdentifier();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityVoiceOverStatusChanged")
    public static native String VoiceOverStatusChangedNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityMonoAudioStatusDidChangeNotification")
    public static native String MonoAudioStatusDidChangeNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIAccessibilityClosedCaptioningStatusDidChangeNotification")
    public static native String ClosedCaptioningStatusDidChangeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityInvertColorsStatusDidChangeNotification")
    public static native String InvertColorsStatusDidChangeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIAccessibilityGuidedAccessStatusDidChangeNotification")
    public static native String GuidedAccessStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityBoldTextStatusDidChangeNotification")
    public static native String BoldTextStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityGrayscaleStatusDidChangeNotification")
    public static native String GrayscaleStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityReduceTransparencyStatusDidChangeNotification")
    public static native String ReduceTransparencyStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityReduceMotionStatusDidChangeNotification")
    public static native String ReduceMotionStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityDarkerSystemColorsStatusDidChangeNotification")
    public static native String DarkerSystemColorsStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilitySwitchControlStatusDidChangeNotification")
    public static native String SwitchControlStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeakSelectionStatusDidChangeNotification")
    public static native String SpeakSelectionStatusDidChangeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilitySpeakScreenStatusDidChangeNotification")
    public static native String SpeakScreenStatusDidChangeNotification();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("UIAccessibilityZoomFocusChanged")
    public static native void zoomFocusChanged(@Representing("UIAccessibilityZoomType") long type, CGRect frame, UIView view);
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
    public static native void postNotification(int notification, Object argument);
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
