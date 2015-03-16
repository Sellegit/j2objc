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
@Mapping("MPMovieRepeatMode")
public final class MPMovieRepeatMode extends ObjCEnum {
    
    @GlobalConstant("MPMovieRepeatModeNone")
    public static final long None = 0L;
    @GlobalConstant("MPMovieRepeatModeOne")
    public static final long One = 1L;
    

}
