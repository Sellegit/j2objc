package apple.storekit;


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
import apple.uikit.*;
import apple.accounts.*;



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("StoreKit/StoreKit.h") @Mapping("SKPayment")
public class SKPayment 
    extends NSObject 
    implements NSCopying {

    
    
    public SKPayment() {}
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("productIdentifier")
    public native String getProductIdentifier();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("requestData")
    public native NSData getRequestData();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("quantity")
    public native @MachineSizedSInt long getQuantity();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("applicationUsername")
    public native String getApplicationUsername();
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("paymentWithProduct:")
    public static native SKPayment createFromProduct(SKProduct product);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
