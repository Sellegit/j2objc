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





@Library("PassKit") @Mapping("PKPass")
public class PKPass 
    extends PKObject 
     {

    
    
    public PKPass() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("passType")
    public native @Representing("PKPassType") @MachineSizedUInt long getPassType();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("paymentPass")
    public native PKPaymentPass getPaymentPass();
    @Mapping("serialNumber")
    public native String getSerialNumber();
    @Mapping("passTypeIdentifier")
    public native String getPassTypeIdentifier();
    @Mapping("webServiceURL")
    public native NSURL getWebServiceURL();
    @Mapping("authenticationToken")
    public native String getAuthenticationToken();
    @Mapping("icon")
    public native UIImage getIcon();
    @Mapping("localizedName")
    public native String getLocalizedName();
    @Mapping("localizedDescription")
    public native String getLocalizedDescription();
    @Mapping("organizationName")
    public native String getOrganizationName();
    @Mapping("relevantDate")
    public native NSDate getRelevantDate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("passURL")
    public native NSURL getPassURL();
    
    
    
    @Mapping("localizedValueForFieldKey:")
    public native Object getLocalizedValue(String key);
    
}
