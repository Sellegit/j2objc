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
public class CBAdvertisementData 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("CBAdvertisementDataLocalNameKey")
    public static native NSString LocalNameKey();
    @GlobalConstant("CBAdvertisementDataTxPowerLevelKey")
    public static native NSString TxPowerLevelKey();
    @GlobalConstant("CBAdvertisementDataServiceUUIDsKey")
    public static native NSString ServiceUUIDsKey();
    @GlobalConstant("CBAdvertisementDataServiceDataKey")
    public static native NSString ServiceDataKey();
    @GlobalConstant("CBAdvertisementDataManufacturerDataKey")
    public static native NSString ManufacturerDataKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBAdvertisementDataOverflowServiceUUIDsKey")
    public static native NSString OverflowServiceUUIDsKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CBAdvertisementDataIsConnectable")
    public static native NSString IsConnectable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CBAdvertisementDataSolicitedServiceUUIDsKey")
    public static native NSString SolicitedServiceUUIDsKey();
    
}
