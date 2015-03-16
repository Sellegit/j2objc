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
 * @since Available in iOS 7.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetResourceLoadingDataRequest")
public class AVAssetResourceLoadingDataRequest 
    extends NSObject 
     {

    
    
    public AVAssetResourceLoadingDataRequest() {}
    
    
    @Mapping("requestedOffset")
    public native long getRequestedOffset();
    @Mapping("requestedLength")
    public native @MachineSizedSInt long getRequestedLength();
    @Mapping("currentOffset")
    public native long getCurrentOffset();
    
    
    
    @Mapping("respondWithData:")
    public native void respondWithData(NSData data);
    
}
