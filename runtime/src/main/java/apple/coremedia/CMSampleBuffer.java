package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Mapping("CMSampleBufferRef") @Library("CoreMedia/CoreMedia.h")
public class CMSampleBuffer 
    extends CFType 
     {

    
    
    protected CMSampleBuffer() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferNotification_DataBecameReady")
    public static native NSString DataBecameReadyNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCMSampleBufferNotification_DataFailed")
    public static native NSString DataFailedNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCMSampleBufferNotificationParameter_OSStatus")
    public static native NSString OSStatusNotificationParameter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotification_InhibitOutputUntil")
    public static native NSString InhibitOutputUntilConduitNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotificationParameter_ResumeTag")
    public static native NSString ResumeTagConduitNotificationParameter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotification_ResetOutput")
    public static native NSString ResetOutputConduitNotification();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotification_UpcomingOutputPTSRangeChanged")
    public static native NSString UpcomingOutputPTSRangeChangedConduitNotification();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotificationParameter_UpcomingOutputPTSRangeMayOverlapQueuedOutputPTSRange")
    public static native NSString UpcomingOutputPTSRangeMayOverlapQueuedOutputPTSRangeConduitNotificationParameter();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotificationParameter_MinUpcomingOutputPTS")
    public static native NSString MinUpcomingOutputPTSConduitNotificationParameter();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotificationParameter_MaxUpcomingOutputPTS")
    public static native NSString MaxUpcomingOutputPTSConduitNotificationParameter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConsumerNotification_BufferConsumed")
    public static native NSString BufferConsumedConsumerNotification();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreate")
    public static native CMSampleBufferError create(CFAllocator allocator, CMBlockBuffer dataBuffer, boolean dataReady, FunctionPtr makeDataReadyCallback, Todo makeDataReadyRefcon, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, @MachineSizedSInt long numSampleTimingEntries, CMSampleTimingInfo sampleTimingArray, @MachineSizedSInt long numSampleSizeEntries, Todo sampleSizeArray, Todo sBufOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateReady")
    public static native CMSampleBufferError createReady(CFAllocator allocator, CMBlockBuffer dataBuffer, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, @MachineSizedSInt long numSampleTimingEntries, CMSampleTimingInfo sampleTimingArray, @MachineSizedSInt long numSampleSizeEntries, Todo sampleSizeArray, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioSampleBufferCreateWithPacketDescriptions")
    public static native CMSampleBufferError createAudioSampleBuffer(CFAllocator allocator, CMBlockBuffer dataBuffer, boolean dataReady, FunctionPtr makeDataReadyCallback, Todo makeDataReadyRefcon, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, CMTime sbufPTS, Todo packetDescriptions, Todo sBufOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioSampleBufferCreateReadyWithPacketDescriptions")
    public static native CMSampleBufferError createAudioSampleBuffer(CFAllocator allocator, CMBlockBuffer dataBuffer, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, CMTime sbufPTS, Todo packetDescriptions, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateForImageBuffer")
    public static native CMSampleBufferError createForImageBuffer(CFAllocator allocator, CVImageBuffer imageBuffer, boolean dataReady, FunctionPtr makeDataReadyCallback, Todo makeDataReadyRefcon, CMVideoFormatDescription formatDescription, CMSampleTimingInfo sampleTiming, Todo sBufOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateReadyWithImageBuffer")
    public static native CMSampleBufferError createReadyWithImageBuffer(CFAllocator allocator, CVImageBuffer imageBuffer, CMVideoFormatDescription formatDescription, CMSampleTimingInfo sampleTiming, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateCopy")
    public static native CMSampleBufferError createCopy(CFAllocator allocator, CMSampleBuffer sbuf, Todo sbufCopyOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateCopyWithNewTiming")
    public static native CMSampleBufferError createCopyWithNewTiming(CFAllocator allocator, CMSampleBuffer originalSBuf, @MachineSizedSInt long numSampleTimingEntries, CMSampleTimingInfo sampleTimingArray, Todo sBufCopyOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCopySampleBufferForRange")
    public static native CMSampleBufferError createForRange(CFAllocator allocator, CMSampleBuffer sbuf, CFRange sampleRange, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataBuffer")
    public static native int setDataBuffer(CMSampleBuffer sbuf, CMBlockBuffer dataBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetDataBuffer")
    public static native CMBlockBuffer getDataBuffer(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetImageBuffer")
    public static native CVImageBuffer getImageBuffer(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataBufferFromAudioBufferList")
    public static native CMSampleBufferError setAudioBufferList(CMSampleBuffer sbuf, CFAllocator bbufStructAllocator, CFAllocator bbufMemoryAllocator, int flags, Todo bufferList);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer")
    public static native CMSampleBufferError getAudioBufferList(CMSampleBuffer sbuf, Todo bufferListSizeNeededOut, Todo bufferListOut, @MachineSizedUInt long bufferListSize, CFAllocator bbufStructAllocator, CFAllocator bbufMemoryAllocator, int flags, Todo blockBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetAudioStreamPacketDescriptions")
    public static native CMSampleBufferError getAudioStreamPacketDescriptions(CMSampleBuffer sbuf, @MachineSizedUInt long packetDescriptionsSize, Todo packetDescriptionsOut, Todo packetDescriptionsSizeNeededOut);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CMSampleBufferCopyPCMDataIntoAudioBufferList")
    public static native CMSampleBufferError copyPCMDataIntoAudioBufferList(CMSampleBuffer sbuf, int frameOffset, int numFrames, Todo bufferList);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataReady")
    public static native CMSampleBufferError setDataReady(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferDataIsReady")
    public static native boolean isDataReady(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataFailed")
    public static native CMSampleBufferError setDataFailed(CMSampleBuffer sbuf, int status);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferHasDataFailed")
    public static native boolean hasDataFailed(CMSampleBuffer sbuf, Todo statusOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferMakeDataReady")
    public static native CMSampleBufferError makeDataReady(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferTrackDataReadiness")
    public static native CMSampleBufferError trackDataReadiness(CMSampleBuffer sbuf, CMSampleBuffer sbufToTrack);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferInvalidate")
    public static native CMSampleBufferError invalidate(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetInvalidateCallback")
    public static native CMSampleBufferError setInvalidateCallback(CMSampleBuffer sbuf, FunctionPtr invalidateCallback, long invalidateRefCon);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetInvalidateHandler")
    public static native CMSampleBufferError setInvalidateHandler(CMSampleBuffer sbuf, FunctionPtr invalidateHandler);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferIsValid")
    public static native boolean isValid(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetNumSamples")
    public static native @MachineSizedSInt long getNumSamples(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetDuration")
    public static native CMTime getDuration(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetPresentationTimeStamp")
    public static native CMTime getPresentationTimeStamp(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetDecodeTimeStamp")
    public static native CMTime getDecodeTimeStamp(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputDuration")
    public static native CMTime getOutputDuration(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputPresentationTimeStamp")
    public static native CMTime getOutputPresentationTimeStamp(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetOutputPresentationTimeStamp")
    public static native CMSampleBufferError setOutputPresentationTimeStamp(CMSampleBuffer sbuf, CMTime outputPresentationTimeStamp);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputDecodeTimeStamp")
    public static native CMTime getOutputDecodeTimeStamp(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleTimingInfoArray")
    public static native CMSampleBufferError getSampleTimingInfoArray(CMSampleBuffer sbuf, @MachineSizedSInt long timingArrayEntries, CMSampleTimingInfo timingArrayOut, Todo timingArrayEntriesNeededOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputSampleTimingInfoArray")
    public static native CMSampleBufferError getOutputSampleTimingInfoArray(CMSampleBuffer sbuf, @MachineSizedSInt long timingArrayEntries, CMSampleTimingInfo timingArrayOut, Todo timingArrayEntriesNeededOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleTimingInfo")
    public static native CMSampleBufferError getSampleTimingInfo(CMSampleBuffer sbuf, @MachineSizedSInt long sampleIndex, CMSampleTimingInfo timingInfoOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleSizeArray")
    public static native CMSampleBufferError getSampleSizeArray(CMSampleBuffer sbuf, @MachineSizedSInt long sizeArrayEntries, Todo sizeArrayOut, Todo sizeArrayEntriesNeededOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleSize")
    public static native @MachineSizedUInt long getSampleSize(CMSampleBuffer sbuf, @MachineSizedSInt long sampleIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetTotalSampleSize")
    public static native @MachineSizedUInt long getTotalSampleSize(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetFormatDescription")
    public static native CMFormatDescription getFormatDescription(CMSampleBuffer sbuf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleAttachmentsArray")
    public static native List<CMSampleAttachment> getSampleAttachments(CMSampleBuffer sbuf, boolean createIfNecessary);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCallForEachSample")
    public static native CMSampleBufferError callForEachSample(CMSampleBuffer sbuf, FunctionPtr callback, Todo refcon);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferCallBlockForEachSample")
    public static native CMSampleBufferError callForEachSample(CMSampleBuffer sbuf, Todo handler);
    
}
