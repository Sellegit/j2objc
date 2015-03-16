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





@Library("Foundation/Foundation.h") @Mapping("NSURLCredentialStorage")
public class NSURLCredentialStorage 
    extends NSObject 
     {

    
    
    public NSURLCredentialStorage() {}
    
    
    @Mapping("allCredentials")
    public native Map<String, NSURLCredential> getAllCredentials();
    
    
    
    @GlobalConstant("NSURLCredentialStorageChangedNotification")
    public static native NSString ChangedNotification();
    
    @Mapping("credentialsForProtectionSpace:")
    public native Map<String, NSURLCredential> getCredentials(NSURLProtectionSpace space);
    @Mapping("setCredential:forProtectionSpace:")
    public native void setCredential(NSURLCredential credential, NSURLProtectionSpace space);
    @Mapping("removeCredential:forProtectionSpace:")
    public native void removeCredential(NSURLCredential credential, NSURLProtectionSpace space);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("removeCredential:forProtectionSpace:options:")
    public native void removeCredential(NSURLCredential credential, NSURLProtectionSpace space, NSDictionary<?, ?> options);
    @Mapping("defaultCredentialForProtectionSpace:")
    public native NSURLCredential getDefaultCredential(NSURLProtectionSpace space);
    @Mapping("setDefaultCredential:forProtectionSpace:")
    public native void setDefaultCredential(NSURLCredential credential, NSURLProtectionSpace space);
    @Mapping("sharedCredentialStorage")
    public static native NSURLCredentialStorage getSharedCredentialStorage();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getCredentialsForProtectionSpace:task:completionHandler:")
    public native void getCredentials(NSURLProtectionSpace protectionSpace, NSURLSessionTask task, Todo completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setCredential:forProtectionSpace:task:")
    public native void setCredential(NSURLCredential credential, NSURLProtectionSpace protectionSpace, NSURLSessionTask task);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("removeCredential:forProtectionSpace:options:task:")
    public native void removeCredential(NSURLCredential credential, NSURLProtectionSpace protectionSpace, NSDictionary<?, ?> options, NSURLSessionTask task);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getDefaultCredentialForProtectionSpace:task:completionHandler:")
    public native void getDefaultCredential(NSURLProtectionSpace space, NSURLSessionTask task, @Block VoidBlock1<NSURLCredential> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDefaultCredential:forProtectionSpace:task:")
    public native void setDefaultCredential(NSURLCredential credential, NSURLProtectionSpace protectionSpace, NSURLSessionTask task);
    
}
