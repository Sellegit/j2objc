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





@Library("CoreAudio/CoreAudioTypes.h")
@Mapping("AudioChannelFlag")
public final class AudioChannelFlag extends ObjCEnum {
    
    @GlobalConstant("kAudioChannelFlags_AllOff")
    public static final long AllOff = 0L;
    @GlobalConstant("kAudioChannelFlags_RectangularCoordinates")
    public static final long RectangularCoordinates = 1L;
    @GlobalConstant("kAudioChannelFlags_SphericalCoordinates")
    public static final long SphericalCoordinates = 2L;
    @GlobalConstant("kAudioChannelFlags_Meters")
    public static final long Meters = 4L;
    

}
