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
 * @since Available in iOS 6.0 and later.
 */

@Library("AVFoundation") @Mapping("AVAudioSessionDataSourceDescription")
public class AVAudioSessionDataSourceDescription 
    extends NSObject 
     {

    
    
    public AVAudioSessionDataSourceDescription() {}
    
    
    @Mapping("dataSourceID")
    public native NSNumber getDataSourceID();
    @Mapping("dataSourceName")
    public native String getDataSourceName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("location")
    public native AVAudioSessionLocation getLocation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("orientation")
    public native AVAudioSessionOrientation getOrientation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("supportedPolarPatterns")
    public native List<AVAudioSessionPolarPattern> getSupportedPolarPatterns();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("selectedPolarPattern")
    public native AVAudioSessionPolarPattern getSelectedPolarPattern();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredPolarPattern")
    public native AVAudioSessionPolarPattern getPreferredPolarPattern();
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPreferredPolarPattern:error:")
    public native boolean setPreferredPolarPattern(AVAudioSessionPolarPattern pattern, Todo outError);
    
}
