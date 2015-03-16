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

@Library("StoreKit/StoreKit.h") @Mapping("SKProduct")
public class SKProduct 
    extends NSObject 
     {

    
    
    public SKProduct() {}
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("localizedDescription")
    public native String getLocalizedDescription();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("localizedTitle")
    public native String getLocalizedTitle();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("price")
    public native NSDecimalNumber getPrice();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("priceLocale")
    public native NSLocale getPriceLocale();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("productIdentifier")
    public native String getProductIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isDownloadable")
    public native boolean isDownloadable();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("downloadContentLengths")
    public native NSArray<NSNumber> getDownloadContentLengths();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("downloadContentVersion")
    public native String getDownloadContentVersion();
    
    
    
    
    
}
