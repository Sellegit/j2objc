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





@Library("Foundation") @Mapping("NSNetServiceDelegate")
public interface NSNetServiceDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("netServiceWillPublish:")
    void willPublish(NSNetService sender);
    @Mapping("netServiceDidPublish:")
    void didPublish(NSNetService sender);
    @Mapping("netService:didNotPublish:")
    void didNotPublish(NSNetService sender, NSNetServiceErrorInfo errorDict);
    @Mapping("netServiceWillResolve:")
    void willResolve(NSNetService sender);
    @Mapping("netServiceDidResolveAddress:")
    void didResolve(NSNetService sender);
    @Mapping("netService:didNotResolve:")
    void didNotResolve(NSNetService sender, NSNetServiceErrorInfo errorDict);
    @Mapping("netServiceDidStop:")
    void didStop(NSNetService sender);
    @Mapping("netService:didUpdateTXTRecordData:")
    void didUpdateTXTRecordData(NSNetService sender, NSData data);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("netService:didAcceptConnectionWithInputStream:outputStream:")
    void didAcceptConnection(NSNetService sender, NSInputStream inputStream, NSOutputStream outputStream);
    
    /*<adapter>*/
    /*</adapter>*/
}
