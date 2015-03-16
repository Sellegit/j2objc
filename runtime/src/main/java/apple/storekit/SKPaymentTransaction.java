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

@Library("StoreKit/StoreKit.h") @Mapping("SKPaymentTransaction")
public class SKPaymentTransaction 
    extends NSObject 
     {

    
    
    public SKPaymentTransaction() {}
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("error")
    public native NSError getError();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("originalTransaction")
    public native SKPaymentTransaction getOriginalTransaction();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("payment")
    public native SKPayment getPayment();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("downloads")
    public native NSArray<SKDownload> getDownloads();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("transactionDate")
    public native NSDate getTransactionDate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("transactionIdentifier")
    public native String getTransactionIdentifier();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("transactionReceipt")
    public native NSData getTransactionReceipt();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("transactionState")
    public native @Representing("SKPaymentTransactionState") @MachineSizedSInt long getTransactionState();
    
    
    
    
    
}
