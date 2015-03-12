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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class SKPaymentTransactionObserverAdapter 
    extends Object 
    implements SKPaymentTransactionObserver {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("paymentQueue:updatedTransactions:")
    public void updatedTransactions(SKPaymentQueue queue, NSArray<?> transactions) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("paymentQueue:removedTransactions:")
    public void removedTransactions(SKPaymentQueue queue, NSArray<?> transactions) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("paymentQueue:restoreCompletedTransactionsFailedWithError:")
    public void restoreCompletedTransactionsFailed(SKPaymentQueue queue, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("paymentQueueRestoreCompletedTransactionsFinished:")
    public void restoreCompletedTransactionsFinished(SKPaymentQueue queue) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("paymentQueue:updatedDownloads:")
    public void updatedDownloads(SKPaymentQueue queue, NSArray<?> downloads) { throw new UnsupportedOperationException(); }
    
}
