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

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaItemCollection")
public class MPMediaItemCollection 
    extends MPMediaEntity 
     {

    
    
    public MPMediaItemCollection() {}
    @Mapping("initWithItems:")
    public MPMediaItemCollection(NSArray<?> items) { }
    
    
    @Mapping("items")
    public native NSArray<MPMediaItem> getItems();
    @Mapping("representativeItem")
    public native MPMediaItem getRepresentativeItem();
    @Mapping("count")
    public native @MachineSizedUInt long getCount();
    @Mapping("mediaTypes")
    public native @Representing("MPMediaType") @MachineSizedUInt long getMediaTypes();
    
    
    
    
    
}
