package apple.coreaudio;


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


@Mapping("SMPTETime") @Library("CoreAudio/CoreAudioTypes.h")
public class SMPTETime 
    extends Struct 
     {

    
    private SMPTETime() {}
    
    
    @DotMapping("mSubframes")
    public native short getMSubframes();
    @DotMapping("mSubframeDivisor")
    public native short getMSubframeDivisor();
    @DotMapping("mCounter")
    public native int getMCounter();
    @DotMapping("mType")
    public native int getMType();
    @DotMapping("mFlags")
    public native int getMFlags();
    @DotMapping("mHours")
    public native short getMHours();
    @DotMapping("mMinutes")
    public native short getMMinutes();
    @DotMapping("mSeconds")
    public native short getMSeconds();
    @DotMapping("mFrames")
    public native short getMFrames();

    
}
