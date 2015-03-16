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
 * @since Available in iOS 7.0 and later.
 */

@Library("StoreKit/StoreKit.h") @Mapping("SKReceiptRefreshRequest")
public class SKReceiptRefreshRequest 
    extends SKRequest 
     {

    
    
    public SKReceiptRefreshRequest() {}
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithReceiptProperties:")
    public SKReceiptRefreshRequest(NSDictionary<?, ?> properties) { }
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("receiptProperties")
    public native SKReceiptRefreshRequestOptions getReceiptProperties();
    
    
    
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalFunction("SKTerminateForInvalidReceipt")
    public static native void terminateForInvalidReceipt();
    
    
    
}
