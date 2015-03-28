package apple.avfoundation;


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
import apple.foundation.*;
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class AVAssetResourceLoaderDelegateAdapter 
    extends Object 
    implements AVAssetResourceLoaderDelegate {

    
    
    


    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("resourceLoader:shouldWaitForLoadingOfRequestedResource:")
    public boolean shouldWaitForLoadingOfRequestedResource(AVAssetResourceLoader resourceLoader, AVAssetResourceLoadingRequest loadingRequest) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("resourceLoader:shouldWaitForRenewalOfRequestedResource:")
    public boolean shouldWaitForRenewalOfRequestedResource(AVAssetResourceLoader resourceLoader, AVAssetResourceRenewalRequest renewalRequest) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("resourceLoader:didCancelLoadingRequest:")
    public void didCancelLoadingRequest(AVAssetResourceLoader resourceLoader, AVAssetResourceLoadingRequest loadingRequest) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("resourceLoader:shouldWaitForResponseToAuthenticationChallenge:")
    public boolean shouldWaitForResponseToAuthenticationChallenge(AVAssetResourceLoader resourceLoader, NSURLAuthenticationChallenge authenticationChallenge) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("resourceLoader:didCancelAuthenticationChallenge:")
    public void didCancelAuthenticationChallenge(AVAssetResourceLoader resourceLoader, NSURLAuthenticationChallenge authenticationChallenge) { throw new UnsupportedOperationException(); }

}
