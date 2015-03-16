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
public class NSURLUbiquitousItemProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsUbiquitousItemKey")
    protected static native NSString IsUbiquitousItemValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemHasUnresolvedConflictsKey")
    protected static native NSString HasUnresolvedConflictsValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("NSURLUbiquitousItemIsDownloadedKey")
    protected static native NSString IsDownloadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemIsDownloadingKey")
    protected static native NSString IsDownloadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemIsUploadedKey")
    protected static native NSString IsUploadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemIsUploadingKey")
    protected static native NSString IsUploadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("NSURLUbiquitousItemPercentDownloadedKey")
    protected static native NSString PercentDownloadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("NSURLUbiquitousItemPercentUploadedKey")
    protected static native NSString PercentUploadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemDownloadingStatusKey")
    protected static native NSString DownloadingStatusValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemDownloadingErrorKey")
    protected static native NSString DownloadingErrorValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemUploadingErrorKey")
    protected static native NSString UploadingErrorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemDownloadRequestedKey")
    protected static native NSString DownloadRequestedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemContainerDisplayNameKey")
    protected static native NSString ContainerDisplayNameValue();
    
}
