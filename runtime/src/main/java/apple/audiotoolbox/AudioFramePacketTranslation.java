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





@Mapping("AudioFramePacketTranslation")
public class AudioFramePacketTranslation 
    extends Struct 
     {

    
    protected AudioFramePacketTranslation() {}
    
    
    @DotMapping("mFrame")
    public native long getMFrame();
    @DotMapping("mPacket")
    public native long getMPacket();
    @DotMapping("mFrameOffsetInPacket")
    public native int getMFrameOffsetInPacket();
    
    public static native AudioFramePacketTranslation create(long mFrame, long mPacket, int mFrameOffsetInPacket) /*-[
        AudioFramePacketTranslation __new = { .mFrame = mFrame, .mPacket = mPacket, .mFrameOffsetInPacket = mFrameOffsetInPacket };
        return __new;
    ]-*/;
    public static native AudioFramePacketTranslation copyWithmFrame(AudioFramePacketTranslation original, long mFrame) /*-[
        original.mFrame = mFrame;
        return original;
    ]-*/;

    
    public static native AudioFramePacketTranslation copyWithmPacket(AudioFramePacketTranslation original, long mPacket) /*-[
        original.mPacket = mPacket;
        return original;
    ]-*/;

    
    public static native AudioFramePacketTranslation copyWithmFrameOffsetInPacket(AudioFramePacketTranslation original, int mFrameOffsetInPacket) /*-[
        original.mFrameOffsetInPacket = mFrameOffsetInPacket;
        return original;
    ]-*/;

    
}
