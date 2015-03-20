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
@Library("CoreFoundation/CoreFoundation.h")
public class CoreFoundation 
    extends Object 
     {

    
    public static final float StringEncodingInvalidId = 0xffffffff;
    
    
    
    
    
    @GlobalConstant("kCFStringTransformStripCombiningMarks")
    public static native CFString StringTransformStripCombiningMarks();
    @GlobalConstant("kCFStringTransformToLatin")
    public static native CFString StringTransformToLatin();
    @GlobalConstant("kCFStringTransformFullwidthHalfwidth")
    public static native CFString StringTransformFullwidthHalfwidth();
    @GlobalConstant("kCFStringTransformLatinKatakana")
    public static native CFString StringTransformLatinKatakana();
    @GlobalConstant("kCFStringTransformLatinHiragana")
    public static native CFString StringTransformLatinHiragana();
    @GlobalConstant("kCFStringTransformHiraganaKatakana")
    public static native CFString StringTransformHiraganaKatakana();
    @GlobalConstant("kCFStringTransformMandarinLatin")
    public static native CFString StringTransformMandarinLatin();
    @GlobalConstant("kCFStringTransformLatinHangul")
    public static native CFString StringTransformLatinHangul();
    @GlobalConstant("kCFStringTransformLatinArabic")
    public static native CFString StringTransformLatinArabic();
    @GlobalConstant("kCFStringTransformLatinHebrew")
    public static native CFString StringTransformLatinHebrew();
    @GlobalConstant("kCFStringTransformLatinThai")
    public static native CFString StringTransformLatinThai();
    @GlobalConstant("kCFStringTransformLatinCyrillic")
    public static native CFString StringTransformLatinCyrillic();
    @GlobalConstant("kCFStringTransformLatinGreek")
    public static native CFString StringTransformLatinGreek();
    @GlobalConstant("kCFStringTransformToXMLHex")
    public static native CFString StringTransformToXMLHex();
    @GlobalConstant("kCFStringTransformToUnicodeName")
    public static native CFString StringTransformToUnicodeName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStringTransformStripDiacritics")
    public static native CFString StringTransformStripDiacritics();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLKeysOfUnsetValuesKey")
    public static native CFString URLKeysOfUnsetValuesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLNameKey")
    public static native CFString URLNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLocalizedNameKey")
    public static native CFString URLLocalizedNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsRegularFileKey")
    public static native CFString URLIsRegularFileKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsDirectoryKey")
    public static native CFString URLIsDirectoryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsSymbolicLinkKey")
    public static native CFString URLIsSymbolicLinkKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsVolumeKey")
    public static native CFString URLIsVolumeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsPackageKey")
    public static native CFString URLIsPackageKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsSystemImmutableKey")
    public static native CFString URLIsSystemImmutableKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsUserImmutableKey")
    public static native CFString URLIsUserImmutableKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsHiddenKey")
    public static native CFString URLIsHiddenKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLHasHiddenExtensionKey")
    public static native CFString URLHasHiddenExtensionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLCreationDateKey")
    public static native CFString URLCreationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLContentAccessDateKey")
    public static native CFString URLContentAccessDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLContentModificationDateKey")
    public static native CFString URLContentModificationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLAttributeModificationDateKey")
    public static native CFString URLAttributeModificationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLinkCountKey")
    public static native CFString URLLinkCountKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLParentDirectoryURLKey")
    public static native CFString URLParentDirectoryURLKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeURLKey")
    public static native CFString URLVolumeURLKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLTypeIdentifierKey")
    public static native CFString URLTypeIdentifierKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLocalizedTypeDescriptionKey")
    public static native CFString URLLocalizedTypeDescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLabelNumberKey")
    public static native CFString URLLabelNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLabelColorKey")
    public static native CFString URLLabelColorKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLLocalizedLabelKey")
    public static native CFString URLLocalizedLabelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLEffectiveIconKey")
    public static native CFString URLEffectiveIconKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLCustomIconKey")
    public static native CFString URLCustomIconKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceIdentifierKey")
    public static native CFString URLFileResourceIdentifierKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIdentifierKey")
    public static native CFString URLVolumeIdentifierKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLPreferredIOBlockSizeKey")
    public static native CFString URLPreferredIOBlockSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsReadableKey")
    public static native CFString URLIsReadableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsWritableKey")
    public static native CFString URLIsWritableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsExecutableKey")
    public static native CFString URLIsExecutableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileSecurityKey")
    public static native CFString URLFileSecurityKey();
    /**
     * @since Available in iOS 5.1 and later.
     */
    @GlobalConstant("kCFURLIsExcludedFromBackupKey")
    public static native CFString URLIsExcludedFromBackupKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCFURLPathKey")
    public static native CFString URLPathKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsMountTriggerKey")
    public static native CFString URLIsMountTriggerKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFURLGenerationIdentifierKey")
    public static native CFString URLGenerationIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFURLDocumentIdentifierKey")
    public static native CFString URLDocumentIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFURLAddedToDirectoryDateKey")
    public static native CFString URLAddedToDirectoryDateKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeKey")
    public static native CFString URLFileResourceTypeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeNamedPipe")
    public static native CFString URLFileResourceTypeNamedPipe();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeCharacterSpecial")
    public static native CFString URLFileResourceTypeCharacterSpecial();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeDirectory")
    public static native CFString URLFileResourceTypeDirectory();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeBlockSpecial")
    public static native CFString URLFileResourceTypeBlockSpecial();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeRegular")
    public static native CFString URLFileResourceTypeRegular();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeSymbolicLink")
    public static native CFString URLFileResourceTypeSymbolicLink();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeSocket")
    public static native CFString URLFileResourceTypeSocket();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLFileResourceTypeUnknown")
    public static native CFString URLFileResourceTypeUnknown();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLFileSizeKey")
    public static native CFString URLFileSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLFileAllocatedSizeKey")
    public static native CFString URLFileAllocatedSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLTotalFileSizeKey")
    public static native CFString URLTotalFileSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLTotalFileAllocatedSizeKey")
    public static native CFString URLTotalFileAllocatedSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLIsAliasFileKey")
    public static native CFString URLIsAliasFileKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeLocalizedFormatDescriptionKey")
    public static native CFString URLVolumeLocalizedFormatDescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeTotalCapacityKey")
    public static native CFString URLVolumeTotalCapacityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeAvailableCapacityKey")
    public static native CFString URLVolumeAvailableCapacityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeResourceCountKey")
    public static native CFString URLVolumeResourceCountKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsPersistentIDsKey")
    public static native CFString URLVolumeSupportsPersistentIDsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsSymbolicLinksKey")
    public static native CFString URLVolumeSupportsSymbolicLinksKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsHardLinksKey")
    public static native CFString URLVolumeSupportsHardLinksKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsJournalingKey")
    public static native CFString URLVolumeSupportsJournalingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsJournalingKey")
    public static native CFString URLVolumeIsJournalingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsSparseFilesKey")
    public static native CFString URLVolumeSupportsSparseFilesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsZeroRunsKey")
    public static native CFString URLVolumeSupportsZeroRunsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsCaseSensitiveNamesKey")
    public static native CFString URLVolumeSupportsCaseSensitiveNamesKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsCasePreservedNamesKey")
    public static native CFString URLVolumeSupportsCasePreservedNamesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsRootDirectoryDatesKey")
    public static native CFString URLVolumeSupportsRootDirectoryDatesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsVolumeSizesKey")
    public static native CFString URLVolumeSupportsVolumeSizesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsRenamingKey")
    public static native CFString URLVolumeSupportsRenamingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsAdvisoryFileLockingKey")
    public static native CFString URLVolumeSupportsAdvisoryFileLockingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeSupportsExtendedSecurityKey")
    public static native CFString URLVolumeSupportsExtendedSecurityKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsBrowsableKey")
    public static native CFString URLVolumeIsBrowsableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeMaximumFileSizeKey")
    public static native CFString URLVolumeMaximumFileSizeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsEjectableKey")
    public static native CFString URLVolumeIsEjectableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsRemovableKey")
    public static native CFString URLVolumeIsRemovableKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsInternalKey")
    public static native CFString URLVolumeIsInternalKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsAutomountedKey")
    public static native CFString URLVolumeIsAutomountedKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsLocalKey")
    public static native CFString URLVolumeIsLocalKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeIsReadOnlyKey")
    public static native CFString URLVolumeIsReadOnlyKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeCreationDateKey")
    public static native CFString URLVolumeCreationDateKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeURLForRemountingKey")
    public static native CFString URLVolumeURLForRemountingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeUUIDStringKey")
    public static native CFString URLVolumeUUIDStringKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeNameKey")
    public static native CFString URLVolumeNameKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLVolumeLocalizedNameKey")
    public static native CFString URLVolumeLocalizedNameKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLIsUbiquitousItemKey")
    public static native CFString URLIsUbiquitousItemKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemHasUnresolvedConflictsKey")
    public static native CFString URLUbiquitousItemHasUnresolvedConflictsKey();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLUbiquitousItemIsDownloadedKey")
    public static native CFString URLUbiquitousItemIsDownloadedKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemIsDownloadingKey")
    public static native CFString URLUbiquitousItemIsDownloadingKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemIsUploadedKey")
    public static native CFString URLUbiquitousItemIsUploadedKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemIsUploadingKey")
    public static native CFString URLUbiquitousItemIsUploadingKey();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLUbiquitousItemPercentDownloadedKey")
    public static native CFString URLUbiquitousItemPercentDownloadedKey();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLUbiquitousItemPercentUploadedKey")
    public static native CFString URLUbiquitousItemPercentUploadedKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusKey")
    public static native CFString URLUbiquitousItemDownloadingStatusKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingErrorKey")
    public static native CFString URLUbiquitousItemDownloadingErrorKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemUploadingErrorKey")
    public static native CFString URLUbiquitousItemUploadingErrorKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusNotDownloaded")
    public static native CFString URLUbiquitousItemDownloadingStatusNotDownloaded();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusDownloaded")
    public static native CFString URLUbiquitousItemDownloadingStatusDownloaded();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFURLUbiquitousItemDownloadingStatusCurrent")
    public static native CFString URLUbiquitousItemDownloadingStatusCurrent();
    @GlobalConstant("kCFSocketCommandKey")
    public static native CFString Values_kCFSocketCommandKey();
    @GlobalConstant("kCFSocketNameKey")
    public static native CFString Values_kCFSocketNameKey();
    @GlobalConstant("kCFSocketValueKey")
    public static native CFString Values_kCFSocketValueKey();
    @GlobalConstant("kCFSocketResultKey")
    public static native CFString Values_kCFSocketResultKey();
    @GlobalConstant("kCFSocketErrorKey")
    public static native CFString Values_kCFSocketErrorKey();
    @GlobalConstant("kCFSocketRegisterCommand")
    public static native CFString SocketRegisterCommand();
    @GlobalConstant("kCFSocketRetrieveCommand")
    public static native CFString SocketRetrieveCommand();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileExists")
    public static native CFString URLFileExists();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileDirectoryContents")
    public static native CFString URLFileDirectoryContents();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileLength")
    public static native CFString URLFileLength();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileLastModificationTime")
    public static native CFString URLFileLastModificationTime();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFilePOSIXMode")
    public static native CFString URLFilePOSIXMode();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLFileOwnerID")
    public static native CFString URLFileOwnerID();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLHTTPStatusCode")
    public static native CFString URLHTTPStatusCode();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLHTTPStatusLine")
    public static native CFString URLHTTPStatusLine();
    @GlobalConstant("kCFBundleInfoDictionaryVersionKey")
    public static native CFString Values_kCFBundleInfoDictionaryVersionKey();
    @GlobalConstant("kCFBundleExecutableKey")
    public static native CFString Values_kCFBundleExecutableKey();
    @GlobalConstant("kCFBundleIdentifierKey")
    public static native CFString Values_kCFBundleIdentifierKey();
    @GlobalConstant("kCFBundleVersionKey")
    public static native CFString Values_kCFBundleVersionKey();
    @GlobalConstant("kCFBundleDevelopmentRegionKey")
    public static native CFString Values_kCFBundleDevelopmentRegionKey();
    @GlobalConstant("kCFBundleNameKey")
    public static native CFString Values_kCFBundleNameKey();
    @GlobalConstant("kCFBundleLocalizationsKey")
    public static native CFString Values_kCFBundleLocalizationsKey();
    
}
