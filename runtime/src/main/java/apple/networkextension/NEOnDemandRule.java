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

@Library("NetworkExtension/NetworkExtension.h") @Mapping("NEOnDemandRule")
public class NEOnDemandRule 
    extends NSObject 
    implements NSCopying {

    
    
    public NEOnDemandRule() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("action")
    public native @Representing("NEOnDemandRuleAction") @MachineSizedSInt long getAction();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("DNSSearchDomainMatch")
    public native List<String> getDNSSearchDomainMatch();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDNSSearchDomainMatch:")
    public native void setDNSSearchDomainMatch(List<String> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("DNSServerAddressMatch")
    public native List<String> getDNSServerAddressMatch();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDNSServerAddressMatch:")
    public native void setDNSServerAddressMatch(List<String> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("interfaceTypeMatch")
    public native @Representing("NEOnDemandRuleInterfaceType") @MachineSizedSInt long getInterfaceTypeMatch();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setInterfaceTypeMatch:")
    public native void setInterfaceTypeMatch(@Representing("NEOnDemandRuleInterfaceType") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("SSIDMatch")
    public native List<String> getSSIDMatch();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setSSIDMatch:")
    public native void setSSIDMatch(List<String> v);
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
