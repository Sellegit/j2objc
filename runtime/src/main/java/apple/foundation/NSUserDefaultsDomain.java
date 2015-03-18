package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSUserDefaultsDomain 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSGlobalDomain")
    public static native String GlobalValue();
    @GlobalConstant("NSArgumentDomain")
    public static native String ArgumentValue();
    @GlobalConstant("NSRegistrationDomain")
    public static native String RegistrationValue();
    
}
