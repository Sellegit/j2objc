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

@Library("PassKit") @Mapping("PKPaymentPass")
public class PKPaymentPass 
    extends PKPass 
     {

    
    
    public PKPaymentPass() {}
    @Mapping("initWithData:error:")
    public PKPaymentPass(NSData data, Todo error) { }
    
    
    @Mapping("primaryAccountIdentifier")
    public native String getPrimaryAccountIdentifier();
    @Mapping("primaryAccountNumberSuffix")
    public native String getPrimaryAccountNumberSuffix();
    @Mapping("deviceAccountIdentifier")
    public native String getDeviceAccountIdentifier();
    @Mapping("deviceAccountNumberSuffix")
    public native String getDeviceAccountNumberSuffix();
    @Mapping("activationState")
    public native @Representing("PKPaymentPassActivationState") @MachineSizedUInt long getActivationState();
    
    
    
    
    
}
