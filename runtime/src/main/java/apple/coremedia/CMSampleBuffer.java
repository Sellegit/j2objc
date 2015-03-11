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
@Library("CoreMedia")
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
    protected static native NSString OSStatusNotificationParameter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotification_InhibitOutputUntil")
    public static native NSString InhibitOutputUntilConduitNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotificationParameter_ResumeTag")
    protected static native NSString ResumeTagConduitNotificationParameter();
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
    protected static native NSString UpcomingOutputPTSRangeMayOverlapQueuedOutputPTSRangeConduitNotificationParameter();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotificationParameter_MinUpcomingOutputPTS")
    protected static native NSString MinUpcomingOutputPTSConduitNotificationParameter();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConduitNotificationParameter_MaxUpcomingOutputPTS")
    protected static native NSString MaxUpcomingOutputPTSConduitNotificationParameter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCMSampleBufferConsumerNotification_BufferConsumed")
    public static native NSString BufferConsumedConsumerNotification();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreate")
    private static native CMSampleBufferError create(CFAllocator allocator, CMBlockBuffer dataBuffer, boolean dataReady, FunctionPtr makeDataReadyCallback, @Pointer long makeDataReadyRefcon, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, @MachineSizedSInt long numSampleTimingEntries, CMSampleTimingInfo sampleTimingArray, @MachineSizedSInt long numSampleSizeEntries, Todo sampleSizeArray, Todo sBufOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateReady")
    private static native CMSampleBufferError createReady(CFAllocator allocator, CMBlockBuffer dataBuffer, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, @MachineSizedSInt long numSampleTimingEntries, CMSampleTimingInfo sampleTimingArray, @MachineSizedSInt long numSampleSizeEntries, Todo sampleSizeArray, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioSampleBufferCreateWithPacketDescriptions")
    private static native CMSampleBufferError createAudioSampleBuffer(CFAllocator allocator, CMBlockBuffer dataBuffer, boolean dataReady, FunctionPtr makeDataReadyCallback, @Pointer long makeDataReadyRefcon, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, CMTime sbufPTS, AudioStreamPacketDescription packetDescriptions, Todo sBufOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioSampleBufferCreateReadyWithPacketDescriptions")
    private static native CMSampleBufferError createAudioSampleBuffer(CFAllocator allocator, CMBlockBuffer dataBuffer, CMFormatDescription formatDescription, @MachineSizedSInt long numSamples, CMTime sbufPTS, AudioStreamPacketDescription packetDescriptions, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateForImageBuffer")
    private static native CMSampleBufferError createForImageBuffer(CFAllocator allocator, CVImageBuffer imageBuffer, boolean dataReady, FunctionPtr makeDataReadyCallback, @Pointer long makeDataReadyRefcon, CMVideoFormatDescription formatDescription, CMSampleTimingInfo sampleTiming, Todo sBufOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateReadyWithImageBuffer")
    private static native CMSampleBufferError createReadyWithImageBuffer(CFAllocator allocator, CVImageBuffer imageBuffer, CMVideoFormatDescription formatDescription, CMSampleTimingInfo sampleTiming, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateCopy")
    private static native CMSampleBufferError createCopy(CFAllocator allocator, CMSampleBuffer sbuf, Todo sbufCopyOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCreateCopyWithNewTiming")
    private static native CMSampleBufferError createCopyWithNewTiming(CFAllocator allocator, CMSampleBuffer originalSBuf, @MachineSizedSInt long numSampleTimingEntries, CMSampleTimingInfo sampleTimingArray, Todo sBufCopyOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCopySampleBufferForRange")
    protected static native CMSampleBufferError createForRange(CFAllocator allocator, CMSampleBuffer sbuf, CFRange sampleRange, Todo sBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataBuffer")
    public native int setDataBuffer(CMBlockBuffer dataBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetDataBuffer")
    public native CMBlockBuffer getDataBuffer();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetImageBuffer")
    public native CVImageBuffer getImageBuffer();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataBufferFromAudioBufferList")
    public native CMSampleBufferError setAudioBufferList(CFAllocator bbufStructAllocator, CFAllocator bbufMemoryAllocator, CMSampleBufferFlag flags, AudioBufferList bufferList);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetAudioBufferListWithRetainedBlockBuffer")
    private native CMSampleBufferError getAudioBufferList(Todo bufferListSizeNeededOut, AudioBufferList bufferListOut, @MachineSizedUInt long bufferListSize, CFAllocator bbufStructAllocator, CFAllocator bbufMemoryAllocator, CMSampleBufferFlag flags, Todo blockBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetAudioStreamPacketDescriptions")
    private native CMSampleBufferError getAudioStreamPacketDescriptions(@MachineSizedUInt long packetDescriptionsSize, AudioStreamPacketDescription packetDescriptionsOut, Todo packetDescriptionsSizeNeededOut);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CMSampleBufferCopyPCMDataIntoAudioBufferList")
    public native CMSampleBufferError copyPCMDataIntoAudioBufferList(int frameOffset, int numFrames, AudioBufferList bufferList);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataReady")
    public native CMSampleBufferError setDataReady();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferDataIsReady")
    public native boolean isDataReady();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetDataFailed")
    public native CMSampleBufferError setDataFailed(CMSampleBufferError status);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferHasDataFailed")
    private native boolean hasDataFailed(Todo statusOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferMakeDataReady")
    public native CMSampleBufferError makeDataReady();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferTrackDataReadiness")
    public native CMSampleBufferError trackDataReadiness(CMSampleBuffer sbufToTrack);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferInvalidate")
    public native CMSampleBufferError invalidate();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetInvalidateCallback")
    private native CMSampleBufferError setInvalidateCallback(FunctionPtr invalidateCallback, long invalidateRefCon);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetInvalidateHandler")
    public native CMSampleBufferError setInvalidateHandler(@Block VoidBlock1<CMSampleBuffer> invalidateHandler);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferIsValid")
    public native boolean isValid();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetNumSamples")
    public native @MachineSizedSInt long getNumSamples();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetDuration")
    public native CMTime getDuration();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetPresentationTimeStamp")
    public native CMTime getPresentationTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetDecodeTimeStamp")
    public native CMTime getDecodeTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputDuration")
    public native CMTime getOutputDuration();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputPresentationTimeStamp")
    public native CMTime getOutputPresentationTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferSetOutputPresentationTimeStamp")
    public native CMSampleBufferError setOutputPresentationTimeStamp(CMTime outputPresentationTimeStamp);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputDecodeTimeStamp")
    public native CMTime getOutputDecodeTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleTimingInfoArray")
    private native CMSampleBufferError getSampleTimingInfoArray(@MachineSizedSInt long timingArrayEntries, CMSampleTimingInfo timingArrayOut, Todo timingArrayEntriesNeededOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetOutputSampleTimingInfoArray")
    private native CMSampleBufferError getOutputSampleTimingInfoArray(@MachineSizedSInt long timingArrayEntries, CMSampleTimingInfo timingArrayOut, Todo timingArrayEntriesNeededOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleTimingInfo")
    private native CMSampleBufferError getSampleTimingInfo(@MachineSizedSInt long sampleIndex, CMSampleTimingInfo timingInfoOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleSizeArray")
    private native CMSampleBufferError getSampleSizeArray(@MachineSizedSInt long sizeArrayEntries, Todo sizeArrayOut, Todo sizeArrayEntriesNeededOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleSize")
    public native @MachineSizedUInt long getSampleSize(@MachineSizedSInt long sampleIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetTotalSampleSize")
    public native @MachineSizedUInt long getTotalSampleSize();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetFormatDescription")
    public native CMFormatDescription getFormatDescription();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferGetSampleAttachmentsArray")
    public native List<CMSampleAttachment> getSampleAttachments(boolean createIfNecessary);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMSampleBufferCallForEachSample")
    private native CMSampleBufferError callForEachSample(FunctionPtr callback, @Pointer long refcon);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMSampleBufferCallBlockForEachSample")
    public native CMSampleBufferError callForEachSample(@Block Block2<CMSampleBuffer, Long, CMSampleBufferError> handler);
    
}
