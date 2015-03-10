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

public abstract class AVCaptureVideoDataOutputSampleBufferDelegateAdapter 
    extends Object 
    implements AVCaptureVideoDataOutputSampleBufferDelegate {

    
    
    
    
    
    
    
    @NotImplemented("captureOutput:didOutputSampleBuffer:fromConnection:")
    public void didOutputSampleBuffer(AVCaptureOutput captureOutput, CMSampleBuffer sampleBuffer, AVCaptureConnection connection) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("captureOutput:didDropSampleBuffer:fromConnection:")
    public void didDropSampleBuffer(AVCaptureOutput captureOutput, CMSampleBuffer sampleBuffer, AVCaptureConnection connection) { throw new UnsupportedOperationException(); }
    
}
