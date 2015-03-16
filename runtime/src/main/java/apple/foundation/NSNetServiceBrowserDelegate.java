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





@Library("Foundation/Foundation.h") @Mapping("NSNetServiceBrowserDelegate")
public interface NSNetServiceBrowserDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("netServiceBrowserWillSearch:")
    void willSearch(NSNetServiceBrowser aNetServiceBrowser);
    @Mapping("netServiceBrowserDidStopSearch:")
    void didStopSearch(NSNetServiceBrowser aNetServiceBrowser);
    @Mapping("netServiceBrowser:didNotSearch:")
    void didNotSearch(NSNetServiceBrowser aNetServiceBrowser, NSDictionary<?, ?> errorDict);
    @Mapping("netServiceBrowser:didFindDomain:moreComing:")
    void didFindDomain(NSNetServiceBrowser aNetServiceBrowser, String domainString, boolean moreComing);
    @Mapping("netServiceBrowser:didFindService:moreComing:")
    void didFindService(NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService, boolean moreComing);
    @Mapping("netServiceBrowser:didRemoveDomain:moreComing:")
    void didRemoveDomain(NSNetServiceBrowser aNetServiceBrowser, String domainString, boolean moreComing);
    @Mapping("netServiceBrowser:didRemoveService:moreComing:")
    void didRemoveService(NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService, boolean moreComing);
    
    /*<adapter>*/
    /*</adapter>*/
}
