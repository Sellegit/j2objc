package apple.externalaccessory;


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
import apple.uikit.*;
import apple.dispatch.*;






@Mapping("EAWiFiUnconfiguredAccessoryConfigurationStatus")
public final class EAWiFiUnconfiguredAccessoryConfigurationStatus extends ObjCEnum {
    
    @GlobalConstant("EAWiFiUnconfiguredAccessoryConfigurationStatusSuccess")
    public static final long Success = 0L;
    @GlobalConstant("EAWiFiUnconfiguredAccessoryConfigurationStatusUserCancelledConfiguration")
    public static final long UserCancelledConfiguration = 1L;
    @GlobalConstant("EAWiFiUnconfiguredAccessoryConfigurationStatusFailed")
    public static final long Failed = 2L;
    

}
