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





@Library("StoreKit/StoreKit.h") @Mapping("SKStoreProductViewControllerDelegate")
public interface SKStoreProductViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("productViewControllerDidFinish:")
    void didFinish(SKStoreProductViewController viewController);
    
    /*<adapter>*/
    /*</adapter>*/
}
