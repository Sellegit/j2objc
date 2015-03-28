package apple.coretelephony;


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


/**
 * @since Available in iOS 4.0 and later.
 */
@Library("CoreTelephony/CTCall.h") @Mapping("CTCarrier")
public class CTCarrier 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CTCarrier() { }

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("carrierName")
    public native String getCarrierName();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mobileCountryCode")
    public native String getMobileCountryCode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mobileNetworkCode")
    public native String getMobileNetworkCode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isoCountryCode")
    public native String getIsoCountryCode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("allowsVOIP")
    public native boolean allowsVOIP();

    
    


}
