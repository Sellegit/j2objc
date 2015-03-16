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

@Library("PassKit/PassKit.h") @Mapping("PKPayment")
public class PKPayment 
    extends NSObject 
     {

    
    
    public PKPayment() {}
    
    
    @Mapping("token")
    public native PKPaymentToken getToken();
    @Mapping("billingAddress")
    public native ABPerson getBillingAddress();
    @Mapping("shippingAddress")
    public native ABPerson getShippingAddress();
    @Mapping("shippingMethod")
    public native PKShippingMethod getShippingMethod();
    
    
    
    
    
}
