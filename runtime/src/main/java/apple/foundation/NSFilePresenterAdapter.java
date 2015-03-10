package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class NSFilePresenterAdapter 
    extends Object 
    implements NSFilePresenter {

    
    
    
    @NotImplemented("presentedItemURL")
    public NSURL getPresentedItemURL() { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedItemOperationQueue")
    public NSOperationQueue getPresentedItemOperationQueue() { throw new UnsupportedOperationException(); }
    @NotImplemented("primaryPresentedItemURL")
    public NSURL getPrimaryPresentedItemURL() { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("relinquishPresentedItemToReader:")
    public void relinquishPresentedItemToReader(@Block("(@Block)") VoidBlock1<Runnable> reader) { throw new UnsupportedOperationException(); }
    @NotImplemented("relinquishPresentedItemToWriter:")
    public void relinquishPresentedItemToWriter(@Block("(@Block)") VoidBlock1<Runnable> writer) { throw new UnsupportedOperationException(); }
    @NotImplemented("savePresentedItemChangesWithCompletionHandler:")
    public void savePresentedItemChanges(@Block VoidBlock1<NSError> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("accommodatePresentedItemDeletionWithCompletionHandler:")
    public void accommodatePresentedItemDeletion(@Block VoidBlock1<NSError> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedItemDidMoveToURL:")
    public void presentedItemDidMoveToURL(NSURL newURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedItemDidChange")
    public void presentedItemDidChange() { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedItemDidGainVersion:")
    public void presentedItemDidGainVersion(NSFileVersion version) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedItemDidLoseVersion:")
    public void presentedItemDidLoseVersion(NSFileVersion version) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedItemDidResolveConflictVersion:")
    public void presentedItemDidResolveConflictVersion(NSFileVersion version) { throw new UnsupportedOperationException(); }
    @NotImplemented("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    public void accommodatePresentedSubitemDeletionAtURL(NSURL url, @Block VoidBlock1<NSError> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedSubitemDidAppearAtURL:")
    public void presentedSubitemDidAppearAtURL(NSURL url) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedSubitemAtURL:didMoveToURL:")
    public void presentedSubitemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedSubitemDidChangeAtURL:")
    public void presentedSubitemDidChangeAtURL(NSURL url) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedSubitemAtURL:didGainVersion:")
    public void presentedSubitemAtURLDidGainVersion(NSURL url, NSFileVersion version) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedSubitemAtURL:didLoseVersion:")
    public void presentedSubitemAtURLDidLoseVersion(NSURL url, NSFileVersion version) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentedSubitemAtURL:didResolveConflictVersion:")
    public void presentedSubitemAtURLDidResolveConflictVersion(NSURL url, NSFileVersion version) { throw new UnsupportedOperationException(); }
    
}
