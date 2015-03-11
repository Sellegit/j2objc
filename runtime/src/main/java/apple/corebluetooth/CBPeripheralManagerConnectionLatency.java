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


@Mapping("CBPeripheralManagerConnectionLatency")
public final class CBPeripheralManagerConnectionLatency extends ObjCEnum {
    
    @GlobalConstant("CBPeripheralManagerConnectionLatencyLow")
    public static final long Low = 0L;
    @GlobalConstant("CBPeripheralManagerConnectionLatencyMedium")
    public static final long Medium = 1L;
    @GlobalConstant("CBPeripheralManagerConnectionLatencyHigh")
    public static final long High = 2L;
    

}
