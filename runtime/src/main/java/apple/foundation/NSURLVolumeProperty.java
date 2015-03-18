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
public class NSURLVolumeProperty 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeLocalizedFormatDescriptionKey")
    public static native NSString LocalizedFormatDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeTotalCapacityKey")
    public static native NSString TotalCapacityValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeAvailableCapacityKey")
    public static native NSString AvailableCapacityValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeResourceCountKey")
    public static native NSString ResourceCountValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsPersistentIDsKey")
    public static native NSString SupportsPersistentIDsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsSymbolicLinksKey")
    public static native NSString SupportsSymbolicLinksValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsHardLinksKey")
    public static native NSString SupportsHardLinksValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsJournalingKey")
    public static native NSString SupportsJournalingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsJournalingKey")
    public static native NSString IsJournalingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsSparseFilesKey")
    public static native NSString SupportsSparseFilesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsZeroRunsKey")
    public static native NSString SupportsZeroRunsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsCaseSensitiveNamesKey")
    public static native NSString SupportsCaseSensitiveNamesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsCasePreservedNamesKey")
    public static native NSString SupportsCasePreservedNamesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsRootDirectoryDatesKey")
    public static native NSString SupportsRootDirectoryDatesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsVolumeSizesKey")
    public static native NSString SupportsVolumeSizesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsRenamingKey")
    public static native NSString SupportsRenamingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsAdvisoryFileLockingKey")
    public static native NSString SupportsAdvisoryFileLockingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsExtendedSecurityKey")
    public static native NSString SupportsExtendedSecurityValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsBrowsableKey")
    public static native NSString IsBrowsableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeMaximumFileSizeKey")
    public static native NSString MaximumFileSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsEjectableKey")
    public static native NSString IsEjectableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsRemovableKey")
    public static native NSString IsRemovableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsInternalKey")
    public static native NSString IsInternalValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsAutomountedKey")
    public static native NSString IsAutomountedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsLocalKey")
    public static native NSString IsLocalValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsReadOnlyKey")
    public static native NSString IsReadOnlyValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeCreationDateKey")
    public static native NSString CreationDateValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeURLForRemountingKey")
    public static native NSString URLForRemountingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeUUIDStringKey")
    public static native NSString UUIDStringValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeNameKey")
    public static native NSString NameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeLocalizedNameKey")
    public static native NSString LocalizedNameValue();
    
}
