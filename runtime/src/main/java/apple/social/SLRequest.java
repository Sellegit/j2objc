package apple.social;


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
import apple.uikit.*;
import apple.accounts.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("Social") @Mapping("SLRequest")
public class SLRequest 
    extends NSObject 
     {

    
    
    public SLRequest() {}
    
    
    @Mapping("account")
    public native ACAccount getAccount();
    public native void setAccount(ACAccount v);
    @Mapping("requestMethod")
    public native @Representing("SLRequestMethod") @MachineSizedSInt long getRequestMethod();
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("parameters")
    public native Map<String, NSObject> getParameters();
    
    
    
    @Mapping("addMultipartData:withName:type:filename:")
    public native void addMultipartData(NSData data, String name, String type, String filename);
    @Mapping("preparedURLRequest")
    public native NSURLRequest getPreparedURLRequest();
    @Mapping("performRequestWithHandler:")
    public native void performRequest(@Block VoidBlock3<NSData, NSHTTPURLResponse, NSError> handler);
    @Mapping("requestForServiceType:requestMethod:URL:parameters:")
    public static native SLRequest create(SLServiceType serviceType, @Representing("SLRequestMethod") @MachineSizedSInt long requestMethod, NSURL url, Map<String, NSObject> parameters);
    
}
