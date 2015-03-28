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
@Adapter
public abstract class NSFileManagerDelegateAdapter 
    extends Object 
    implements NSFileManagerDelegate {

    
    
    


    
    
    @NotImplemented("fileManager:shouldCopyItemAtPath:toPath:")
    public boolean shouldCopyItemAtPath(NSFileManager fileManager, String srcPath, String dstPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldCopyItemAtURL:toURL:")
    public boolean shouldCopyItemAtURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:")
    public boolean shouldProceedCopyingItemAtPath(NSFileManager fileManager, NSError error, String srcPath, String dstPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:")
    public boolean shouldProceedCopyingItemAtURL(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("fileManager:shouldMoveItemAtPath:toPath:")
    public boolean shouldMoveItemAtPath(NSFileManager fileManager, String srcPath, String dstPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldMoveItemAtURL:toURL:")
    public boolean shouldMoveItemAtURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("fileManager:shouldProceedAfterError:movingItemAtPath:toPath:")
    public boolean shouldProceedMovingItemAtPath(NSFileManager fileManager, NSError error, String srcPath, String dstPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldProceedAfterError:movingItemAtURL:toURL:")
    public boolean shouldProceedMovingItemAtURL(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("fileManager:shouldLinkItemAtPath:toPath:")
    public boolean shouldLinkItemAtPath(NSFileManager fileManager, String srcPath, String dstPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldLinkItemAtURL:toURL:")
    public boolean shouldLinkItemAtURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:")
    public boolean shouldProceedLinkingItemAtPath(NSFileManager fileManager, NSError error, String srcPath, String dstPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:")
    public boolean shouldProceedLinkingItemAtURL(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL) { throw new UnsupportedOperationException(); }
    @NotImplemented("fileManager:shouldRemoveItemAtPath:")
    public boolean shouldRemoveItemAtPath(NSFileManager fileManager, String path) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldRemoveItemAtURL:")
    public boolean shouldRemoveItemAtURL(NSFileManager fileManager, NSURL URL) { throw new UnsupportedOperationException(); }
    @NotImplemented("fileManager:shouldProceedAfterError:removingItemAtPath:")
    public boolean shouldProceedRemovingItemAtPath(NSFileManager fileManager, NSError error, String path) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("fileManager:shouldProceedAfterError:removingItemAtURL:")
    public boolean shouldProceedRemovingItemAtURL(NSFileManager fileManager, NSError error, NSURL URL) { throw new UnsupportedOperationException(); }

}
