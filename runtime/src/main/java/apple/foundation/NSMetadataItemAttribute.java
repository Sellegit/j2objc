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
    protected static native NSString FSNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemDisplayNameKey")
    protected static native NSString DisplayNameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemURLKey")
    protected static native NSString URLValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemPathKey")
    protected static native NSString PathValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemFSSizeKey")
    protected static native NSString FSSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemFSCreationDateKey")
    protected static native NSString FSCreationDateValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemFSContentChangeDateKey")
    protected static native NSString FSContentChangeDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataItemContentTypeKey")
    protected static native NSString ContentTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataItemContentTypeTreeKey")
    protected static native NSString ContentTypeTreeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataItemIsUbiquitousKey")
    protected static native NSString IsUbiquitousValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemHasUnresolvedConflictsKey")
    protected static native NSString HasUnresolvedConflictsValue();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("NSMetadataUbiquitousItemIsDownloadedKey")
    protected static native NSString IsDownloadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadingStatusKey")
    protected static native NSString DownloadingStatusValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsDownloadingKey")
    protected static native NSString IsDownloadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsUploadedKey")
    protected static native NSString IsUploadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsUploadingKey")
    protected static native NSString IsUploadingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemPercentDownloadedKey")
    protected static native NSString PercentDownloadedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemPercentUploadedKey")
    protected static native NSString PercentUploadedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadingErrorKey")
    protected static native NSString DownloadingErrorValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemUploadingErrorKey")
    protected static native NSString UploadingErrorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemDownloadRequestedKey")
    protected static native NSString DownloadRequestedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemIsExternalDocumentKey")
    protected static native NSString IsExternalDocumentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemContainerDisplayNameKey")
    protected static native NSString ContainerDisplayNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSMetadataUbiquitousItemURLInLocalContainerKey")
    protected static native NSString URLInLocalContainerValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSMetadataQueryResultContentRelevanceAttribute")
    protected static native NSString ContentRelevanceValue();
    
}
