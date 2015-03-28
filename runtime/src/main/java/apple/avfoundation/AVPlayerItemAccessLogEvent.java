package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;


/**
 * @since Available in iOS 4.3 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerItemAccessLogEvent")
public class AVPlayerItemAccessLogEvent 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public AVPlayerItemAccessLogEvent() { }

    
    /**
     * @since Available in iOS 4.3 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("numberOfSegmentsDownloaded")
    public native @MachineSizedSInt long getNumberOfSegmentsDownloaded();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("numberOfMediaRequests")
    public native @MachineSizedSInt long getNumberOfMediaRequests();
    @Mapping("playbackStartDate")
    public native NSDate getPlaybackStartDate();
    @Mapping("URI")
    public native String getURI();
    @Mapping("serverAddress")
    public native String getServerAddress();
    @Mapping("numberOfServerAddressChanges")
    public native @MachineSizedSInt long getNumberOfServerAddressChanges();
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
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("transferDuration")
    public native double getTransferDuration();
    @Mapping("observedBitrate")
    public native double getObservedBitrate();
    @Mapping("indicatedBitrate")
    public native double getIndicatedBitrate();
    @Mapping("numberOfDroppedVideoFrames")
    public native @MachineSizedSInt long getNumberOfDroppedVideoFrames();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("startupTime")
    public native double getStartupTime();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("downloadOverdue")
    public native @MachineSizedSInt long getDownloadOverdue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("observedMaxBitrate")
    public native double getObservedMaxBitrate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("observedMinBitrate")
    public native double getObservedMinBitrate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("observedBitrateStandardDeviation")
    public native double getObservedBitrateStandardDeviation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("playbackType")
    public native String getPlaybackType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("mediaRequestsWWAN")
    public native @MachineSizedSInt long getMediaRequestsWWAN();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("switchBitrate")
    public native double getSwitchBitrate();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
