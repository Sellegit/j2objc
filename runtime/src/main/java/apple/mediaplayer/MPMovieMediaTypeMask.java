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
@Mapping("MPMovieMediaTypeMask")
public final class MPMovieMediaTypeMask extends ObjCEnum {
    
    @GlobalConstant("MPMovieMediaTypeMaskNone")
    public static final long None = 0L;
    @GlobalConstant("MPMovieMediaTypeMaskVideo")
    public static final long Video = 1L;
    @GlobalConstant("MPMovieMediaTypeMaskAudio")
    public static final long Audio = 2L;
    

}
