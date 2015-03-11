package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation")
public class NSStreamProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelKey")
    protected static native NSString SocketSecurityLevelValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSOCKSProxyConfigurationKey")
    protected static native NSString SOCKSProxyConfigurationValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamDataWrittenToMemoryStreamKey")
    protected static native NSString DataWrittenToMemoryStreamValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamFileCurrentOffsetKey")
    protected static native NSString FileCurrentOffsetValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSStreamNetworkServiceType")
    protected static native NSString NetworkServiceTypeValue();
    
}
