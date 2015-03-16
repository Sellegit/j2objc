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

    
    
    protected MusicTrack() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetSequence")
    public static native int getSequence(MusicTrack inTrack, Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetDestNode")
    public static native int setDestNode(MusicTrack inTrack, int inNode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetDestMIDIEndpoint")
    public static native int setDestMIDIEndpoint(MusicTrack inTrack, MIDIEndpoint inEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetDestNode")
    public static native int getDestNode(MusicTrack inTrack, Todo outNode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetDestMIDIEndpoint")
    public static native int getDestMIDIEndpoint(MusicTrack inTrack, Todo outEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetProperty")
    public static native int setProperty(MusicTrack inTrack, int inPropertyID, Todo inData, int inLength);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetProperty")
    public static native int getProperty(MusicTrack inTrack, int inPropertyID, Todo outData, Todo ioLength);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackMoveEvents")
    public static native int moveEvents(MusicTrack inTrack, double inStartTime, double inEndTime, double inMoveTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackClear")
    public static native int clear(MusicTrack inTrack, double inStartTime, double inEndTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackCut")
    public static native int cut(MusicTrack inTrack, double inStartTime, double inEndTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackCopyInsert")
    public static native int copyInsert(MusicTrack inSourceTrack, double inSourceStartTime, double inSourceEndTime, MusicTrack inDestTrack, double inDestInsertTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackMerge")
    public static native int merge(MusicTrack inSourceTrack, double inSourceStartTime, double inSourceEndTime, MusicTrack inDestTrack, double inDestInsertTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDINoteEvent")
    public static native int newMIDINoteEvent(MusicTrack inTrack, double inTimeStamp, MIDINoteMessage inMessage);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDIChannelEvent")
    public static native int newMIDIChannelEvent(MusicTrack inTrack, double inTimeStamp, MIDIChannelMessage inMessage);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDIRawDataEvent")
    public static native int newMIDIRawDataEvent(MusicTrack inTrack, double inTimeStamp, MIDIRawData inRawData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewExtendedNoteEvent")
    public static native int newExtendedNoteEvent(MusicTrack inTrack, double inTimeStamp, ExtendedNoteOnEvent inInfo);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewParameterEvent")
    public static native int newParameterEvent(MusicTrack inTrack, double inTimeStamp, ParameterEvent inInfo);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewExtendedTempoEvent")
    public static native int newExtendedTempoEvent(MusicTrack inTrack, double inTimeStamp, double inBPM);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMetaEvent")
    public static native int newMetaEvent(MusicTrack inTrack, double inTimeStamp, MIDIMetaEvent inMetaEvent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewUserEvent")
    public static native int newUserEvent(MusicTrack inTrack, double inTimeStamp, MusicEventUserData inUserData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewAUPresetEvent")
    public static native int newAUPresetEvent(MusicTrack inTrack, double inTimeStamp, AUPresetEvent inPresetEvent);
    
}
