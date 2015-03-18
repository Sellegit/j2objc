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


/*<javadoc>*/
/*</javadoc>*/
@Library("MediaPlayer/MediaPlayer.h")
public class MPMediaItemProperty 
    extends MPMediaEntityProperty 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyPersistentID")
    public static native NSString ItemPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyMediaType")
    public static native NSString MediaTypeValue();
    @GlobalConstant("MPMediaItemPropertyTitle")
    public static native NSString TitleValue();
    @GlobalConstant("MPMediaItemPropertyAlbumTitle")
    public static native NSString AlbumTitleValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyAlbumPersistentID")
    public static native NSString AlbumPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyArtistPersistentID")
    public static native NSString ArtistPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyAlbumArtist")
    public static native NSString AlbumArtistValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyAlbumArtistPersistentID")
    public static native NSString AlbumArtistPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyGenre")
    public static native NSString GenreValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyGenrePersistentID")
    public static native NSString GenrePersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyComposerPersistentID")
    public static native NSString ComposerPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyPlaybackDuration")
    public static native NSString PlaybackDurationValue();
    @GlobalConstant("MPMediaItemPropertyAlbumTrackNumber")
    public static native NSString AlbumTrackNumberValue();
    @GlobalConstant("MPMediaItemPropertyAlbumTrackCount")
    public static native NSString AlbumTrackCountValue();
    @GlobalConstant("MPMediaItemPropertyDiscNumber")
    public static native NSString DiscNumberValue();
    @GlobalConstant("MPMediaItemPropertyDiscCount")
    public static native NSString DiscCountValue();
    @GlobalConstant("MPMediaItemPropertyArtwork")
    public static native NSString ArtworkValue();
    @GlobalConstant("MPMediaItemPropertyLyrics")
    public static native NSString LyricsValue();
    @GlobalConstant("MPMediaItemPropertyIsCompilation")
    public static native NSString IsCompilationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyReleaseDate")
    public static native NSString ReleaseDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyBeatsPerMinute")
    public static native NSString BeatsPerMinuteValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyComments")
    public static native NSString CommentsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyAssetURL")
    public static native NSString AssetURLValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyIsCloudItem")
    public static native NSString IsCloudItemValue();
    @GlobalConstant("MPMediaItemPropertyPodcastTitle")
    public static native NSString PodcastTitleValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyPodcastPersistentID")
    public static native NSString PodcastPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyPlayCount")
    public static native NSString PlayCountValue();
    @GlobalConstant("MPMediaItemPropertySkipCount")
    public static native NSString SkipCountValue();
    @GlobalConstant("MPMediaItemPropertyRating")
    public static native NSString RatingValue();
    @GlobalConstant("MPMediaItemPropertyLastPlayedDate")
    public static native NSString LastPlayedDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyUserGrouping")
    public static native NSString UserGroupingValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyBookmarkTime")
    public static native NSString BookmarkTimeValue();
    
}
