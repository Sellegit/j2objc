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
@Library("HomeKit")
public class HMServiceType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeLightbulb")
    protected static native NSString LightbulbValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeSwitch")
    protected static native NSString SwitchValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeThermostat")
    protected static native NSString ThermostatValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeGarageDoorOpener")
    protected static native NSString GarageDoorOpenerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeAccessoryInformation")
    protected static native NSString AccessoryInformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeFan")
    protected static native NSString FanValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeOutlet")
    protected static native NSString OutletValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeLockMechanism")
    protected static native NSString LockMechanismValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMServiceTypeLockManagement")
    protected static native NSString LockManagementValue();
    
}
