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





@Mapping("CAFPacketTableHeader")
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
        original.mNumberPackets = mNumberPackets;
        return original;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmNumberValidFrames(CAFPacketTableHeader original, long mNumberValidFrames) /*-[
        original.mNumberValidFrames = mNumberValidFrames;
        return original;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmPrimingFrames(CAFPacketTableHeader original, int mPrimingFrames) /*-[
        original.mPrimingFrames = mPrimingFrames;
        return original;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmRemainderFrames(CAFPacketTableHeader original, int mRemainderFrames) /*-[
        original.mRemainderFrames = mRemainderFrames;
        return original;
    ]-*/;

    
    public static native CAFPacketTableHeader copyWithmPacketDescriptions(CAFPacketTableHeader original, ByteBuffer mPacketDescriptions) /*-[
        original.mPacketDescriptions = mPacketDescriptions;
        return original;
    ]-*/;

    
}
