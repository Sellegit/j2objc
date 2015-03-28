package apple.mediaplayer;


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
import apple.uikit.*;


/**
 * @since Available in iOS 4.3 and later.
 */
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMovieAccessLogEvent")
public class MPMovieAccessLogEvent 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public MPMovieAccessLogEvent() { }

    
    @Mapping("numberOfSegmentsDownloaded")
    public native @MachineSizedUInt long getNumberOfSegmentsDownloaded();
    @Mapping("playbackStartDate")
    public native NSDate getPlaybackStartDate();
    @Mapping("URI")
    public native String getURI();
    @Mapping("serverAddress")
    public native String getServerAddress();
    @Mapping("numberOfServerAddressChanges")
    public native @MachineSizedUInt long getNumberOfServerAddressChanges();
    @Mapping("playbackSessionID")
    public native String getPlaybackSessionID();
    @Mapping("playbackStartOffset")
    public native double getPlaybackStartOffset();
    @Mapping("segmentsDownloadedDuration")
    public native double getSegmentsDownloadedDuration();
    @Mapping("durationWatched")
    public native double getDurationWatched();
    @Mapping("numberOfStalls")
    public native @MachineSizedSInt long getNumberOfStalls();
    @Mapping("numberOfBytesTransferred")
    public native long getNumberOfBytesTransferred();
    @Mapping("observedBitrate")
    public native double getObservedBitrate();
    @Mapping("indicatedBitrate")
    public native double getIndicatedBitrate();
    @Mapping("numberOfDroppedVideoFrames")
    public native @MachineSizedSInt long getNumberOfDroppedVideoFrames();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
