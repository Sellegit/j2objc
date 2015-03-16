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





@Mapping("CAFAudioDescription") @Library("AudioToolbox/AudioToolbox.h")
public class CAFAudioDescription 
    extends Struct 
     {

    
    protected CAFAudioDescription() {}
    
    
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
    @DotMapping("mChannelsPerFrame")
    public native int getMChannelsPerFrame();
    @DotMapping("mBitsPerChannel")
    public native int getMBitsPerChannel();
    
    public static native CAFAudioDescription create(double mSampleRate, int mFormatID, int mFormatFlags, int mBytesPerPacket, int mFramesPerPacket, int mChannelsPerFrame, int mBitsPerChannel) /*-[
        CAFAudioDescription __new = { .mSampleRate = mSampleRate, .mFormatID = mFormatID, .mFormatFlags = mFormatFlags, .mBytesPerPacket = mBytesPerPacket, .mFramesPerPacket = mFramesPerPacket, .mChannelsPerFrame = mChannelsPerFrame, .mBitsPerChannel = mBitsPerChannel };
        return __new;
    ]-*/;
    public static native CAFAudioDescription copyWithmSampleRate(CAFAudioDescription original, double mSampleRate) /*-[
        CAFAudioDescription __new = { .mSampleRate = mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel };
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmFormatID(CAFAudioDescription original, int mFormatID) /*-[
        CAFAudioDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel };
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmFormatFlags(CAFAudioDescription original, int mFormatFlags) /*-[
        CAFAudioDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel };
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmBytesPerPacket(CAFAudioDescription original, int mBytesPerPacket) /*-[
        CAFAudioDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel };
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmFramesPerPacket(CAFAudioDescription original, int mFramesPerPacket) /*-[
        CAFAudioDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = mFramesPerPacket, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel };
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmChannelsPerFrame(CAFAudioDescription original, int mChannelsPerFrame) /*-[
        CAFAudioDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mChannelsPerFrame = mChannelsPerFrame, .mBitsPerChannel = original.mBitsPerChannel };
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmBitsPerChannel(CAFAudioDescription original, int mBitsPerChannel) /*-[
        CAFAudioDescription __new = { .mSampleRate = original.mSampleRate, .mFormatID = original.mFormatID, .mFormatFlags = original.mFormatFlags, .mBytesPerPacket = original.mBytesPerPacket, .mFramesPerPacket = original.mFramesPerPacket, .mChannelsPerFrame = original.mChannelsPerFrame, .mBitsPerChannel = mBitsPerChannel };
        return __new;
    ]-*/;

    
}
