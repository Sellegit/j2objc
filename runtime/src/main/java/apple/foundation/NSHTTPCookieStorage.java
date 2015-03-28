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


@Library("Foundation/Foundation.h") @Mapping("NSHTTPCookieStorage")
public class NSHTTPCookieStorage 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSHTTPCookieStorage() { }

    
    @Mapping("cookies")
    public native NSArray<NSHTTPCookie> getCookies();
    @Mapping("cookieAcceptPolicy")
    public native @Representing("NSHTTPCookieAcceptPolicy") long getCookieAcceptPolicy();
    @Mapping("setCookieAcceptPolicy:")
    public native void setCookieAcceptPolicy(@Representing("NSHTTPCookieAcceptPolicy") long v);

    
    
    @GlobalConstant("NSHTTPCookieManagerAcceptPolicyChangedNotification")
    public static native NSString AcceptPolicyChangedNotification();
    @GlobalConstant("NSHTTPCookieManagerCookiesChangedNotification")
    public static native NSString CookiesChangedNotification();

    @Mapping("setCookie:")
    public native void setCookie(NSHTTPCookie cookie);
    @Mapping("deleteCookie:")
    public native void deleteCookie(NSHTTPCookie cookie);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("removeCookiesSinceDate:")
    public native void removeCookiesSinceDate(NSDate date);
    @Mapping("cookiesForURL:")
    public native NSArray<NSHTTPCookie> getCookiesForURL(NSURL URL);
    @Mapping("setCookies:forURL:mainDocumentURL:")
    public native void setCookiesForURL(NSArray<?> cookies, NSURL URL, NSURL mainDocumentURL);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("sortedCookiesUsingDescriptors:")
    public native NSArray<NSHTTPCookie> getSortedCookies(NSArray<?> sortOrder);
    @Mapping("sharedHTTPCookieStorage")
    public static native NSHTTPCookieStorage getSharedHTTPCookieStorage();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("storeCookies:forTask:")
    public native void storeCookiesForTask(NSArray<?> cookies, NSURLSessionTask task);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getCookiesForTask:completionHandler:")
    public native void getCookiesForTask(NSURLSessionTask task, Todo completionHandler);

}
