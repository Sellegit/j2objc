package apple.systemconfiguration;


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
import apple.dispatch.*;





@Mapping("SCNetworkReachabilityContext") @Library("SystemConfiguration/SystemConfiguration.h")
 class SCNetworkReachabilityContext 
    extends Struct 
     {

    
    protected SCNetworkReachabilityContext() {}
    
    
    @DotMapping("version")
    public native @MachineSizedSInt long getVersion();
    
    
}
