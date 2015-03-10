package apple.mediaplayer;


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
import apple.uikit.*;



/**
 * @since Available in iOS 4.3 and later.
 */

@Library("MediaPlayer") @Mapping("MPMovieAccessLog")
public class MPMovieAccessLog 
    extends NSObject 
    implements NSCopying {

    
    
    public MPMovieAccessLog() {}
    
    
    @Mapping("extendedLogData")
    public native NSData getExtendedLogData();
    @Mapping("extendedLogDataStringEncoding")
    public native @Representing("NSStringEncoding") int getExtendedLogDataStringEncoding();
    @Mapping("events")
    public native NSArray<MPMovieAccessLogEvent> getEvents();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
