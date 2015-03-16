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
public class CBCentralManagerRestoredState 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CBCentralManagerRestoredStatePeripheralsKey")
    protected static native NSString PeripheralsKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CBCentralManagerRestoredStateScanServicesKey")
    protected static native NSString ScanServicesKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CBCentralManagerRestoredStateScanOptionsKey")
    protected static native NSString ScanOptionsKey();
    
}
