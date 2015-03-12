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
 * @since Available in iOS 4.0 and later.
 */

@Library("AVFoundation") @Mapping("AVCaptureSession")
public class AVCaptureSession 
    extends NSObject 
     {

    
    
    public AVCaptureSession() {}
    
    
    @Mapping("sessionPreset")
    public native AVCaptureSessionPreset getSessionPreset();
    @Mapping("setSessionPreset:")
    public native void setSessionPreset(AVCaptureSessionPreset v);
    @Mapping("inputs")
    public native NSArray<AVCaptureInput> getInputs();
    @Mapping("outputs")
    public native NSArray<AVCaptureOutput> getOutputs();
    @Mapping("isRunning")
    public native boolean isRunning();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isInterrupted")
    public native boolean isInterrupted();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("usesApplicationAudioSession")
    public native boolean usesApplicationAudioSession();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setUsesApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("automaticallyConfiguresApplicationAudioSession")
    public native boolean automaticallyConfiguresApplicationAudioSession();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAutomaticallyConfiguresApplicationAudioSession:")
    public native void setAutomaticallyConfiguresApplicationAudioSession(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("masterClock")
    public native CMClock getMasterClock();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionRuntimeErrorNotification")
    public static native NSString RuntimeErrorNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionErrorKey")
    public static native NSString NotificationErrorKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionDidStartRunningNotification")
    public static native NSString DidStartRunningNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionDidStopRunningNotification")
    public static native NSString DidStopRunningNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionWasInterruptedNotification")
    public static native NSString WasInterruptedNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureSessionInterruptionEndedNotification")
    public static native NSString InterruptionEndedNotification();
    
    @Mapping("canSetSessionPreset:")
    public native boolean canSetSessionPreset(String preset);
    @Mapping("canAddInput:")
    public native boolean canAddInput(AVCaptureInput input);
    @Mapping("addInput:")
    public native void addInput(AVCaptureInput input);
    @Mapping("removeInput:")
    public native void removeInput(AVCaptureInput input);
    @Mapping("canAddOutput:")
    public native boolean canAddOutput(AVCaptureOutput output);
    @Mapping("addOutput:")
    public native void addOutput(AVCaptureOutput output);
    @Mapping("removeOutput:")
    public native void removeOutput(AVCaptureOutput output);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("addInputWithNoConnections:")
    public native void addInputWithNoConnections(AVCaptureInput input);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("addOutputWithNoConnections:")
    public native void addOutputWithNoConnections(AVCaptureOutput output);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("canAddConnection:")
    public native boolean canAddConnection(AVCaptureConnection connection);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("addConnection:")
    public native void addConnection(AVCaptureConnection connection);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("removeConnection:")
    public native void removeConnection(AVCaptureConnection connection);
    @Mapping("beginConfiguration")
    public native void beginConfiguration();
    @Mapping("commitConfiguration")
    public native void commitConfiguration();
    @Mapping("startRunning")
    public native void startRunning();
    @Mapping("stopRunning")
    public native void stopRunning();
    
}
