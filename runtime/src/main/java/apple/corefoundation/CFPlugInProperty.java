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
@Library("CoreFoundation")
public class CFPlugInProperty 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFPlugInDynamicRegistrationKey")
    protected static native CFString DynamicRegistrationValue();
    @GlobalConstant("kCFPlugInDynamicRegisterFunctionKey")
    protected static native CFString DynamicRegisterFunctionValue();
    @GlobalConstant("kCFPlugInUnloadFunctionKey")
    protected static native CFString UnloadFunctionValue();
    @GlobalConstant("kCFPlugInFactoriesKey")
    protected static native CFString FactoriesValue();
    @GlobalConstant("kCFPlugInTypesKey")
    protected static native CFString TypesValue();
    
}
