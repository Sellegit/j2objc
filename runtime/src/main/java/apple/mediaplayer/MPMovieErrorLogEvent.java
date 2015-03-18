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

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMovieErrorLogEvent")
public class MPMovieErrorLogEvent 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public MPMovieErrorLogEvent() { }
    
    
    @Mapping("date")
    public native NSDate getDate();
    @Mapping("URI")
    public native String getURI();
    @Mapping("serverAddress")
    public native String getServerAddress();
    @Mapping("playbackSessionID")
    public native String getPlaybackSessionID();
    @Mapping("errorStatusCode")
    public native @MachineSizedSInt long getErrorStatusCode();
    @Mapping("errorDomain")
    public native String getErrorDomain();
    @Mapping("errorComment")
    public native String getErrorComment();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
