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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSFileCoordinator")
public class NSFileCoordinator 
    extends NSObject 
     {

    
    
    @Mapping("initWithFilePresenter:")
    public NSFileCoordinator(NSFilePresenter filePresenterOrNil) { }
    @Mapping("init")
    public NSFileCoordinator() { }
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("purposeIdentifier")
    public native String getPurposeIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setPurposeIdentifier:")
    public native void setPurposeIdentifier(String v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("coordinateAccessWithIntents:queue:byAccessor:")
    public native void coordinateAccessWithIntents(NSArray<?> intents, NSOperationQueue queue, @Block VoidBlock1<NSError> accessor);
    @Mapping("coordinateReadingItemAtURL:options:error:byAccessor:")
    public native void coordinateReadingItem(NSURL url, @Representing("NSFileCoordinatorReadingOptions") @MachineSizedUInt long options, Todo outError, @Block VoidBlock1<NSURL> reader);
    @Mapping("coordinateWritingItemAtURL:options:error:byAccessor:")
    public native void coordinateWritingItem(NSURL url, @Representing("NSFileCoordinatorWritingOptions") @MachineSizedUInt long options, Todo outError, @Block VoidBlock1<NSURL> writer);
    @Mapping("coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
    public native void coordinateReadingItem(NSURL readingURL, @Representing("NSFileCoordinatorReadingOptions") @MachineSizedUInt long readingOptions, NSURL writingURL, @Representing("NSFileCoordinatorWritingOptions") @MachineSizedUInt long writingOptions, Todo outError, @Block VoidBlock2<NSURL, NSURL> readerWriter);
    @Mapping("coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
    public native void coordinateWritingItem(NSURL url1, @Representing("NSFileCoordinatorWritingOptions") @MachineSizedUInt long options1, NSURL url2, @Representing("NSFileCoordinatorWritingOptions") @MachineSizedUInt long options2, Todo outError, @Block VoidBlock2<NSURL, NSURL> writer);
    @Mapping("prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:")
    public native void prepareForReadingItems(NSArray<?> readingURLs, @Representing("NSFileCoordinatorReadingOptions") @MachineSizedUInt long readingOptions, NSArray<?> writingURLs, @Representing("NSFileCoordinatorWritingOptions") @MachineSizedUInt long writingOptions, Todo outError, @Block("(@Block)") VoidBlock1<Runnable> batchAccessor);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("itemAtURL:willMoveToURL:")
    public native void itemAtURLWillMoveToURL(NSURL oldURL, NSURL newURL);
    @Mapping("itemAtURL:didMoveToURL:")
    public native void itemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL);
    @Mapping("cancel")
    public native void cancel();
    @Mapping("addFilePresenter:")
    public static native void addFilePresenter(NSFilePresenter filePresenter);
    @Mapping("removeFilePresenter:")
    public static native void removeFilePresenter(NSFilePresenter filePresenter);
    @Mapping("filePresenters")
    public static native List<NSFilePresenter> getFilePresenters();
    
}
