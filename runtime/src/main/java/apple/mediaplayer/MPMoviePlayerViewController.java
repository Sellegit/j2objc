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
 * @since Available in iOS 3.2 and later.
 */

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMoviePlayerViewController")
public class MPMoviePlayerViewController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithContentURL:")
    public MPMoviePlayerViewController(NSURL contentURL) { }
    @Mapping("initWithNibName:bundle:")
    public MPMoviePlayerViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public MPMoviePlayerViewController() { }
    
    
    @Mapping("moviePlayer")
    public native MPMoviePlayerController getMoviePlayer();
    
    
    
    
    
}
