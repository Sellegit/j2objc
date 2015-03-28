package apple.storekit;


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
import apple.accounts.*;


@Library("StoreKit/StoreKit.h")
@Mapping("SKErrorCode")
public final class SKErrorCode extends ObjCEnum {
    
    @GlobalConstant("SKErrorUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("SKErrorClientInvalid")
    public static final long ClientInvalid = 1L;
    @GlobalConstant("SKErrorPaymentCancelled")
    public static final long PaymentCancelled = 2L;
    @GlobalConstant("SKErrorPaymentInvalid")
    public static final long PaymentInvalid = 3L;
    @GlobalConstant("SKErrorPaymentNotAllowed")
    public static final long PaymentNotAllowed = 4L;
    @GlobalConstant("SKErrorStoreProductNotAvailable")
    public static final long StoreProductNotAvailable = 5L;


}
