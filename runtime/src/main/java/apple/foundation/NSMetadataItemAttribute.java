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
public class NSMetadataItemAttribute 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemFSNameKey")
    public static native NSString FSNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemDisplayNameKey")
    public static native NSString DisplayNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemURLKey")
    public static native NSString URLValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemPathKey")
    public static native NSString PathValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemFSSizeKey")
    public static native NSString FSSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemFSCreationDateKey")
    public static native NSString FSCreationDateValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemFSContentChangeDateKey")
    public static native NSString FSContentChangeDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataItemContentTypeKey")
    public static native NSString ContentTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataItemContentTypeTreeKey")
    public static native NSString ContentTypeTreeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemIsUbiquitousKey")
    public static native NSString IsUbiquitousValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemHasUnresolvedConflictsKey")
    public static native NSString HasUnresolvedConflictsValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("NSMetadataUbiquitousItemIsDownloadedKey")
    public static native NSString IsDownloadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadingStatusKey")
    public static native NSString DownloadingStatusValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsDownloadingKey")
    public static native NSString IsDownloadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsUploadedKey")
    public static native NSString IsUploadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsUploadingKey")
    public static native NSString IsUploadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemPercentDownloadedKey")
    public static native NSString PercentDownloadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemPercentUploadedKey")
    public static native NSString PercentUploadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadingErrorKey")
    public static native NSString DownloadingErrorValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemUploadingErrorKey")
    public static native NSString UploadingErrorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadRequestedKey")
    public static native NSString DownloadRequestedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsExternalDocumentKey")
    public static native NSString IsExternalDocumentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemContainerDisplayNameKey")
    public static native NSString ContainerDisplayNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemURLInLocalContainerKey")
    public static native NSString URLInLocalContainerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataQueryResultContentRelevanceAttribute")
    public static native NSString ContentRelevanceValue();
    
}
