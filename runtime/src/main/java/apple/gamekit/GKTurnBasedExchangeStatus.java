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
@Mapping("GKTurnBasedExchangeStatus")
public final class GKTurnBasedExchangeStatus extends ObjCEnum {
    
    @GlobalConstant("GKTurnBasedExchangeStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("GKTurnBasedExchangeStatusActive")
    public static final long Active = 1L;
    @GlobalConstant("GKTurnBasedExchangeStatusComplete")
    public static final long Complete = 2L;
    @GlobalConstant("GKTurnBasedExchangeStatusResolved")
    public static final long Resolved = 3L;
    @GlobalConstant("GKTurnBasedExchangeStatusCanceled")
    public static final long Canceled = 4L;
    

}
