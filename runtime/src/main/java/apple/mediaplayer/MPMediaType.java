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


@Mapping("MPMediaType")
public final class MPMediaType extends ObjCEnum {
    
    @GlobalConstant("MPMediaTypeMusic")
    public static final long Music = 1L;
    @GlobalConstant("MPMediaTypePodcast")
    public static final long Podcast = 2L;
    @GlobalConstant("MPMediaTypeAudioBook")
    public static final long AudioBook = 4L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMediaTypeAudioITunesU")
    public static final long AudioITunesU = 8L;
    @GlobalConstant("MPMediaTypeAnyAudio")
    public static final long AnyAudio = 255L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMediaTypeMovie")
    public static final long Movie = 256L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMediaTypeTVShow")
    public static final long TVShow = 512L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMediaTypeVideoPodcast")
    public static final long VideoPodcast = 1024L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMediaTypeMusicVideo")
    public static final long MusicVideo = 2048L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMediaTypeVideoITunesU")
    public static final long VideoITunesU = 4096L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("MPMediaTypeHomeVideo")
    public static final long HomeVideo = 8192L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMediaTypeAnyVideo")
    public static final long AnyVideo = 65280L;
    @GlobalConstant("MPMediaTypeAny")
    public static final long Any = -1L;
    

}
