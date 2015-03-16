package apple.homekit;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("HomeKit/HomeKit.h")
public class HMCharacteristicProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicPropertySupportsEventNotification")
    protected static native NSString SupportsEventNotificationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicPropertyReadable")
    protected static native NSString ReadableValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicPropertyWritable")
    protected static native NSString WritableValue();
    
}
