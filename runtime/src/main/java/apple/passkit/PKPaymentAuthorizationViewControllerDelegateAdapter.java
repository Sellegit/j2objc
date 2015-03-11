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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class PKPaymentAuthorizationViewControllerDelegateAdapter 
    extends Object 
    implements PKPaymentAuthorizationViewControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("paymentAuthorizationViewController:didAuthorizePayment:completion:")
    public void didAuthorizePayment(PKPaymentAuthorizationViewController controller, PKPayment payment, @Block VoidBlock1<PKPaymentAuthorizationStatus> completion) { throw new UnsupportedOperationException(); }
    @NotImplemented("paymentAuthorizationViewControllerDidFinish:")
    public void didFinish(PKPaymentAuthorizationViewController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("paymentAuthorizationViewController:didSelectShippingMethod:completion:")
    public void didSelectShippingMethod(PKPaymentAuthorizationViewController controller, PKShippingMethod shippingMethod, @Block VoidBlock2<PKPaymentAuthorizationStatus, NSArray<PKPaymentSummaryItem>> completion) { throw new UnsupportedOperationException(); }
    @NotImplemented("paymentAuthorizationViewController:didSelectShippingAddress:completion:")
    public void didSelectShippingAddress(PKPaymentAuthorizationViewController controller, ABRecord address, @Block VoidBlock3<PKPaymentAuthorizationStatus, NSArray<PKShippingMethod>, NSArray<PKPaymentSummaryItem>> completion) { throw new UnsupportedOperationException(); }
    
}
