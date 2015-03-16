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





@Library("Foundation/Foundation.h") @Mapping("NSFilePresenter")
public interface NSFilePresenter 
    extends NSObjectProtocol {

    
    
    @Mapping("presentedItemURL")
    NSURL getPresentedItemURL();
    @Mapping("presentedItemOperationQueue")
    NSOperationQueue getPresentedItemOperationQueue();
    
    
    @Mapping("relinquishPresentedItemToReader:")
    void relinquishPresentedItemToReader(@Block("(@Block)") VoidBlock1<Runnable> reader);
    @Mapping("relinquishPresentedItemToWriter:")
    void relinquishPresentedItemToWriter(@Block("(@Block)") VoidBlock1<Runnable> writer);
    @Mapping("savePresentedItemChangesWithCompletionHandler:")
    void savePresentedItemChanges(@Block VoidBlock1<NSError> completionHandler);
    @Mapping("accommodatePresentedItemDeletionWithCompletionHandler:")
    void accommodatePresentedItemDeletion(@Block VoidBlock1<NSError> completionHandler);
    @Mapping("presentedItemDidMoveToURL:")
    void presentedItemDidMoveToURL(NSURL newURL);
    @Mapping("presentedItemDidChange")
    void presentedItemDidChange();
    @Mapping("presentedItemDidGainVersion:")
    void presentedItemDidGainVersion(NSFileVersion version);
    @Mapping("presentedItemDidLoseVersion:")
    void presentedItemDidLoseVersion(NSFileVersion version);
    @Mapping("presentedItemDidResolveConflictVersion:")
    void presentedItemDidResolveConflictVersion(NSFileVersion version);
    @Mapping("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    void accommodatePresentedSubitemDeletionAtURL(NSURL url, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("presentedSubitemDidAppearAtURL:")
    void presentedSubitemDidAppearAtURL(NSURL url);
    @Mapping("presentedSubitemAtURL:didMoveToURL:")
    void presentedSubitemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL);
    @Mapping("presentedSubitemDidChangeAtURL:")
    void presentedSubitemDidChangeAtURL(NSURL url);
    @Mapping("presentedSubitemAtURL:didGainVersion:")
    void presentedSubitemAtURLDidGainVersion(NSURL url, NSFileVersion version);
    @Mapping("presentedSubitemAtURL:didLoseVersion:")
    void presentedSubitemAtURLDidLoseVersion(NSURL url, NSFileVersion version);
    @Mapping("presentedSubitemAtURL:didResolveConflictVersion:")
    void presentedSubitemAtURLDidResolveConflictVersion(NSURL url, NSFileVersion version);
    
    /*<adapter>*/
    /*</adapter>*/
}
