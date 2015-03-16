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
@Mapping("NEVPNIKEv2EncryptionAlgorithm")
public final class NEVPNIKEv2EncryptionAlgorithm extends ObjCEnum {
    
    @GlobalConstant("NEVPNIKEv2EncryptionAlgorithmDES")
    public static final long DES = 1L;
    @GlobalConstant("NEVPNIKEv2EncryptionAlgorithm3DES")
    public static final long _3DES = 2L;
    @GlobalConstant("NEVPNIKEv2EncryptionAlgorithmAES128")
    public static final long AES128 = 3L;
    @GlobalConstant("NEVPNIKEv2EncryptionAlgorithmAES256")
    public static final long AES256 = 4L;
    

}
