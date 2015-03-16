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
public class NSURLFileSystemProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLNameKey")
    protected static native NSString NameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLocalizedNameKey")
    protected static native NSString LocalizedNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsRegularFileKey")
    protected static native NSString IsRegularFileValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsDirectoryKey")
    protected static native NSString IsDirectoryValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsSymbolicLinkKey")
    protected static native NSString IsSymbolicLinkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsVolumeKey")
    protected static native NSString IsVolumeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsPackageKey")
    protected static native NSString IsPackageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsSystemImmutableKey")
    protected static native NSString IsSystemImmutableValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsUserImmutableKey")
    protected static native NSString IsUserImmutableValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsHiddenKey")
    protected static native NSString IsHiddenValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLHasHiddenExtensionKey")
    protected static native NSString HasHiddenExtensionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLCreationDateKey")
    protected static native NSString CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLContentAccessDateKey")
    protected static native NSString ContentAccessDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLContentModificationDateKey")
    protected static native NSString ContentModificationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLAttributeModificationDateKey")
    protected static native NSString AttributeModificationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLinkCountKey")
    protected static native NSString LinkCountValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLParentDirectoryURLKey")
    protected static native NSString ParentDirectoryURLValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLTypeIdentifierKey")
    protected static native NSString TypeIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLocalizedTypeDescriptionKey")
    protected static native NSString LocalizedTypeDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLabelNumberKey")
    protected static native NSString LabelNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLabelColorKey")
    protected static native NSString LabelColorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLocalizedLabelKey")
    protected static native NSString LocalizedLabelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLEffectiveIconKey")
    protected static native NSString EffectiveIconValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLCustomIconKey")
    protected static native NSString CustomIconValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceIdentifierKey")
    protected static native NSString FileResourceIdentifierValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLPreferredIOBlockSizeKey")
    protected static native NSString PreferredIOBlockSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsReadableKey")
    protected static native NSString IsReadableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsWritableKey")
    protected static native NSString IsWritableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsExecutableKey")
    protected static native NSString IsExecutableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileSecurityKey")
    protected static native NSString FileSecurityValue();
    /**
     * @since Available in iOS 5.1 and later.
     */
    @GlobalConstant("NSURLIsExcludedFromBackupKey")
    protected static native NSString IsExcludedFromBackupValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSURLPathKey")
    protected static native NSString PathValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsMountTriggerKey")
    protected static native NSString IsMountTriggerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLGenerationIdentifierKey")
    protected static native NSString GenerationIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLDocumentIdentifierKey")
    protected static native NSString DocumentIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLAddedToDirectoryDateKey")
    protected static native NSString AddedToDirectoryDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLThumbnailDictionaryKey")
    protected static native NSString ThumbnailDictionaryValue();
    
}
