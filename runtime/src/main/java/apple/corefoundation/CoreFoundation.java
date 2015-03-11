package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation")
public class CoreFoundation 
    extends Object 
     {

    
    public static final float StringEncodingInvalidId = 0xffffffff;
    
    
    
    
    
    @GlobalConstant("kCFStringTransformStripCombiningMarks")
    public static native String StringTransformStripCombiningMarks();
    @GlobalConstant("kCFStringTransformToLatin")
    public static native String StringTransformToLatin();
    @GlobalConstant("kCFStringTransformFullwidthHalfwidth")
    public static native String StringTransformFullwidthHalfwidth();
    @GlobalConstant("kCFStringTransformLatinKatakana")
    public static native String StringTransformLatinKatakana();
    @GlobalConstant("kCFStringTransformLatinHiragana")
    public static native String StringTransformLatinHiragana();
    @GlobalConstant("kCFStringTransformHiraganaKatakana")
    public static native String StringTransformHiraganaKatakana();
    @GlobalConstant("kCFStringTransformMandarinLatin")
    public static native String StringTransformMandarinLatin();
    @GlobalConstant("kCFStringTransformLatinHangul")
    public static native String StringTransformLatinHangul();
    @GlobalConstant("kCFStringTransformLatinArabic")
    public static native String StringTransformLatinArabic();
    @GlobalConstant("kCFStringTransformLatinHebrew")
    public static native String StringTransformLatinHebrew();
    @GlobalConstant("kCFStringTransformLatinThai")
    public static native String StringTransformLatinThai();
    @GlobalConstant("kCFStringTransformLatinCyrillic")
    public static native String StringTransformLatinCyrillic();
    @GlobalConstant("kCFStringTransformLatinGreek")
    public static native String StringTransformLatinGreek();
    @GlobalConstant("kCFStringTransformToXMLHex")
    public static native String StringTransformToXMLHex();
    @GlobalConstant("kCFStringTransformToUnicodeName")
    public static native String StringTransformToUnicodeName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStringTransformStripDiacritics")
    public static native String StringTransformStripDiacritics();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLKeysOfUnsetValuesKey")
    public static native String URLKeysOfUnsetValuesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLNameKey")
    public static native String URLNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLocalizedNameKey")
    public static native String URLLocalizedNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsRegularFileKey")
    public static native String URLIsRegularFileKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsDirectoryKey")
    public static native String URLIsDirectoryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsSymbolicLinkKey")
    public static native String URLIsSymbolicLinkKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsVolumeKey")
    public static native String URLIsVolumeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsPackageKey")
    public static native String URLIsPackageKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsSystemImmutableKey")
    public static native String URLIsSystemImmutableKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsUserImmutableKey")
    public static native String URLIsUserImmutableKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsHiddenKey")
    public static native String URLIsHiddenKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLHasHiddenExtensionKey")
    public static native String URLHasHiddenExtensionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLCreationDateKey")
    public static native String URLCreationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLContentAccessDateKey")
    public static native String URLContentAccessDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLContentModificationDateKey")
    public static native String URLContentModificationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLAttributeModificationDateKey")
    public static native String URLAttributeModificationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLinkCountKey")
    public static native String URLLinkCountKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLParentDirectoryURLKey")
    public static native String URLParentDirectoryURLKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeURLKey")
    public static native String URLVolumeURLKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLTypeIdentifierKey")
    public static native String URLTypeIdentifierKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLocalizedTypeDescriptionKey")
    public static native String URLLocalizedTypeDescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLabelNumberKey")
    public static native String URLLabelNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLabelColorKey")
    public static native String URLLabelColorKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLocalizedLabelKey")
    public static native String URLLocalizedLabelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLEffectiveIconKey")
    public static native String URLEffectiveIconKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLCustomIconKey")
    public static native String URLCustomIconKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceIdentifierKey")
    public static native String URLFileResourceIdentifierKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIdentifierKey")
    public static native String URLVolumeIdentifierKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLPreferredIOBlockSizeKey")
    public static native String URLPreferredIOBlockSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsReadableKey")
    public static native String URLIsReadableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsWritableKey")
    public static native String URLIsWritableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsExecutableKey")
    public static native String URLIsExecutableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileSecurityKey")
    public static native String URLFileSecurityKey();
    /**
     * @since Available in iOS 5.1 and later.
     */
    @GlobalConstant("kCFURLIsExcludedFromBackupKey")
    public static native String URLIsExcludedFromBackupKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCFURLPathKey")
    public static native String URLPathKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsMountTriggerKey")
    public static native String URLIsMountTriggerKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFURLGenerationIdentifierKey")
    public static native String URLGenerationIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFURLDocumentIdentifierKey")
    public static native String URLDocumentIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFURLAddedToDirectoryDateKey")
    public static native String URLAddedToDirectoryDateKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeKey")
    public static native String URLFileResourceTypeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeNamedPipe")
    public static native String URLFileResourceTypeNamedPipe();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeCharacterSpecial")
    public static native String URLFileResourceTypeCharacterSpecial();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeDirectory")
    public static native String URLFileResourceTypeDirectory();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeBlockSpecial")
    public static native String URLFileResourceTypeBlockSpecial();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeRegular")
    public static native String URLFileResourceTypeRegular();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeSymbolicLink")
    public static native String URLFileResourceTypeSymbolicLink();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeSocket")
    public static native String URLFileResourceTypeSocket();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeUnknown")
    public static native String URLFileResourceTypeUnknown();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLFileSizeKey")
    public static native String URLFileSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLFileAllocatedSizeKey")
    public static native String URLFileAllocatedSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLTotalFileSizeKey")
    public static native String URLTotalFileSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLTotalFileAllocatedSizeKey")
    public static native String URLTotalFileAllocatedSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsAliasFileKey")
    public static native String URLIsAliasFileKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeLocalizedFormatDescriptionKey")
    public static native String URLVolumeLocalizedFormatDescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeTotalCapacityKey")
    public static native String URLVolumeTotalCapacityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeAvailableCapacityKey")
    public static native String URLVolumeAvailableCapacityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeResourceCountKey")
    public static native String URLVolumeResourceCountKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsPersistentIDsKey")
    public static native String URLVolumeSupportsPersistentIDsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsSymbolicLinksKey")
    public static native String URLVolumeSupportsSymbolicLinksKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsHardLinksKey")
    public static native String URLVolumeSupportsHardLinksKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsJournalingKey")
    public static native String URLVolumeSupportsJournalingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsJournalingKey")
    public static native String URLVolumeIsJournalingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsSparseFilesKey")
    public static native String URLVolumeSupportsSparseFilesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsZeroRunsKey")
    public static native String URLVolumeSupportsZeroRunsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsCaseSensitiveNamesKey")
    public static native String URLVolumeSupportsCaseSensitiveNamesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsCasePreservedNamesKey")
    public static native String URLVolumeSupportsCasePreservedNamesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsRootDirectoryDatesKey")
    public static native String URLVolumeSupportsRootDirectoryDatesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsVolumeSizesKey")
    public static native String URLVolumeSupportsVolumeSizesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsRenamingKey")
    public static native String URLVolumeSupportsRenamingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsAdvisoryFileLockingKey")
    public static native String URLVolumeSupportsAdvisoryFileLockingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsExtendedSecurityKey")
    public static native String URLVolumeSupportsExtendedSecurityKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsBrowsableKey")
    public static native String URLVolumeIsBrowsableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeMaximumFileSizeKey")
    public static native String URLVolumeMaximumFileSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsEjectableKey")
    public static native String URLVolumeIsEjectableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsRemovableKey")
    public static native String URLVolumeIsRemovableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsInternalKey")
    public static native String URLVolumeIsInternalKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsAutomountedKey")
    public static native String URLVolumeIsAutomountedKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsLocalKey")
    public static native String URLVolumeIsLocalKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsReadOnlyKey")
    public static native String URLVolumeIsReadOnlyKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeCreationDateKey")
    public static native String URLVolumeCreationDateKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeURLForRemountingKey")
    public static native String URLVolumeURLForRemountingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeUUIDStringKey")
    public static native String URLVolumeUUIDStringKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeNameKey")
    public static native String URLVolumeNameKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeLocalizedNameKey")
    public static native String URLVolumeLocalizedNameKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsUbiquitousItemKey")
    public static native String URLIsUbiquitousItemKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemHasUnresolvedConflictsKey")
    public static native String URLUbiquitousItemHasUnresolvedConflictsKey();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLUbiquitousItemIsDownloadedKey")
    public static native String URLUbiquitousItemIsDownloadedKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemIsDownloadingKey")
    public static native String URLUbiquitousItemIsDownloadingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemIsUploadedKey")
    public static native String URLUbiquitousItemIsUploadedKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemIsUploadingKey")
    public static native String URLUbiquitousItemIsUploadingKey();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLUbiquitousItemPercentDownloadedKey")
    public static native String URLUbiquitousItemPercentDownloadedKey();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLUbiquitousItemPercentUploadedKey")
    public static native String URLUbiquitousItemPercentUploadedKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusKey")
    public static native String URLUbiquitousItemDownloadingStatusKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingErrorKey")
    public static native String URLUbiquitousItemDownloadingErrorKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemUploadingErrorKey")
    public static native String URLUbiquitousItemUploadingErrorKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusNotDownloaded")
    public static native String URLUbiquitousItemDownloadingStatusNotDownloaded();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusDownloaded")
    public static native String URLUbiquitousItemDownloadingStatusDownloaded();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusCurrent")
    public static native String URLUbiquitousItemDownloadingStatusCurrent();
    @GlobalConstant("kCFSocketCommandKey")
    public static native String Values_kCFSocketCommandKey();
    @GlobalConstant("kCFSocketNameKey")
    public static native String Values_kCFSocketNameKey();
    @GlobalConstant("kCFSocketValueKey")
    public static native String Values_kCFSocketValueKey();
    @GlobalConstant("kCFSocketResultKey")
    public static native String Values_kCFSocketResultKey();
    @GlobalConstant("kCFSocketErrorKey")
    public static native String Values_kCFSocketErrorKey();
    @GlobalConstant("kCFSocketRegisterCommand")
    public static native String SocketRegisterCommand();
    @GlobalConstant("kCFSocketRetrieveCommand")
    public static native String SocketRetrieveCommand();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileExists")
    public static native String URLFileExists();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileDirectoryContents")
    public static native String URLFileDirectoryContents();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileLength")
    public static native String URLFileLength();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileLastModificationTime")
    public static native String URLFileLastModificationTime();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFilePOSIXMode")
    public static native String URLFilePOSIXMode();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileOwnerID")
    public static native String URLFileOwnerID();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLHTTPStatusCode")
    public static native String URLHTTPStatusCode();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLHTTPStatusLine")
    public static native String URLHTTPStatusLine();
    @GlobalConstant("kCFBundleInfoDictionaryVersionKey")
    public static native String Values_kCFBundleInfoDictionaryVersionKey();
    @GlobalConstant("kCFBundleExecutableKey")
    public static native String Values_kCFBundleExecutableKey();
    @GlobalConstant("kCFBundleIdentifierKey")
    public static native String Values_kCFBundleIdentifierKey();
    @GlobalConstant("kCFBundleVersionKey")
    public static native String Values_kCFBundleVersionKey();
    @GlobalConstant("kCFBundleDevelopmentRegionKey")
    public static native String Values_kCFBundleDevelopmentRegionKey();
    @GlobalConstant("kCFBundleNameKey")
    public static native String Values_kCFBundleNameKey();
    @GlobalConstant("kCFBundleLocalizationsKey")
    public static native String Values_kCFBundleLocalizationsKey();
    
}
