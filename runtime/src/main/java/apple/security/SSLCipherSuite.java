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
@Mapping("SSLCipherSuite")
public final class SSLCipherSuite extends ObjCEnum {
    
    @GlobalConstant("SSL_NULL_WITH_NULL_NULL")
    public static final long SSL_NULL_WITH_NULL_NULL = 0L;
    @GlobalConstant("SSL_RSA_WITH_NULL_MD5")
    public static final long SSL_RSA_WITH_NULL_MD5 = 1L;
    @GlobalConstant("SSL_RSA_WITH_NULL_SHA")
    public static final long SSL_RSA_WITH_NULL_SHA = 2L;
    @GlobalConstant("SSL_RSA_EXPORT_WITH_RC4_40_MD5")
    public static final long SSL_RSA_EXPORT_WITH_RC4_40_MD5 = 3L;
    @GlobalConstant("SSL_RSA_WITH_RC4_128_MD5")
    public static final long SSL_RSA_WITH_RC4_128_MD5 = 4L;
    @GlobalConstant("SSL_RSA_WITH_RC4_128_SHA")
    public static final long SSL_RSA_WITH_RC4_128_SHA = 5L;
    @GlobalConstant("SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5")
    public static final long SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5 = 6L;
    @GlobalConstant("SSL_RSA_WITH_IDEA_CBC_SHA")
    public static final long SSL_RSA_WITH_IDEA_CBC_SHA = 7L;
    @GlobalConstant("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA")
    public static final long SSL_RSA_EXPORT_WITH_DES40_CBC_SHA = 8L;
    @GlobalConstant("SSL_RSA_WITH_DES_CBC_SHA")
    public static final long SSL_RSA_WITH_DES_CBC_SHA = 9L;
    @GlobalConstant("SSL_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long SSL_RSA_WITH_3DES_EDE_CBC_SHA = 10L;
    @GlobalConstant("SSL_DH_DSS_EXPORT_WITH_DES40_CBC_SHA")
    public static final long SSL_DH_DSS_EXPORT_WITH_DES40_CBC_SHA = 11L;
    @GlobalConstant("SSL_DH_DSS_WITH_DES_CBC_SHA")
    public static final long SSL_DH_DSS_WITH_DES_CBC_SHA = 12L;
    @GlobalConstant("SSL_DH_DSS_WITH_3DES_EDE_CBC_SHA")
    public static final long SSL_DH_DSS_WITH_3DES_EDE_CBC_SHA = 13L;
    @GlobalConstant("SSL_DH_RSA_EXPORT_WITH_DES40_CBC_SHA")
    public static final long SSL_DH_RSA_EXPORT_WITH_DES40_CBC_SHA = 14L;
    @GlobalConstant("SSL_DH_RSA_WITH_DES_CBC_SHA")
    public static final long SSL_DH_RSA_WITH_DES_CBC_SHA = 15L;
    @GlobalConstant("SSL_DH_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long SSL_DH_RSA_WITH_3DES_EDE_CBC_SHA = 16L;
    @GlobalConstant("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA")
    public static final long SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = 17L;
    @GlobalConstant("SSL_DHE_DSS_WITH_DES_CBC_SHA")
    public static final long SSL_DHE_DSS_WITH_DES_CBC_SHA = 18L;
    @GlobalConstant("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA")
    public static final long SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA = 19L;
    @GlobalConstant("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA")
    public static final long SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = 20L;
    @GlobalConstant("SSL_DHE_RSA_WITH_DES_CBC_SHA")
    public static final long SSL_DHE_RSA_WITH_DES_CBC_SHA = 21L;
    @GlobalConstant("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA = 22L;
    @GlobalConstant("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5")
    public static final long SSL_DH_anon_EXPORT_WITH_RC4_40_MD5 = 23L;
    @GlobalConstant("SSL_DH_anon_WITH_RC4_128_MD5")
    public static final long SSL_DH_anon_WITH_RC4_128_MD5 = 24L;
    @GlobalConstant("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA")
    public static final long SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA = 25L;
    @GlobalConstant("SSL_DH_anon_WITH_DES_CBC_SHA")
    public static final long SSL_DH_anon_WITH_DES_CBC_SHA = 26L;
    @GlobalConstant("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA")
    public static final long SSL_DH_anon_WITH_3DES_EDE_CBC_SHA = 27L;
    @GlobalConstant("SSL_FORTEZZA_DMS_WITH_NULL_SHA")
    public static final long SSL_FORTEZZA_DMS_WITH_NULL_SHA = 28L;
    @GlobalConstant("SSL_FORTEZZA_DMS_WITH_FORTEZZA_CBC_SHA")
    public static final long SSL_FORTEZZA_DMS_WITH_FORTEZZA_CBC_SHA = 29L;
    @GlobalConstant("TLS_RSA_WITH_AES_128_CBC_SHA")
    public static final long TLS_RSA_WITH_AES_128_CBC_SHA = 47L;
    @GlobalConstant("TLS_DH_DSS_WITH_AES_128_CBC_SHA")
    public static final long TLS_DH_DSS_WITH_AES_128_CBC_SHA = 48L;
    @GlobalConstant("TLS_DH_RSA_WITH_AES_128_CBC_SHA")
    public static final long TLS_DH_RSA_WITH_AES_128_CBC_SHA = 49L;
    @GlobalConstant("TLS_DHE_DSS_WITH_AES_128_CBC_SHA")
    public static final long TLS_DHE_DSS_WITH_AES_128_CBC_SHA = 50L;
    @GlobalConstant("TLS_DHE_RSA_WITH_AES_128_CBC_SHA")
    public static final long TLS_DHE_RSA_WITH_AES_128_CBC_SHA = 51L;
    @GlobalConstant("TLS_DH_anon_WITH_AES_128_CBC_SHA")
    public static final long TLS_DH_anon_WITH_AES_128_CBC_SHA = 52L;
    @GlobalConstant("TLS_RSA_WITH_AES_256_CBC_SHA")
    public static final long TLS_RSA_WITH_AES_256_CBC_SHA = 53L;
    @GlobalConstant("TLS_DH_DSS_WITH_AES_256_CBC_SHA")
    public static final long TLS_DH_DSS_WITH_AES_256_CBC_SHA = 54L;
    @GlobalConstant("TLS_DH_RSA_WITH_AES_256_CBC_SHA")
    public static final long TLS_DH_RSA_WITH_AES_256_CBC_SHA = 55L;
    @GlobalConstant("TLS_DHE_DSS_WITH_AES_256_CBC_SHA")
    public static final long TLS_DHE_DSS_WITH_AES_256_CBC_SHA = 56L;
    @GlobalConstant("TLS_DHE_RSA_WITH_AES_256_CBC_SHA")
    public static final long TLS_DHE_RSA_WITH_AES_256_CBC_SHA = 57L;
    @GlobalConstant("TLS_DH_anon_WITH_AES_256_CBC_SHA")
    public static final long TLS_DH_anon_WITH_AES_256_CBC_SHA = 58L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_NULL_SHA")
    public static final long TLS_ECDH_ECDSA_WITH_NULL_SHA = 49153L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_RC4_128_SHA")
    public static final long TLS_ECDH_ECDSA_WITH_RC4_128_SHA = 49154L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = 49155L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA")
    public static final long TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = 49156L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA")
    public static final long TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = 49157L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_NULL_SHA")
    public static final long TLS_ECDHE_ECDSA_WITH_NULL_SHA = 49158L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA")
    public static final long TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = 49159L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = 49160L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA")
    public static final long TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = 49161L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA")
    public static final long TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = 49162L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_NULL_SHA")
    public static final long TLS_ECDH_RSA_WITH_NULL_SHA = 49163L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_RC4_128_SHA")
    public static final long TLS_ECDH_RSA_WITH_RC4_128_SHA = 49164L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = 49165L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA")
    public static final long TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = 49166L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA")
    public static final long TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = 49167L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_NULL_SHA")
    public static final long TLS_ECDHE_RSA_WITH_NULL_SHA = 49168L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_RC4_128_SHA")
    public static final long TLS_ECDHE_RSA_WITH_RC4_128_SHA = 49169L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = 49170L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA")
    public static final long TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = 49171L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA")
    public static final long TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = 49172L;
    @GlobalConstant("TLS_ECDH_anon_WITH_NULL_SHA")
    public static final long TLS_ECDH_anon_WITH_NULL_SHA = 49173L;
    @GlobalConstant("TLS_ECDH_anon_WITH_RC4_128_SHA")
    public static final long TLS_ECDH_anon_WITH_RC4_128_SHA = 49174L;
    @GlobalConstant("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = 49175L;
    @GlobalConstant("TLS_ECDH_anon_WITH_AES_128_CBC_SHA")
    public static final long TLS_ECDH_anon_WITH_AES_128_CBC_SHA = 49176L;
    @GlobalConstant("TLS_ECDH_anon_WITH_AES_256_CBC_SHA")
    public static final long TLS_ECDH_anon_WITH_AES_256_CBC_SHA = 49177L;
    @GlobalConstant("TLS_NULL_WITH_NULL_NULL")
    public static final long TLS_NULL_WITH_NULL_NULL = 0L;
    @GlobalConstant("TLS_RSA_WITH_NULL_MD5")
    public static final long TLS_RSA_WITH_NULL_MD5 = 1L;
    @GlobalConstant("TLS_RSA_WITH_NULL_SHA")
    public static final long TLS_RSA_WITH_NULL_SHA = 2L;
    @GlobalConstant("TLS_RSA_WITH_RC4_128_MD5")
    public static final long TLS_RSA_WITH_RC4_128_MD5 = 4L;
    @GlobalConstant("TLS_RSA_WITH_RC4_128_SHA")
    public static final long TLS_RSA_WITH_RC4_128_SHA = 5L;
    @GlobalConstant("TLS_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_RSA_WITH_3DES_EDE_CBC_SHA = 10L;
    @GlobalConstant("TLS_RSA_WITH_NULL_SHA256")
    public static final long TLS_RSA_WITH_NULL_SHA256 = 59L;
    @GlobalConstant("TLS_RSA_WITH_AES_128_CBC_SHA256")
    public static final long TLS_RSA_WITH_AES_128_CBC_SHA256 = 60L;
    @GlobalConstant("TLS_RSA_WITH_AES_256_CBC_SHA256")
    public static final long TLS_RSA_WITH_AES_256_CBC_SHA256 = 61L;
    @GlobalConstant("TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA = 13L;
    @GlobalConstant("TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA = 16L;
    @GlobalConstant("TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = 19L;
    @GlobalConstant("TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = 22L;
    @GlobalConstant("TLS_DH_DSS_WITH_AES_128_CBC_SHA256")
    public static final long TLS_DH_DSS_WITH_AES_128_CBC_SHA256 = 62L;
    @GlobalConstant("TLS_DH_RSA_WITH_AES_128_CBC_SHA256")
    public static final long TLS_DH_RSA_WITH_AES_128_CBC_SHA256 = 63L;
    @GlobalConstant("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256")
    public static final long TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = 64L;
    @GlobalConstant("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256")
    public static final long TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = 103L;
    @GlobalConstant("TLS_DH_DSS_WITH_AES_256_CBC_SHA256")
    public static final long TLS_DH_DSS_WITH_AES_256_CBC_SHA256 = 104L;
    @GlobalConstant("TLS_DH_RSA_WITH_AES_256_CBC_SHA256")
    public static final long TLS_DH_RSA_WITH_AES_256_CBC_SHA256 = 105L;
    @GlobalConstant("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256")
    public static final long TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = 106L;
    @GlobalConstant("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256")
    public static final long TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = 107L;
    @GlobalConstant("TLS_DH_anon_WITH_RC4_128_MD5")
    public static final long TLS_DH_anon_WITH_RC4_128_MD5 = 24L;
    @GlobalConstant("TLS_DH_anon_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = 27L;
    @GlobalConstant("TLS_DH_anon_WITH_AES_128_CBC_SHA256")
    public static final long TLS_DH_anon_WITH_AES_128_CBC_SHA256 = 108L;
    @GlobalConstant("TLS_DH_anon_WITH_AES_256_CBC_SHA256")
    public static final long TLS_DH_anon_WITH_AES_256_CBC_SHA256 = 109L;
    @GlobalConstant("TLS_PSK_WITH_RC4_128_SHA")
    public static final long TLS_PSK_WITH_RC4_128_SHA = 138L;
    @GlobalConstant("TLS_PSK_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_PSK_WITH_3DES_EDE_CBC_SHA = 139L;
    @GlobalConstant("TLS_PSK_WITH_AES_128_CBC_SHA")
    public static final long TLS_PSK_WITH_AES_128_CBC_SHA = 140L;
    @GlobalConstant("TLS_PSK_WITH_AES_256_CBC_SHA")
    public static final long TLS_PSK_WITH_AES_256_CBC_SHA = 141L;
    @GlobalConstant("TLS_DHE_PSK_WITH_RC4_128_SHA")
    public static final long TLS_DHE_PSK_WITH_RC4_128_SHA = 142L;
    @GlobalConstant("TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA = 143L;
    @GlobalConstant("TLS_DHE_PSK_WITH_AES_128_CBC_SHA")
    public static final long TLS_DHE_PSK_WITH_AES_128_CBC_SHA = 144L;
    @GlobalConstant("TLS_DHE_PSK_WITH_AES_256_CBC_SHA")
    public static final long TLS_DHE_PSK_WITH_AES_256_CBC_SHA = 145L;
    @GlobalConstant("TLS_RSA_PSK_WITH_RC4_128_SHA")
    public static final long TLS_RSA_PSK_WITH_RC4_128_SHA = 146L;
    @GlobalConstant("TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA")
    public static final long TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA = 147L;
    @GlobalConstant("TLS_RSA_PSK_WITH_AES_128_CBC_SHA")
    public static final long TLS_RSA_PSK_WITH_AES_128_CBC_SHA = 148L;
    @GlobalConstant("TLS_RSA_PSK_WITH_AES_256_CBC_SHA")
    public static final long TLS_RSA_PSK_WITH_AES_256_CBC_SHA = 149L;
    @GlobalConstant("TLS_PSK_WITH_NULL_SHA")
    public static final long TLS_PSK_WITH_NULL_SHA = 44L;
    @GlobalConstant("TLS_DHE_PSK_WITH_NULL_SHA")
    public static final long TLS_DHE_PSK_WITH_NULL_SHA = 45L;
    @GlobalConstant("TLS_RSA_PSK_WITH_NULL_SHA")
    public static final long TLS_RSA_PSK_WITH_NULL_SHA = 46L;
    @GlobalConstant("TLS_RSA_WITH_AES_128_GCM_SHA256")
    public static final long TLS_RSA_WITH_AES_128_GCM_SHA256 = 156L;
    @GlobalConstant("TLS_RSA_WITH_AES_256_GCM_SHA384")
    public static final long TLS_RSA_WITH_AES_256_GCM_SHA384 = 157L;
    @GlobalConstant("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256")
    public static final long TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = 158L;
    @GlobalConstant("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384")
    public static final long TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = 159L;
    @GlobalConstant("TLS_DH_RSA_WITH_AES_128_GCM_SHA256")
    public static final long TLS_DH_RSA_WITH_AES_128_GCM_SHA256 = 160L;
    @GlobalConstant("TLS_DH_RSA_WITH_AES_256_GCM_SHA384")
    public static final long TLS_DH_RSA_WITH_AES_256_GCM_SHA384 = 161L;
    @GlobalConstant("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256")
    public static final long TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = 162L;
    @GlobalConstant("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384")
    public static final long TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = 163L;
    @GlobalConstant("TLS_DH_DSS_WITH_AES_128_GCM_SHA256")
    public static final long TLS_DH_DSS_WITH_AES_128_GCM_SHA256 = 164L;
    @GlobalConstant("TLS_DH_DSS_WITH_AES_256_GCM_SHA384")
    public static final long TLS_DH_DSS_WITH_AES_256_GCM_SHA384 = 165L;
    @GlobalConstant("TLS_DH_anon_WITH_AES_128_GCM_SHA256")
    public static final long TLS_DH_anon_WITH_AES_128_GCM_SHA256 = 166L;
    @GlobalConstant("TLS_DH_anon_WITH_AES_256_GCM_SHA384")
    public static final long TLS_DH_anon_WITH_AES_256_GCM_SHA384 = 167L;
    @GlobalConstant("TLS_PSK_WITH_AES_128_GCM_SHA256")
    public static final long TLS_PSK_WITH_AES_128_GCM_SHA256 = 168L;
    @GlobalConstant("TLS_PSK_WITH_AES_256_GCM_SHA384")
    public static final long TLS_PSK_WITH_AES_256_GCM_SHA384 = 169L;
    @GlobalConstant("TLS_DHE_PSK_WITH_AES_128_GCM_SHA256")
    public static final long TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 = 170L;
    @GlobalConstant("TLS_DHE_PSK_WITH_AES_256_GCM_SHA384")
    public static final long TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 = 171L;
    @GlobalConstant("TLS_RSA_PSK_WITH_AES_128_GCM_SHA256")
    public static final long TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 = 172L;
    @GlobalConstant("TLS_RSA_PSK_WITH_AES_256_GCM_SHA384")
    public static final long TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 = 173L;
    @GlobalConstant("TLS_PSK_WITH_AES_128_CBC_SHA256")
    public static final long TLS_PSK_WITH_AES_128_CBC_SHA256 = 174L;
    @GlobalConstant("TLS_PSK_WITH_AES_256_CBC_SHA384")
    public static final long TLS_PSK_WITH_AES_256_CBC_SHA384 = 175L;
    @GlobalConstant("TLS_PSK_WITH_NULL_SHA256")
    public static final long TLS_PSK_WITH_NULL_SHA256 = 176L;
    @GlobalConstant("TLS_PSK_WITH_NULL_SHA384")
    public static final long TLS_PSK_WITH_NULL_SHA384 = 177L;
    @GlobalConstant("TLS_DHE_PSK_WITH_AES_128_CBC_SHA256")
    public static final long TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 = 178L;
    @GlobalConstant("TLS_DHE_PSK_WITH_AES_256_CBC_SHA384")
    public static final long TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 = 179L;
    @GlobalConstant("TLS_DHE_PSK_WITH_NULL_SHA256")
    public static final long TLS_DHE_PSK_WITH_NULL_SHA256 = 180L;
    @GlobalConstant("TLS_DHE_PSK_WITH_NULL_SHA384")
    public static final long TLS_DHE_PSK_WITH_NULL_SHA384 = 181L;
    @GlobalConstant("TLS_RSA_PSK_WITH_AES_128_CBC_SHA256")
    public static final long TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 = 182L;
    @GlobalConstant("TLS_RSA_PSK_WITH_AES_256_CBC_SHA384")
    public static final long TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 = 183L;
    @GlobalConstant("TLS_RSA_PSK_WITH_NULL_SHA256")
    public static final long TLS_RSA_PSK_WITH_NULL_SHA256 = 184L;
    @GlobalConstant("TLS_RSA_PSK_WITH_NULL_SHA384")
    public static final long TLS_RSA_PSK_WITH_NULL_SHA384 = 185L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256")
    public static final long TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = 49187L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384")
    public static final long TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = 49188L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256")
    public static final long TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = 49189L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384")
    public static final long TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = 49190L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256")
    public static final long TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = 49191L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384")
    public static final long TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = 49192L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256")
    public static final long TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = 49193L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384")
    public static final long TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = 49194L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256")
    public static final long TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = 49195L;
    @GlobalConstant("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384")
    public static final long TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = 49196L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256")
    public static final long TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = 49197L;
    @GlobalConstant("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384")
    public static final long TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = 49198L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256")
    public static final long TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = 49199L;
    @GlobalConstant("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384")
    public static final long TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = 49200L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256")
    public static final long TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = 49201L;
    @GlobalConstant("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384")
    public static final long TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = 49202L;
    @GlobalConstant("TLS_EMPTY_RENEGOTIATION_INFO_SCSV")
    public static final long TLS_EMPTY_RENEGOTIATION_INFO_SCSV = 255L;
    @GlobalConstant("SSL_RSA_WITH_RC2_CBC_MD5")
    public static final long SSL_RSA_WITH_RC2_CBC_MD5 = 65408L;
    @GlobalConstant("SSL_RSA_WITH_IDEA_CBC_MD5")
    public static final long SSL_RSA_WITH_IDEA_CBC_MD5 = 65409L;
    @GlobalConstant("SSL_RSA_WITH_DES_CBC_MD5")
    public static final long SSL_RSA_WITH_DES_CBC_MD5 = 65410L;
    @GlobalConstant("SSL_RSA_WITH_3DES_EDE_CBC_MD5")
    public static final long SSL_RSA_WITH_3DES_EDE_CBC_MD5 = 65411L;
    @GlobalConstant("SSL_NO_SUCH_CIPHERSUITE")
    public static final long SSL_NO_SUCH_CIPHERSUITE = 65535L;
    

}
