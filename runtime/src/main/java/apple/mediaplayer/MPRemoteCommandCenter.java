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
 * @since Available in iOS 7.1 and later.
 */

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPRemoteCommandCenter")
public class MPRemoteCommandCenter 
    extends NSObject 
     {

    
    
    public MPRemoteCommandCenter() {}
    
    
    @Mapping("pauseCommand")
    public native MPRemoteCommand getPauseCommand();
    @Mapping("playCommand")
    public native MPRemoteCommand getPlayCommand();
    @Mapping("stopCommand")
    public native MPRemoteCommand getStopCommand();
    @Mapping("togglePlayPauseCommand")
    public native MPRemoteCommand getTogglePlayPauseCommand();
    @Mapping("nextTrackCommand")
    public native MPRemoteCommand getNextTrackCommand();
    @Mapping("previousTrackCommand")
    public native MPRemoteCommand getPreviousTrackCommand();
    @Mapping("skipForwardCommand")
    public native MPSkipIntervalCommand getSkipForwardCommand();
    @Mapping("skipBackwardCommand")
    public native MPSkipIntervalCommand getSkipBackwardCommand();
    @Mapping("seekForwardCommand")
    public native MPRemoteCommand getSeekForwardCommand();
    @Mapping("seekBackwardCommand")
    public native MPRemoteCommand getSeekBackwardCommand();
    @Mapping("ratingCommand")
    public native MPRatingCommand getRatingCommand();
    @Mapping("changePlaybackRateCommand")
    public native MPChangePlaybackRateCommand getChangePlaybackRateCommand();
    @Mapping("likeCommand")
    public native MPFeedbackCommand getLikeCommand();
    @Mapping("dislikeCommand")
    public native MPFeedbackCommand getDislikeCommand();
    @Mapping("bookmarkCommand")
    public native MPFeedbackCommand getBookmarkCommand();
    
    
    
    @Mapping("sharedCommandCenter")
    public static native MPRemoteCommandCenter getSharedCommandCenter();
    
}
