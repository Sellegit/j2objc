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





@Mapping("AudioQueueBuffer")
public class AudioQueueBuffer 
    extends Struct 
     {

    
    protected AudioQueueBuffer() {}
    
    
    @DotMapping("mAudioDataBytesCapacity")
    public native int getMAudioDataBytesCapacity();
    @DotMapping("mAudioData")
    public native Todo getMAudioData();
    @DotMapping("mAudioDataByteSize")
    public native int getMAudioDataByteSize();
    @DotMapping("mUserData")
    public native Todo getMUserData();
    @DotMapping("mPacketDescriptionCapacity")
    public native int getMPacketDescriptionCapacity();
    @DotMapping("mPacketDescriptions")
    public native AudioStreamPacketDescription getMPacketDescriptions();
    @DotMapping("mPacketDescriptionCount")
    public native int getMPacketDescriptionCount();
    
    public static native AudioQueueBuffer create(int mAudioDataBytesCapacity, Todo mAudioData, int mAudioDataByteSize, Todo mUserData, int mPacketDescriptionCapacity, AudioStreamPacketDescription mPacketDescriptions, int mPacketDescriptionCount) /*-[
        AudioQueueBuffer __new = { .mAudioDataBytesCapacity = mAudioDataBytesCapacity, .mAudioData = mAudioData, .mAudioDataByteSize = mAudioDataByteSize, .mUserData = mUserData, .mPacketDescriptionCapacity = mPacketDescriptionCapacity, .mPacketDescriptions = mPacketDescriptions, .mPacketDescriptionCount = mPacketDescriptionCount };
        return __new;
    ]-*/;
    public static native AudioQueueBuffer copyWithmAudioDataBytesCapacity(AudioQueueBuffer original, int mAudioDataBytesCapacity) /*-[
        original.mAudioDataBytesCapacity = mAudioDataBytesCapacity;
        return __new;
    ]-*/;

    
    public static native AudioQueueBuffer copyWithmAudioData(AudioQueueBuffer original, Todo mAudioData) /*-[
        original.mAudioData = mAudioData;
        return __new;
    ]-*/;

    
    public static native AudioQueueBuffer copyWithmAudioDataByteSize(AudioQueueBuffer original, int mAudioDataByteSize) /*-[
        original.mAudioDataByteSize = mAudioDataByteSize;
        return __new;
    ]-*/;

    
    public static native AudioQueueBuffer copyWithmUserData(AudioQueueBuffer original, Todo mUserData) /*-[
        original.mUserData = mUserData;
        return __new;
    ]-*/;

    
    public static native AudioQueueBuffer copyWithmPacketDescriptionCapacity(AudioQueueBuffer original, int mPacketDescriptionCapacity) /*-[
        original.mPacketDescriptionCapacity = mPacketDescriptionCapacity;
        return __new;
    ]-*/;

    
    public static native AudioQueueBuffer copyWithmPacketDescriptions(AudioQueueBuffer original, AudioStreamPacketDescription mPacketDescriptions) /*-[
        original.mPacketDescriptions = mPacketDescriptions;
        return __new;
    ]-*/;

    
    public static native AudioQueueBuffer copyWithmPacketDescriptionCount(AudioQueueBuffer original, int mPacketDescriptionCount) /*-[
        original.mPacketDescriptionCount = mPacketDescriptionCount;
        return __new;
    ]-*/;

    
}
