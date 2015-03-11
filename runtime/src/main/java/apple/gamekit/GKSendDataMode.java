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






@Mapping("GKSendDataMode")
public final class GKSendDataMode extends ObjCEnum {
    
    @GlobalConstant("GKSendDataReliable")
    public static final long Reliable = 0L;
    @GlobalConstant("GKSendDataUnreliable")
    public static final long Unreliable = 1L;
    

}
