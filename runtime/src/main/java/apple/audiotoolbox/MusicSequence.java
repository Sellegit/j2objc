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


/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox/AudioToolbox.h")
public class MusicSequence 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("NewMusicSequence")
    public static native int create(Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("DisposeMusicSequence")
    public static native int dispose(OpaqueMusicSequence inSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceNewTrack")
    public static native int newTrack(OpaqueMusicSequence inSequence, Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceDisposeTrack")
    public static native int disposeTrack(OpaqueMusicSequence inSequence, OpaqueMusicTrack inTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTrackCount")
    public static native int getTrackCount(OpaqueMusicSequence inSequence, Todo outNumberOfTracks);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetIndTrack")
    public static native int getIndTrack(OpaqueMusicSequence inSequence, int inTrackIndex, Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTrackIndex")
    public static native int getTrackIndex(OpaqueMusicSequence inSequence, OpaqueMusicTrack inTrack, Todo outTrackIndex);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTempoTrack")
    public static native int getTempoTrack(OpaqueMusicSequence inSequence, Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetMIDIEndpoint")
    public static native int setMIDIEndpoint(OpaqueMusicSequence inSequence, MIDIEndpoint inEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetSequenceType")
    public static native int setSequenceType(OpaqueMusicSequence inSequence, MusicSequenceType inType);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetSequenceType")
    public static native int getSequenceType(OpaqueMusicSequence inSequence, Todo outType);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileLoad")
    public static native int fileLoad(OpaqueMusicSequence inSequence, CFURL inFileRef, int inFileTypeHint, int inFlags);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileLoadData")
    public static native int fileLoadData(OpaqueMusicSequence inSequence, CFData inData, int inFileTypeHint, int inFlags);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileCreate")
    public static native int fileCreate(OpaqueMusicSequence inSequence, CFURL inFileRef, int inFileType, int inFlags, short inResolution);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileCreateData")
    public static native int fileCreateData(OpaqueMusicSequence inSequence, int inFileType, int inFlags, short inResolution, Todo outData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceReverse")
    public static native int reverse(OpaqueMusicSequence inSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetSecondsForBeats")
    public static native int getSecondsForBeats(OpaqueMusicSequence inSequence, double inBeats, Todo outSeconds);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetBeatsForSeconds")
    public static native int getBeatsForSeconds(OpaqueMusicSequence inSequence, double inSeconds, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetUserCallback")
    public static native int setUserCallback(OpaqueMusicSequence inSequence, FunctionPtr inCallback, Todo inClientData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceBeatsToBarBeatTime")
    public static native int beatsToBarBeatTime(OpaqueMusicSequence inSequence, double inBeats, int inSubbeatDivisor, Todo outBarBeatTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceBarBeatTimeToBeats")
    public static native int barBeatTimeToBeats(OpaqueMusicSequence inSequence, Todo inBarBeatTime, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetInfoDictionary")
    public static native CFDictionary getInfoDictionary(OpaqueMusicSequence inSequence);
    
}
