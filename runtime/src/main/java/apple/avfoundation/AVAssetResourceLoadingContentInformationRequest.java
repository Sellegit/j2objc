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
 * @since Available in iOS 7.0 and later.
 */

@Library("AVFoundation") @Mapping("AVAssetResourceLoadingContentInformationRequest")
public class AVAssetResourceLoadingContentInformationRequest 
    extends NSObject 
     {

    
    
    public AVAssetResourceLoadingContentInformationRequest() {}
    
    
    @Mapping("contentType")
    public native String getContentType();
    @Mapping("setContentType:")
    public native void setContentType(String v);
    @Mapping("contentLength")
    public native long getContentLength();
    @Mapping("setContentLength:")
    public native void setContentLength(long v);
    @Mapping("isByteRangeAccessSupported")
    public native boolean isByteRangeAccessSupported();
    @Mapping("setByteRangeAccessSupported:")
    public native void setByteRangeAccessSupported(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("renewalDate")
    public native NSDate getRenewalDate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setRenewalDate:")
    public native void setRenewalDate(NSDate v);
    
    
    
    
    
}
