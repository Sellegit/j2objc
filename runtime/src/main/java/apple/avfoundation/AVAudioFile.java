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
 * @since Available in iOS 8.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioFile")
public class AVAudioFile 
    extends NSObject 
     {

    
    
    public AVAudioFile() {}
    
    
    @Mapping("url")
    public native NSURL getUrl();
    @Mapping("fileFormat")
    public native AVAudioFormat getFileFormat();
    @Mapping("processingFormat")
    public native AVAudioFormat getProcessingFormat();
    @Mapping("length")
    public native long getLength();
    @Mapping("framePosition")
    public native long getFramePosition();
    @Mapping("setFramePosition:")
    public native void setFramePosition(long v);
    
    
    
    
    
}
