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
@Mapping("CBPeripheralState")
public final class CBPeripheralState extends ObjCEnum {
    
    @GlobalConstant("CBPeripheralStateDisconnected")
    public static final long Disconnected = 0L;
    @GlobalConstant("CBPeripheralStateConnecting")
    public static final long Connecting = 1L;
    @GlobalConstant("CBPeripheralStateConnected")
    public static final long Connected = 2L;
    

}
