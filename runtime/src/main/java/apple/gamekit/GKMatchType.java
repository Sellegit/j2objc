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
@Mapping("GKMatchType")
public final class GKMatchType extends ObjCEnum {
    
    @GlobalConstant("GKMatchTypePeerToPeer")
    public static final long PeerToPeer = 0L;
    @GlobalConstant("GKMatchTypeHosted")
    public static final long Hosted = 1L;
    @GlobalConstant("GKMatchTypeTurnBased")
    public static final long TurnBased = 2L;
    

}
