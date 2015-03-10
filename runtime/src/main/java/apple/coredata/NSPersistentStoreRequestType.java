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






@Mapping("NSPersistentStoreRequestType")
public final class NSPersistentStoreRequestType extends ObjCEnum {
    
    @GlobalConstant("NSFetchRequestType")
    public static final long Fetch = 1L;
    @GlobalConstant("NSSaveRequestType")
    public static final long Save = 2L;
    @GlobalConstant("NSBatchUpdateRequestType")
    public static final long BatchUpdate = 6L;
    

}
