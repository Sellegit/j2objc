package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/**
 * @since Available in iOS 5.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIDocument")
public class UIDocument 
    extends NSObject 
    implements NSFilePresenter {

    
    
    @Mapping("initWithFileURL:")
    public UIDocument(NSURL url) { }
    @Mapping("init")
    public UIDocument() { }

    
    @Mapping("fileURL")
    public native NSURL getFileURL();
    @Mapping("localizedName")
    public native String getLocalizedName();
    @Mapping("fileType")
    public native String getFileType();
    @Mapping("fileModificationDate")
    public native NSDate getFileModificationDate();
    @Mapping("setFileModificationDate:")
    public native void setFileModificationDate(NSDate v);
    @Mapping("documentState")
    public native @Representing("UIDocumentState") long getDocumentState();
    @Mapping("undoManager")
    public native NSUndoManager getUndoManager();
    @Mapping("setUndoManager:")
    public native void setUndoManager(NSUndoManager v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("userActivity")
    public native NSUserActivity getUserActivity();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setUserActivity:")
    public native void setUserActivity(NSUserActivity v);
    @Mapping("presentedItemURL")
    public native NSURL getPresentedItemURL();
    @Mapping("presentedItemOperationQueue")
    public native NSOperationQueue getPresentedItemOperationQueue();

    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIDocumentStateChangedNotification")
    public static native String StateChangedNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSUserActivityDocumentURLKey")
    public static native String UserActivityDocumentURLKey();

    @Mapping("openWithCompletionHandler:")
    public native void open(@Block VoidBooleanBlock completionHandler);
    @Mapping("closeWithCompletionHandler:")
    public native void close(@Block VoidBooleanBlock completionHandler);
    @Mapping("loadFromContents:ofType:error:")
    public native boolean loadFromContents(Object contents, String typeName, Todo outError);
    @Mapping("contentsForType:error:")
    public native Object getContentsForType(String typeName, Todo outError);
    @Mapping("disableEditing")
    public native void disableEditing();
    @Mapping("enableEditing")
    public native void enableEditing();
    @Mapping("hasUnsavedChanges")
    public native boolean hasUnsavedChanges();
    @Mapping("updateChangeCount:")
    public native void updateChangeCount(@Representing("UIDocumentChangeKind") long change);
    @Mapping("changeCountTokenForSaveOperation:")
    public native Object getChangeCountToken(@Representing("UIDocumentSaveOperation") long saveOperation);
    @Mapping("updateChangeCountWithToken:forSaveOperation:")
    public native void updateChangeCount(Object changeCountToken, @Representing("UIDocumentSaveOperation") long saveOperation);
    @Mapping("saveToURL:forSaveOperation:completionHandler:")
    public native void save(NSURL url, @Representing("UIDocumentSaveOperation") long saveOperation, @Block VoidBooleanBlock completionHandler);
    @Mapping("autosaveWithCompletionHandler:")
    public native void autoSave(@Block VoidBooleanBlock completionHandler);
    @Mapping("savingFileType")
    public native String getSavingFileType();
    @Mapping("fileNameExtensionForType:saveOperation:")
    public native String getFileNameExtension(String typeName, @Representing("UIDocumentSaveOperation") long saveOperation);
    @Mapping("writeContents:andAttributes:safelyToURL:forSaveOperation:error:")
    public native boolean writeContents(Object contents, NSDictionary<?, ?> additionalFileAttributes, NSURL url, @Representing("UIDocumentSaveOperation") long saveOperation, Todo outError);
    @Mapping("writeContents:toURL:forSaveOperation:originalContentsURL:error:")
    public native boolean writeContents(Object contents, NSURL url, @Representing("UIDocumentSaveOperation") long saveOperation, NSURL originalContentsURL, Todo outError);
    @Mapping("fileAttributesToWriteToURL:forSaveOperation:error:")
    public native NSDictionary<?, ?> getFileAttributesToWrite(NSURL url, @Representing("UIDocumentSaveOperation") long saveOperation, Todo outError);
    @Mapping("readFromURL:error:")
    public native boolean read(NSURL url, Todo outError);
    @Mapping("performAsynchronousFileAccessUsingBlock:")
    public native void performAsynchronousFileAccess(@Block Runnable block);
    @Mapping("handleError:userInteractionPermitted:")
    public native void handleError(NSError error, boolean userInteractionPermitted);
    @Mapping("finishedHandlingError:recovered:")
    public native void finishedHandlingError(NSError error, boolean recovered);
    @Mapping("userInteractionNoLongerPermittedForError:")
    public native void userInteractionNoLongerPermitted(NSError error);
    @Mapping("revertToContentsOfURL:completionHandler:")
    public native void revert(NSURL url, @Block VoidBooleanBlock completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("updateUserActivityState:")
    public native void updateUserActivityState(NSUserActivity userActivity);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("restoreUserActivityState:")
    public native void restoreUserActivityState(NSUserActivity userActivity);
    @Mapping("relinquishPresentedItemToReader:")
    public native void relinquishPresentedItemToReader(@Block("(@Block)") VoidBlock1<Runnable> reader);
    @Mapping("relinquishPresentedItemToWriter:")
    public native void relinquishPresentedItemToWriter(@Block("(@Block)") VoidBlock1<Runnable> writer);
    @Mapping("savePresentedItemChangesWithCompletionHandler:")
    public native void savePresentedItemChanges(@Block VoidBlock1<NSError> completionHandler);
    @Mapping("accommodatePresentedItemDeletionWithCompletionHandler:")
    public native void accommodatePresentedItemDeletion(@Block VoidBlock1<NSError> completionHandler);
    @Mapping("presentedItemDidMoveToURL:")
    public native void presentedItemDidMoveToURL(NSURL newURL);
    @Mapping("presentedItemDidChange")
    public native void presentedItemDidChange();
    @Mapping("presentedItemDidGainVersion:")
    public native void presentedItemDidGainVersion(NSFileVersion version);
    @Mapping("presentedItemDidLoseVersion:")
    public native void presentedItemDidLoseVersion(NSFileVersion version);
    @Mapping("presentedItemDidResolveConflictVersion:")
    public native void presentedItemDidResolveConflictVersion(NSFileVersion version);
    @Mapping("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    public native void accommodatePresentedSubitemDeletionAtURL(NSURL url, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("presentedSubitemDidAppearAtURL:")
    public native void presentedSubitemDidAppearAtURL(NSURL url);
    @Mapping("presentedSubitemAtURL:didMoveToURL:")
    public native void presentedSubitemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL);
    @Mapping("presentedSubitemDidChangeAtURL:")
    public native void presentedSubitemDidChangeAtURL(NSURL url);
    @Mapping("presentedSubitemAtURL:didGainVersion:")
    public native void presentedSubitemAtURLDidGainVersion(NSURL url, NSFileVersion version);
    @Mapping("presentedSubitemAtURL:didLoseVersion:")
    public native void presentedSubitemAtURLDidLoseVersion(NSURL url, NSFileVersion version);
    @Mapping("presentedSubitemAtURL:didResolveConflictVersion:")
    public native void presentedSubitemAtURLDidResolveConflictVersion(NSURL url, NSFileVersion version);

}
