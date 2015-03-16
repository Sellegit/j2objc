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
@Mapping("MPMusicRepeatMode")
public final class MPMusicRepeatMode extends ObjCEnum {
    
    @GlobalConstant("MPMusicRepeatModeDefault")
    public static final long Default = 0L;
    @GlobalConstant("MPMusicRepeatModeNone")
    public static final long None = 1L;
    @GlobalConstant("MPMusicRepeatModeOne")
    public static final long One = 2L;
    @GlobalConstant("MPMusicRepeatModeAll")
    public static final long All = 3L;
    

}
