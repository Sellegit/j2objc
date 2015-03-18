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
public class NSExpressionMigrationKey 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigrationManagerKey")
    public static native String ManagerKeyValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigrationSourceObjectKey")
    public static native String SourceObjectKeyValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigrationDestinationObjectKey")
    public static native String DestinationObjectKeyValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigrationEntityMappingKey")
    public static native String EntityMappingKeyValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigrationPropertyMappingKey")
    public static native String PropertyMappingKeyValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSMigrationEntityPolicyKey")
    public static native String EntityPolicyKeyValue();
    
}
