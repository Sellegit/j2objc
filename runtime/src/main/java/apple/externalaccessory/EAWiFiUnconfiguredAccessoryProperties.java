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






@Mapping("EAWiFiUnconfiguredAccessoryProperties")
public final class EAWiFiUnconfiguredAccessoryProperties extends ObjCEnum {
    
    @GlobalConstant("EAWiFiUnconfiguredAccessoryPropertySupportsAirPlay")
    public static final long AirPlay = 1L;
    @GlobalConstant("EAWiFiUnconfiguredAccessoryPropertySupportsAirPrint")
    public static final long AirPrint = 2L;
    @GlobalConstant("EAWiFiUnconfiguredAccessoryPropertySupportsHomeKit")
    public static final long HomeKit = 4L;
    

}
