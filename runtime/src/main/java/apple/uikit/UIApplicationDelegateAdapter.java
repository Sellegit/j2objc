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
@Adapter
public abstract class UIApplicationDelegateAdapter 
    extends Object 
    implements UIApplicationDelegate {

    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("window")
    public UIWindow getWindow() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setWindow:")
    public void setWindow(UIWindow v) { throw new UnsupportedOperationException(); }

    
    
    @NotImplemented("applicationDidFinishLaunching:")
    public void didFinishLaunching(UIApplication application) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("application:willFinishLaunchingWithOptions:")
    public boolean willFinishLaunching(UIApplication application, NSDictionary<?, ?> launchOptions) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("application:didFinishLaunchingWithOptions:")
    public boolean didFinishLaunching(UIApplication application, NSDictionary<?, ?> launchOptions) { throw new UnsupportedOperationException(); }
    @NotImplemented("applicationDidBecomeActive:")
    public void didBecomeActive(UIApplication application) { throw new UnsupportedOperationException(); }
    @NotImplemented("applicationWillResignActive:")
    public void willResignActive(UIApplication application) { throw new UnsupportedOperationException(); }
    @NotImplemented("application:handleOpenURL:")
    public boolean handleOpenURL(UIApplication application, NSURL url) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.2 and later.
     */
    @NotImplemented("application:openURL:sourceApplication:annotation:")
    public boolean openURL(UIApplication application, NSURL url, String sourceApplication, Object annotation) { throw new UnsupportedOperationException(); }
    @NotImplemented("applicationDidReceiveMemoryWarning:")
    public void didReceiveMemoryWarning(UIApplication application) { throw new UnsupportedOperationException(); }
    @NotImplemented("applicationWillTerminate:")
    public void willTerminate(UIApplication application) { throw new UnsupportedOperationException(); }
    @NotImplemented("applicationSignificantTimeChange:")
    public void significantTimeChange(UIApplication application) { throw new UnsupportedOperationException(); }
    @NotImplemented("application:willChangeStatusBarOrientation:duration:")
    public void willChangeStatusBarOrientation(UIApplication application, @Representing("UIInterfaceOrientation") long newStatusBarOrientation, double duration) { throw new UnsupportedOperationException(); }
    @NotImplemented("application:didChangeStatusBarOrientation:")
    public void didChangStatusBarOrientation(UIApplication application, @Representing("UIInterfaceOrientation") long oldStatusBarOrientation) { throw new UnsupportedOperationException(); }
    @NotImplemented("application:willChangeStatusBarFrame:")
    public void willChangeStatusBarFrame(UIApplication application, CGRect newStatusBarFrame) { throw new UnsupportedOperationException(); }
    @NotImplemented("application:didChangeStatusBarFrame:")
    public void didChangStatusBarFrame(UIApplication application, CGRect oldStatusBarFrame) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:didRegisterUserNotificationSettings:")
    public void didRegisterUserNotificationSettings(UIApplication application, UIUserNotificationSettings notificationSettings) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("application:didRegisterForRemoteNotificationsWithDeviceToken:")
    public void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("application:didFailToRegisterForRemoteNotificationsWithError:")
    public void didFailToRegisterForRemoteNotifications(UIApplication application, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("application:didReceiveRemoteNotification:")
    public void didReceiveRemoteNotification(UIApplication application, NSDictionary<?, ?> userInfo) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("application:didReceiveLocalNotification:")
    public void didReceiveLocalNotification(UIApplication application, UILocalNotification notification) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    public void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, @Block Runnable completionHandler) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    public void handleRemoteNotificationAction(UIApplication application, String identifier, NSDictionary<?, ?> userInfo, @Block Runnable completionHandler) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("application:didReceiveRemoteNotification:fetchCompletionHandler:")
    public void didReceiveRemoteNotification(UIApplication application, NSDictionary<?, ?> userInfo, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("application:performFetchWithCompletionHandler:")
    public void performFetch(UIApplication application, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("application:handleEventsForBackgroundURLSession:completionHandler:")
    public void handleEventsForBackgroundURLSession(UIApplication application, String identifier, @Block Runnable completionHandler) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.2 and later.
     */
    @NotImplemented("application:handleWatchKitExtensionRequest:reply:")
    public void application$handleWatchKitExtensionRequest$reply$(UIApplication application, NSDictionary<?, ?> userInfo, Todo reply) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("applicationDidEnterBackground:")
    public void didEnterBackground(UIApplication application) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("applicationWillEnterForeground:")
    public void willEnterForeground(UIApplication application) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("applicationProtectedDataWillBecomeUnavailable:")
    public void protectedDataWillBecomeUnavailable(UIApplication application) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("applicationProtectedDataDidBecomeAvailable:")
    public void protectedDataDidBecomeAvailable(UIApplication application) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("application:supportedInterfaceOrientationsForWindow:")
    public @MachineSizedUInt long getSupportedInterfaceOrientations(UIApplication application, UIWindow window) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:shouldAllowExtensionPointIdentifier:")
    public boolean shouldAllowExtensionPointIdentifier(UIApplication application, String extensionPointIdentifier) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("application:viewControllerWithRestorationIdentifierPath:coder:")
    public UIViewController getViewController(UIApplication application, NSArray<?> identifierComponents, NSCoder coder) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("application:shouldSaveApplicationState:")
    public boolean shouldSaveApplicationState(UIApplication application, NSCoder coder) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("application:shouldRestoreApplicationState:")
    public boolean shouldRestoreApplicationState(UIApplication application, NSCoder coder) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("application:willEncodeRestorableStateWithCoder:")
    public void willEncodeRestorableState(UIApplication application, NSCoder coder) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("application:didDecodeRestorableStateWithCoder:")
    public void didDecodeRestorableState(UIApplication application, NSCoder coder) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:willContinueUserActivityWithType:")
    public boolean willContinueUserActivity(UIApplication application, String userActivityType) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:continueUserActivity:restorationHandler:")
    public boolean continueUserActivity(UIApplication application, NSUserActivity userActivity, Todo restorationHandler) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:didFailToContinueUserActivityWithType:error:")
    public void didFailToContinueUserActivity(UIApplication application, String userActivityType, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("application:didUpdateUserActivity:")
    public void didUpdateUserActivity(UIApplication application, NSUserActivity userActivity) { throw new UnsupportedOperationException(); }

}
