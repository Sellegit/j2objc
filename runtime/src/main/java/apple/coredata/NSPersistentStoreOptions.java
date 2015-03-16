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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreData/CoreData.h")
public class NSPersistentStoreOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSReadOnlyPersistentStoreOption")
    protected static native NSString ReadOnlyOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSPersistentStoreTimeoutOption")
    protected static native NSString TimeoutOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSQLitePragmasOption")
    protected static native NSString SQLitePragmasOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSQLiteAnalyzeOption")
    protected static native NSString SQLiteAnalyzeOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSQLiteManualVacuumOption")
    protected static native NSString SQLiteManualVacuumOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSIgnorePersistentStoreVersioningOption")
    protected static native NSString IgnorePersistentStoreVersioningOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigratePersistentStoresAutomaticallyOption")
    protected static native NSString MigratePersistentStoresAutomaticallyOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInferMappingModelAutomaticallyOption")
    protected static native NSString InferMappingModelAutomaticallyOption();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousContentNameKey")
    protected static native NSString UbiquitousContentNameOption();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousContentURLKey")
    protected static native NSString UbiquitousContentURLOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousPeerTokenOption")
    protected static native NSString UbiquitousPeerTokenOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreRemoveUbiquitousMetadataOption")
    protected static native NSString RemoveUbiquitousMetadataOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousContainerIdentifierKey")
    protected static native NSString UbiquitousContainerIdentifierOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreRebuildFromUbiquitousContentOption")
    protected static native NSString RebuildFromUbiquitousContentOption();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSPersistentStoreFileProtectionKey")
    protected static native NSString FileProtectionOption();
    
}
