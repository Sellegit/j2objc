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





@Library("MediaPlayer")
@Mapping("MPMoviePlaybackState")
public final class MPMoviePlaybackState extends ObjCEnum {
    
    @GlobalConstant("MPMoviePlaybackStateStopped")
    public static final long Stopped = 0L;
    @GlobalConstant("MPMoviePlaybackStatePlaying")
    public static final long Playing = 1L;
    @GlobalConstant("MPMoviePlaybackStatePaused")
    public static final long Paused = 2L;
    @GlobalConstant("MPMoviePlaybackStateInterrupted")
    public static final long Interrupted = 3L;
    @GlobalConstant("MPMoviePlaybackStateSeekingForward")
    public static final long SeekingForward = 4L;
    @GlobalConstant("MPMoviePlaybackStateSeekingBackward")
    public static final long SeekingBackward = 5L;
    

}
