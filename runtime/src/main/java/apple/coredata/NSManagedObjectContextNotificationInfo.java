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
public class NSManagedObjectContextNotificationInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInsertedObjectsKey")
    public static native NSString InsertedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUpdatedObjectsKey")
    public static native NSString UpdatedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSDeletedObjectsKey")
    public static native NSString DeletedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSRefreshedObjectsKey")
    public static native NSString RefreshedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInvalidatedObjectsKey")
    public static native NSString InvalidatedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInvalidatedAllObjectsKey")
    public static native NSString InvalidatedAllObjectsKey();

}
