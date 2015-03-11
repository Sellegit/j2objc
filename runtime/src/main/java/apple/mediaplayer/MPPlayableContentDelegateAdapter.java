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


/*<javadoc>*/
/*</javadoc>*/

public abstract class MPPlayableContentDelegateAdapter 
    extends Object 
    implements MPPlayableContentDelegate {

    
    
    
    
    
    
    
    @NotImplemented("playableContentManager:initiatePlaybackOfContentItemAtIndexPath:completionHandler:")
    public void initiatePlayback(MPPlayableContentManager contentManager, NSIndexPath indexPath, @Block VoidBlock1<NSError> completionHandler) { throw new UnsupportedOperationException(); }
    
}
