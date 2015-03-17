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
public class MusicTrack 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetSequence")
    public static native int getSequence(OpaqueMusicTrack inTrack, Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetDestNode")
    public static native int setDestNode(OpaqueMusicTrack inTrack, int inNode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetDestMIDIEndpoint")
    public static native int setDestMIDIEndpoint(OpaqueMusicTrack inTrack, MIDIEndpoint inEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetDestNode")
    public static native int getDestNode(OpaqueMusicTrack inTrack, Todo outNode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetDestMIDIEndpoint")
    public static native int getDestMIDIEndpoint(OpaqueMusicTrack inTrack, Todo outEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetProperty")
    public static native int setProperty(OpaqueMusicTrack inTrack, int inPropertyID, Todo inData, int inLength);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetProperty")
    public static native int getProperty(OpaqueMusicTrack inTrack, int inPropertyID, Todo outData, Todo ioLength);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackMoveEvents")
    public static native int moveEvents(OpaqueMusicTrack inTrack, double inStartTime, double inEndTime, double inMoveTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackClear")
    public static native int clear(OpaqueMusicTrack inTrack, double inStartTime, double inEndTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackCut")
    public static native int cut(OpaqueMusicTrack inTrack, double inStartTime, double inEndTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackCopyInsert")
    public static native int copyInsert(OpaqueMusicTrack inSourceTrack, double inSourceStartTime, double inSourceEndTime, OpaqueMusicTrack inDestTrack, double inDestInsertTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackMerge")
    public static native int merge(OpaqueMusicTrack inSourceTrack, double inSourceStartTime, double inSourceEndTime, OpaqueMusicTrack inDestTrack, double inDestInsertTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDINoteEvent")
    public static native int newMIDINoteEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inMessage);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDIChannelEvent")
    public static native int newMIDIChannelEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inMessage);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDIRawDataEvent")
    public static native int newMIDIRawDataEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inRawData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewExtendedNoteEvent")
    public static native int newExtendedNoteEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inInfo);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewParameterEvent")
    public static native int newParameterEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inInfo);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewExtendedTempoEvent")
    public static native int newExtendedTempoEvent(OpaqueMusicTrack inTrack, double inTimeStamp, double inBPM);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMetaEvent")
    public static native int newMetaEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inMetaEvent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewUserEvent")
    public static native int newUserEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inUserData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewAUPresetEvent")
    public static native int newAUPresetEvent(OpaqueMusicTrack inTrack, double inTimeStamp, Todo inPresetEvent);
    
}
