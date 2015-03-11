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
public class MusicTrack 
    extends Object 
     {

    
    
    protected MusicTrack() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetSequence")
    public native int getSequence(Todo outSequence);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetDestNode")
    public native int setDestNode(int inNode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetDestMIDIEndpoint")
    public native int setDestMIDIEndpoint(MIDIEndpoint inEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetDestNode")
    public native int getDestNode(Todo outNode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetDestMIDIEndpoint")
    public native int getDestMIDIEndpoint(Todo outEndpoint);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackSetProperty")
    public native int setProperty(int inPropertyID, Todo inData, int inLength);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackGetProperty")
    public native int getProperty(int inPropertyID, Todo outData, Todo ioLength);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackMoveEvents")
    public native int moveEvents(double inStartTime, double inEndTime, double inMoveTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackClear")
    public native int clear(double inStartTime, double inEndTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackCut")
    public native int cut(double inStartTime, double inEndTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackCopyInsert")
    public native int copyInsert(double inSourceStartTime, double inSourceEndTime, MusicTrack inDestTrack, double inDestInsertTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackMerge")
    public native int merge(double inSourceStartTime, double inSourceEndTime, MusicTrack inDestTrack, double inDestInsertTime);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDINoteEvent")
    public native int newMIDINoteEvent(double inTimeStamp, MIDINoteMessage inMessage);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDIChannelEvent")
    public native int newMIDIChannelEvent(double inTimeStamp, MIDIChannelMessage inMessage);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMIDIRawDataEvent")
    public native int newMIDIRawDataEvent(double inTimeStamp, MIDIRawData inRawData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewExtendedNoteEvent")
    public native int newExtendedNoteEvent(double inTimeStamp, ExtendedNoteOnEvent inInfo);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewParameterEvent")
    public native int newParameterEvent(double inTimeStamp, ParameterEvent inInfo);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewExtendedTempoEvent")
    public native int newExtendedTempoEvent(double inTimeStamp, double inBPM);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewMetaEvent")
    public native int newMetaEvent(double inTimeStamp, MIDIMetaEvent inMetaEvent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewUserEvent")
    public native int newUserEvent(double inTimeStamp, MusicEventUserData inUserData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicTrackNewAUPresetEvent")
    public native int newAUPresetEvent(double inTimeStamp, AUPresetEvent inPresetEvent);
    
}
