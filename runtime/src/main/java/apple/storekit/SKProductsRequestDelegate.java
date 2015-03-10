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





@Library("StoreKit") @Mapping("SKProductsRequestDelegate")
public interface SKProductsRequestDelegate 
    extends SKRequestDelegate {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("productsRequest:didReceiveResponse:")
    void didReceiveResponse(SKProductsRequest request, SKProductsResponse response);
    
    /*<adapter>*/
    /*</adapter>*/
}
