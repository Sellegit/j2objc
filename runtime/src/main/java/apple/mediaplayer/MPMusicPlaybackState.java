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





@Library("MediaPlayer/MediaPlayer.h")
@Mapping("MPMusicPlaybackState")
public final class MPMusicPlaybackState extends ObjCEnum {
    
    @GlobalConstant("MPMusicPlaybackStateStopped")
    public static final long Stopped = 0L;
    @GlobalConstant("MPMusicPlaybackStatePlaying")
    public static final long Playing = 1L;
    @GlobalConstant("MPMusicPlaybackStatePaused")
    public static final long Paused = 2L;
    @GlobalConstant("MPMusicPlaybackStateInterrupted")
    public static final long Interrupted = 3L;
    @GlobalConstant("MPMusicPlaybackStateSeekingForward")
    public static final long SeekingForward = 4L;
    @GlobalConstant("MPMusicPlaybackStateSeekingBackward")
    public static final long SeekingBackward = 5L;
    

}
