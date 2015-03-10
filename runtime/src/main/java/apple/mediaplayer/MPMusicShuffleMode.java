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






@Mapping("MPMusicShuffleMode")
public final class MPMusicShuffleMode extends ObjCEnum {
    
    @GlobalConstant("MPMusicShuffleModeDefault")
    public static final long Default = 0L;
    @GlobalConstant("MPMusicShuffleModeOff")
    public static final long Off = 1L;
    @GlobalConstant("MPMusicShuffleModeSongs")
    public static final long Songs = 2L;
    @GlobalConstant("MPMusicShuffleModeAlbums")
    public static final long Albums = 3L;
    

}
