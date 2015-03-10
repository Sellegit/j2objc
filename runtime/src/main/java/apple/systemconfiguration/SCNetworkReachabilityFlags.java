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






@Mapping("SCNetworkReachabilityFlags")
public final class SCNetworkReachabilityFlags extends ObjCEnum {
    
    @GlobalConstant("kSCNetworkReachabilityFlagsTransientConnection")
    public static final long TransientConnection = 1L;
    @GlobalConstant("kSCNetworkReachabilityFlagsReachable")
    public static final long Reachable = 2L;
    @GlobalConstant("kSCNetworkReachabilityFlagsConnectionRequired")
    public static final long ConnectionRequired = 4L;
    @GlobalConstant("kSCNetworkReachabilityFlagsConnectionOnTraffic")
    public static final long ConnectionOnTraffic = 8L;
    @GlobalConstant("kSCNetworkReachabilityFlagsInterventionRequired")
    public static final long InterventionRequired = 16L;
    @GlobalConstant("kSCNetworkReachabilityFlagsConnectionOnDemand")
    public static final long ConnectionOnDemand = 32L;
    @GlobalConstant("kSCNetworkReachabilityFlagsIsLocalAddress")
    public static final long IsLocalAddress = 65536L;
    @GlobalConstant("kSCNetworkReachabilityFlagsIsDirect")
    public static final long IsDirect = 131072L;
    @GlobalConstant("kSCNetworkReachabilityFlagsIsWWAN")
    public static final long IsWWAN = 262144L;
    @GlobalConstant("kSCNetworkReachabilityFlagsConnectionAutomatic")
    public static final long ConnectionAutomatic = 8L;
    

}
