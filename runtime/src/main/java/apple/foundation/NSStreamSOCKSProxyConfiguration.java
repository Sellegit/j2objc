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
@Library("Foundation/Foundation.h")
public class NSStreamSOCKSProxyConfiguration 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSOCKSProxyHostKey")
    public static native NSString HostKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSOCKSProxyPortKey")
    public static native NSString PortKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSOCKSProxyVersionKey")
    public static native NSString VersionKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSOCKSProxyUserKey")
    public static native NSString UserKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSOCKSProxyPasswordKey")
    public static native NSString PasswordKey();

}
