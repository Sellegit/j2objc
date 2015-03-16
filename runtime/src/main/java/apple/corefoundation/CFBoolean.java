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
public class CFBoolean 
    extends CFPropertyList 
     {

    
    
    protected CFBoolean() {}
    
    
    
    
    @GlobalConstant("kCFBooleanTrue")
    private static native CFBoolean True();
    @GlobalConstant("kCFBooleanFalse")
    private static native CFBoolean False();
    
    @GlobalFunction("CFBooleanGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFBooleanGetValue")
    public static native boolean booleanValue(CFBoolean boolVal);
    
}
