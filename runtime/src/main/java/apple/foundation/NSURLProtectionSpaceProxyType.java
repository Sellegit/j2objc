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
public class NSURLProtectionSpaceProxyType 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSURLProtectionSpaceHTTPProxy")
    public static native NSString HTTPValue();
    @GlobalConstant("NSURLProtectionSpaceHTTPSProxy")
    public static native NSString HTTPSValue();
    @GlobalConstant("NSURLProtectionSpaceFTPProxy")
    public static native NSString FTPValue();
    @GlobalConstant("NSURLProtectionSpaceSOCKSProxy")
    public static native NSString SOCKSValue();
    
}
