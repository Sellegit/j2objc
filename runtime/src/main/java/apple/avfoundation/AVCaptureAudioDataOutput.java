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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureAudioDataOutput")
public class AVCaptureAudioDataOutput 
    extends AVCaptureOutput 
     {

    
    
    public AVCaptureAudioDataOutput() {}
    
    
    @Mapping("sampleBufferDelegate")
    public native AVCaptureAudioDataOutputSampleBufferDelegate getSampleBufferDelegate();
    @Mapping("sampleBufferCallbackQueue")
    public native DispatchQueue getSampleBufferCallbackQueue();
    
    
    
    @Mapping("setSampleBufferDelegate:queue:")
    public native void setSampleBufferDelegate(AVCaptureAudioDataOutputSampleBufferDelegate sampleBufferDelegate, DispatchQueue sampleBufferCallbackQueue);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("recommendedAudioSettingsForAssetWriterWithOutputFileType:")
    public native AVAudioSettings getRecommendedAudioSettings(String outputFileType);
    
}
