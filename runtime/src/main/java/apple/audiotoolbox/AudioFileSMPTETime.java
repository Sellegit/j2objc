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





@Mapping("AudioFileSMPTETime")
public class AudioFileSMPTETime 
    extends Struct 
     {

    
    protected AudioFileSMPTETime() {}
    
    
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
    
    public static native AudioFileSMPTETime create(byte mHours, byte mMinutes, byte mSeconds, byte mFrames, int mSubFrameSampleOffset) /*-[
        AudioFileSMPTETime __new = { .mHours = mHours, .mMinutes = mMinutes, .mSeconds = mSeconds, .mFrames = mFrames, .mSubFrameSampleOffset = mSubFrameSampleOffset };
        return __new;
    ]-*/;
    public static native AudioFileSMPTETime copyWithmHours(AudioFileSMPTETime original, byte mHours) /*-[
        original.mHours = mHours;
        return original;
    ]-*/;

    
    public static native AudioFileSMPTETime copyWithmMinutes(AudioFileSMPTETime original, byte mMinutes) /*-[
        original.mMinutes = mMinutes;
        return original;
    ]-*/;

    
    public static native AudioFileSMPTETime copyWithmSeconds(AudioFileSMPTETime original, byte mSeconds) /*-[
        original.mSeconds = mSeconds;
        return original;
    ]-*/;

    
    public static native AudioFileSMPTETime copyWithmFrames(AudioFileSMPTETime original, byte mFrames) /*-[
        original.mFrames = mFrames;
        return original;
    ]-*/;

    
    public static native AudioFileSMPTETime copyWithmSubFrameSampleOffset(AudioFileSMPTETime original, int mSubFrameSampleOffset) /*-[
        original.mSubFrameSampleOffset = mSubFrameSampleOffset;
        return original;
    ]-*/;

    
}
