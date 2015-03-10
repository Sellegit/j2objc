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
public class MusicEventIterator 
    extends Object 
     {

    
    
    protected MusicEventIterator() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("NewMusicEventIterator")
    public static native int create(MusicTrack inTrack, Todo outIterator);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("DisposeMusicEventIterator")
    public native int dispose();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorSeek")
    public native int seek(double inTimeStamp);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorNextEvent")
    public native int nextEvent();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorPreviousEvent")
    public native int previousEvent();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorGetEventInfo")
    public native int getEventInfo(Todo outTimeStamp, Todo outEventType, Todo outEventData, Todo outEventDataSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorSetEventInfo")
    public native int setEventInfo(MusicEventType inEventType, Todo inEventData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorSetEventTime")
    public native int setEventTime(double inTimeStamp);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorDeleteEvent")
    public native int deleteEvent();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorHasPreviousEvent")
    public native int hasPreviousEvent(Todo outHasPrevEvent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorHasNextEvent")
    public native int hasNextEvent(Todo outHasNextEvent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("MusicEventIteratorHasCurrentEvent")
    public native int hasCurrentEvent(Todo outHasCurEvent);
    
}
