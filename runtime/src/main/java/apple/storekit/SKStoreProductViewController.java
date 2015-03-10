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
 * @since Available in iOS 6.0 and later.
 */

@Library("StoreKit") @Mapping("SKStoreProductViewController")
public class SKStoreProductViewController 
    extends UIViewController 
     {

    
    
    public SKStoreProductViewController() {}
    @Mapping("initWithNibName:bundle:")
    public SKStoreProductViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("delegate")
    public native SKStoreProductViewControllerDelegate getDelegate();
    /**
     * @since Available in iOS 6.0 and later.
     */
    public native void setDelegate(SKStoreProductViewControllerDelegate v);
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("loadProductWithParameters:completionBlock:")
    public native void loadProduct(SKStoreProductParameters parameters, @Block VoidBlock2<Boolean, NSError> block);
    
}
