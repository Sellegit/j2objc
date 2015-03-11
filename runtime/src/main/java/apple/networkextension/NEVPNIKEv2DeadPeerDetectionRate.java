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

@Library("NetworkExtension")
@Mapping("NEVPNIKEv2DeadPeerDetectionRate")
public final class NEVPNIKEv2DeadPeerDetectionRate extends ObjCEnum {
    
    @GlobalConstant("NEVPNIKEv2DeadPeerDetectionRateNone")
    public static final long None = 0L;
    @GlobalConstant("NEVPNIKEv2DeadPeerDetectionRateLow")
    public static final long Low = 1L;
    @GlobalConstant("NEVPNIKEv2DeadPeerDetectionRateMedium")
    public static final long Medium = 2L;
    @GlobalConstant("NEVPNIKEv2DeadPeerDetectionRateHigh")
    public static final long High = 3L;
    

}
