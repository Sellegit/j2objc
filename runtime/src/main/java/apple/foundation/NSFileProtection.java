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
public class NSFileProtection 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSFileProtectionNone")
    public static native NSString NoneValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSFileProtectionComplete")
    public static native NSString CompleteValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSFileProtectionCompleteUnlessOpen")
    public static native NSString CompleteUnlessOpenValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSFileProtectionCompleteUntilFirstUserAuthentication")
    public static native NSString CompleteUntilFirstUserAuthenticationValue();

}
