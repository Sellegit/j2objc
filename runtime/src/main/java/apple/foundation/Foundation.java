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
@Library("Foundation/Foundation.h")
public class Foundation 
    extends Object 
     {

    
    public static final long PropertyListImmutable = 0L;
    public static final long PropertyListMutableContainers = 1L;
    public static final long PropertyListMutableContainersAndLeaves = 2L;
    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeURLKey")
    public static native NSString VolumeURLValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIdentifierKey")
    public static native NSString VolumeIdentifierValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeKey")
    public static native NSString FileResourceTypeValue();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostWillEnterForegroundNotification")
    public static native String ExtensionHostWillEnterForegroundNotification();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostDidEnterBackgroundNotification")
    public static native String ExtensionHostDidEnterBackgroundNotification();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostWillResignActiveNotification")
    public static native String ExtensionHostWillResignActiveNotification();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("NSExtensionHostDidBecomeActiveNotification")
    public static native String ExtensionHostDidBecomeActiveNotification();
    
}
