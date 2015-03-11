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


@Mapping("NEVPNIKEAuthenticationMethod")
public final class NEVPNIKEAuthenticationMethod extends ObjCEnum {
    
    @GlobalConstant("NEVPNIKEAuthenticationMethodNone")
    public static final long None = 0L;
    @GlobalConstant("NEVPNIKEAuthenticationMethodCertificate")
    public static final long Certificate = 1L;
    @GlobalConstant("NEVPNIKEAuthenticationMethodSharedSecret")
    public static final long SharedSecret = 2L;
    

}
