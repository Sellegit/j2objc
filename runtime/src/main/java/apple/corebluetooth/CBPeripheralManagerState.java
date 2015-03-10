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



/**
 * @since Available in iOS 6.0 and later.
 */


@Mapping("CBPeripheralManagerState")
public final class CBPeripheralManagerState extends ObjCEnum {
    
    @GlobalConstant("CBPeripheralManagerStateUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("CBPeripheralManagerStateResetting")
    public static final long Resetting = 1L;
    @GlobalConstant("CBPeripheralManagerStateUnsupported")
    public static final long Unsupported = 2L;
    @GlobalConstant("CBPeripheralManagerStateUnauthorized")
    public static final long Unauthorized = 3L;
    @GlobalConstant("CBPeripheralManagerStatePoweredOff")
    public static final long PoweredOff = 4L;
    @GlobalConstant("CBPeripheralManagerStatePoweredOn")
    public static final long PoweredOn = 5L;
    

}
