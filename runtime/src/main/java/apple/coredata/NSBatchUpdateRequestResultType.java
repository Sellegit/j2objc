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





@Library("CoreData/CoreData.h")
@Mapping("NSBatchUpdateRequestResultType")
public final class NSBatchUpdateRequestResultType extends ObjCEnum {
    
    @GlobalConstant("NSStatusOnlyResultType")
    public static final long StatusOnlyResultType = 0L;
    @GlobalConstant("NSUpdatedObjectIDsResultType")
    public static final long UpdatedObjectIDsResultType = 1L;
    @GlobalConstant("NSUpdatedObjectsCountResultType")
    public static final long UpdatedObjectsCountResultType = 2L;
    

}
