package apple.homekit;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("HomeKit/HomeKit.h")
public class HMServiceType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeLightbulb")
    public static native NSString LightbulbValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeSwitch")
    public static native NSString SwitchValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeThermostat")
    public static native NSString ThermostatValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeGarageDoorOpener")
    public static native NSString GarageDoorOpenerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeAccessoryInformation")
    public static native NSString AccessoryInformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeFan")
    public static native NSString FanValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeOutlet")
    public static native NSString OutletValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeLockMechanism")
    public static native NSString LockMechanismValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeLockManagement")
    public static native NSString LockManagementValue();

}
