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

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreTelephony/CTCall.h")
public class CTRadioAccessTechnology 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyGPRS")
    public static native NSString GPRSValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyEdge")
    public static native NSString EdgeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyWCDMA")
    public static native NSString WCDMAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyHSDPA")
    public static native NSString HSDPAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyHSUPA")
    public static native NSString HSUPAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMA1x")
    public static native NSString CDMA1xValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMAEVDORev0")
    public static native NSString CDMAEVDORev0Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMAEVDORevA")
    public static native NSString CDMAEVDORevAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMAEVDORevB")
    public static native NSString CDMAEVDORevBValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyeHRPD")
    public static native NSString eHRPDValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyLTE")
    public static native NSString LTEValue();

}
