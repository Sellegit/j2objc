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

public abstract class NSNetServiceBrowserDelegateAdapter 
    extends Object 
    implements NSNetServiceBrowserDelegate {

    
    
    
    
    
    
    
    @NotImplemented("netServiceBrowserWillSearch:")
    public void willSearch(NSNetServiceBrowser aNetServiceBrowser) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceBrowserDidStopSearch:")
    public void didStopSearch(NSNetServiceBrowser aNetServiceBrowser) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceBrowser:didNotSearch:")
    public void didNotSearch(NSNetServiceBrowser aNetServiceBrowser, NSDictionary<?, ?> errorDict) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceBrowser:didFindDomain:moreComing:")
    public void didFindDomain(NSNetServiceBrowser aNetServiceBrowser, String domainString, boolean moreComing) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceBrowser:didFindService:moreComing:")
    public void didFindService(NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService, boolean moreComing) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceBrowser:didRemoveDomain:moreComing:")
    public void didRemoveDomain(NSNetServiceBrowser aNetServiceBrowser, String domainString, boolean moreComing) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceBrowser:didRemoveService:moreComing:")
    public void didRemoveService(NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService, boolean moreComing) { throw new UnsupportedOperationException(); }
    
}
