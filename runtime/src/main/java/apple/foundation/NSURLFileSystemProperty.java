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
    public static native NSString NameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLocalizedNameKey")
    public static native NSString LocalizedNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsRegularFileKey")
    public static native NSString IsRegularFileValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsDirectoryKey")
    public static native NSString IsDirectoryValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsSymbolicLinkKey")
    public static native NSString IsSymbolicLinkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsVolumeKey")
    public static native NSString IsVolumeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsPackageKey")
    public static native NSString IsPackageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsSystemImmutableKey")
    public static native NSString IsSystemImmutableValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsUserImmutableKey")
    public static native NSString IsUserImmutableValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLIsHiddenKey")
    public static native NSString IsHiddenValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLHasHiddenExtensionKey")
    public static native NSString HasHiddenExtensionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLCreationDateKey")
    public static native NSString CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLContentAccessDateKey")
    public static native NSString ContentAccessDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLContentModificationDateKey")
    public static native NSString ContentModificationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLAttributeModificationDateKey")
    public static native NSString AttributeModificationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLinkCountKey")
    public static native NSString LinkCountValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLParentDirectoryURLKey")
    public static native NSString ParentDirectoryURLValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLTypeIdentifierKey")
    public static native NSString TypeIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLocalizedTypeDescriptionKey")
    public static native NSString LocalizedTypeDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLabelNumberKey")
    public static native NSString LabelNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLabelColorKey")
    public static native NSString LabelColorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLLocalizedLabelKey")
    public static native NSString LocalizedLabelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLEffectiveIconKey")
    public static native NSString EffectiveIconValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLCustomIconKey")
    public static native NSString CustomIconValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceIdentifierKey")
    public static native NSString FileResourceIdentifierValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLPreferredIOBlockSizeKey")
    public static native NSString PreferredIOBlockSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsReadableKey")
    public static native NSString IsReadableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsWritableKey")
    public static native NSString IsWritableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsExecutableKey")
    public static native NSString IsExecutableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileSecurityKey")
    public static native NSString FileSecurityValue();
    /**
     * @since Available in iOS 5.1 and later.
     */
    @GlobalConstant("NSURLIsExcludedFromBackupKey")
    public static native NSString IsExcludedFromBackupValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSURLPathKey")
    public static native NSString PathValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLIsMountTriggerKey")
    public static native NSString IsMountTriggerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLGenerationIdentifierKey")
    public static native NSString GenerationIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLDocumentIdentifierKey")
    public static native NSString DocumentIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLAddedToDirectoryDateKey")
    public static native NSString AddedToDirectoryDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLThumbnailDictionaryKey")
    public static native NSString ThumbnailDictionaryValue();

}
