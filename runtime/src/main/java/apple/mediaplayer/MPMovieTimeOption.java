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
@Mapping("MPMovieTimeOption")
public final class MPMovieTimeOption extends ObjCEnum {
    
    @GlobalConstant("MPMovieTimeOptionNearestKeyFrame")
    public static final long NearestKeyFrame = 0L;
    @GlobalConstant("MPMovieTimeOptionExact")
    public static final long Exact = 1L;
    

}
