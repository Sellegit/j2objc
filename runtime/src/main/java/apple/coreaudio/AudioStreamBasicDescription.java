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





@Mapping("AudioStreamBasicDescription") @Library("CoreAudio/CoreAudioTypes.h")
public class AudioStreamBasicDescription 
    extends Struct 
     {

    
    private AudioStreamBasicDescription() {}
    
    
    @DotMapping("mSampleRate")
    public native double getMSampleRate();
    @DotMapping("mFormatID")
    public native int getMFormatID();
    @DotMapping("mFormatFlags")
    public native int getMFormatFlags();
    @DotMapping("mBytesPerPacket")
    public native int getMBytesPerPacket();
    @DotMapping("mFramesPerPacket")
    public native int getMFramesPerPacket();
    @DotMapping("mBytesPerFrame")
    public native int getMBytesPerFrame();
    @DotMapping("mChannelsPerFrame")
    public native int getMChannelsPerFrame();
    @DotMapping("mBitsPerChannel")
    public native int getMBitsPerChannel();
    @DotMapping("mReserved")
    public native int getMReserved();
    
    public static native AudioStreamBasicDescription create(double mSampleRate, int mFormatID, int mFormatFlags, int mBytesPerPacket, int mFramesPerPacket, int mBytesPerFrame, int mChannelsPerFrame, int mBitsPerChannel, int mReserved) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = mSampleRate, .mFormatID = mFormatID, .mFormatFlags = mFormatFlags, .mBytesPerPacket = mBytesPerPacket, .mFramesPerPacket = mFramesPerPacket, .mBytesPerFrame = mBytesPerFrame, .mChannelsPerFrame = mChannelsPerFrame, .mBitsPerChannel = mBitsPerChannel, .mReserved = mReserved };
        return __new;
    ]-*/;
    public static native AudioStreamBasicDescription copyWithmSampleRate(AudioStreamBasicDescription original, double mSampleRate) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmFormatID(AudioStreamBasicDescription original, int mFormatID) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmFormatFlags(AudioStreamBasicDescription original, int mFormatFlags) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmBytesPerPacket(AudioStreamBasicDescription original, int mBytesPerPacket) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmFramesPerPacket(AudioStreamBasicDescription original, int mFramesPerPacket) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmBytesPerFrame(AudioStreamBasicDescription original, int mBytesPerFrame) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmChannelsPerFrame(AudioStreamBasicDescription original, int mChannelsPerFrame) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmBitsPerChannel(AudioStreamBasicDescription original, int mBitsPerChannel) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = mBitsPerChannel, .mReserved = original.mReserved };
        return __new;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmReserved(AudioStreamBasicDescription original, int mReserved) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mBytesPerFrame = original.mBytesPerFrame, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel, .mReserved = mReserved };
        return __new;
    ]-*/;

    
}
