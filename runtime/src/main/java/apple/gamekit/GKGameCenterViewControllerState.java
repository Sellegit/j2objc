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





@Library("GameKit")
@Mapping("GKGameCenterViewControllerState")
public final class GKGameCenterViewControllerState extends ObjCEnum {
    
    @GlobalConstant("GKGameCenterViewControllerStateDefault")
    public static final long Default = -1L;
    @GlobalConstant("GKGameCenterViewControllerStateLeaderboards")
    public static final long Leaderboards = 0L;
    @GlobalConstant("GKGameCenterViewControllerStateAchievements")
    public static final long Achievements = 1L;
    @GlobalConstant("GKGameCenterViewControllerStateChallenges")
    public static final long Challenges = 2L;
    

}
