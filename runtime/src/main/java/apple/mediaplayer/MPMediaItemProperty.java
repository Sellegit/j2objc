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
    protected static native NSString ItemPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyMediaType")
    protected static native NSString MediaTypeValue();
    @GlobalConstant("MPMediaItemPropertyTitle")
    protected static native NSString TitleValue();
    @GlobalConstant("MPMediaItemPropertyAlbumTitle")
    protected static native NSString AlbumTitleValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyAlbumPersistentID")
    protected static native NSString AlbumPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyArtist")
    protected static native NSString ArtistValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyArtistPersistentID")
    protected static native NSString ArtistPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyAlbumArtist")
    protected static native NSString AlbumArtistValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyAlbumArtistPersistentID")
    protected static native NSString AlbumArtistPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyGenre")
    protected static native NSString GenreValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyGenrePersistentID")
    protected static native NSString GenrePersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyComposer")
    protected static native NSString ComposerValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyComposerPersistentID")
    protected static native NSString ComposerPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyPlaybackDuration")
    protected static native NSString PlaybackDurationValue();
    @GlobalConstant("MPMediaItemPropertyAlbumTrackNumber")
    protected static native NSString AlbumTrackNumberValue();
    @GlobalConstant("MPMediaItemPropertyAlbumTrackCount")
    protected static native NSString AlbumTrackCountValue();
    @GlobalConstant("MPMediaItemPropertyDiscNumber")
    protected static native NSString DiscNumberValue();
    @GlobalConstant("MPMediaItemPropertyDiscCount")
    protected static native NSString DiscCountValue();
    @GlobalConstant("MPMediaItemPropertyArtwork")
    protected static native NSString ArtworkValue();
    @GlobalConstant("MPMediaItemPropertyLyrics")
    protected static native NSString LyricsValue();
    @GlobalConstant("MPMediaItemPropertyIsCompilation")
    protected static native NSString IsCompilationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyReleaseDate")
    protected static native NSString ReleaseDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyBeatsPerMinute")
    protected static native NSString BeatsPerMinuteValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyComments")
    protected static native NSString CommentsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyAssetURL")
    protected static native NSString AssetURLValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyIsCloudItem")
    protected static native NSString IsCloudItemValue();
    @GlobalConstant("MPMediaItemPropertyPodcastTitle")
    protected static native NSString PodcastTitleValue();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("MPMediaItemPropertyPodcastPersistentID")
    protected static native NSString PodcastPersistentIDValue();
    @GlobalConstant("MPMediaItemPropertyPlayCount")
    protected static native NSString PlayCountValue();
    @GlobalConstant("MPMediaItemPropertySkipCount")
    protected static native NSString SkipCountValue();
    @GlobalConstant("MPMediaItemPropertyRating")
    protected static native NSString RatingValue();
    @GlobalConstant("MPMediaItemPropertyLastPlayedDate")
    protected static native NSString LastPlayedDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyUserGrouping")
    protected static native NSString UserGroupingValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MPMediaItemPropertyBookmarkTime")
    protected static native NSString BookmarkTimeValue();
    
}
