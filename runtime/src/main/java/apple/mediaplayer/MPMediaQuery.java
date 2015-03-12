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

@Library("MediaPlayer") @Mapping("MPMediaQuery")
public class MPMediaQuery 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithFilterPredicates:")
    public MPMediaQuery(NSSet<?> filterPredicates) { }
    
    
    @Mapping("filterPredicates")
    public native NSSet<MPMediaPredicate> getFilterPredicates();
    @Mapping("setFilterPredicates:")
    public native void setFilterPredicates(NSSet<MPMediaPredicate> v);
    @Mapping("items")
    public native NSArray<MPMediaItem> getItems();
    @Mapping("collections")
    public native NSArray<MPMediaItemCollection> getCollections();
    @Mapping("groupingType")
    public native @Representing("MPMediaGrouping") @MachineSizedSInt long getGroupingType();
    @Mapping("setGroupingType:")
    public native void setGroupingType(@Representing("MPMediaGrouping") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("itemSections")
    public native NSArray<MPMediaQuerySection> getItemSections();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("collectionSections")
    public native NSArray<MPMediaQuerySection> getCollectionSections();
    
    
    
    @Mapping("addFilterPredicate:")
    public native void addFilterPredicate(MPMediaPredicate predicate);
    @Mapping("removeFilterPredicate:")
    public native void removeFilterPredicate(MPMediaPredicate predicate);
    @Mapping("albumsQuery")
    public static native MPMediaQuery createAlbumsQuery();
    @Mapping("artistsQuery")
    public static native MPMediaQuery createArtistsQuery();
    @Mapping("songsQuery")
    public static native MPMediaQuery createSongsQuery();
    @Mapping("playlistsQuery")
    public static native MPMediaQuery createPlaylistsQuery();
    @Mapping("podcastsQuery")
    public static native MPMediaQuery createPodcastsQuery();
    @Mapping("audiobooksQuery")
    public static native MPMediaQuery createAudiobooksQuery();
    @Mapping("compilationsQuery")
    public static native MPMediaQuery createCompilationsQuery();
    @Mapping("composersQuery")
    public static native MPMediaQuery createComposersQuery();
    @Mapping("genresQuery")
    public static native MPMediaQuery createGenresQuery();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
