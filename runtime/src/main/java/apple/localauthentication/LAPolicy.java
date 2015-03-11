package apple.localauthentication;


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

@Library("LocalAuthentication")
@Mapping("LAPolicy")
public final class LAPolicy extends ObjCEnum {
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("LAPolicyDeviceOwnerAuthenticationWithBiometrics")
    public static final long DeviceOwnerAuthenticationWithBiometrics = 1L;
    

}
