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
@Mapping("PKMerchantCapability")
public final class PKMerchantCapability extends ObjCEnum {
    
    @GlobalConstant("PKMerchantCapability3DS")
    public static final long _3DS = 1L;
    @GlobalConstant("PKMerchantCapabilityEMV")
    public static final long EMV = 2L;


}
