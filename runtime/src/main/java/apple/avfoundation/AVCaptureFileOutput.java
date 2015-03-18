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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureFileOutput")
public class AVCaptureFileOutput 
    extends AVCaptureOutput 
     {

    
    
    @Mapping("init")
    public AVCaptureFileOutput() { }
    
    
    @Mapping("outputFileURL")
    public native NSURL getOutputFileURL();
    @Mapping("isRecording")
    public native boolean isRecording();
    @Mapping("recordedDuration")
    public native CMTime getRecordedDuration();
    @Mapping("recordedFileSize")
    public native long getRecordedFileSize();
    @Mapping("maxRecordedDuration")
    public native CMTime getMaxRecordedDuration();
    @Mapping("setMaxRecordedDuration:")
    public native void setMaxRecordedDuration(CMTime v);
    @Mapping("maxRecordedFileSize")
    public native long getMaxRecordedFileSize();
    @Mapping("setMaxRecordedFileSize:")
    public native void setMaxRecordedFileSize(long v);
    @Mapping("minFreeDiskSpaceLimit")
    public native long getMinFreeDiskSpaceLimit();
    @Mapping("setMinFreeDiskSpaceLimit:")
    public native void setMinFreeDiskSpaceLimit(long v);
    
    
    
    @Mapping("startRecordingToOutputFileURL:recordingDelegate:")
    public native void startRecording(NSURL outputFileURL, AVCaptureFileOutputRecordingDelegate delegate);
    @Mapping("stopRecording")
    public native void stopRecording();
    
}
