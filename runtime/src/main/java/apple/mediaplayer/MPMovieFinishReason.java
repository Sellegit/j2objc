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
@Mapping("MPMovieFinishReason")
public final class MPMovieFinishReason extends ObjCEnum {
    
    @GlobalConstant("MPMovieFinishReasonPlaybackEnded")
    public static final long PlaybackEnded = 0L;
    @GlobalConstant("MPMovieFinishReasonPlaybackError")
    public static final long PlaybackError = 1L;
    @GlobalConstant("MPMovieFinishReasonUserExited")
    public static final long UserExited = 2L;
    

}
