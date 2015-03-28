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


@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPPlayableContentDelegate")
public interface MPPlayableContentDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("playableContentManager:initiatePlaybackOfContentItemAtIndexPath:completionHandler:")
    void initiatePlayback(MPPlayableContentManager contentManager, NSIndexPath indexPath, @Block VoidBlock1<NSError> completionHandler);

    /*<adapter>*/
    /*</adapter>*/
}
