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





@Mapping("AudioQueueBuffer") @Library("AudioToolbox/AudioToolbox.h")
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
    
    
}
