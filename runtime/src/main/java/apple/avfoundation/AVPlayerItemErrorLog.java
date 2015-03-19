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
 * @since Available in iOS 4.3 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerItemErrorLog")
public class AVPlayerItemErrorLog 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public AVPlayerItemErrorLog() { }
    
    
    @Mapping("extendedLogDataStringEncoding")
    public native @Representing("NSStringEncoding") long getExtendedLogDataStringEncoding();
    @Mapping("events")
    public native NSArray<AVPlayerItemErrorLogEvent> getEvents();
    
    
    
    @Mapping("extendedLogData")
    public native NSData getExtendedLogData();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
