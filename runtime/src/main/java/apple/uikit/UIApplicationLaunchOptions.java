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
public class UIApplicationLaunchOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsURLKey")
    public static native String URLKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsSourceApplicationKey")
    public static native String SourceApplicationKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsRemoteNotificationKey")
    public static native String RemoteNotificationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsLocalNotificationKey")
    public static native String LocalNotificationKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsAnnotationKey")
    public static native String AnnotationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsLocationKey")
    public static native String LocationKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsNewsstandDownloadsKey")
    public static native String NewsstandDownloadsKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsBluetoothCentralsKey")
    public static native String BluetoothCentralsKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsBluetoothPeripheralsKey")
    public static native String BluetoothPeripheralsKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIApplicationLaunchOptionsUserActivityDictionaryKey")
    public static native String UserActivityDictionaryKey();

}
