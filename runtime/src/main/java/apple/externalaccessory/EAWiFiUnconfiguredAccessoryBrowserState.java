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


@Library("ExternalAccessory/ExternalAccessory.h")
@Mapping("EAWiFiUnconfiguredAccessoryBrowserState")
public final class EAWiFiUnconfiguredAccessoryBrowserState extends ObjCEnum {
    
    @GlobalConstant("EAWiFiUnconfiguredAccessoryBrowserStateWiFiUnavailable")
    public static final long WiFiUnavailable = 0L;
    @GlobalConstant("EAWiFiUnconfiguredAccessoryBrowserStateStopped")
    public static final long Stopped = 1L;
    @GlobalConstant("EAWiFiUnconfiguredAccessoryBrowserStateSearching")
    public static final long Searching = 2L;
    @GlobalConstant("EAWiFiUnconfiguredAccessoryBrowserStateConfiguring")
    public static final long Configuring = 3L;


}
