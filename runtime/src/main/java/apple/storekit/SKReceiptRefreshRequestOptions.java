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
@Library("StoreKit/StoreKit.h")
public class SKReceiptRefreshRequestOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("SKReceiptPropertyIsExpired")
    public static native NSString IsExpiredKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("SKReceiptPropertyIsRevoked")
    public static native NSString IsRevokedKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("SKReceiptPropertyIsVolumePurchase")
    public static native NSString IsVolumePurchaseKey();

}
