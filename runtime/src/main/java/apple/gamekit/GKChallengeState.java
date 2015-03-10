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






@Mapping("GKChallengeState")
public final class GKChallengeState extends ObjCEnum {
    
    @GlobalConstant("GKChallengeStateInvalid")
    public static final long Invalid = 0L;
    @GlobalConstant("GKChallengeStatePending")
    public static final long Pending = 1L;
    @GlobalConstant("GKChallengeStateCompleted")
    public static final long Completed = 2L;
    @GlobalConstant("GKChallengeStateDeclined")
    public static final long Declined = 3L;
    

}
