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





@Library("StoreKit") @Mapping("SKPaymentTransactionObserver")
public interface SKPaymentTransactionObserver 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("paymentQueue:updatedTransactions:")
    void updatedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("paymentQueue:removedTransactions:")
    void removedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("paymentQueue:restoreCompletedTransactionsFailedWithError:")
    void restoreCompletedTransactionsFailed(SKPaymentQueue queue, NSError error);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("paymentQueueRestoreCompletedTransactionsFinished:")
    void restoreCompletedTransactionsFinished(SKPaymentQueue queue);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("paymentQueue:updatedDownloads:")
    void updatedDownloads(SKPaymentQueue queue, NSArray<SKDownload> downloads);
    
    /*<adapter>*/
    /*</adapter>*/
}
