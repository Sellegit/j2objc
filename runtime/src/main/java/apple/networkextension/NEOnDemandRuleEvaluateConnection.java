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
@Library("NetworkExtension/NetworkExtension.h") @Mapping("NEOnDemandRuleEvaluateConnection")
public class NEOnDemandRuleEvaluateConnection 
    extends NEOnDemandRule 
     {

    
    
    @Mapping("init")
    public NEOnDemandRuleEvaluateConnection() { }

    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("connectionRules")
    public native NSArray<NEEvaluateConnectionRule> getConnectionRules();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setConnectionRules:")
    public native void setConnectionRules(NSArray<NEEvaluateConnectionRule> v);

    
    


}
