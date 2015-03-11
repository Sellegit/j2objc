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






@Mapping("NSHTTPCookieAcceptPolicy")
public final class NSHTTPCookieAcceptPolicy extends ObjCEnum {
    
    @GlobalConstant("NSHTTPCookieAcceptPolicyAlways")
    public static final long Always = 0L;
    @GlobalConstant("NSHTTPCookieAcceptPolicyNever")
    public static final long Never = 1L;
    @GlobalConstant("NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain")
    public static final long OnlyFromMainDocumentDomain = 2L;
    

}
