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
    protected static native NSString LocalizedFormatDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeTotalCapacityKey")
    protected static native NSString TotalCapacityValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeAvailableCapacityKey")
    protected static native NSString AvailableCapacityValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeResourceCountKey")
    protected static native NSString ResourceCountValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsPersistentIDsKey")
    protected static native NSString SupportsPersistentIDsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsSymbolicLinksKey")
    protected static native NSString SupportsSymbolicLinksValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsHardLinksKey")
    protected static native NSString SupportsHardLinksValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsJournalingKey")
    protected static native NSString SupportsJournalingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsJournalingKey")
    protected static native NSString IsJournalingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsSparseFilesKey")
    protected static native NSString SupportsSparseFilesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsZeroRunsKey")
    protected static native NSString SupportsZeroRunsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsCaseSensitiveNamesKey")
    protected static native NSString SupportsCaseSensitiveNamesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsCasePreservedNamesKey")
    protected static native NSString SupportsCasePreservedNamesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsRootDirectoryDatesKey")
    protected static native NSString SupportsRootDirectoryDatesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsVolumeSizesKey")
    protected static native NSString SupportsVolumeSizesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsRenamingKey")
    protected static native NSString SupportsRenamingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsAdvisoryFileLockingKey")
    protected static native NSString SupportsAdvisoryFileLockingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeSupportsExtendedSecurityKey")
    protected static native NSString SupportsExtendedSecurityValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsBrowsableKey")
    protected static native NSString IsBrowsableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeMaximumFileSizeKey")
    protected static native NSString MaximumFileSizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsEjectableKey")
    protected static native NSString IsEjectableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsRemovableKey")
    protected static native NSString IsRemovableValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsInternalKey")
    protected static native NSString IsInternalValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsAutomountedKey")
    protected static native NSString IsAutomountedValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsLocalKey")
    protected static native NSString IsLocalValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeIsReadOnlyKey")
    protected static native NSString IsReadOnlyValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeCreationDateKey")
    protected static native NSString CreationDateValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeURLForRemountingKey")
    protected static native NSString URLForRemountingValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeUUIDStringKey")
    protected static native NSString UUIDStringValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeNameKey")
    protected static native NSString NameValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLVolumeLocalizedNameKey")
    protected static native NSString LocalizedNameValue();
    
}
