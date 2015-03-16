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





@Mapping("CAFPacketTableHeader") @Library("AudioToolbox/AudioToolbox.h")
public class CAFPacketTableHeader 
    extends Struct 
     {

    
    protected CAFPacketTableHeader() {}
    
    
    @DotMapping("mNumberPackets")
    public native long getMNumberPackets();
    @DotMapping("mNumberValidFrames")
    public native long getMNumberValidFrames();
    @DotMapping("mPrimingFrames")
    public native int getMPrimingFrames();
    @DotMapping("mRemainderFrames")
    public native int getMRemainderFrames();
    @DotMapping("mPacketDescriptions")
    public native ByteBuffer getMPacketDescriptions();
    
    public static native CAFPacketTableHeader create(long mNumberPackets, long mNumberValidFrames, int mPrimingFrames, int mRemainderFrames, ByteBuffer mPacketDescriptions) /*-[
        CAFPacketTableHeader __new = { .mNumberPackets = mNumberPackets, .mNumberValidFrames = mNumberValidFrames, .mPrimingFrames = mPrimingFrames, .mRemainderFrames = mRemainderFrames, .mPacketDescriptions = mPacketDescriptions };
        return __new;
    ]-*/;
    public static native CAFPacketTableHeader copyWithmNumberPackets(CAFPacketTableHeader original, long mNumberPackets) /*-[
        CAFPacketTableHeader __new = { .mNumberPackets = mNumberPackets, .mNumberValidFrames = original.mNumberValidFrames, .mPrimingFrames = original.mPrimingFrames, .mRemainderFrames = original.mRemainderFrames, .mPacketDescriptions = original.mPacketDescriptions };
        return __new;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmNumberValidFrames(CAFPacketTableHeader original, long mNumberValidFrames) /*-[
        CAFPacketTableHeader __new = { .mNumberPackets = original.mNumberPackets, .mNumberValidFrames = mNumberValidFrames, .mPrimingFrames = original.mPrimingFrames, .mRemainderFrames = original.mRemainderFrames, .mPacketDescriptions = original.mPacketDescriptions };
        return __new;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmPrimingFrames(CAFPacketTableHeader original, int mPrimingFrames) /*-[
        CAFPacketTableHeader __new = { .mNumberPackets = original.mNumberPackets, .mNumberValidFrames = original.mNumberValidFrames, .mPrimingFrames = mPrimingFrames, .mRemainderFrames = original.mRemainderFrames, .mPacketDescriptions = original.mPacketDescriptions };
        return __new;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmRemainderFrames(CAFPacketTableHeader original, int mRemainderFrames) /*-[
        CAFPacketTableHeader __new = { .mNumberPackets = original.mNumberPackets, .mNumberValidFrames = original.mNumberValidFrames, .mPrimingFrames = original.mPrimingFrames, .mRemainderFrames = mRemainderFrames, .mPacketDescriptions = original.mPacketDescriptions };
        return __new;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmPacketDescriptions(CAFPacketTableHeader original, ByteBuffer mPacketDescriptions) /*-[
        CAFPacketTableHeader __new = { .mNumberPackets = original.mNumberPackets, .mNumberValidFrames = original.mNumberValidFrames, .mPrimingFrames = original.mPrimingFrames, .mRemainderFrames = original.mRemainderFrames, .mPacketDescriptions = mPacketDescriptions };
        return __new;
    ]-*/;

    
}
