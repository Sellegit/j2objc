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
@Mapping("NSDeleteRule")
public final class NSDeleteRule extends ObjCEnum {
    
    @GlobalConstant("NSNoActionDeleteRule")
    public static final long NoAction = 0L;
    @GlobalConstant("NSNullifyDeleteRule")
    public static final long Nullify = 1L;
    @GlobalConstant("NSCascadeDeleteRule")
    public static final long Cascade = 2L;
    @GlobalConstant("NSDenyDeleteRule")
    public static final long Deny = 3L;
    

}
