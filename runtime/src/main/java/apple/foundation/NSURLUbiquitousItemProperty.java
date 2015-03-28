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
    public static native NSString IsUbiquitousItemValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemHasUnresolvedConflictsKey")
    public static native NSString HasUnresolvedConflictsValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("NSURLUbiquitousItemIsDownloadedKey")
    public static native NSString IsDownloadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemIsDownloadingKey")
    public static native NSString IsDownloadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemIsUploadedKey")
    public static native NSString IsUploadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemIsUploadingKey")
    public static native NSString IsUploadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("NSURLUbiquitousItemPercentDownloadedKey")
    public static native NSString PercentDownloadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("NSURLUbiquitousItemPercentUploadedKey")
    public static native NSString PercentUploadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemDownloadingStatusKey")
    public static native NSString DownloadingStatusValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemDownloadingErrorKey")
    public static native NSString DownloadingErrorValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemUploadingErrorKey")
    public static native NSString UploadingErrorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemDownloadRequestedKey")
    public static native NSString DownloadRequestedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLUbiquitousItemContainerDisplayNameKey")
    public static native NSString ContainerDisplayNameValue();

}
