package apple.coretelephony;


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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("CoreTelephony/CoreTelephony.h") @Mapping("CTSubscriber")
public class CTSubscriber 
    extends NSObject 
     {

    
    
    public CTSubscriber() {}
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("carrierToken")
    public native NSData getCarrierToken();
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTSubscriberTokenRefreshed")
    public static native NSString TokenRefreshedNotification();
    
    
    
}
