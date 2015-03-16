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





@Library("AudioToolbox/AudioToolbox.h")
@Mapping("AudioQueueProperty")
public final class AudioQueueProperty extends ObjCEnum {
    
    @GlobalConstant("kAudioQueueProperty_IsRunning")
    public static final long Property_IsRunning = 1634824814L;
    @GlobalConstant("kAudioQueueDeviceProperty_SampleRate")
    public static final long DeviceProperty_SampleRate = 1634825074L;
    @GlobalConstant("kAudioQueueDeviceProperty_NumberChannels")
    public static final long DeviceProperty_NumberChannels = 1634821219L;
    @GlobalConstant("kAudioQueueProperty_CurrentDevice")
    public static final long Property_CurrentDevice = 1634820964L;
    @GlobalConstant("kAudioQueueProperty_MagicCookie")
    public static final long Property_MagicCookie = 1634823523L;
    @GlobalConstant("kAudioQueueProperty_MaximumOutputPacketSize")
    public static final long Property_MaximumOutputPacketSize = 2020569203L;
    @GlobalConstant("kAudioQueueProperty_StreamDescription")
    public static final long Property_StreamDescription = 1634821748L;
    @GlobalConstant("kAudioQueueProperty_ChannelLayout")
    public static final long Property_ChannelLayout = 1634820972L;
    @GlobalConstant("kAudioQueueProperty_EnableLevelMetering")
    public static final long Property_EnableLevelMetering = 1634823525L;
    @GlobalConstant("kAudioQueueProperty_CurrentLevelMeter")
    public static final long Property_CurrentLevelMeter = 1634823542L;
    @GlobalConstant("kAudioQueueProperty_CurrentLevelMeterDB")
    public static final long Property_CurrentLevelMeterDB = 1634823524L;
    @GlobalConstant("kAudioQueueProperty_DecodeBufferSizeFrames")
    public static final long Property_DecodeBufferSizeFrames = 1684234854L;
    @GlobalConstant("kAudioQueueProperty_ConverterError")
    public static final long Property_ConverterError = 1902343781L;
    @GlobalConstant("kAudioQueueProperty_EnableTimePitch")
    public static final long Property_EnableTimePitch = 1902081136L;
    @GlobalConstant("kAudioQueueProperty_TimePitchAlgorithm")
    public static final long Property_TimePitchAlgorithm = 1903456353L;
    @GlobalConstant("kAudioQueueProperty_TimePitchBypass")
    public static final long Property_TimePitchBypass = 1903456354L;
    

}
