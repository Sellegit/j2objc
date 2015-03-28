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
@Mapping("MPMovieScalingMode")
public final class MPMovieScalingMode extends ObjCEnum {
    
    @GlobalConstant("MPMovieScalingModeNone")
    public static final long None = 0L;
    @GlobalConstant("MPMovieScalingModeAspectFit")
    public static final long AspectFit = 1L;
    @GlobalConstant("MPMovieScalingModeAspectFill")
    public static final long AspectFill = 2L;
    @GlobalConstant("MPMovieScalingModeFill")
    public static final long Fill = 3L;


}
