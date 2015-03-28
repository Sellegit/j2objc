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
public class CFPlugInProperty 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFPlugInDynamicRegistrationKey")
    public static native CFString DynamicRegistrationValue();
    @GlobalConstant("kCFPlugInDynamicRegisterFunctionKey")
    public static native CFString DynamicRegisterFunctionValue();
    @GlobalConstant("kCFPlugInUnloadFunctionKey")
    public static native CFString UnloadFunctionValue();
    @GlobalConstant("kCFPlugInFactoriesKey")
    public static native CFString FactoriesValue();
    @GlobalConstant("kCFPlugInTypesKey")
    public static native CFString TypesValue();

}
