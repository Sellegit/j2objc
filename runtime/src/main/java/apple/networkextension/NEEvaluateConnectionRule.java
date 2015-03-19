package apple.networkextension;


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
 * @since Available in iOS 8.0 and later.
 */

@Library("NetworkExtension/NetworkExtension.h") @Mapping("NEEvaluateConnectionRule")
public class NEEvaluateConnectionRule 
    extends NSObject 
    implements NSCopying {

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithMatchDomains:andAction:")
    public NEEvaluateConnectionRule(NSArray<?> domains, @Representing("NEEvaluateConnectionRuleAction") long action) { }
    @Mapping("init")
    public NEEvaluateConnectionRule() { }
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("action")
    public native @Representing("NEEvaluateConnectionRuleAction") long getAction();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("matchDomains")
    public native List<String> getMatchDomains();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("useDNSServers")
    public native List<String> getDNSServers();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setUseDNSServers:")
    public native void setDNSServers(List<String> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("probeURL")
    public native NSURL getProbeURL();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setProbeURL:")
    public native void setProbeURL(NSURL v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
