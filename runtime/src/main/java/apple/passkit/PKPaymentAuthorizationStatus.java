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
@Library("PassKit/PassKit.h")
@Mapping("PKPaymentAuthorizationStatus")
public final class PKPaymentAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("PKPaymentAuthorizationStatusSuccess")
    public static final long Success = 0L;
    @GlobalConstant("PKPaymentAuthorizationStatusFailure")
    public static final long Failure = 1L;
    @GlobalConstant("PKPaymentAuthorizationStatusInvalidBillingPostalAddress")
    public static final long InvalidBillingPostalAddress = 2L;
    @GlobalConstant("PKPaymentAuthorizationStatusInvalidShippingPostalAddress")
    public static final long InvalidShippingPostalAddress = 3L;
    @GlobalConstant("PKPaymentAuthorizationStatusInvalidShippingContact")
    public static final long InvalidShippingContact = 4L;


}
