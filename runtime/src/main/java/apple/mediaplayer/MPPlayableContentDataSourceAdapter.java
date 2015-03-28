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
@Adapter
public abstract class MPPlayableContentDataSourceAdapter 
    extends Object 
    implements MPPlayableContentDataSource {

    
    
    


    
    
    @NotImplemented("beginLoadingChildItemsAtIndexPath:completionHandler:")
    public void beginLoadingChildItems(NSIndexPath indexPath, @Block VoidBlock1<NSError> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("childItemsDisplayPlaybackProgressAtIndexPath:")
    public boolean childItemsDisplayPlaybackProgress(NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("numberOfChildItemsAtIndexPath:")
    public @MachineSizedSInt long getNumberOfChildItems(NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("contentItemAtIndexPath:")
    public MPContentItem getContentItem(NSIndexPath indexPath) { throw new UnsupportedOperationException(); }

}
