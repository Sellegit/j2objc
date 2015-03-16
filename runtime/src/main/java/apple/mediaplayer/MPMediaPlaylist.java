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

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaPlaylist")
public class MPMediaPlaylist 
    extends MPMediaItemCollection 
     {

    
    
    public MPMediaPlaylist() {}
    @Mapping("initWithItems:")
    public MPMediaPlaylist(NSArray<?> items) { }
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("persistentID")
    public native long getPersistentID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("playlistAttributes")
    public native @Representing("MPMediaPlaylistAttribute") @MachineSizedUInt long getPlaylistAttributes();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("seedItems")
    public native NSArray<MPMediaItem> getSeedItems();
    
    
    
    
    
}
