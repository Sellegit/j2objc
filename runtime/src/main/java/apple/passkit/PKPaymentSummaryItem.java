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

@Library("PassKit/PassKit.h") @Mapping("PKPaymentSummaryItem")
public class PKPaymentSummaryItem 
    extends NSObject 
     {

    
    
    public PKPaymentSummaryItem() {}
    
    
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    @Mapping("amount")
    public native NSDecimalNumber getAmount();
    @Mapping("setAmount:")
    public native void setAmount(NSDecimalNumber v);
    
    
    
    @Mapping("summaryItemWithLabel:amount:")
    public static native PKPaymentSummaryItem create(String label, NSDecimalNumber amount);
    
}
