package apple.corebluetooth;


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
import apple.dispatch.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreBluetooth/CoreBluetooth.h")
public class CBUUIDIdentifier 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("CBUUIDCharacteristicExtendedPropertiesString")
    public static native String CharacteristicExtendedPropertiesValue();
    @GlobalConstant("CBUUIDCharacteristicUserDescriptionString")
    public static native String CharacteristicUserDescriptionValue();
    @GlobalConstant("CBUUIDClientCharacteristicConfigurationString")
    public static native String ClientCharacteristicConfigurationValue();
    @GlobalConstant("CBUUIDServerCharacteristicConfigurationString")
    public static native String ServerCharacteristicConfigurationValue();
    @GlobalConstant("CBUUIDCharacteristicFormatString")
    public static native String CharacteristicFormatValue();
    @GlobalConstant("CBUUIDCharacteristicAggregateFormatString")
    public static native String CharacteristicAggregateFormatValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDGenericAccessProfileString")
    public static native String GenericAccessProfileValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDGenericAttributeProfileString")
    public static native String GenericAttributeProfileValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDDeviceNameString")
    public static native String DeviceNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDAppearanceString")
    public static native String AppearanceValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDPeripheralPrivacyFlagString")
    public static native String PeripheralPrivacyFlagValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDReconnectionAddressString")
    public static native String ReconnectionAddressValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDPeripheralPreferredConnectionParametersString")
    public static native String PeripheralPreferredConnectionParametersValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDServiceChangedString")
    public static native String ServiceChangedValue();

}
