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
@Library("StoreKit")
public class SKReceiptRefreshRequestOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("SKReceiptPropertyIsExpired")
    protected static native NSString IsExpiredKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("SKReceiptPropertyIsRevoked")
    protected static native NSString IsRevokedKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("SKReceiptPropertyIsVolumePurchase")
    protected static native NSString IsVolumePurchaseKey();
    
}
