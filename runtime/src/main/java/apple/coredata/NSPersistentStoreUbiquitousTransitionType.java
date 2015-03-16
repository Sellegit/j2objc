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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("CoreData/CoreData.h")
@Mapping("NSPersistentStoreUbiquitousTransitionType")
public final class NSPersistentStoreUbiquitousTransitionType extends ObjCEnum {
    
    @GlobalConstant("NSPersistentStoreUbiquitousTransitionTypeAccountAdded")
    public static final long AccountAdded = 1L;
    @GlobalConstant("NSPersistentStoreUbiquitousTransitionTypeAccountRemoved")
    public static final long AccountRemoved = 2L;
    @GlobalConstant("NSPersistentStoreUbiquitousTransitionTypeContentRemoved")
    public static final long ContentRemoved = 3L;
    @GlobalConstant("NSPersistentStoreUbiquitousTransitionTypeInitialImportCompleted")
    public static final long InitialImportCompleted = 4L;
    

}
