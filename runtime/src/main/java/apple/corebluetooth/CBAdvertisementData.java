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
    protected static native NSString LocalNameKey();
    @GlobalConstant("CBAdvertisementDataTxPowerLevelKey")
    protected static native NSString TxPowerLevelKey();
    @GlobalConstant("CBAdvertisementDataServiceUUIDsKey")
    protected static native NSString ServiceUUIDsKey();
    @GlobalConstant("CBAdvertisementDataServiceDataKey")
    protected static native NSString ServiceDataKey();
    @GlobalConstant("CBAdvertisementDataManufacturerDataKey")
    protected static native NSString ManufacturerDataKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBAdvertisementDataOverflowServiceUUIDsKey")
    protected static native NSString OverflowServiceUUIDsKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CBAdvertisementDataIsConnectable")
    protected static native NSString IsConnectable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CBAdvertisementDataSolicitedServiceUUIDsKey")
    protected static native NSString SolicitedServiceUUIDsKey();
    
}
