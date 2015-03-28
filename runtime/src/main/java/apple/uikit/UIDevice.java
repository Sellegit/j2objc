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
@Library("UIKit/UIKit.h") @Mapping("UIDevice")
public class UIDevice 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIDevice() { }

    
    @Mapping("name")
    public native String getName();
    @Mapping("model")
    public native String getModel();
    @Mapping("localizedModel")
    public native String getLocalizedModel();
    @Mapping("systemName")
    public native String getSystemName();
    @Mapping("systemVersion")
    public native String getSystemVersion();
    @Mapping("orientation")
    public native @Representing("UIDeviceOrientation") long getOrientation();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("identifierForVendor")
    public native NSUUID getIdentifierForVendor();
    @Mapping("isGeneratingDeviceOrientationNotifications")
    public native boolean generatesDeviceOrientationNotifications();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isBatteryMonitoringEnabled")
    public native boolean isBatteryMonitoringEnabled();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setBatteryMonitoringEnabled:")
    public native void setBatteryMonitoringEnabled(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("batteryState")
    public native @Representing("UIDeviceBatteryState") long getBatteryState();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("batteryLevel")
    public native float getBatteryLevel();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isProximityMonitoringEnabled")
    public native boolean isProximityMonitoringEnabled();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setProximityMonitoringEnabled:")
    public native void setProximityMonitoringEnabled(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("proximityState")
    public native boolean isProximityState();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isMultitaskingSupported")
    public native boolean isMultitaskingSupported();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("userInterfaceIdiom")
    public native @Representing("UIUserInterfaceIdiom") long getUserInterfaceIdiom();

    
    
    @GlobalConstant("UIDeviceOrientationDidChangeNotification")
    public static native NSString OrientationDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIDeviceBatteryStateDidChangeNotification")
    public static native NSString BatteryStateDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIDeviceBatteryLevelDidChangeNotification")
    public static native NSString BatteryLevelDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIDeviceProximityStateDidChangeNotification")
    public static native NSString ProximityStateDidChangeNotification();

    @Mapping("beginGeneratingDeviceOrientationNotifications")
    public native void beginGeneratingDeviceOrientationNotifications();
    @Mapping("endGeneratingDeviceOrientationNotifications")
    public native void endGeneratingDeviceOrientationNotifications();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("playInputClick")
    public native void playInputClick();
    @Mapping("currentDevice")
    public static native UIDevice getCurrentDevice();

}
