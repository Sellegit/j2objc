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
public class MusicEventIterator 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("NewMusicEventIterator")
    public static native int create(OpaqueMusicTrack inTrack, Todo outIterator);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("DisposeMusicEventIterator")
    public static native int dispose(OpaqueMusicEventIterator inIterator);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorSeek")
    public static native int seek(OpaqueMusicEventIterator inIterator, double inTimeStamp);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorNextEvent")
    public static native int nextEvent(OpaqueMusicEventIterator inIterator);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorPreviousEvent")
    public static native int previousEvent(OpaqueMusicEventIterator inIterator);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorGetEventInfo")
    public static native int getEventInfo(OpaqueMusicEventIterator inIterator, Todo outTimeStamp, Todo outEventType, Todo outEventData, Todo outEventDataSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorSetEventInfo")
    public static native int setEventInfo(OpaqueMusicEventIterator inIterator, @Representing("MusicEventType") long inEventType, Todo inEventData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorSetEventTime")
    public static native int setEventTime(OpaqueMusicEventIterator inIterator, double inTimeStamp);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorDeleteEvent")
    public static native int deleteEvent(OpaqueMusicEventIterator inIterator);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorHasPreviousEvent")
    public static native int hasPreviousEvent(OpaqueMusicEventIterator inIterator, Todo outHasPrevEvent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorHasNextEvent")
    public static native int hasNextEvent(OpaqueMusicEventIterator inIterator, Todo outHasNextEvent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorHasCurrentEvent")
    public static native int hasCurrentEvent(OpaqueMusicEventIterator inIterator, Todo outHasCurEvent);
    
}
