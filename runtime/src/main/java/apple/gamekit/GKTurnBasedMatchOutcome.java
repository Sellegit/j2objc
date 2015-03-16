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
@Mapping("GKTurnBasedMatchOutcome")
public final class GKTurnBasedMatchOutcome extends ObjCEnum {
    
    @GlobalConstant("GKTurnBasedMatchOutcomeNone")
    public static final long None = 0L;
    @GlobalConstant("GKTurnBasedMatchOutcomeQuit")
    public static final long Quit = 1L;
    @GlobalConstant("GKTurnBasedMatchOutcomeWon")
    public static final long Won = 2L;
    @GlobalConstant("GKTurnBasedMatchOutcomeLost")
    public static final long Lost = 3L;
    @GlobalConstant("GKTurnBasedMatchOutcomeTied")
    public static final long Tied = 4L;
    @GlobalConstant("GKTurnBasedMatchOutcomeTimeExpired")
    public static final long TimeExpired = 5L;
    @GlobalConstant("GKTurnBasedMatchOutcomeFirst")
    public static final long First = 6L;
    @GlobalConstant("GKTurnBasedMatchOutcomeSecond")
    public static final long Second = 7L;
    @GlobalConstant("GKTurnBasedMatchOutcomeThird")
    public static final long Third = 8L;
    @GlobalConstant("GKTurnBasedMatchOutcomeFourth")
    public static final long Fourth = 9L;
    @GlobalConstant("GKTurnBasedMatchOutcomeCustomRange")
    public static final long CustomRange = 16711680L;
    

}
