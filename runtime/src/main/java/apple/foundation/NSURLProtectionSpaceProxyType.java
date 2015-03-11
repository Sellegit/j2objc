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
public class NSURLProtectionSpaceProxyType 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSURLProtectionSpaceHTTPProxy")
    protected static native NSString HTTPValue();
    @GlobalConstant("NSURLProtectionSpaceHTTPSProxy")
    protected static native NSString HTTPSValue();
    @GlobalConstant("NSURLProtectionSpaceFTPProxy")
    protected static native NSString FTPValue();
    @GlobalConstant("NSURLProtectionSpaceSOCKSProxy")
    protected static native NSString SOCKSValue();
    
}
