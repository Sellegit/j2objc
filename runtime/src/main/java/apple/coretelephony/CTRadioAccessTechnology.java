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
@Library("CoreTelephony")
public class CTRadioAccessTechnology 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyGPRS")
    protected static native NSString GPRSValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyEdge")
    protected static native NSString EdgeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyWCDMA")
    protected static native NSString WCDMAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyHSDPA")
    protected static native NSString HSDPAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyHSUPA")
    protected static native NSString HSUPAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMA1x")
    protected static native NSString CDMA1xValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMAEVDORev0")
    protected static native NSString CDMAEVDORev0Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMAEVDORevA")
    protected static native NSString CDMAEVDORevAValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyCDMAEVDORevB")
    protected static native NSString CDMAEVDORevBValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyeHRPD")
    protected static native NSString eHRPDValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("CTRadioAccessTechnologyLTE")
    protected static native NSString LTEValue();
    
}
