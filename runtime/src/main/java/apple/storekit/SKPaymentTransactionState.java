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

@Library("StoreKit")
@Mapping("SKPaymentTransactionState")
public final class SKPaymentTransactionState extends ObjCEnum {
    
    @GlobalConstant("SKPaymentTransactionStatePurchasing")
    public static final long Purchasing = 0L;
    @GlobalConstant("SKPaymentTransactionStatePurchased")
    public static final long Purchased = 1L;
    @GlobalConstant("SKPaymentTransactionStateFailed")
    public static final long Failed = 2L;
    @GlobalConstant("SKPaymentTransactionStateRestored")
    public static final long Restored = 3L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("SKPaymentTransactionStateDeferred")
    public static final long Deferred = 4L;
    

}
