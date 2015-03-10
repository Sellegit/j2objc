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





@Mapping("CAFAudioDescription")
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
        original.mSampleRate = mSampleRate;
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmFormatID(CAFAudioDescription original, int mFormatID) /*-[
        original.mFormatID = mFormatID;
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmFormatFlags(CAFAudioDescription original, int mFormatFlags) /*-[
        original.mFormatFlags = mFormatFlags;
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmBytesPerPacket(CAFAudioDescription original, int mBytesPerPacket) /*-[
        original.mBytesPerPacket = mBytesPerPacket;
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmFramesPerPacket(CAFAudioDescription original, int mFramesPerPacket) /*-[
        original.mFramesPerPacket = mFramesPerPacket;
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmChannelsPerFrame(CAFAudioDescription original, int mChannelsPerFrame) /*-[
        original.mChannelsPerFrame = mChannelsPerFrame;
        return __new;
    ]-*/;

    
    public static native CAFAudioDescription copyWithmBitsPerChannel(CAFAudioDescription original, int mBitsPerChannel) /*-[
        original.mBitsPerChannel = mBitsPerChannel;
        return __new;
    ]-*/;

    
}
