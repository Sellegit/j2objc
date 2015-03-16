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
@Mapping("NEVPNIKEv2IntegrityAlgorithm")
public final class NEVPNIKEv2IntegrityAlgorithm extends ObjCEnum {
    
    @GlobalConstant("NEVPNIKEv2IntegrityAlgorithmSHA96")
    public static final long _96 = 1L;
    @GlobalConstant("NEVPNIKEv2IntegrityAlgorithmSHA160")
    public static final long _160 = 2L;
    @GlobalConstant("NEVPNIKEv2IntegrityAlgorithmSHA256")
    public static final long _256 = 3L;
    @GlobalConstant("NEVPNIKEv2IntegrityAlgorithmSHA384")
    public static final long _384 = 4L;
    @GlobalConstant("NEVPNIKEv2IntegrityAlgorithmSHA512")
    public static final long _512 = 5L;
    

}
