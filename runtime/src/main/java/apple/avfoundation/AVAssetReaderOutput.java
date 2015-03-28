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
 * @since Available in iOS 4.1 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetReaderOutput")
public class AVAssetReaderOutput 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVAssetReaderOutput() { }

    
    @Mapping("mediaType")
    public native AVMediaType getMediaType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("alwaysCopiesSampleData")
    public native boolean alwaysCopiesSampleData();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAlwaysCopiesSampleData:")
    public native void setAlwaysCopiesSampleData(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("supportsRandomAccess")
    public native boolean supportsRandomAccess();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setSupportsRandomAccess:")
    public native void setSupportsRandomAccess(boolean v);

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("resetForReadingTimeRanges:")
    public native void resetForReadingTimeRanges(NSArray<?> timeRanges);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("markConfigurationAsFinal")
    public native void markConfigurationAsFinal();

}
