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
@Adapter
public abstract class NSNetServiceDelegateAdapter 
    extends Object 
    implements NSNetServiceDelegate {

    
    
    
    
    
    
    
    @NotImplemented("netServiceWillPublish:")
    public void willPublish(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceDidPublish:")
    public void didPublish(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netService:didNotPublish:")
    public void didNotPublish(NSNetService sender, NSNetServiceErrorInfo errorDict) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceWillResolve:")
    public void willResolve(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceDidResolveAddress:")
    public void didResolve(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netService:didNotResolve:")
    public void didNotResolve(NSNetService sender, NSNetServiceErrorInfo errorDict) { throw new UnsupportedOperationException(); }
    @NotImplemented("netServiceDidStop:")
    public void didStop(NSNetService sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("netService:didUpdateTXTRecordData:")
    public void didUpdateTXTRecordData(NSNetService sender, NSData data) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("netService:didAcceptConnectionWithInputStream:outputStream:")
    public void didAcceptConnection(NSNetService sender, NSInputStream inputStream, NSOutputStream outputStream) { throw new UnsupportedOperationException(); }
    
}
