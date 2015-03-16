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





@Mapping("AudioFile_SMPTE_Time") @Library("AudioToolbox/AudioToolbox.h")
public class AudioFile_SMPTE_Time 
    extends Struct 
     {

    
    protected AudioFile_SMPTE_Time() {}
    
    
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
    
    public static native AudioFile_SMPTE_Time create(byte mHours, byte mMinutes, byte mSeconds, byte mFrames, int mSubFrameSampleOffset) /*-[
        AudioFile_SMPTE_Time __new = { .mHours = mHours, .mMinutes = mMinutes, .mSeconds = mSeconds, .mFrames = mFrames, .mSubFrameSampleOffset = mSubFrameSampleOffset };
        return __new;
    ]-*/;
    public static native AudioFile_SMPTE_Time copyWithmHours(AudioFile_SMPTE_Time original, byte mHours) /*-[
        AudioFile_SMPTE_Time __new = { .mHours = mHours, .mMinutes = original.mMinutes, .mSeconds = original.mSeconds, .mFrames = original.mFrames, .mSubFrameSampleOffset = original.mSubFrameSampleOffset };
        return __new;
    ]-*/;

    
    public static native AudioFile_SMPTE_Time copyWithmMinutes(AudioFile_SMPTE_Time original, byte mMinutes) /*-[
        AudioFile_SMPTE_Time __new = { .mHours = original.mHours, .mMinutes = mMinutes, .mSeconds = original.mSeconds, .mFrames = original.mFrames, .mSubFrameSampleOffset = original.mSubFrameSampleOffset };
        return __new;
    ]-*/;

    
    public static native AudioFile_SMPTE_Time copyWithmSeconds(AudioFile_SMPTE_Time original, byte mSeconds) /*-[
        AudioFile_SMPTE_Time __new = { .mHours = original.mHours, .mMinutes = original.mMinutes, .mSeconds = mSeconds, .mFrames = original.mFrames, .mSubFrameSampleOffset = original.mSubFrameSampleOffset };
        return __new;
    ]-*/;

    
    public static native AudioFile_SMPTE_Time copyWithmFrames(AudioFile_SMPTE_Time original, byte mFrames) /*-[
        AudioFile_SMPTE_Time __new = { .mHours = original.mHours, .mMinutes = original.mMinutes, .mSeconds = original.mSeconds, .mFrames = mFrames, .mSubFrameSampleOffset = original.mSubFrameSampleOffset };
        return __new;
    ]-*/;

    
    public static native AudioFile_SMPTE_Time copyWithmSubFrameSampleOffset(AudioFile_SMPTE_Time original, int mSubFrameSampleOffset) /*-[
        AudioFile_SMPTE_Time __new = { .mHours = original.mHours, .mMinutes = original.mMinutes, .mSeconds = original.mSeconds, .mFrames = original.mFrames, .mSubFrameSampleOffset = mSubFrameSampleOffset };
        return __new;
    ]-*/;

    
}
