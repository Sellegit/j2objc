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

    
    
    protected MusicSequence() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("NewMusicSequence")
    public static native int create(Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("DisposeMusicSequence")
    public static native int dispose(MusicSequence inSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceNewTrack")
    public static native int newTrack(MusicSequence inSequence, Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceDisposeTrack")
    public static native int disposeTrack(MusicSequence inSequence, MusicTrack inTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTrackCount")
    public static native int getTrackCount(MusicSequence inSequence, Todo outNumberOfTracks);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetIndTrack")
    public static native int getIndTrack(MusicSequence inSequence, int inTrackIndex, Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTrackIndex")
    public static native int getTrackIndex(MusicSequence inSequence, MusicTrack inTrack, Todo outTrackIndex);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTempoTrack")
    public static native int getTempoTrack(MusicSequence inSequence, Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetMIDIEndpoint")
    public static native int setMIDIEndpoint(MusicSequence inSequence, MIDIEndpoint inEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetSequenceType")
    public static native int setSequenceType(MusicSequence inSequence, MusicSequenceType inType);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetSequenceType")
    public static native int getSequenceType(MusicSequence inSequence, Todo outType);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileLoad")
    public static native int fileLoad(MusicSequence inSequence, CFURL inFileRef, int inFileTypeHint, int inFlags);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileLoadData")
    public static native int fileLoadData(MusicSequence inSequence, CFData inData, int inFileTypeHint, int inFlags);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileCreate")
    public static native int fileCreate(MusicSequence inSequence, CFURL inFileRef, int inFileType, int inFlags, short inResolution);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileCreateData")
    public static native int fileCreateData(MusicSequence inSequence, int inFileType, int inFlags, short inResolution, Todo outData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceReverse")
    public static native int reverse(MusicSequence inSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetSecondsForBeats")
    public static native int getSecondsForBeats(MusicSequence inSequence, double inBeats, Todo outSeconds);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetBeatsForSeconds")
    public static native int getBeatsForSeconds(MusicSequence inSequence, double inSeconds, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetUserCallback")
    public static native int setUserCallback(MusicSequence inSequence, FunctionPtr inCallback, Todo inClientData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceBeatsToBarBeatTime")
    public static native int beatsToBarBeatTime(MusicSequence inSequence, double inBeats, int inSubbeatDivisor, CABarBeatTime outBarBeatTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceBarBeatTimeToBeats")
    public static native int barBeatTimeToBeats(MusicSequence inSequence, CABarBeatTime inBarBeatTime, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetInfoDictionary")
    public static native CFDictionary getInfoDictionary(MusicSequence inSequence);
    
}
