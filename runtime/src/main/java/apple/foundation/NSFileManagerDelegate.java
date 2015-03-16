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





@Library("Foundation/Foundation.h") @Mapping("NSFileManagerDelegate")
public interface NSFileManagerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("fileManager:shouldCopyItemAtPath:toPath:")
    boolean shouldCopyItemAtPath(NSFileManager fileManager, String srcPath, String dstPath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldCopyItemAtURL:toURL:")
    boolean shouldCopyItemAtURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL);
    @Mapping("fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:")
    boolean shouldProceedCopyingItemAtPath(NSFileManager fileManager, NSError error, String srcPath, String dstPath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:")
    boolean shouldProceedCopyingItemAtURL(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);
    @Mapping("fileManager:shouldMoveItemAtPath:toPath:")
    boolean shouldMoveItemAtPath(NSFileManager fileManager, String srcPath, String dstPath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldMoveItemAtURL:toURL:")
    boolean shouldMoveItemAtURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL);
    @Mapping("fileManager:shouldProceedAfterError:movingItemAtPath:toPath:")
    boolean shouldProceedMovingItemAtPath(NSFileManager fileManager, NSError error, String srcPath, String dstPath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldProceedAfterError:movingItemAtURL:toURL:")
    boolean shouldProceedMovingItemAtURL(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);
    @Mapping("fileManager:shouldLinkItemAtPath:toPath:")
    boolean shouldLinkItemAtPath(NSFileManager fileManager, String srcPath, String dstPath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldLinkItemAtURL:toURL:")
    boolean shouldLinkItemAtURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL);
    @Mapping("fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:")
    boolean shouldProceedLinkingItemAtPath(NSFileManager fileManager, NSError error, String srcPath, String dstPath);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:")
    boolean shouldProceedLinkingItemAtURL(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);
    @Mapping("fileManager:shouldRemoveItemAtPath:")
    boolean shouldRemoveItemAtPath(NSFileManager fileManager, String path);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldRemoveItemAtURL:")
    boolean shouldRemoveItemAtURL(NSFileManager fileManager, NSURL URL);
    @Mapping("fileManager:shouldProceedAfterError:removingItemAtPath:")
    boolean shouldProceedRemovingItemAtPath(NSFileManager fileManager, NSError error, String path);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileManager:shouldProceedAfterError:removingItemAtURL:")
    boolean shouldProceedRemovingItemAtURL(NSFileManager fileManager, NSError error, NSURL URL);
    
    /*<adapter>*/
    /*</adapter>*/
}
