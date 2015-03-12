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





@Mapping("AudioStreamBasicDescription")
public class AudioStreamBasicDescription 
    extends Struct 
     {

    
    protected AudioStreamBasicDescription() {}
    
    
    @DotMapping("mSampleRate")
    public native double getMSampleRate();
    @DotMapping("mFormatID")
    public native AudioFormat getMFormatID();
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
    
    public static native AudioStreamBasicDescription create(double mSampleRate, AudioFormat mFormatID, int mFormatFlags, int mBytesPerPacket, int mFramesPerPacket, int mBytesPerFrame, int mChannelsPerFrame, int mBitsPerChannel, int mReserved) /*-[
        AudioStreamBasicDescription __new = { .mSampleRate = mSampleRate, .mFormatID = mFormatID, .mFormatFlags = mFormatFlags, .mBytesPerPacket = mBytesPerPacket, .mFramesPerPacket = mFramesPerPacket, .mBytesPerFrame = mBytesPerFrame, .mChannelsPerFrame = mChannelsPerFrame, .mBitsPerChannel = mBitsPerChannel, .mReserved = mReserved };
        return __new;
    ]-*/;
    public static native AudioStreamBasicDescription copyWithmSampleRate(AudioStreamBasicDescription original, double mSampleRate) /*-[
        original.mSampleRate = mSampleRate;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmFormatID(AudioStreamBasicDescription original, AudioFormat mFormatID) /*-[
        original.mFormatID = mFormatID;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmFormatFlags(AudioStreamBasicDescription original, int mFormatFlags) /*-[
        original.mFormatFlags = mFormatFlags;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmBytesPerPacket(AudioStreamBasicDescription original, int mBytesPerPacket) /*-[
        original.mBytesPerPacket = mBytesPerPacket;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmFramesPerPacket(AudioStreamBasicDescription original, int mFramesPerPacket) /*-[
        original.mFramesPerPacket = mFramesPerPacket;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmBytesPerFrame(AudioStreamBasicDescription original, int mBytesPerFrame) /*-[
        original.mBytesPerFrame = mBytesPerFrame;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmChannelsPerFrame(AudioStreamBasicDescription original, int mChannelsPerFrame) /*-[
        original.mChannelsPerFrame = mChannelsPerFrame;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmBitsPerChannel(AudioStreamBasicDescription original, int mBitsPerChannel) /*-[
        original.mBitsPerChannel = mBitsPerChannel;
        return original;
    ]-*/;

    
    public static native AudioStreamBasicDescription copyWithmReserved(AudioStreamBasicDescription original, int mReserved) /*-[
        original.mReserved = mReserved;
        return original;
    ]-*/;

    
}
