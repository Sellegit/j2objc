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

@Library("AVFoundation") @Mapping("AVCaptureMovieFileOutput")
public class AVCaptureMovieFileOutput 
    extends AVCaptureFileOutput 
     {

    
    
    public AVCaptureMovieFileOutput() {}
    
    
    @Mapping("movieFragmentInterval")
    public native CMTime getMovieFragmentInterval();
    public native void setMovieFragmentInterval(CMTime v);
    @Mapping("metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    public native void setMetadata(NSArray<AVMetadataItem> v);
    
    
    
    
    
}
