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
@Mapping("GKTurnBasedMatchStatus")
public final class GKTurnBasedMatchStatus extends ObjCEnum {
    
    @GlobalConstant("GKTurnBasedMatchStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("GKTurnBasedMatchStatusOpen")
    public static final long Open = 1L;
    @GlobalConstant("GKTurnBasedMatchStatusEnded")
    public static final long Ended = 2L;
    @GlobalConstant("GKTurnBasedMatchStatusMatching")
    public static final long Matching = 3L;
    

}
