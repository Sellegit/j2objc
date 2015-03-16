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
@Library("Security/Security.h")
public class SecImportExport 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecImportExportPassphrase")
    public static native CFString KeyPassphrase();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecImportItemLabel")
    public static native CFString KeyItemLabel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecImportItemKeyID")
    public static native CFString KeyItemKeyID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecImportItemTrust")
    public static native CFString KeyItemTrust();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecImportItemCertChain")
    public static native CFString KeyItemCertChain();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecImportItemIdentity")
    public static native CFString KeyItemIdentity();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecPKCS12Import")
    public static native int importPKCS12(CFData pkcs12_data, CFDictionary options, Todo items);
    
}
