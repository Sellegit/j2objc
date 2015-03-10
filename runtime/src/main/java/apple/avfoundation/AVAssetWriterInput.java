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

@Library("AVFoundation") @Mapping("AVAssetWriterInput")
public class AVAssetWriterInput 
    extends NSObject 
     {

    
    
    public AVAssetWriterInput() {}
    
    
    @Mapping("mediaType")
    public native AVMediaType getMediaType();
    @Mapping("outputSettings")
    public native NSDictionary<NSString, NSObject> getOutputSettings();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("sourceFormatHint")
    public native CMFormatDescription getSourceFormatHint();
    @Mapping("metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    public native void setMetadata(NSArray<AVMetadataItem> v);
    @Mapping("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();
    @Mapping("expectsMediaDataInRealTime")
    public native boolean expectsMediaDataInRealTime();
    public native void setExpectsMediaDataInRealTime(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("languageCode")
    public native String getLanguageCode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setLanguageCode(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("extendedLanguageTag")
    public native String getExtendedLanguageTag();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setExtendedLanguageTag(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("naturalSize")
    public native CGSize getNaturalSize();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setNaturalSize(CGSize v);
    @Mapping("transform")
    public native CGAffineTransform getTransform();
    public native void setTransform(CGAffineTransform v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredVolume")
    public native float getPreferredVolume();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setPreferredVolume(float v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("marksOutputTrackAsEnabled")
    public native boolean marksOutputTrackAsEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setMarksOutputTrackAsEnabled(boolean v);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("mediaTimeScale")
    public native int getMediaTimeScale();
    /**
     * @since Available in iOS 4.3 and later.
     */
    public native void setMediaTimeScale(int v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preferredMediaChunkDuration")
    public native CMTime getPreferredMediaChunkDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setPreferredMediaChunkDuration(CMTime v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preferredMediaChunkAlignment")
    public native @MachineSizedSInt long getPreferredMediaChunkAlignment();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setPreferredMediaChunkAlignment(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("sampleReferenceBaseURL")
    public native NSURL getSampleReferenceBaseURL();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setSampleReferenceBaseURL(NSURL v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("performsMultiPassEncodingIfSupported")
    public native boolean performsMultiPassEncodingIfSupported();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setPerformsMultiPassEncodingIfSupported(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("canPerformMultiplePasses")
    public native boolean canPerformMultiplePasses();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("currentPassDescription")
    public native AVAssetWriterInputPassDescription getCurrentPassDescription();
    
    
    
    @Mapping("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReady(DispatchQueue queue, @Block Runnable block);
    @Mapping("appendSampleBuffer:")
    public native boolean appendSampleBuffer(CMSampleBuffer sampleBuffer);
    @Mapping("markAsFinished")
    public native void markAsFinished();
    @Mapping("assetWriterInputWithMediaType:outputSettings:")
    public static native AVAssetWriterInput create(AVMediaType mediaType, NSDictionary<NSString, NSObject> outputSettings);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("assetWriterInputWithMediaType:outputSettings:sourceFormatHint:")
    public static native AVAssetWriterInput create(AVMediaType mediaType, NSDictionary<NSString, NSObject> outputSettings, CMFormatDescription sourceFormatHint);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canAddTrackAssociationWithTrackOfInput:type:")
    public native boolean canAddTrackAssociation(AVAssetWriterInput input, AVTrackAssociationType trackAssociationType);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addTrackAssociationWithTrackOfInput:type:")
    public native void addTrackAssociation(AVAssetWriterInput input, AVTrackAssociationType trackAssociationType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("respondToEachPassDescriptionOnQueue:usingBlock:")
    public native void respondToEachPassDescriptionOnQueue(DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("markCurrentPassAsFinished")
    public native void markCurrentPassAsFinished();
    
}
