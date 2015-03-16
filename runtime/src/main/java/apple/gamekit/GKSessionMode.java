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
@Mapping("GKSessionMode")
public final class GKSessionMode extends ObjCEnum {
    
    @GlobalConstant("GKSessionModeServer")
    public static final long Server = 0L;
    @GlobalConstant("GKSessionModeClient")
    public static final long Client = 1L;
    @GlobalConstant("GKSessionModePeer")
    public static final long Peer = 2L;
    

}
