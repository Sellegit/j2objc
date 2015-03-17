package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox/AudioToolbox.h")
public class AudioQueue 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueNewOutput")
    public static native AudioQueueError newOutput(AudioStreamBasicDescription inFormat, FunctionPtr inCallbackProc, Todo inUserData, CFRunLoop inCallbackRunLoop, CFString inCallbackRunLoopMode, int inFlags, Todo outAQ);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueNewInput")
    public static native AudioQueueError newInput(AudioStreamBasicDescription inFormat, FunctionPtr inCallbackProc, Todo inUserData, CFRunLoop inCallbackRunLoop, CFString inCallbackRunLoopMode, int inFlags, Todo outAQ);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueAllocateBuffer")
    public static native AudioQueueError allocateBuffer(OpaqueAudioQueue inAQ, int inBufferByteSize, Todo outBuffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueAllocateBufferWithPacketDescriptions")
    public static native AudioQueueError allocateBufferWithPacketDescriptions(OpaqueAudioQueue inAQ, int inBufferByteSize, int inNumberPacketDescriptions, Todo outBuffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueFreeBuffer")
    public static native AudioQueueError freeBuffer(OpaqueAudioQueue inAQ, Todo inBuffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueEnqueueBuffer")
    public static native AudioQueueError enqueueBuffer(OpaqueAudioQueue inAQ, Todo inBuffer, int inNumPacketDescs, Todo inPacketDescs);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueEnqueueBufferWithParameters")
    public static native AudioQueueError enqueueBufferWithParameters(OpaqueAudioQueue inAQ, Todo inBuffer, int inNumPacketDescs, Todo inPacketDescs, int inTrimFramesAtStart, int inTrimFramesAtEnd, int inNumParamValues, Todo inParamValues, Todo inStartTime, Todo outActualStartTime);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueStart")
    public static native AudioQueueError start(OpaqueAudioQueue inAQ, Todo inStartTime);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueuePrime")
    public static native AudioQueueError prime(OpaqueAudioQueue inAQ, int inNumberOfFramesToPrepare, Todo outNumberOfFramesPrepared);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueStop")
    public static native AudioQueueError stop(OpaqueAudioQueue inAQ, boolean inImmediate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueuePause")
    public static native AudioQueueError pause(OpaqueAudioQueue inAQ);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueFlush")
    public static native AudioQueueError flush(OpaqueAudioQueue inAQ);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueReset")
    public static native AudioQueueError reset(OpaqueAudioQueue inAQ);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueGetParameter")
    public static native AudioQueueError getParameter(OpaqueAudioQueue inAQ, int inParamID, Todo outValue);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueSetParameter")
    public static native AudioQueueError setParameter(OpaqueAudioQueue inAQ, int inParamID, float inValue);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueGetProperty")
    public static native AudioQueueError getProperty(OpaqueAudioQueue inAQ, int inID, Todo outData, Todo ioDataSize);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueSetProperty")
    public static native AudioQueueError setProperty(OpaqueAudioQueue inAQ, int inID, Todo inData, int inDataSize);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueGetPropertySize")
    public static native AudioQueueError getPropertySize(OpaqueAudioQueue inAQ, int inID, Todo outDataSize);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueAddPropertyListener")
    public static native AudioQueueError addPropertyListener(OpaqueAudioQueue inAQ, int inID, FunctionPtr inProc, Todo inUserData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueRemovePropertyListener")
    public static native AudioQueueError removePropertyListener(OpaqueAudioQueue inAQ, int inID, FunctionPtr inProc, Todo inUserData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueCreateTimeline")
    public static native AudioQueueError createTimeline(OpaqueAudioQueue inAQ, Todo outTimeline);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueDisposeTimeline")
    public static native AudioQueueError disposeTimeline(OpaqueAudioQueue inAQ, OpaqueAudioQueueTimeline inTimeline);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueGetCurrentTime")
    public static native AudioQueueError getCurrentTime(OpaqueAudioQueue inAQ, OpaqueAudioQueueTimeline inTimeline, Todo outTimeStamp, Todo outTimelineDiscontinuity);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueDeviceGetCurrentTime")
    public static native AudioQueueError deviceGetCurrentTime(OpaqueAudioQueue inAQ, Todo outTimeStamp);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueDeviceTranslateTime")
    public static native AudioQueueError deviceTranslateTime(OpaqueAudioQueue inAQ, Todo inTime, Todo outTime);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueDeviceGetNearestStartTime")
    public static native AudioQueueError deviceGetNearestStartTime(OpaqueAudioQueue inAQ, Todo ioRequestedStartTime, int inFlags);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueSetOfflineRenderFormat")
    public static native AudioQueueError setOfflineRenderFormat(OpaqueAudioQueue inAQ, AudioStreamBasicDescription inFormat, AudioChannelLayout inLayout);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioQueueOfflineRender")
    public static native AudioQueueError offlineRender(OpaqueAudioQueue inAQ, Todo inTimestamp, Todo ioBuffer, int inNumberFrames);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("AudioQueueProcessingTapNew")
    public static native AudioQueueError processingTapNew(OpaqueAudioQueue inAQ, FunctionPtr inCallback, Todo inClientData, int inFlags, Todo outMaxFrames, AudioStreamBasicDescription outProcessingFormat, Todo outAQTap);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("AudioQueueProcessingTapDispose")
    public static native AudioQueueError processingTapDispose(OpaqueAudioQueueProcessingTap inAQTap);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("AudioQueueProcessingTapGetSourceAudio")
    public static native AudioQueueError processingTapGetSourceAudio(OpaqueAudioQueueProcessingTap inAQTap, int inNumberFrames, Todo ioTimeStamp, Todo outFlags, Todo outNumberFrames, Todo ioData);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("AudioQueueProcessingTapGetQueueTime")
    public static native AudioQueueError processingTapGetQueueTime(OpaqueAudioQueueProcessingTap inAQTap, Todo outQueueSampleTime, Todo outQueueFrameCount);
    
}
