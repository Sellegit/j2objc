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
@Mapping("NEVPNStatus")
public final class NEVPNStatus extends ObjCEnum {
    
    @GlobalConstant("NEVPNStatusInvalid")
    public static final long Invalid = 0L;
    @GlobalConstant("NEVPNStatusDisconnected")
    public static final long Disconnected = 1L;
    @GlobalConstant("NEVPNStatusConnecting")
    public static final long Connecting = 2L;
    @GlobalConstant("NEVPNStatusConnected")
    public static final long Connected = 3L;
    @GlobalConstant("NEVPNStatusReasserting")
    public static final long Reasserting = 4L;
    @GlobalConstant("NEVPNStatusDisconnecting")
    public static final long Disconnecting = 5L;


}
