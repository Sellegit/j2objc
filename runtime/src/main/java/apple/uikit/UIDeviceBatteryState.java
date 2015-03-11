package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;






@Mapping("UIDeviceBatteryState")
public final class UIDeviceBatteryState extends ObjCEnum {
    
    @GlobalConstant("UIDeviceBatteryStateUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("UIDeviceBatteryStateUnplugged")
    public static final long Unplugged = 1L;
    @GlobalConstant("UIDeviceBatteryStateCharging")
    public static final long Charging = 2L;
    @GlobalConstant("UIDeviceBatteryStateFull")
    public static final long Full = 3L;
    

}
