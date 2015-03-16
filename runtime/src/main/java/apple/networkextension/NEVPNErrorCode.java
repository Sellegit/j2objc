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
@Mapping("NEVPNErrorCode")
public final class NEVPNErrorCode extends ObjCEnum {
    
    @GlobalConstant("NEVPNErrorConfigurationInvalid")
    public static final long figurationInvalid = 1L;
    @GlobalConstant("NEVPNErrorConfigurationDisabled")
    public static final long figurationDisabled = 2L;
    @GlobalConstant("NEVPNErrorConnectionFailed")
    public static final long nectionFailed = 3L;
    @GlobalConstant("NEVPNErrorConfigurationStale")
    public static final long figurationStale = 4L;
    

}
