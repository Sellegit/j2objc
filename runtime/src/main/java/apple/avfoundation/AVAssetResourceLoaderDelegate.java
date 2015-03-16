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





@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetResourceLoaderDelegate")
public interface AVAssetResourceLoaderDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("resourceLoader:shouldWaitForLoadingOfRequestedResource:")
    boolean shouldWaitForLoadingOfRequestedResource(AVAssetResourceLoader resourceLoader, AVAssetResourceLoadingRequest loadingRequest);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("resourceLoader:shouldWaitForRenewalOfRequestedResource:")
    boolean shouldWaitForRenewalOfRequestedResource(AVAssetResourceLoader resourceLoader, AVAssetResourceRenewalRequest renewalRequest);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("resourceLoader:didCancelLoadingRequest:")
    void didCancelLoadingRequest(AVAssetResourceLoader resourceLoader, AVAssetResourceLoadingRequest loadingRequest);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("resourceLoader:shouldWaitForResponseToAuthenticationChallenge:")
    boolean shouldWaitForResponseToAuthenticationChallenge(AVAssetResourceLoader resourceLoader, NSURLAuthenticationChallenge authenticationChallenge);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("resourceLoader:didCancelAuthenticationChallenge:")
    void didCancelAuthenticationChallenge(AVAssetResourceLoader resourceLoader, NSURLAuthenticationChallenge authenticationChallenge);
    
    /*<adapter>*/
    /*</adapter>*/
}
