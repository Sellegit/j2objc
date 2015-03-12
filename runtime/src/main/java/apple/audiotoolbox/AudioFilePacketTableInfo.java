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





@Mapping("AudioFilePacketTableInfo")
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
        original.mNumberValidFrames = mNumberValidFrames;
        return original;
    ]-*/;

    
    public static native AudioFilePacketTableInfo copyWithmPrimingFrames(AudioFilePacketTableInfo original, int mPrimingFrames) /*-[
        original.mPrimingFrames = mPrimingFrames;
        return original;
    ]-*/;

    
    public static native AudioFilePacketTableInfo copyWithmRemainderFrames(AudioFilePacketTableInfo original, int mRemainderFrames) /*-[
        original.mRemainderFrames = mRemainderFrames;
        return original;
    ]-*/;

    
}
