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
    public static native NSString ReadOnlyOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSPersistentStoreTimeoutOption")
    public static native NSString TimeoutOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSQLitePragmasOption")
    public static native NSString SQLitePragmasOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSQLiteAnalyzeOption")
    public static native NSString SQLiteAnalyzeOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSSQLiteManualVacuumOption")
    public static native NSString SQLiteManualVacuumOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSIgnorePersistentStoreVersioningOption")
    public static native NSString IgnorePersistentStoreVersioningOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigratePersistentStoresAutomaticallyOption")
    public static native NSString MigratePersistentStoresAutomaticallyOption();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInferMappingModelAutomaticallyOption")
    public static native NSString InferMappingModelAutomaticallyOption();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousContentNameKey")
    public static native NSString UbiquitousContentNameOption();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousContentURLKey")
    public static native NSString UbiquitousContentURLOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousPeerTokenOption")
    public static native NSString UbiquitousPeerTokenOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreRemoveUbiquitousMetadataOption")
    public static native NSString RemoveUbiquitousMetadataOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousContainerIdentifierKey")
    public static native NSString UbiquitousContainerIdentifierOption();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreRebuildFromUbiquitousContentOption")
    public static native NSString RebuildFromUbiquitousContentOption();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSPersistentStoreFileProtectionKey")
    public static native NSString FileProtectionOption();
    
}
