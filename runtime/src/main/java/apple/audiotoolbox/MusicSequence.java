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
@Library("AudioToolbox")
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
    public native int dispose();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceNewTrack")
    public native int newTrack(Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceDisposeTrack")
    public native int disposeTrack(MusicTrack inTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTrackCount")
    public native int getTrackCount(Todo outNumberOfTracks);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetIndTrack")
    public native int getIndTrack(int inTrackIndex, Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTrackIndex")
    public native int getTrackIndex(MusicTrack inTrack, Todo outTrackIndex);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetTempoTrack")
    public native int getTempoTrack(Todo outTrack);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetMIDIEndpoint")
    public native int setMIDIEndpoint(MIDIEndpoint inEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetSequenceType")
    public native int setSequenceType(MusicSequenceType inType);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetSequenceType")
    public native int getSequenceType(Todo outType);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileLoad")
    public native int fileLoad(CFURL inFileRef, int inFileTypeHint, int inFlags);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileLoadData")
    public native int fileLoadData(CFData inData, int inFileTypeHint, int inFlags);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileCreate")
    public native int fileCreate(CFURL inFileRef, int inFileType, int inFlags, short inResolution);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceFileCreateData")
    public native int fileCreateData(int inFileType, int inFlags, short inResolution, Todo outData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceReverse")
    public native int reverse();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetSecondsForBeats")
    public native int getSecondsForBeats(double inBeats, Todo outSeconds);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetBeatsForSeconds")
    public native int getBeatsForSeconds(double inSeconds, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceSetUserCallback")
    public native int setUserCallback(FunctionPtr inCallback, Todo inClientData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceBeatsToBarBeatTime")
    public native int beatsToBarBeatTime(double inBeats, int inSubbeatDivisor, CABarBeatTime outBarBeatTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceBarBeatTimeToBeats")
    public native int barBeatTimeToBeats(CABarBeatTime inBarBeatTime, Todo outBeats);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicSequenceGetInfoDictionary")
    public native CFDictionary getInfoDictionary();
    
}
