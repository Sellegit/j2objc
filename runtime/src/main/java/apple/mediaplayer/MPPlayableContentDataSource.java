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





@Library("MediaPlayer") @Mapping("MPPlayableContentDataSource")
public interface MPPlayableContentDataSource 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("beginLoadingChildItemsAtIndexPath:completionHandler:")
    void beginLoadingChildItems(NSIndexPath indexPath, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("childItemsDisplayPlaybackProgressAtIndexPath:")
    boolean childItemsDisplayPlaybackProgress(NSIndexPath indexPath);
    @Mapping("numberOfChildItemsAtIndexPath:")
    @MachineSizedSInt long getNumberOfChildItems(NSIndexPath indexPath);
    @Mapping("contentItemAtIndexPath:")
    MPContentItem getContentItem(NSIndexPath indexPath);
    
    /*<adapter>*/
    /*</adapter>*/
}
