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
@Library("PassKit/PassKit.h") @Mapping("PKPaymentRequest")
public class PKPaymentRequest 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public PKPaymentRequest() { }

    
    @Mapping("merchantIdentifier")
    public native String getMerchantIdentifier();
    @Mapping("setMerchantIdentifier:")
    public native void setMerchantIdentifier(String v);
    @Mapping("countryCode")
    public native String getCountryCode();
    @Mapping("setCountryCode:")
    public native void setCountryCode(String v);
    @Mapping("supportedNetworks")
    public native List<PKPaymentNetwork> getSupportedNetworks();
    @Mapping("setSupportedNetworks:")
    public native void setSupportedNetworks(List<PKPaymentNetwork> v);
    @Mapping("merchantCapabilities")
    public native @Representing("PKMerchantCapability") long getMerchantCapabilities();
    @Mapping("setMerchantCapabilities:")
    public native void setMerchantCapabilities(@Representing("PKMerchantCapability") long v);
    @Mapping("paymentSummaryItems")
    public native NSArray<PKPaymentSummaryItem> getPaymentSummaryItems();
    @Mapping("setPaymentSummaryItems:")
    public native void setPaymentSummaryItems(NSArray<PKPaymentSummaryItem> v);
    @Mapping("currencyCode")
    public native String getCurrencyCode();
    @Mapping("setCurrencyCode:")
    public native void setCurrencyCode(String v);
    @Mapping("requiredBillingAddressFields")
    public native @Representing("PKAddressField") long getRequiredBillingAddressFields();
    @Mapping("setRequiredBillingAddressFields:")
    public native void setRequiredBillingAddressFields(@Representing("PKAddressField") long v);
    @Mapping("billingAddress")
    public native ABRecordRef getBillingAddress();
    @Mapping("setBillingAddress:")
    public native void setBillingAddress(ABRecordRef v);
    @Mapping("requiredShippingAddressFields")
    public native @Representing("PKAddressField") long getRequiredShippingAddressFields();
    @Mapping("setRequiredShippingAddressFields:")
    public native void setRequiredShippingAddressFields(@Representing("PKAddressField") long v);
    @Mapping("shippingAddress")
    public native ABRecordRef getShippingAddress();
    @Mapping("setShippingAddress:")
    public native void setShippingAddress(ABRecordRef v);
    @Mapping("shippingMethods")
    public native NSArray<PKShippingMethod> getShippingMethods();
    @Mapping("setShippingMethods:")
    public native void setShippingMethods(NSArray<PKShippingMethod> v);
    @Mapping("applicationData")
    public native NSData getApplicationData();
    @Mapping("setApplicationData:")
    public native void setApplicationData(NSData v);

    
    


}
