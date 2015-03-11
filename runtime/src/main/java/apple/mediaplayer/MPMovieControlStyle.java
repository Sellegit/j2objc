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
@Mapping("MPMovieControlStyle")
public final class MPMovieControlStyle extends ObjCEnum {
    
    @GlobalConstant("MPMovieControlStyleNone")
    public static final long None = 0L;
    @GlobalConstant("MPMovieControlStyleEmbedded")
    public static final long Embedded = 1L;
    @GlobalConstant("MPMovieControlStyleFullscreen")
    public static final long Fullscreen = 2L;
    @GlobalConstant("MPMovieControlStyleDefault")
    public static final long Default = 1L;
    

}
