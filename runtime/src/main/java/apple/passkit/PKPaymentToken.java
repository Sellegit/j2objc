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
@Library("PassKit/PassKit.h") @Mapping("PKPaymentToken")
public class PKPaymentToken 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public PKPaymentToken() { }

    
    @Mapping("paymentInstrumentName")
    public native String getPaymentInstrumentName();
    @Mapping("paymentNetwork")
    public native PKPaymentNetwork getPaymentNetwork();
    @Mapping("transactionIdentifier")
    public native String getTransactionIdentifier();
    @Mapping("paymentData")
    public native NSData getPaymentData();

    
    


}
