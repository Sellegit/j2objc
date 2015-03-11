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



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("AVFoundation") @Mapping("AVAssetResourceLoadingRequest")
public class AVAssetResourceLoadingRequest 
    extends NSObject 
     {

    
    
    public AVAssetResourceLoadingRequest() {}
    
    
    @Mapping("request")
    public native NSURLRequest getRequest();
    @Mapping("isFinished")
    public native boolean isFinished();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isCancelled")
    public native boolean isCancelled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("contentInformationRequest")
    public native AVAssetResourceLoadingContentInformationRequest getContentInformationRequest();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("dataRequest")
    public native AVAssetResourceLoadingDataRequest getDataRequest();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("response")
    public native NSURLResponse getResponse();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setResponse(NSURLResponse v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("redirect")
    public native NSURLRequest getRedirect();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setRedirect(NSURLRequest v);
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("finishLoading")
    public native void finishLoading();
    @Mapping("finishLoadingWithError:")
    public native void finishLoading(NSError error);
    @Mapping("streamingContentKeyRequestDataForApp:contentIdentifier:options:error:")
    public native NSData getStreamingContentKeyRequestData(NSData appIdentifier, NSData contentIdentifier, NSDictionary<NSString, ?> options, Todo outError);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("finishLoadingWithResponse:data:redirect:")
    public native void finishLoading(NSURLResponse response, NSData data, NSURLRequest redirect);
    
}
