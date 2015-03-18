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
public class NSPersistentStoreCoordinatorChangeNotificationInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSAddedPersistentStoresKey")
    public static native NSString AddedKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSRemovedPersistentStoresKey")
    public static native NSString RemovedKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUUIDChangedPersistentStoresKey")
    public static native NSString UUIDChangedKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreUbiquitousTransitionTypeKey")
    public static native NSString UbiquitousTransitionTypeKey();
    
}
