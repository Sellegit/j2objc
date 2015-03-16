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
@Mapping("AudioToolboxError")
public final class AudioToolboxError extends ObjCEnum {
    
    @GlobalConstant("kAudioToolboxErr_InvalidSequenceType")
    public static final long InvalidSequenceType = -10846L;
    @GlobalConstant("kAudioToolboxErr_TrackIndexError")
    public static final long TrackIndexError = -10859L;
    @GlobalConstant("kAudioToolboxErr_TrackNotFound")
    public static final long TrackNotFound = -10858L;
    @GlobalConstant("kAudioToolboxErr_EndOfTrack")
    public static final long EndOfTrack = -10857L;
    @GlobalConstant("kAudioToolboxErr_StartOfTrack")
    public static final long StartOfTrack = -10856L;
    @GlobalConstant("kAudioToolboxErr_IllegalTrackDestination")
    public static final long IllegalTrackDestination = -10855L;
    @GlobalConstant("kAudioToolboxErr_NoSequence")
    public static final long NoSequence = -10854L;
    @GlobalConstant("kAudioToolboxErr_InvalidEventType")
    public static final long InvalidEventType = -10853L;
    @GlobalConstant("kAudioToolboxErr_InvalidPlayerState")
    public static final long InvalidPlayerState = -10852L;
    @GlobalConstant("kAudioToolboxErr_CannotDoInCurrentContext")
    public static final long CannotDoInCurrentContext = -10863L;
    

}
