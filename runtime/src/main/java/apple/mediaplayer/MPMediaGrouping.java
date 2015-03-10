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



/**
 * @since Available in iOS 3.0 and later.
 */


@Mapping("MPMediaGrouping")
public final class MPMediaGrouping extends ObjCEnum {
    
    @GlobalConstant("MPMediaGroupingTitle")
    public static final long Title = 0L;
    @GlobalConstant("MPMediaGroupingAlbum")
    public static final long Album = 1L;
    @GlobalConstant("MPMediaGroupingArtist")
    public static final long Artist = 2L;
    @GlobalConstant("MPMediaGroupingAlbumArtist")
    public static final long AlbumArtist = 3L;
    @GlobalConstant("MPMediaGroupingComposer")
    public static final long Composer = 4L;
    @GlobalConstant("MPMediaGroupingGenre")
    public static final long Genre = 5L;
    @GlobalConstant("MPMediaGroupingPlaylist")
    public static final long Playlist = 6L;
    @GlobalConstant("MPMediaGroupingPodcastTitle")
    public static final long PodcastTitle = 7L;
    

}
