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
public class NSHTTPCookieAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSHTTPCookieName")
    protected static native NSString NameAttribute();
    @GlobalConstant("NSHTTPCookieValue")
    protected static native NSString ValueAttribute();
    @GlobalConstant("NSHTTPCookieOriginURL")
    protected static native NSString OriginURLAttribute();
    @GlobalConstant("NSHTTPCookieVersion")
    protected static native NSString VersionAttribute();
    @GlobalConstant("NSHTTPCookieDomain")
    protected static native NSString DomainAttribute();
    @GlobalConstant("NSHTTPCookiePath")
    protected static native NSString PathAttribute();
    @GlobalConstant("NSHTTPCookieSecure")
    protected static native NSString SecureAttribute();
    @GlobalConstant("NSHTTPCookieExpires")
    protected static native NSString ExpiresAttribute();
    @GlobalConstant("NSHTTPCookieComment")
    protected static native NSString CommentAttribute();
    @GlobalConstant("NSHTTPCookieCommentURL")
    protected static native NSString CommentURLAttribute();
    @GlobalConstant("NSHTTPCookieDiscard")
    protected static native NSString DiscardAttribute();
    @GlobalConstant("NSHTTPCookieMaximumAge")
    protected static native NSString MaximumAgeAttribute();
    @GlobalConstant("NSHTTPCookiePort")
    protected static native NSString PortAttribute();
    
}
