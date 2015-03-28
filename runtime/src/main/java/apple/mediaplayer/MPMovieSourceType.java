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
@Mapping("MPMovieSourceType")
public final class MPMovieSourceType extends ObjCEnum {
    
    @GlobalConstant("MPMovieSourceTypeUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("MPMovieSourceTypeFile")
    public static final long File = 1L;
    @GlobalConstant("MPMovieSourceTypeStreaming")
    public static final long Streaming = 2L;


}
