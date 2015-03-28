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
public class CFPreferencesDomain 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFPreferencesAnyApplication")
    public static native CFString AnyApplicationValue();
    @GlobalConstant("kCFPreferencesCurrentApplication")
    public static native CFString CurrentApplicationValue();
    @GlobalConstant("kCFPreferencesAnyHost")
    public static native CFString AnyHostValue();
    @GlobalConstant("kCFPreferencesCurrentHost")
    public static native CFString CurrentHostValue();
    @GlobalConstant("kCFPreferencesAnyUser")
    public static native CFString AnyUserValue();
    @GlobalConstant("kCFPreferencesCurrentUser")
    public static native CFString CurrentUserValue();

}
