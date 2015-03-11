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

@Library("StoreKit") @Mapping("SKProductsResponse")
public class SKProductsResponse 
    extends NSObject 
     {

    
    
    public SKProductsResponse() {}
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("products")
    public native NSArray<SKProduct> getProducts();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("invalidProductIdentifiers")
    public native List<String> getInvalidProductIdentifiers();
    
    
    
    
    
}
