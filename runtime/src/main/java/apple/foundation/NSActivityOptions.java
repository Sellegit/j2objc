package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("Foundation")
@Mapping("NSActivityOptions")
public final class NSActivityOptions extends ObjCEnum {
    
    @GlobalConstant("NSActivityIdleDisplaySleepDisabled")
    public static final long IdleDisplaySleepDisabled = 1099511627776L;
    @GlobalConstant("NSActivityIdleSystemSleepDisabled")
    public static final long IdleSystemSleepDisabled = 1048576L;
    @GlobalConstant("NSActivitySuddenTerminationDisabled")
    public static final long SuddenTerminationDisabled = 16384L;
    @GlobalConstant("NSActivityAutomaticTerminationDisabled")
    public static final long AutomaticTerminationDisabled = 32768L;
    @GlobalConstant("NSActivityUserInitiated")
    public static final long UserInitiated = 16777215L;
    @GlobalConstant("NSActivityUserInitiatedAllowingIdleSystemSleep")
    public static final long UserInitiatedAllowingIdleSystemSleep = 15728639L;
    @GlobalConstant("NSActivityBackground")
    public static final long Background = 255L;
    @GlobalConstant("NSActivityLatencyCritical")
    public static final long LatencyCritical = 1095216660480L;
    

}
