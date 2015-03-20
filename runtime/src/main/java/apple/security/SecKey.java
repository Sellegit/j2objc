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
@Mapping("SecKeyRef") @Library("Security/Security.h")
public class SecKey 
    extends CFType 
     {

    
    
    protected SecKey() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecPrivateKeyAttrs")
    public static native CFType PrivateKeyAttrs();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kSecPublicKeyAttrs")
    public static native CFType PublicKeyAttrs();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyGeneratePair")
    public static native int generatePair(CFDictionary parameters, Todo publicKey, Todo privateKey);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyRawSign")
    public static native int rawSign(SecKey key, @Representing("SecPadding") long padding, Todo dataToSign, @MachineSizedUInt long dataToSignLen, Todo sig, Todo sigLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyRawVerify")
    public static native int rawVerify(SecKey key, @Representing("SecPadding") long padding, Todo signedData, @MachineSizedUInt long signedDataLen, Todo sig, @MachineSizedUInt long sigLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyEncrypt")
    public static native int encrypt(SecKey key, @Representing("SecPadding") long padding, Todo plainText, @MachineSizedUInt long plainTextLen, Todo cipherText, Todo cipherTextLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyDecrypt")
    public static native int decrypt(SecKey key, @Representing("SecPadding") long padding, Todo cipherText, @MachineSizedUInt long cipherTextLen, Todo plainText, Todo plainTextLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyGetBlockSize")
    public static native @MachineSizedUInt long getBlockSize(SecKey key);
    
}
