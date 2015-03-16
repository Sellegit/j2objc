package apple.gamekit;


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





@Library("GameKit/GameKit.h")
@Mapping("GKLeaderboardTimeScope")
public final class GKLeaderboardTimeScope extends ObjCEnum {
    
    @GlobalConstant("GKLeaderboardTimeScopeToday")
    public static final long Today = 0L;
    @GlobalConstant("GKLeaderboardTimeScopeWeek")
    public static final long Week = 1L;
    @GlobalConstant("GKLeaderboardTimeScopeAllTime")
    public static final long AllTime = 2L;
    

}
