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


@Library("Foundation/Foundation.h") @Mapping("NSCachedURLResponse")
public class NSCachedURLResponse 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithResponse:data:")
    public NSCachedURLResponse(NSURLResponse response, NSData data) { }
    @Mapping("initWithResponse:data:userInfo:storagePolicy:")
    public NSCachedURLResponse(NSURLResponse response, NSData data, NSDictionary<?, ?> userInfo, @Representing("NSURLCacheStoragePolicy") long storagePolicy) { }
    @Mapping("init")
    public NSCachedURLResponse() { }

    
    @Mapping("response")
    public native NSURLResponse getResponse();
    @Mapping("data")
    public native NSData getData();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("storagePolicy")
    public native @Representing("NSURLCacheStoragePolicy") long getStoragePolicy();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
