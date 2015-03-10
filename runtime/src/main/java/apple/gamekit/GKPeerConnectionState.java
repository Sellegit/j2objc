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






@Mapping("GKPeerConnectionState")
public final class GKPeerConnectionState extends ObjCEnum {
    
    @GlobalConstant("GKPeerStateAvailable")
    public static final long Available = 0L;
    @GlobalConstant("GKPeerStateUnavailable")
    public static final long Unavailable = 1L;
    @GlobalConstant("GKPeerStateConnected")
    public static final long Connected = 2L;
    @GlobalConstant("GKPeerStateDisconnected")
    public static final long Disconnected = 3L;
    @GlobalConstant("GKPeerStateConnecting")
    public static final long Connecting = 4L;
    

}
