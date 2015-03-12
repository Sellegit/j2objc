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





@Mapping("AudioBytePacketTranslation")
public class AudioBytePacketTranslation 
    extends Struct 
     {

    
    protected AudioBytePacketTranslation() {}
    
    
    @DotMapping("mByte")
    public native long getMByte();
    @DotMapping("mPacket")
    public native long getMPacket();
    @DotMapping("mByteOffsetInPacket")
    public native int getMByteOffsetInPacket();
    @DotMapping("mFlags")
    public native int getMFlags();
    
    public static native AudioBytePacketTranslation create(long mByte, long mPacket, int mByteOffsetInPacket, int mFlags) /*-[
        AudioBytePacketTranslation __new = { .mByte = mByte, .mPacket = mPacket, .mByteOffsetInPacket = mByteOffsetInPacket, .mFlags = mFlags };
        return __new;
    ]-*/;
    public static native AudioBytePacketTranslation copyWithmByte(AudioBytePacketTranslation original, long mByte) /*-[
        original.mByte = mByte;
        return original;
    ]-*/;

    
    public static native AudioBytePacketTranslation copyWithmPacket(AudioBytePacketTranslation original, long mPacket) /*-[
        original.mPacket = mPacket;
        return original;
    ]-*/;

    
    public static native AudioBytePacketTranslation copyWithmByteOffsetInPacket(AudioBytePacketTranslation original, int mByteOffsetInPacket) /*-[
        original.mByteOffsetInPacket = mByteOffsetInPacket;
        return original;
    ]-*/;

    
    public static native AudioBytePacketTranslation copyWithmFlags(AudioBytePacketTranslation original, int mFlags) /*-[
        original.mFlags = mFlags;
        return original;
    ]-*/;

    
}
