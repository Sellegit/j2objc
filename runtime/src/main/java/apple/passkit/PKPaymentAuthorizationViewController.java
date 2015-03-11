package apple.passkit;


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
import apple.addressbook.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("PassKit") @Mapping("PKPaymentAuthorizationViewController")
public class PKPaymentAuthorizationViewController 
    extends UIViewController 
     {

    
    
    public PKPaymentAuthorizationViewController() {}
    @Mapping("initWithPaymentRequest:")
    public PKPaymentAuthorizationViewController(PKPaymentRequest request) { }
    @Mapping("initWithNibName:bundle:")
    public PKPaymentAuthorizationViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("delegate")
    public native PKPaymentAuthorizationViewControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(PKPaymentAuthorizationViewControllerDelegate v);
    
    
    
    @Mapping("canMakePayments")
    public static native boolean canMakePayments();
    @Mapping("canMakePaymentsUsingNetworks:")
    public static native boolean canMakePaymentsUsingNetworks(List<PKPaymentNetwork> supportedNetworks);
    
}
