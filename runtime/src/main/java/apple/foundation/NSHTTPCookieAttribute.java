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
public class NSHTTPCookieAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSHTTPCookieName")
    public static native NSString NameAttribute();
    @GlobalConstant("NSHTTPCookieValue")
    public static native NSString ValueAttribute();
    @GlobalConstant("NSHTTPCookieOriginURL")
    public static native NSString OriginURLAttribute();
    @GlobalConstant("NSHTTPCookieVersion")
    public static native NSString VersionAttribute();
    @GlobalConstant("NSHTTPCookieDomain")
    public static native NSString DomainAttribute();
    @GlobalConstant("NSHTTPCookiePath")
    public static native NSString PathAttribute();
    @GlobalConstant("NSHTTPCookieSecure")
    public static native NSString SecureAttribute();
    @GlobalConstant("NSHTTPCookieExpires")
    public static native NSString ExpiresAttribute();
    @GlobalConstant("NSHTTPCookieComment")
    public static native NSString CommentAttribute();
    @GlobalConstant("NSHTTPCookieCommentURL")
    public static native NSString CommentURLAttribute();
    @GlobalConstant("NSHTTPCookieDiscard")
    public static native NSString DiscardAttribute();
    @GlobalConstant("NSHTTPCookieMaximumAge")
    public static native NSString MaximumAgeAttribute();
    @GlobalConstant("NSHTTPCookiePort")
    public static native NSString PortAttribute();
    
}
