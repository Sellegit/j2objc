package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFPlugIn 
    extends CFType 
     {

    
    
    
    
    
    @GlobalFunction("CFPlugInGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFPlugInCreate")
    protected static native CFPlugIn create(CFAllocator allocator, CFURL plugInURL);
    @GlobalFunction("CFPlugInGetBundle")
    public static native CFBundle getBundle(CFPlugIn plugIn);
    @GlobalFunction("CFPlugInSetLoadOnDemand")
    public static native void setLoadOnDemand(CFPlugIn plugIn, boolean flag);
    @GlobalFunction("CFPlugInIsLoadOnDemand")
    public static native boolean isLoadingOnDemand(CFPlugIn plugIn);
    @GlobalFunction("CFPlugInFindFactoriesForPlugInType")
    public static native CFArray findFactoriesForPlugInType(CFUUID typeUUID);
    @GlobalFunction("CFPlugInFindFactoriesForPlugInTypeInPlugIn")
    public static native CFArray findFactoriesForPlugInTypeInPlugIn(CFUUID typeUUID, CFPlugIn plugIn);
    @GlobalFunction("CFPlugInRegisterFactoryFunction")
    public static native boolean registerFactoryFunction(CFUUID factoryUUID, FunctionPtr func);
    @GlobalFunction("CFPlugInRegisterFactoryFunctionByName")
    public static native boolean registerFactoryFunctionByName(CFUUID factoryUUID, CFPlugIn plugIn, String functionName);
    @GlobalFunction("CFPlugInUnregisterFactory")
    public static native boolean unregisterFactory(CFUUID factoryUUID);
    @GlobalFunction("CFPlugInRegisterPlugInType")
    public static native boolean registerPlugInType(CFUUID factoryUUID, CFUUID typeUUID);
    @GlobalFunction("CFPlugInUnregisterPlugInType")
    public static native boolean unregisterPlugInType(CFUUID factoryUUID, CFUUID typeUUID);
    @GlobalFunction("CFPlugInAddInstanceForFactory")
    public static native void addInstanceForFactory(CFUUID factoryID);
    @GlobalFunction("CFPlugInRemoveInstanceForFactory")
    public static native void removeInstanceForFactory(CFUUID factoryID);
    
}
