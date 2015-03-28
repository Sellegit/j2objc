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


@Library("NetworkExtension/NetworkExtension.h")
@Mapping("NEEvaluateConnectionRuleAction")
public final class NEEvaluateConnectionRuleAction extends ObjCEnum {
    
    @GlobalConstant("NEEvaluateConnectionRuleActionConnectIfNeeded")
    public static final long ConnectIfNeeded = 1L;
    @GlobalConstant("NEEvaluateConnectionRuleActionNeverConnect")
    public static final long NeverConnect = 2L;


}
