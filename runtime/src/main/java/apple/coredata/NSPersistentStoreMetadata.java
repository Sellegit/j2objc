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
    protected static native NSString TypeValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSStoreUUIDKey")
    protected static native NSString UUIDValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSStoreModelVersionHashesKey")
    protected static native NSString ModelVersionHashesValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSStoreModelVersionIdentifiersKey")
    protected static native NSString ModelVersionIdentifiersValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSPersistentStoreOSCompatibility")
    protected static native NSString OSCompatibilityValue();
    
}
