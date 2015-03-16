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
@Mapping("GKMatchSendDataMode")
public final class GKMatchSendDataMode extends ObjCEnum {
    
    @GlobalConstant("GKMatchSendDataReliable")
    public static final long Reliable = 0L;
    @GlobalConstant("GKMatchSendDataUnreliable")
    public static final long Unreliable = 1L;
    

}
