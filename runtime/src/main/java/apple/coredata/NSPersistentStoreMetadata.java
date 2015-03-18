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
public class NSPersistentStoreMetadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSStoreTypeKey")
    public static native NSString TypeValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSStoreUUIDKey")
    public static native NSString UUIDValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSStoreModelVersionHashesKey")
    public static native NSString ModelVersionHashesValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSStoreModelVersionIdentifiersKey")
    public static native NSString ModelVersionIdentifiersValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSPersistentStoreOSCompatibility")
    public static native NSString OSCompatibilityValue();
    
}
