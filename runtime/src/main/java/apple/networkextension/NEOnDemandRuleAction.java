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


@Mapping("NEOnDemandRuleAction")
public final class NEOnDemandRuleAction extends ObjCEnum {
    
    @GlobalConstant("NEOnDemandRuleActionConnect")
    public static final long Connect = 1L;
    @GlobalConstant("NEOnDemandRuleActionDisconnect")
    public static final long Disconnect = 2L;
    @GlobalConstant("NEOnDemandRuleActionEvaluateConnection")
    public static final long EvaluateConnection = 3L;
    @GlobalConstant("NEOnDemandRuleActionIgnore")
    public static final long Ignore = 4L;
    

}
