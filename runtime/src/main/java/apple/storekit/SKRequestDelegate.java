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


@Library("StoreKit/StoreKit.h") @Mapping("SKRequestDelegate")
public interface SKRequestDelegate 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("requestDidFinish:")
    void didFinish(SKRequest request);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("request:didFailWithError:")
    void didFail(SKRequest request, NSError error);

    /*<adapter>*/
    /*</adapter>*/
}
