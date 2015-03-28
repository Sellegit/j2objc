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
 * @since Available in iOS 5.0 and later.
 */
@Library("CoreData/CoreData.h")
@Mapping("NSManagedObjectContextConcurrencyType")
public final class NSManagedObjectContextConcurrencyType extends ObjCEnum {
    
    @GlobalConstant("NSConfinementConcurrencyType")
    public static final long Confinement = 0L;
    @GlobalConstant("NSPrivateQueueConcurrencyType")
    public static final long PrivateQueue = 1L;
    @GlobalConstant("NSMainQueueConcurrencyType")
    public static final long MainQueue = 2L;


}
