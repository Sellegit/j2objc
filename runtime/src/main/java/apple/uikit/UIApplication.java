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

@Library("UIKit") @Mapping("UIApplication")
public class UIApplication 
    extends UIResponder 
    implements UIActionSheetDelegate {

    
    
    public UIApplication() {}
    
    
    @Mapping("delegate")
    public native UIApplicationDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIApplicationDelegate v);
    @Mapping("isIdleTimerDisabled")
    public native boolean isIdleTimerDisabled();
    @Mapping("setIdleTimerDisabled:")
    public native void setIdleTimerDisabled(boolean v);
    @Mapping("keyWindow")
    public native UIWindow getKeyWindow();
    @Mapping("windows")
    public native NSArray<UIWindow> getWindows();
    @Mapping("isNetworkActivityIndicatorVisible")
    public native boolean isNetworkActivityIndicatorVisible();
    @Mapping("setNetworkActivityIndicatorVisible:")
    public native void setNetworkActivityIndicatorVisible(boolean v);
    @Mapping("statusBarStyle")
    public native @Representing("UIStatusBarStyle") @MachineSizedSInt long getStatusBarStyle();
    @Mapping("setStatusBarStyle:")
    public native void setStatusBarStyle(@Representing("UIStatusBarStyle") @MachineSizedSInt long v);
    @Mapping("isStatusBarHidden")
    public native boolean isStatusBarHidden();
    @Mapping("setStatusBarHidden:")
    public native void setStatusBarHidden(boolean v);
    @Mapping("statusBarOrientation")
    public native @Representing("UIInterfaceOrientation") @MachineSizedSInt long getStatusBarOrientation();
    @Mapping("setStatusBarOrientation:")
    public native void setStatusBarOrientation(@Representing("UIInterfaceOrientation") @MachineSizedSInt long v);
    @Mapping("statusBarOrientationAnimationDuration")
    public native double getStatusBarOrientationAnimationDuration();
    @Mapping("statusBarFrame")
    public native CGRect getStatusBarFrame();
    @Mapping("applicationIconBadgeNumber")
    public native @MachineSizedSInt long getApplicationIconBadgeNumber();
    @Mapping("setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("applicationSupportsShakeToEdit")
    public native boolean supportsShakeToEdit();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setApplicationSupportsShakeToEdit:")
    public native void setSupportsShakeToEdit(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("applicationState")
    public native @Representing("UIApplicationState") @MachineSizedSInt long getApplicationState();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("backgroundTimeRemaining")
    public native double getBackgroundTimeRemaining();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("backgroundRefreshStatus")
    public native @Representing("UIBackgroundRefreshStatus") @MachineSizedSInt long getBackgroundRefreshStatus();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isProtectedDataAvailable")
    public native boolean isProtectedDataAvailable();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("userInterfaceLayoutDirection")
    public native @Representing("UIUserInterfaceLayoutDirection") @MachineSizedSInt long getUserInterfaceLayoutDirection();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredContentSizeCategory")
    public native String getPreferredContentSizeCategory();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("scheduledLocalNotifications")
    public native NSArray<UILocalNotification> getScheduledLocalNotifications();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setScheduledLocalNotifications:")
    public native void setScheduledLocalNotifications(NSArray<UILocalNotification> v);
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIBackgroundTaskInvalid")
    public static native @MachineSizedUInt long getInvalidBackgroundTask();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIMinimumKeepAliveTimeout")
    public static native double getMinimumKeepAliveTimeout();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationBackgroundFetchIntervalMinimum")
    public static native double getBackgroundFetchIntervalMinimum();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationBackgroundFetchIntervalNever")
    public static native double getBackgroundFetchIntervalNever();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIApplicationDidEnterBackgroundNotification")
    public static native NSString DidEnterBackgroundNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIApplicationWillEnterForegroundNotification")
    public static native NSString WillEnterForegroundNotification();
    @GlobalConstant("UIApplicationDidFinishLaunchingNotification")
    public static native NSString DidFinishLaunchingNotification();
    @GlobalConstant("UIApplicationDidBecomeActiveNotification")
    public static native NSString DidBecomeActiveNotification();
    @GlobalConstant("UIApplicationWillResignActiveNotification")
    public static native NSString WillResignActiveNotification();
    @GlobalConstant("UIApplicationDidReceiveMemoryWarningNotification")
    public static native NSString DidReceiveMemoryWarningNotification();
    @GlobalConstant("UIApplicationWillTerminateNotification")
    public static native NSString WillTerminateNotification();
    @GlobalConstant("UIApplicationSignificantTimeChangeNotification")
    public static native NSString SignificantTimeChangeNotification();
    @GlobalConstant("UIApplicationWillChangeStatusBarOrientationNotification")
    public static native NSString WillChangeStatusBarOrientationNotification();
    @GlobalConstant("UIApplicationDidChangeStatusBarOrientationNotification")
    public static native NSString DidChangeStatusBarOrientationNotification();
    @GlobalConstant("UIApplicationStatusBarOrientationUserInfoKey")
    protected static native NSString StatusBarOrientationUserInfoKey();
    @GlobalConstant("UIApplicationWillChangeStatusBarFrameNotification")
    public static native NSString WillChangeStatusBarFrameNotification();
    @GlobalConstant("UIApplicationDidChangeStatusBarFrameNotification")
    public static native NSString DidChangeStatusBarFrameNotification();
    @GlobalConstant("UIApplicationStatusBarFrameUserInfoKey")
    protected static native NSString StatusBarFrameUserInfoKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationBackgroundRefreshStatusDidChangeNotification")
    public static native NSString BackgroundRefreshStatusDidChangeNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIApplicationProtectedDataWillBecomeUnavailable")
    public static native NSString ProtectedDataWillBecomeUnavailableNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIApplicationProtectedDataDidBecomeAvailable")
    public static native NSString ProtectedDataDidBecomeAvailableNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIApplicationOpenSettingsURLString")
    public static native String getOpenSettingsURLString();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryDidChangeNotification")
    public static native NSString ContentSizeCategoryDidChangeNotification();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryNewValueKey")
    protected static native NSString ContentSizeCategoryNewValueKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationUserDidTakeScreenshotNotification")
    public static native NSString UserDidTakeScreenshotNotification();
    
    @GlobalFunction("UIApplicationMain")
    protected static native int main(int argc, Todo argv, String principalClassName, String delegateClassName);
    
    @Mapping("beginIgnoringInteractionEvents")
    public native void beginIgnoringInteractionEvents();
    @Mapping("endIgnoringInteractionEvents")
    public native void endIgnoringInteractionEvents();
    @Mapping("isIgnoringInteractionEvents")
    public native boolean isIgnoringInteractionEvents();
    @Mapping("openURL:")
    public native boolean openURL(NSURL url);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("canOpenURL:")
    public native boolean canOpenURL(NSURL url);
    @Mapping("sendEvent:")
    public native void sendEvent(UIEvent event);
    @Mapping("sendAction:to:from:forEvent:")
    public native boolean sendAction(Selector action, Object target, Object sender, UIEvent event);
    @Mapping("setStatusBarStyle:animated:")
    public native void setStatusBarStyle(@Representing("UIStatusBarStyle") @MachineSizedSInt long statusBarStyle, boolean animated);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setStatusBarHidden:withAnimation:")
    public native void setStatusBarHidden(boolean hidden, @Representing("UIStatusBarAnimation") @MachineSizedSInt long animation);
    @Mapping("setStatusBarOrientation:animated:")
    public native void setStatusBarOrientation(@Representing("UIInterfaceOrientation") @MachineSizedSInt long interfaceOrientation, boolean animated);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("supportedInterfaceOrientationsForWindow:")
    public native @MachineSizedUInt long getSupportedInterfaceOrientations(UIWindow window);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("beginBackgroundTaskWithExpirationHandler:")
    public native @MachineSizedUInt long beginBackgroundTask(@Block Runnable handler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("beginBackgroundTaskWithName:expirationHandler:")
    public native @MachineSizedUInt long beginBackgroundTask(String taskName, @Block Runnable handler);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("endBackgroundTask:")
    public native void endBackgroundTask(@MachineSizedUInt long identifier);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setMinimumBackgroundFetchInterval:")
    public native void setMinimumBackgroundFetchInterval(double minimumBackgroundFetchInterval);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setKeepAliveTimeout:handler:")
    public native boolean setKeepAliveTimeout(double timeout, @Block Runnable keepAliveHandler);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("clearKeepAliveTimeout")
    public native void clearKeepAliveTimeout();
    @Mapping("sharedApplication")
    public static native UIApplication getSharedApplication();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("registerForRemoteNotifications")
    public native void registerForRemoteNotifications();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("unregisterForRemoteNotifications")
    public native void unregisterForRemoteNotifications();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isRegisteredForRemoteNotifications")
    public native boolean isRegisteredForRemoteNotifications();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("registerForRemoteNotificationTypes:")
    public native void registerForRemoteNotificationTypes(@Representing("UIRemoteNotificationType") @MachineSizedUInt long types);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("enabledRemoteNotificationTypes")
    public native @Representing("UIRemoteNotificationType") @MachineSizedUInt long getEnabledRemoteNotificationTypes();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("presentLocalNotificationNow:")
    public native void presentLocalNotificationNow(UILocalNotification notification);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("scheduleLocalNotification:")
    public native void scheduleLocalNotification(UILocalNotification notification);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("cancelLocalNotification:")
    public native void cancelLocalNotification(UILocalNotification notification);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("cancelAllLocalNotifications")
    public native void cancelAllLocalNotifications();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("registerUserNotificationSettings:")
    public native void registerUserNotificationSettings(UIUserNotificationSettings notificationSettings);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("currentUserNotificationSettings")
    public native UIUserNotificationSettings getCurrentUserNotificationSettings();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("beginReceivingRemoteControlEvents")
    public native void beginReceivingRemoteControlEvents();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("endReceivingRemoteControlEvents")
    public native void endReceivingRemoteControlEvents();
    @Mapping("setNewsstandIconImage:")
    public native void setNewsstandIconImage(UIImage image);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("extendStateRestoration")
    public native void extendStateRestoration();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("completeStateRestoration")
    public native void completeStateRestoration();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("ignoreSnapshotOnNextApplicationLaunch")
    public native void ignoreSnapshotOnNextApplicationLaunch();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("registerObjectForStateRestoration:restorationIdentifier:")
    public static native void registerObjectForStateRestoration(UIStateRestoring object, String restorationIdentifier);
    @Mapping("actionSheet:clickedButtonAtIndex:")
    public native void clicked(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    @Mapping("actionSheetCancel:")
    public native void cancel(UIActionSheet actionSheet);
    @Mapping("willPresentActionSheet:")
    public native void willPresent(UIActionSheet actionSheet);
    @Mapping("didPresentActionSheet:")
    public native void didPresent(UIActionSheet actionSheet);
    @Mapping("actionSheet:willDismissWithButtonIndex:")
    public native void willDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    @Mapping("actionSheet:didDismissWithButtonIndex:")
    public native void didDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    
}
