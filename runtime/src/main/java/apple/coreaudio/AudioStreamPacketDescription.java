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





@Mapping("AudioStreamPacketDescription")
public class AudioStreamPacketDescription 
    extends Struct 
     {

    
    protected AudioStreamPacketDescription() {}
    
    
    @DotMapping("mStartOffset")
    public native long getMStartOffset();
    @DotMapping("mVariableFramesInPacket")
    public native int getMVariableFramesInPacket();
    @DotMapping("mDataByteSize")
    public native int getMDataByteSize();
    
    public static native AudioStreamPacketDescription create(long mStartOffset, int mVariableFramesInPacket, int mDataByteSize) /*-[
        AudioStreamPacketDescription __new = { .mStartOffset = mStartOffset, .mVariableFramesInPacket = mVariableFramesInPacket, .mDataByteSize = mDataByteSize };
        return __new;
    ]-*/;
    public static native AudioStreamPacketDescription copyWithmStartOffset(AudioStreamPacketDescription original, long mStartOffset) /*-[
        original.mStartOffset = mStartOffset;
        return __new;
    ]-*/;

    
    public static native AudioStreamPacketDescription copyWithmVariableFramesInPacket(AudioStreamPacketDescription original, int mVariableFramesInPacket) /*-[
        original.mVariableFramesInPacket = mVariableFramesInPacket;
        return __new;
    ]-*/;

    
    public static native AudioStreamPacketDescription copyWithmDataByteSize(AudioStreamPacketDescription original, int mDataByteSize) /*-[
        original.mDataByteSize = mDataByteSize;
        return __new;
    ]-*/;

    
}
