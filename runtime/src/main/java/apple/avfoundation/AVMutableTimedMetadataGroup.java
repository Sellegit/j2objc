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
 * @since Available in iOS 4.3 and later.
 */

@Library("AVFoundation") @Mapping("AVMutableTimedMetadataGroup")
public class AVMutableTimedMetadataGroup 
    extends AVTimedMetadataGroup 
     {

    
    
    public AVMutableTimedMetadataGroup() {}
    @Mapping("initWithItems:timeRange:")
    public AVMutableTimedMetadataGroup(NSArray<?> items, CMTimeRange timeRange) { }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithSampleBuffer:")
    public AVMutableTimedMetadataGroup(CMSampleBuffer sampleBuffer) { }
    
    
    @Mapping("timeRange")
    public native CMTimeRange getTimeRange();
    public native void setTimeRange(CMTimeRange v);
    @Mapping("items")
    public native NSArray<AVMetadataItem> getItems();
    public native void setItems(NSArray<AVMetadataItem> v);
    
    
    
    
    
}
