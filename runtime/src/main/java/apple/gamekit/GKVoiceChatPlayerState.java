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
@Mapping("GKVoiceChatPlayerState")
public final class GKVoiceChatPlayerState extends ObjCEnum {
    
    @GlobalConstant("GKVoiceChatPlayerConnected")
    public static final long Connected = 0L;
    @GlobalConstant("GKVoiceChatPlayerDisconnected")
    public static final long Disconnected = 1L;
    @GlobalConstant("GKVoiceChatPlayerSpeaking")
    public static final long Speaking = 2L;
    @GlobalConstant("GKVoiceChatPlayerSilent")
    public static final long Silent = 3L;
    @GlobalConstant("GKVoiceChatPlayerConnecting")
    public static final long Connecting = 4L;
    

}
