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
@Library("CoreData")
public class NSManagedObjectContextNotificationInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInsertedObjectsKey")
    protected static native NSString InsertedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSUpdatedObjectsKey")
    protected static native NSString UpdatedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSDeletedObjectsKey")
    protected static native NSString DeletedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSRefreshedObjectsKey")
    protected static native NSString RefreshedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInvalidatedObjectsKey")
    protected static native NSString InvalidatedObjectsKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSInvalidatedAllObjectsKey")
    protected static native NSString InvalidatedAllObjectsKey();
    
}
