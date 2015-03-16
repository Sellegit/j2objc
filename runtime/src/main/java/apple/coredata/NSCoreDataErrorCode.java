package apple.coredata;


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
import apple.foundation.*;





@Library("CoreData/CoreData.h")
@Mapping("NSCoreDataErrorCode")
public final class NSCoreDataErrorCode extends ObjCEnum {
    
    @GlobalConstant("NSManagedObjectValidationError")
    public static final long ManagedObjectValidation = 1550L;
    @GlobalConstant("NSValidationMultipleErrorsError")
    public static final long ValidationMultipleErrors = 1560L;
    @GlobalConstant("NSValidationMissingMandatoryPropertyError")
    public static final long ValidationMissingMandatoryProperty = 1570L;
    @GlobalConstant("NSValidationRelationshipLacksMinimumCountError")
    public static final long ValidationRelationshipLacksMinimumCount = 1580L;
    @GlobalConstant("NSValidationRelationshipExceedsMaximumCountError")
    public static final long ValidationRelationshipExceedsMaximumCount = 1590L;
    @GlobalConstant("NSValidationRelationshipDeniedDeleteError")
    public static final long ValidationRelationshipDeniedDelete = 1600L;
    @GlobalConstant("NSValidationNumberTooLargeError")
    public static final long ValidationNumberTooLarge = 1610L;
    @GlobalConstant("NSValidationNumberTooSmallError")
    public static final long ValidationNumberTooSmall = 1620L;
    @GlobalConstant("NSValidationDateTooLateError")
    public static final long ValidationDateTooLate = 1630L;
    @GlobalConstant("NSValidationDateTooSoonError")
    public static final long ValidationDateTooSoon = 1640L;
    @GlobalConstant("NSValidationInvalidDateError")
    public static final long ValidationInvalidDate = 1650L;
    @GlobalConstant("NSValidationStringTooLongError")
    public static final long ValidationStringTooLong = 1660L;
    @GlobalConstant("NSValidationStringTooShortError")
    public static final long ValidationStringTooShort = 1670L;
    @GlobalConstant("NSValidationStringPatternMatchingError")
    public static final long ValidationStringPatternMatching = 1680L;
    @GlobalConstant("NSManagedObjectContextLockingError")
    public static final long ManagedObjectContextLocking = 132000L;
    @GlobalConstant("NSPersistentStoreCoordinatorLockingError")
    public static final long PersistentStoreCoordinatorLocking = 132010L;
    @GlobalConstant("NSManagedObjectReferentialIntegrityError")
    public static final long ManagedObjectReferentialIntegrity = 133000L;
    @GlobalConstant("NSManagedObjectExternalRelationshipError")
    public static final long ManagedObjectExternalRelationship = 133010L;
    @GlobalConstant("NSManagedObjectMergeError")
    public static final long ManagedObjectMerge = 133020L;
    @GlobalConstant("NSPersistentStoreInvalidTypeError")
    public static final long PersistentStoreInvalidType = 134000L;
    @GlobalConstant("NSPersistentStoreTypeMismatchError")
    public static final long PersistentStoreTypeMismatch = 134010L;
    @GlobalConstant("NSPersistentStoreIncompatibleSchemaError")
    public static final long PersistentStoreIncompatibleSchema = 134020L;
    @GlobalConstant("NSPersistentStoreSaveError")
    public static final long PersistentStoreSave = 134030L;
    @GlobalConstant("NSPersistentStoreIncompleteSaveError")
    public static final long PersistentStoreIncompleteSave = 134040L;
    @GlobalConstant("NSPersistentStoreSaveConflictsError")
    public static final long PersistentStoreSaveConflicts = 134050L;
    @GlobalConstant("NSCoreDataError")
    public static final long CoreData = 134060L;
    @GlobalConstant("NSPersistentStoreOperationError")
    public static final long PersistentStoreOperation = 134070L;
    @GlobalConstant("NSPersistentStoreOpenError")
    public static final long PersistentStoreOpen = 134080L;
    @GlobalConstant("NSPersistentStoreTimeoutError")
    public static final long PersistentStoreTimeout = 134090L;
    @GlobalConstant("NSPersistentStoreUnsupportedRequestTypeError")
    public static final long PersistentStoreUnsupportedRequestType = 134091L;
    @GlobalConstant("NSPersistentStoreIncompatibleVersionHashError")
    public static final long PersistentStoreIncompatibleVersionHash = 134100L;
    @GlobalConstant("NSMigrationError")
    public static final long Migration = 134110L;
    @GlobalConstant("NSMigrationCancelledError")
    public static final long MigrationCancelled = 134120L;
    @GlobalConstant("NSMigrationMissingSourceModelError")
    public static final long MigrationMissingSourceModel = 134130L;
    @GlobalConstant("NSMigrationMissingMappingModelError")
    public static final long MigrationMissingMappingModel = 134140L;
    @GlobalConstant("NSMigrationManagerSourceStoreError")
    public static final long MigrationManagerSourceStore = 134150L;
    @GlobalConstant("NSMigrationManagerDestinationStoreError")
    public static final long MigrationManagerDestinationStore = 134160L;
    @GlobalConstant("NSEntityMigrationPolicyError")
    public static final long EntityMigrationPolicy = 134170L;
    @GlobalConstant("NSSQLiteError")
    public static final long SQLite = 134180L;
    @GlobalConstant("NSInferredMappingModelError")
    public static final long InferredMappingModel = 134190L;
    @GlobalConstant("NSExternalRecordImportError")
    public static final long ExternalRecordImport = 134200L;
    

}
