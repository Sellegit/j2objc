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
@Library("PassKit/PassKit.h")
public class PKPaymentNetwork 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("PKPaymentNetworkAmex")
    protected static native NSString AmexValue();
    @GlobalConstant("PKPaymentNetworkMasterCard")
    protected static native NSString MasterCardValue();
    @GlobalConstant("PKPaymentNetworkVisa")
    protected static native NSString VisaValue();
    
}
