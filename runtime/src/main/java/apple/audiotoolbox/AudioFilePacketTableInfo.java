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





@Mapping("AudioFilePacketTableInfo") @Library("AudioToolbox/AudioToolbox.h")
public class AudioFilePacketTableInfo 
    extends Struct 
     {

    
    protected AudioFilePacketTableInfo() {}
    
    
    @DotMapping("mNumberValidFrames")
    public native long getMNumberValidFrames();
    @DotMapping("mPrimingFrames")
    public native int getMPrimingFrames();
    @DotMapping("mRemainderFrames")
    public native int getMRemainderFrames();
    
    public static native AudioFilePacketTableInfo create(long mNumberValidFrames, int mPrimingFrames, int mRemainderFrames) /*-[
        AudioFilePacketTableInfo __new = { .mNumberValidFrames = mNumberValidFrames, .mPrimingFrames = mPrimingFrames, .mRemainderFrames = mRemainderFrames };
        return __new;
    ]-*/;
    public static native AudioFilePacketTableInfo copyWithmNumberValidFrames(AudioFilePacketTableInfo original, long mNumberValidFrames) /*-[
        AudioFilePacketTableInfo __new = { .mNumberValidFrames = mNumberValidFrames, .mPrimingFrames = original.mPrimingFrames, .mRemainderFrames = original.mRemainderFrames };
        return __new;
    ]-*/;

    
    public static native AudioFilePacketTableInfo copyWithmPrimingFrames(AudioFilePacketTableInfo original, int mPrimingFrames) /*-[
        AudioFilePacketTableInfo __new = { .mNumberValidFrames = original.mNumberValidFrames, .mPrimingFrames = mPrimingFrames, .mRemainderFrames = original.mRemainderFrames };
        return __new;
    ]-*/;

    
    public static native AudioFilePacketTableInfo copyWithmRemainderFrames(AudioFilePacketTableInfo original, int mRemainderFrames) /*-[
        AudioFilePacketTableInfo __new = { .mNumberValidFrames = original.mNumberValidFrames, .mPrimingFrames = original.mPrimingFrames, .mRemainderFrames = mRemainderFrames };
        return __new;
    ]-*/;

    
}
