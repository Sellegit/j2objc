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
public class CFPreferencesDomain 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFPreferencesAnyApplication")
    protected static native CFString AnyApplicationValue();
    @GlobalConstant("kCFPreferencesCurrentApplication")
    protected static native CFString CurrentApplicationValue();
    @GlobalConstant("kCFPreferencesAnyHost")
    protected static native CFString AnyHostValue();
    @GlobalConstant("kCFPreferencesCurrentHost")
    protected static native CFString CurrentHostValue();
    @GlobalConstant("kCFPreferencesAnyUser")
    protected static native CFString AnyUserValue();
    @GlobalConstant("kCFPreferencesCurrentUser")
    protected static native CFString CurrentUserValue();
    
}
