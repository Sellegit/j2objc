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

@Library("UIKit/UIKit.h") @Mapping("UIScreen")
public class UIScreen 
    extends NSObject 
    implements UITraitEnvironment {

    
    
    public UIScreen() {}
    
    
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("applicationFrame")
    public native CGRect getApplicationFrame();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("scale")
    public native @MachineSizedFloat double getScale();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("availableModes")
    public native NSArray<UIScreenMode> getAvailableModes();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("preferredMode")
    public native UIScreenMode getPreferredMode();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("currentMode")
    public native UIScreenMode getCurrentMode();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setCurrentMode:")
    public native void setCurrentMode(UIScreenMode v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("overscanCompensation")
    public native @Representing("UIScreenOverscanCompensation") @MachineSizedSInt long getOverscanCompensation();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setOverscanCompensation:")
    public native void setOverscanCompensation(@Representing("UIScreenOverscanCompensation") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("mirroredScreen")
    public native UIScreen getMirroredScreen();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("brightness")
    public native @MachineSizedFloat double getBrightness();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBrightness:")
    public native void setBrightness(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("wantsSoftwareDimming")
    public native boolean wantsSoftwareDimming();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setWantsSoftwareDimming:")
    public native void setWantsSoftwareDimming(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("coordinateSpace")
    public native UICoordinateSpace getCoordinateSpace();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("fixedCoordinateSpace")
    public native UICoordinateSpace getFixedCoordinateSpace();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("nativeBounds")
    public native CGRect getNativeBounds();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("nativeScale")
    public native @MachineSizedFloat double getNativeScale();
    @Mapping("traitCollection")
    public native UITraitCollection getTraitCollection();
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("UIScreenDidConnectNotification")
    public static native NSString DidConnectNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("UIScreenDidDisconnectNotification")
    public static native NSString DidDisconnectNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("UIScreenModeDidChangeNotification")
    public static native NSString ModeDidChangeNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIScreenBrightnessDidChangeNotification")
    public static native NSString BrightnessDidChangeNotification();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("displayLinkWithTarget:selector:")
    public native CADisplayLink createDisplayLink(Object target, Selector sel);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("screens")
    public static native NSArray<UIScreen> getScreens();
    @Mapping("mainScreen")
    public static native UIScreen getMainScreen();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("snapshotViewAfterScreenUpdates:")
    public native UIView snapshotView(boolean afterUpdates);
    @Mapping("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    
}
