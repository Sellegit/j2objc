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
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMovieErrorLog")
public class MPMovieErrorLog 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public MPMovieErrorLog() { }

    
    @Mapping("extendedLogData")
    public native NSData getExtendedLogData();
    @Mapping("extendedLogDataStringEncoding")
    public native @Representing("NSStringEncoding") long getExtendedLogDataStringEncoding();
    @Mapping("events")
    public native NSArray<MPMovieErrorLogEvent> getEvents();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
