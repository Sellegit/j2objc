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
@Library("Foundation")
public class NSFileProtection 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSFileProtectionNone")
    protected static native NSString NoneValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSFileProtectionComplete")
    protected static native NSString CompleteValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSFileProtectionCompleteUnlessOpen")
    protected static native NSString CompleteUnlessOpenValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSFileProtectionCompleteUntilFirstUserAuthentication")
    protected static native NSString CompleteUntilFirstUserAuthenticationValue();
    
}
