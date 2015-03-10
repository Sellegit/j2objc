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
@Library("CoreBluetooth")
public class CBConnectPeripheralOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBConnectPeripheralOptionNotifyOnConnectionKey")
    protected static native NSString NotifyOnConnectionKey();
    @GlobalConstant("CBConnectPeripheralOptionNotifyOnDisconnectionKey")
    protected static native NSString NotifyOnDisconnectionKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CBConnectPeripheralOptionNotifyOnNotificationKey")
    protected static native NSString NotifyOnNotificationKey();
    
}
