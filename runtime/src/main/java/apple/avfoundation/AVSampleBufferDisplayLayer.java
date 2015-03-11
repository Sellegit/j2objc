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
 * @since Available in iOS 8.0 and later.
 */

@Library("AVFoundation") @Mapping("AVSampleBufferDisplayLayer")
public class AVSampleBufferDisplayLayer 
    extends CALayer 
     {

    
    
    public AVSampleBufferDisplayLayer() {}
    @Mapping("initWithLayer:")
    public AVSampleBufferDisplayLayer(Object layer) { }
    
    
    @Mapping("controlTimebase")
    public native CMTimebase getControlTimebase();
    @Mapping("setControlTimebase:")
    public native void setControlTimebase(CMTimebase v);
    @Mapping("videoGravity")
    public native AVLayerVideoGravity getVideoGravity();
    @Mapping("setVideoGravity:")
    public native void setVideoGravity(AVLayerVideoGravity v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("status")
    public native @Representing("AVQueuedSampleBufferRenderingStatus") @MachineSizedSInt long getStatus();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("error")
    public native NSError getError();
    @Mapping("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVSampleBufferDisplayLayerFailedToDecodeNotification")
    public static native NSString FailedToDecodeNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVSampleBufferDisplayLayerFailedToDecodeNotificationErrorKey")
    public static native NSString FailedToDecodeNotificationErrorKey();
    
    @Mapping("enqueueSampleBuffer:")
    public native void enqueueSampleBuffer(CMSampleBuffer sampleBuffer);
    @Mapping("flush")
    public native void flush();
    @Mapping("flushAndRemoveImage")
    public native void flushAndRemoveImage();
    @Mapping("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueue(DispatchQueue queue, @Block Runnable block);
    @Mapping("stopRequestingMediaData")
    public native void stopRequestingMediaData();
    
}
