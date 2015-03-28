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
@Mapping("NSEntityMappingType")
public final class NSEntityMappingType extends ObjCEnum {
    
    @GlobalConstant("NSUndefinedEntityMappingType")
    public static final long Undefined = 0L;
    @GlobalConstant("NSCustomEntityMappingType")
    public static final long Custom = 1L;
    @GlobalConstant("NSAddEntityMappingType")
    public static final long Add = 2L;
    @GlobalConstant("NSRemoveEntityMappingType")
    public static final long Remove = 3L;
    @GlobalConstant("NSCopyEntityMappingType")
    public static final long Copy = 4L;
    @GlobalConstant("NSTransformEntityMappingType")
    public static final long Transform = 5L;


}
