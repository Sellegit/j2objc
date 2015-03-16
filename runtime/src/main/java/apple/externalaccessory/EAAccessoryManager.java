package apple.externalaccessory;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("ExternalAccessory/ExternalAccessory.h") @Mapping("EAAccessoryManager")
public class EAAccessoryManager 
    extends NSObject 
     {

    
    
    public EAAccessoryManager() {}
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("connectedAccessories")
    public native NSArray<EAAccessory> getConnectedAccessories();
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("EAAccessoryDidConnectNotification")
    public static native NSString AccessoryDidConnectNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("EAAccessoryDidDisconnectNotification")
    public static native NSString AccessoryDidDisconnectNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("EAAccessoryKey")
    protected static native NSString AccessoryKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("EAAccessorySelectedKey")
    protected static native NSString AccessorySelectedKey();
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("registerForLocalNotifications")
    public native void registerForLocalNotifications();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("unregisterForLocalNotifications")
    public native void unregisterForLocalNotifications();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("sharedAccessoryManager")
    public static native EAAccessoryManager getSharedAccessoryManager();
    
}
