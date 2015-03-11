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
@Mapping("GKPlayerConnectionState")
public final class GKPlayerConnectionState extends ObjCEnum {
    
    @GlobalConstant("GKPlayerStateUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("GKPlayerStateConnected")
    public static final long Connected = 1L;
    @GlobalConstant("GKPlayerStateDisconnected")
    public static final long Disconnected = 2L;
    

}
