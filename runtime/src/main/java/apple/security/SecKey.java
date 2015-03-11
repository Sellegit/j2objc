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
    public native int rawSign(SecPadding padding, Todo dataToSign, @MachineSizedUInt long dataToSignLen, Todo sig, Todo sigLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyRawVerify")
    public native int rawVerify(SecPadding padding, Todo signedData, @MachineSizedUInt long signedDataLen, Todo sig, @MachineSizedUInt long sigLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyEncrypt")
    public native int encrypt(SecPadding padding, Todo plainText, @MachineSizedUInt long plainTextLen, Todo cipherText, Todo cipherTextLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyDecrypt")
    public native int decrypt(SecPadding padding, Todo cipherText, @MachineSizedUInt long cipherTextLen, Todo plainText, Todo plainTextLen);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecKeyGetBlockSize")
    public native @MachineSizedUInt long getBlockSize();
    
}
