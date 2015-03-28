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
@Mapping("MPMovieLoadState")
public final class MPMovieLoadState extends ObjCEnum {
    
    @GlobalConstant("MPMovieLoadStateUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("MPMovieLoadStatePlayable")
    public static final long Playable = 1L;
    @GlobalConstant("MPMovieLoadStatePlaythroughOK")
    public static final long PlaythroughOK = 2L;
    @GlobalConstant("MPMovieLoadStateStalled")
    public static final long Stalled = 4L;


}
