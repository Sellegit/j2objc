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
public class CFNull 
    extends CFType 
     {

    
    
    protected CFNull() {}
    
    
    
    
    @GlobalConstant("kCFNull")
    public static native CFNull getNull();
    
    @GlobalFunction("CFNullGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    
}
