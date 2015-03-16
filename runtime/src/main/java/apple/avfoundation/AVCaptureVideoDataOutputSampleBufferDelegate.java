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





@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureVideoDataOutputSampleBufferDelegate")
public interface AVCaptureVideoDataOutputSampleBufferDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("captureOutput:didOutputSampleBuffer:fromConnection:")
    void didOutputSampleBuffer(AVCaptureOutput captureOutput, CMSampleBuffer sampleBuffer, AVCaptureConnection connection);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("captureOutput:didDropSampleBuffer:fromConnection:")
    void didDropSampleBuffer(AVCaptureOutput captureOutput, CMSampleBuffer sampleBuffer, AVCaptureConnection connection);
    
    /*<adapter>*/
    /*</adapter>*/
}
