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





@Library("Foundation/Foundation.h") @Mapping("NSError")
public class NSError 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithDomain:code:userInfo:")
    public NSError(String domain, @MachineSizedSInt long code, NSDictionary<?, ?> dict) { }
    
    
    @Mapping("domain")
    public native String getDomain();
    @Mapping("code")
    public native @MachineSizedSInt long getCode();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("localizedDescription")
    public native String getLocalizedDescription();
    @Mapping("localizedFailureReason")
    public native String getLocalizedFailureReason();
    @Mapping("localizedRecoverySuggestion")
    public native String getLocalizedRecoverySuggestion();
    @Mapping("localizedRecoveryOptions")
    public native List<String> getLocalizedRecoveryOptions();
    @Mapping("recoveryAttempter")
    public native NSErrorRecoveryAttempting getRecoveryAttempter();
    @Mapping("helpAnchor")
    public native String getHelpAnchor();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
