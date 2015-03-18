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

@Library("StoreKit/StoreKit.h") @Mapping("SKProductsRequest")
public class SKProductsRequest 
    extends SKRequest 
     {

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("initWithProductIdentifiers:")
    public SKProductsRequest(NSSet<?> productIdentifiers) { }
    @Mapping("init")
    public SKProductsRequest() { }
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("delegate")
    public native SKProductsRequestDelegate getDelegate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setDelegate:")
    public native void setDelegate(SKProductsRequestDelegate v);
    
    
    
    
    
}
