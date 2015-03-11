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
 * @since Available in iOS 7.0 and later.
 */

@Library("CoreBluetooth")
@Mapping("CBPeripheralManagerAuthorizationStatus")
public final class CBPeripheralManagerAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("CBPeripheralManagerAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("CBPeripheralManagerAuthorizationStatusRestricted")
    public static final long Restricted = 1L;
    @GlobalConstant("CBPeripheralManagerAuthorizationStatusDenied")
    public static final long Denied = 2L;
    @GlobalConstant("CBPeripheralManagerAuthorizationStatusAuthorized")
    public static final long Authorized = 3L;
    

}
