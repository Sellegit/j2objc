package apple.security;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("Security")
public class Security 
    extends Object 
     {

    
    public static final long kSecAccessControlUserPresence = 1L;
    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecUseOperationPrompt")
    public static native CFType kSecUseOperationPrompt();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecUseOperationPrompt")
    public static native void kSecUseOperationPrompt(CFType v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecUseNoAuthenticationUI")
    public static native CFType kSecUseNoAuthenticationUI();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecUseNoAuthenticationUI")
    public static native void kSecUseNoAuthenticationUI(CFType v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecSharedPassword")
    public static native CFType kSecSharedPassword();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kSecSharedPassword")
    public static native void kSecSharedPassword(CFType v);
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("SecAddSharedWebCredential")
    public static native void secAddSharedWebCredential(CFString fqdn, CFString account, CFString password, Todo completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("SecRequestSharedWebCredential")
    public static native void secRequestSharedWebCredential(CFString fqdn, CFString account, Todo completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("SecCreateSharedWebCredentialPassword")
    public static native CFString secCreateSharedWebCredentialPassword();
    
}
