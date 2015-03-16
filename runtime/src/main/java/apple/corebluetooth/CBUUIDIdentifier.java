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
    protected static native String CharacteristicExtendedPropertiesValue();
    @GlobalConstant("CBUUIDCharacteristicUserDescriptionString")
    protected static native String CharacteristicUserDescriptionValue();
    @GlobalConstant("CBUUIDClientCharacteristicConfigurationString")
    protected static native String ClientCharacteristicConfigurationValue();
    @GlobalConstant("CBUUIDServerCharacteristicConfigurationString")
    protected static native String ServerCharacteristicConfigurationValue();
    @GlobalConstant("CBUUIDCharacteristicFormatString")
    protected static native String CharacteristicFormatValue();
    @GlobalConstant("CBUUIDCharacteristicAggregateFormatString")
    protected static native String CharacteristicAggregateFormatValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDGenericAccessProfileString")
    protected static native String GenericAccessProfileValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDGenericAttributeProfileString")
    protected static native String GenericAttributeProfileValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDDeviceNameString")
    protected static native String DeviceNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDAppearanceString")
    protected static native String AppearanceValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDPeripheralPrivacyFlagString")
    protected static native String PeripheralPrivacyFlagValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDReconnectionAddressString")
    protected static native String ReconnectionAddressValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDPeripheralPreferredConnectionParametersString")
    protected static native String PeripheralPreferredConnectionParametersValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("CBUUIDServiceChangedString")
    protected static native String ServiceChangedValue();
    
}
