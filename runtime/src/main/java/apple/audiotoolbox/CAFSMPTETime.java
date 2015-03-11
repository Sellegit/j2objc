package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("CAFSMPTETime")
public class CAFSMPTETime 
    extends Struct 
     {

    
    protected CAFSMPTETime() {}
    
    
    @DotMapping("mHours")
    public native byte getMHours();
    @DotMapping("mMinutes")
    public native byte getMMinutes();
    @DotMapping("mSeconds")
    public native byte getMSeconds();
    @DotMapping("mFrames")
    public native byte getMFrames();
    @DotMapping("mSubFrameSampleOffset")
    public native int getMSubFrameSampleOffset();
    
    public static native CAFSMPTETime create(byte mHours, byte mMinutes, byte mSeconds, byte mFrames, int mSubFrameSampleOffset) /*-[
        CAFSMPTETime __new = { .mHours = mHours, .mMinutes = mMinutes, .mSeconds = mSeconds, .mFrames = mFrames, .mSubFrameSampleOffset = mSubFrameSampleOffset };
        return __new;
    ]-*/;
    public static native CAFSMPTETime copyWithmHours(CAFSMPTETime original, byte mHours) /*-[
        original.mHours = mHours;
        return __new;
    ]-*/;

    
    public static native CAFSMPTETime copyWithmMinutes(CAFSMPTETime original, byte mMinutes) /*-[
        original.mMinutes = mMinutes;
        return __new;
    ]-*/;

    
    public static native CAFSMPTETime copyWithmSeconds(CAFSMPTETime original, byte mSeconds) /*-[
        original.mSeconds = mSeconds;
        return __new;
    ]-*/;

    
    public static native CAFSMPTETime copyWithmFrames(CAFSMPTETime original, byte mFrames) /*-[
        original.mFrames = mFrames;
        return __new;
    ]-*/;

    
    public static native CAFSMPTETime copyWithmSubFrameSampleOffset(CAFSMPTETime original, int mSubFrameSampleOffset) /*-[
        original.mSubFrameSampleOffset = mSubFrameSampleOffset;
        return __new;
    ]-*/;

    
}
