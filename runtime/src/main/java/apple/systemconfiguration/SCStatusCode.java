package apple.systemconfiguration;


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
import apple.dispatch.*;


@Library("SystemConfiguration/SystemConfiguration.h")
@Mapping("SCStatusCode")
public final class SCStatusCode extends ObjCEnum {
    
    @GlobalConstant("kSCStatusOK")
    public static final long OK = 0L;
    @GlobalConstant("kSCStatusFailed")
    public static final long Failed = 1001L;
    @GlobalConstant("kSCStatusInvalidArgument")
    public static final long InvalidArgument = 1002L;
    @GlobalConstant("kSCStatusAccessError")
    public static final long AccessError = 1003L;
    @GlobalConstant("kSCStatusNoKey")
    public static final long NoKey = 1004L;
    @GlobalConstant("kSCStatusKeyExists")
    public static final long KeyExists = 1005L;
    @GlobalConstant("kSCStatusLocked")
    public static final long Locked = 1006L;
    @GlobalConstant("kSCStatusNeedLock")
    public static final long NeedLock = 1007L;
    @GlobalConstant("kSCStatusNoStoreSession")
    public static final long NoStoreSession = 2001L;
    @GlobalConstant("kSCStatusNoStoreServer")
    public static final long NoStoreServer = 2002L;
    @GlobalConstant("kSCStatusNotifierActive")
    public static final long NotifierActive = 2003L;
    @GlobalConstant("kSCStatusNoPrefsSession")
    public static final long NoPrefsSession = 3001L;
    @GlobalConstant("kSCStatusPrefsBusy")
    public static final long PrefsBusy = 3002L;
    @GlobalConstant("kSCStatusNoConfigFile")
    public static final long NoConfigFile = 3003L;
    @GlobalConstant("kSCStatusNoLink")
    public static final long NoLink = 3004L;
    @GlobalConstant("kSCStatusStale")
    public static final long Stale = 3005L;
    @GlobalConstant("kSCStatusMaxLink")
    public static final long MaxLink = 3006L;
    @GlobalConstant("kSCStatusReachabilityUnknown")
    public static final long ReachabilityUnknown = 4001L;
    @GlobalConstant("kSCStatusConnectionNoService")
    public static final long ConnectionNoService = 5001L;
    @GlobalConstant("kSCStatusConnectionIgnore")
    public static final long ConnectionIgnore = 5002L;


}
