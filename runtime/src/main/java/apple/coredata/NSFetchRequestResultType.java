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





@Library("CoreData")
@Mapping("NSFetchRequestResultType")
public final class NSFetchRequestResultType extends ObjCEnum {
    
    @GlobalConstant("NSManagedObjectResultType")
    public static final long ManagedObject = 0L;
    @GlobalConstant("NSManagedObjectIDResultType")
    public static final long ManagedObjectID = 1L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSDictionaryResultType")
    public static final long Dictionary = 2L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSCountResultType")
    public static final long Count = 4L;
    

}
