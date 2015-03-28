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
@Library("NetworkExtension/NetworkExtension.h")
@Mapping("NEOnDemandRuleInterfaceType")
public final class NEOnDemandRuleInterfaceType extends ObjCEnum {
    
    @GlobalConstant("NEOnDemandRuleInterfaceTypeEthernet")
    public static final long Ethernet = 1L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NEOnDemandRuleInterfaceTypeWiFi")
    public static final long WiFi = 2L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NEOnDemandRuleInterfaceTypeCellular")
    public static final long Cellular = 3L;


}
