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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class AVCaptureFileOutputRecordingDelegateAdapter 
    extends Object 
    implements AVCaptureFileOutputRecordingDelegate {

    
    
    
    
    
    
    
    @NotImplemented("captureOutput:didStartRecordingToOutputFileAtURL:fromConnections:")
    public void didStartRecording(AVCaptureFileOutput captureOutput, NSURL fileURL, NSArray<AVCaptureConnection> connections) { throw new UnsupportedOperationException(); }
    @NotImplemented("captureOutput:didFinishRecordingToOutputFileAtURL:fromConnections:error:")
    public void didFinishRecording(AVCaptureFileOutput captureOutput, NSURL outputFileURL, NSArray<AVCaptureConnection> connections, NSError error) { throw new UnsupportedOperationException(); }
    
}
