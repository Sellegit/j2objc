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





@Library("AVFoundation") @Mapping("AVCaptureFileOutputRecordingDelegate")
public interface AVCaptureFileOutputRecordingDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:")
    void didStartRecording(AVCaptureFileOutput captureOutput, NSURL fileURL, NSArray<?> connections);
    @Mapping("captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:")
    void didFinishRecording(AVCaptureFileOutput captureOutput, NSURL outputFileURL, NSArray<?> connections, NSError error);
    
    /*<adapter>*/
    /*</adapter>*/
}
