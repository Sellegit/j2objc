package apple.gamecontroller;


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





@Library("GameController/GameController.h") @Mapping("GCController")
public class GCController 
    extends NSObject 
     {

    
    
    public GCController() {}
    
    
    @Mapping("controllerPausedHandler")
    public native @Block VoidBlock1<GCController> getControllerPausedHandler();
    @Mapping("setControllerPausedHandler:")
    public native void setControllerPausedHandler(@Block VoidBlock1<GCController> v);
    @Mapping("vendorName")
    public native String getVendorName();
    @Mapping("isAttachedToDevice")
    public native boolean isAttachedToDevice();
    @Mapping("playerIndex")
    public native @MachineSizedSInt long getPlayerIndex();
    @Mapping("setPlayerIndex:")
    public native void setPlayerIndex(@MachineSizedSInt long v);
    @Mapping("gamepad")
    public native GCGamepad getGamepad();
    @Mapping("extendedGamepad")
    public native GCExtendedGamepad getExtendedGamepad();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("motion")
    public native GCMotion getMotion();
    
    
    
    @GlobalConstant("GCControllerDidConnectNotification")
    public static native NSString DidConnectNotification();
    @GlobalConstant("GCControllerDidDisconnectNotification")
    public static native NSString DidDisconnectNotification();
    
    @Mapping("controllers")
    public static native NSArray<GCController> getControllers();
    @Mapping("startWirelessControllerDiscoveryWithCompletionHandler:")
    public static native void startWirelessControllerDiscovery(@Block Runnable completionHandler);
    @Mapping("stopWirelessControllerDiscovery")
    public static native void stopWirelessControllerDiscovery();
    
}
