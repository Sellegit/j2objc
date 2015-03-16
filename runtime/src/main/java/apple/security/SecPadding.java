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





@Library("Security/Security.h")
@Mapping("SecPadding")
public final class SecPadding extends ObjCEnum {
    
    @GlobalConstant("kSecPaddingNone")
    public static final long None = 0L;
    @GlobalConstant("kSecPaddingPKCS1")
    public static final long PKCS1 = 1L;
    @GlobalConstant("kSecPaddingOAEP")
    public static final long OAEP = 2L;
    @GlobalConstant("kSecPaddingPKCS1MD2")
    public static final long PKCS1MD2 = 32768L;
    @GlobalConstant("kSecPaddingPKCS1MD5")
    public static final long PKCS1MD5 = 32769L;
    @GlobalConstant("kSecPaddingPKCS1SHA1")
    public static final long PKCS1SHA1 = 32770L;
    @GlobalConstant("kSecPaddingPKCS1SHA224")
    public static final long PKCS1SHA224 = 32771L;
    @GlobalConstant("kSecPaddingPKCS1SHA256")
    public static final long PKCS1SHA256 = 32772L;
    @GlobalConstant("kSecPaddingPKCS1SHA384")
    public static final long PKCS1SHA384 = 32773L;
    @GlobalConstant("kSecPaddingPKCS1SHA512")
    public static final long PKCS1SHA512 = 32774L;
    

}
