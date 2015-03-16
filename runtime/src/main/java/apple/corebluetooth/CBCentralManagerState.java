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





@Library("CoreBluetooth/CoreBluetooth.h")
@Mapping("CBCentralManagerState")
public final class CBCentralManagerState extends ObjCEnum {
    
    @GlobalConstant("CBCentralManagerStateUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("CBCentralManagerStateResetting")
    public static final long Resetting = 1L;
    @GlobalConstant("CBCentralManagerStateUnsupported")
    public static final long Unsupported = 2L;
    @GlobalConstant("CBCentralManagerStateUnauthorized")
    public static final long Unauthorized = 3L;
    @GlobalConstant("CBCentralManagerStatePoweredOff")
    public static final long PoweredOff = 4L;
    @GlobalConstant("CBCentralManagerStatePoweredOn")
    public static final long PoweredOn = 5L;
    

}
