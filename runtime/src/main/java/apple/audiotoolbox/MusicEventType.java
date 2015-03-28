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
@Mapping("MusicEventType")
public final class MusicEventType extends ObjCEnum {
    
    @GlobalConstant("kMusicEventType_NULL")
    public static final long NULL = 0L;
    @GlobalConstant("kMusicEventType_ExtendedNote")
    public static final long ExtendedNote = 1L;
    @GlobalConstant("kMusicEventType_ExtendedTempo")
    public static final long ExtendedTempo = 3L;
    @GlobalConstant("kMusicEventType_User")
    public static final long User = 4L;
    @GlobalConstant("kMusicEventType_Meta")
    public static final long Meta = 5L;
    @GlobalConstant("kMusicEventType_MIDINoteMessage")
    public static final long MIDINoteMessage = 6L;
    @GlobalConstant("kMusicEventType_MIDIChannelMessage")
    public static final long MIDIChannelMessage = 7L;
    @GlobalConstant("kMusicEventType_MIDIRawData")
    public static final long MIDIRawData = 8L;
    @GlobalConstant("kMusicEventType_Parameter")
    public static final long Parameter = 9L;
    @GlobalConstant("kMusicEventType_AUPreset")
    public static final long AUPreset = 10L;


}
