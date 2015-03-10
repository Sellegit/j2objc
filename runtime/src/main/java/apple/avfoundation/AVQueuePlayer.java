package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;



/**
 * @since Available in iOS 4.1 and later.
 */

@Library("AVFoundation") @Mapping("AVQueuePlayer")
public class AVQueuePlayer 
    extends AVPlayer 
     {

    
    
    public AVQueuePlayer() {}
    @Mapping("initWithItems:")
    public AVQueuePlayer(NSArray<AVPlayerItem> items) { }
    @Mapping("initWithURL:")
    public AVQueuePlayer(NSURL URL) { }
    @Mapping("initWithPlayerItem:")
    public AVQueuePlayer(AVPlayerItem item) { }
    
    
    
    
    
    
    @Mapping("items")
    public native NSArray<AVPlayerItem> getItems();
    @Mapping("advanceToNextItem")
    public native void advanceToNextItem();
    @Mapping("canInsertItem:afterItem:")
    public native boolean canInsertItem(AVPlayerItem item, AVPlayerItem afterItem);
    @Mapping("insertItem:afterItem:")
    public native void insertItem(AVPlayerItem item, AVPlayerItem afterItem);
    @Mapping("removeItem:")
    public native void removeItem(AVPlayerItem item);
    @Mapping("removeAllItems")
    public native void removeAllItems();
    @Mapping("queuePlayerWithItems:")
    public static native AVQueuePlayer create(NSArray<AVPlayerItem> items);
    
}
