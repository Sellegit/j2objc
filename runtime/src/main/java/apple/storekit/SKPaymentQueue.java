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

@Library("StoreKit/StoreKit.h") @Mapping("SKPaymentQueue")
public class SKPaymentQueue 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SKPaymentQueue() { }
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("transactions")
    public native NSArray<SKPaymentTransaction> getTransactions();
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("addPayment:")
    public native void addPayment(SKPayment payment);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("restoreCompletedTransactions")
    public native void restoreCompletedTransactions();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("restoreCompletedTransactionsWithApplicationUsername:")
    public native void restoreCompletedTransactions(String username);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("finishTransaction:")
    public native void finishTransaction(SKPaymentTransaction transaction);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("startDownloads:")
    public native void startDownloads(NSArray<?> downloads);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("pauseDownloads:")
    public native void pauseDownloads(NSArray<?> downloads);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("resumeDownloads:")
    public native void resumeDownloads(NSArray<?> downloads);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("cancelDownloads:")
    public native void cancelDownloads(NSArray<?> downloads);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("addTransactionObserver:")
    public native void addTransactionObserver(SKPaymentTransactionObserver observer);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("removeTransactionObserver:")
    public native void removeTransactionObserver(SKPaymentTransactionObserver observer);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("defaultQueue")
    public static native SKPaymentQueue getDefaultQueue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("canMakePayments")
    public static native boolean canMakePayments();
    
}
