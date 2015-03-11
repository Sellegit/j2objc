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
 * @since Available in iOS 4.0 and later.
 */

@Library("CoreTelephony") @Mapping("CTTelephonyNetworkInfo")
public class CTTelephonyNetworkInfo 
    extends NSObject 
     {

    
    
    public CTTelephonyNetworkInfo() {}
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("subscriberCellularProvider")
    public native CTCarrier getSubscriberCellularProvider();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("subscriberCellularProviderDidUpdateNotifier")
    public native @Block VoidBlock1<CTCarrier> getSubscriberCellularProviderDidUpdateNotifier();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setSubscriberCellularProviderDidUpdateNotifier:")
    public native void setSubscriberCellularProviderDidUpdateNotifier(@Block VoidBlock1<CTCarrier> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("currentRadioAccessTechnology")
    public native CTRadioAccessTechnology getCurrentRadioAccessTechnology();
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyDidChangeNotification")
    public static native NSString RadioAccessTechnologyDidChangeNotification();
    
    
    
}
