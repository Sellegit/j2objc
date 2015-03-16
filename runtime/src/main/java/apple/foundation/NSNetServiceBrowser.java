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





@Library("Foundation/Foundation.h") @Mapping("NSNetServiceBrowser")
public class NSNetServiceBrowser 
    extends NSObject 
     {

    
    
    public NSNetServiceBrowser() {}
    
    
    @Mapping("delegate")
    public native NSNetServiceBrowserDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSNetServiceBrowserDelegate v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("includesPeerToPeer")
    public native boolean includesPeerToPeer();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean v);
    
    
    
    @Mapping("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop(NSRunLoop aRunLoop, String mode);
    @Mapping("removeFromRunLoop:forMode:")
    public native void removeFromRunLoop(NSRunLoop aRunLoop, String mode);
    @Mapping("searchForBrowsableDomains")
    public native void searchForBrowsableDomains();
    @Mapping("searchForRegistrationDomains")
    public native void searchForRegistrationDomains();
    @Mapping("searchForServicesOfType:inDomain:")
    public native void searchForServices(String type, String domainString);
    @Mapping("stop")
    public native void stop();
    
}
