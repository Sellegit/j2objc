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
@Mapping("NSMergePolicyType")
public final class NSMergePolicyType extends ObjCEnum {
    
    @GlobalConstant("NSErrorMergePolicyType")
    public static final long Error = 0L;
    @GlobalConstant("NSMergeByPropertyStoreTrumpMergePolicyType")
    public static final long MergeByPropertyStoreTrump = 1L;
    @GlobalConstant("NSMergeByPropertyObjectTrumpMergePolicyType")
    public static final long MergeByPropertyObjectTrump = 2L;
    @GlobalConstant("NSOverwriteMergePolicyType")
    public static final long Overwrite = 3L;
    @GlobalConstant("NSRollbackMergePolicyType")
    public static final long Rollback = 4L;
    

}
