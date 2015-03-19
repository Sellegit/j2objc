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





@Library("UIKit/UIKit.h") @Mapping("UIApplicationDelegate")
public interface UIApplicationDelegate 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("window")
    UIWindow getWindow();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setWindow:")
    void setWindow(UIWindow v);
    
    
    @Mapping("applicationDidFinishLaunching:")
    void didFinishLaunching(UIApplication application);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("application:willFinishLaunchingWithOptions:")
    boolean willFinishLaunching(UIApplication application, NSDictionary<?, ?> launchOptions);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("application:didFinishLaunchingWithOptions:")
    boolean didFinishLaunching(UIApplication application, NSDictionary<?, ?> launchOptions);
    @Mapping("applicationDidBecomeActive:")
    void didBecomeActive(UIApplication application);
    @Mapping("applicationWillResignActive:")
    void willResignActive(UIApplication application);
    @Mapping("application:handleOpenURL:")
    boolean handleOpenURL(UIApplication application, NSURL url);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("application:openURL:sourceApplication:annotation:")
    boolean openURL(UIApplication application, NSURL url, String sourceApplication, Object annotation);
    @Mapping("applicationDidReceiveMemoryWarning:")
    void didReceiveMemoryWarning(UIApplication application);
    @Mapping("applicationWillTerminate:")
    void willTerminate(UIApplication application);
    @Mapping("applicationSignificantTimeChange:")
    void significantTimeChange(UIApplication application);
    @Mapping("application:willChangeStatusBarOrientation:duration:")
    void willChangeStatusBarOrientation(UIApplication application, @Representing("UIInterfaceOrientation") long newStatusBarOrientation, double duration);
    @Mapping("application:didChangeStatusBarOrientation:")
    void didChangStatusBarOrientation(UIApplication application, @Representing("UIInterfaceOrientation") long oldStatusBarOrientation);
    @Mapping("application:willChangeStatusBarFrame:")
    void willChangeStatusBarFrame(UIApplication application, CGRect newStatusBarFrame);
    @Mapping("application:didChangeStatusBarFrame:")
    void didChangStatusBarFrame(UIApplication application, CGRect oldStatusBarFrame);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:didRegisterUserNotificationSettings:")
    void didRegisterUserNotificationSettings(UIApplication application, UIUserNotificationSettings notificationSettings);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("application:didRegisterForRemoteNotificationsWithDeviceToken:")
    void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("application:didFailToRegisterForRemoteNotificationsWithError:")
    void didFailToRegisterForRemoteNotifications(UIApplication application, NSError error);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("application:didReceiveRemoteNotification:")
    void didReceiveRemoteNotification(UIApplication application, NSDictionary<?, ?> userInfo);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("application:didReceiveLocalNotification:")
    void didReceiveLocalNotification(UIApplication application, UILocalNotification notification);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    void handleRemoteNotificationAction(UIApplication application, String identifier, NSDictionary<?, ?> userInfo, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("application:didReceiveRemoteNotification:fetchCompletionHandler:")
    void didReceiveRemoteNotification(UIApplication application, NSDictionary<?, ?> userInfo, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("application:performFetchWithCompletionHandler:")
    void performFetch(UIApplication application, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("application:handleEventsForBackgroundURLSession:completionHandler:")
    void handleEventsForBackgroundURLSession(UIApplication application, String identifier, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Mapping("application:handleWatchKitExtensionRequest:reply:")
    void application$handleWatchKitExtensionRequest$reply$(UIApplication application, NSDictionary<?, ?> userInfo, Todo reply);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("applicationDidEnterBackground:")
    void didEnterBackground(UIApplication application);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("applicationWillEnterForeground:")
    void willEnterForeground(UIApplication application);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("applicationProtectedDataWillBecomeUnavailable:")
    void protectedDataWillBecomeUnavailable(UIApplication application);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("applicationProtectedDataDidBecomeAvailable:")
    void protectedDataDidBecomeAvailable(UIApplication application);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("application:supportedInterfaceOrientationsForWindow:")
    @MachineSizedUInt long getSupportedInterfaceOrientations(UIApplication application, UIWindow window);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:shouldAllowExtensionPointIdentifier:")
    boolean shouldAllowExtensionPointIdentifier(UIApplication application, String extensionPointIdentifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("application:viewControllerWithRestorationIdentifierPath:coder:")
    UIViewController getViewController(UIApplication application, NSArray<?> identifierComponents, NSCoder coder);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("application:shouldSaveApplicationState:")
    boolean shouldSaveApplicationState(UIApplication application, NSCoder coder);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("application:shouldRestoreApplicationState:")
    boolean shouldRestoreApplicationState(UIApplication application, NSCoder coder);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("application:willEncodeRestorableStateWithCoder:")
    void willEncodeRestorableState(UIApplication application, NSCoder coder);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("application:didDecodeRestorableStateWithCoder:")
    void didDecodeRestorableState(UIApplication application, NSCoder coder);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:willContinueUserActivityWithType:")
    boolean willContinueUserActivity(UIApplication application, String userActivityType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:continueUserActivity:restorationHandler:")
    boolean continueUserActivity(UIApplication application, NSUserActivity userActivity, Todo restorationHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:didFailToContinueUserActivityWithType:error:")
    void didFailToContinueUserActivity(UIApplication application, String userActivityType, NSError error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("application:didUpdateUserActivity:")
    void didUpdateUserActivity(UIApplication application, NSUserActivity userActivity);
    
    /*<adapter>*/
    /*</adapter>*/
}
