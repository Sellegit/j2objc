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
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaItem")
public class MPMediaItem 
    extends MPMediaEntity 
     {

    
    
    @Mapping("init")
    public MPMediaItem() { }

    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("persistentID")
    public native long getPersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("mediaType")
    public native @Representing("MPMediaType") long getMediaType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("title")
    public native String getTitle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("albumTitle")
    public native String getAlbumTitle();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("albumPersistentID")
    public native long getAlbumPersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("artist")
    public native String getArtist();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("artistPersistentID")
    public native long getArtistPersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("albumArtist")
    public native String getAlbumArtist();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("albumArtistPersistentID")
    public native long getAlbumArtistPersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("genre")
    public native String getGenre();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("genrePersistentID")
    public native long getGenrePersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("composer")
    public native String getComposer();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("composerPersistentID")
    public native long getComposerPersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("playbackDuration")
    public native double getPlaybackDuration();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("albumTrackNumber")
    public native @MachineSizedUInt long getAlbumTrackNumber();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("albumTrackCount")
    public native @MachineSizedUInt long getAlbumTrackCount();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("discNumber")
    public native @MachineSizedUInt long getDiscNumber();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("discCount")
    public native @MachineSizedUInt long getDiscCount();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("artwork")
    public native MPMediaItemArtwork getArtwork();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("lyrics")
    public native String getLyrics();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isCompilation")
    public native boolean isCompilation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("releaseDate")
    public native NSDate getReleaseDate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("beatsPerMinute")
    public native @MachineSizedUInt long getBeatsPerMinute();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("comments")
    public native String getComments();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("assetURL")
    public native NSURL getAssetURL();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isCloudItem")
    public native boolean isCloudItem();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("podcastTitle")
    public native String getPodcastTitle();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("podcastPersistentID")
    public native long getPodcastPersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("playCount")
    public native @MachineSizedUInt long getPlayCount();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("skipCount")
    public native @MachineSizedUInt long getSkipCount();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("rating")
    public native @MachineSizedUInt long getRating();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("lastPlayedDate")
    public native NSDate getLastPlayedDate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("userGrouping")
    public native String getUserGrouping();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("bookmarkTime")
    public native double getBookmarkTime();

    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("persistentIDPropertyForGroupingType:")
    public static native MPMediaEntityProperty getPersistentIDProperty(@Representing("MPMediaGrouping") long groupingType);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("titlePropertyForGroupingType:")
    public static native MPMediaEntityProperty getTitleProperty(@Representing("MPMediaGrouping") long groupingType);

}
